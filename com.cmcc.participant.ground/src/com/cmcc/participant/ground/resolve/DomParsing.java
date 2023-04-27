package com.cmcc.participant.ground.resolve;

import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.eos.system.annotation.Bizlet;
import com.primeton.workflow.commons.logging.LogService;
import com.primeton.workflow.service.notifaction.impl.helper.WFMessageLog;

@Bizlet
public class DomParsing {
	public static final String ELEMENTNAME_INPUTCOLLECTION = "INPUTCOLLECTION";
	public static final String ELEMENTNAME_ITEM = "INPUTCOLLECTION_ITEM";

	public static final String FILETYPE_INNERUSER = "inner";
	public static final String FILETYPE_OUTSIDEUSER = "outside";
	public static final String FILETYPE_ORG = "org";

	private static WFMessageLog messageLogger = WFMessageLog.getWFMessageLogger(DomParsing.class);

	/**
	 * 开始解析
	 * 
	 * 读取目录下的所有文件
	 * 
	 * @throws Exception
	 */
	@Bizlet
	public void doParse(String directoryPath, String fileType) throws Exception {
		// step1 : 获取目录下的所有文件
		File directoryFile = new File(directoryPath);
		File[] files = directoryFile.listFiles(); // 目录下的所有文件
		int fileCount = files.length;
		
		messageLogger.log("类型:" + fileType + "---初始导入开始" + System.currentTimeMillis());
		ThreadPoolExecutor threadPool = new ThreadPoolExecutor(20, 50, 10, TimeUnit.MINUTES, new LinkedBlockingQueue());
		for (int i = 0; i < fileCount; i++) {
			File file = files[i];

			Callable call = new FileImportCallable(file, i, fileCount, fileType);
			Future f1 = threadPool.submit(call);
		}
	}

	class FileImportCallable implements Callable {
		private File file;
		private int fileIndex;
		private int fileCount;
		private String fileType;
		private String message;

		FileImportCallable(File file, int index, int fileCount, String fileType) {
			this.file = file;
			this.fileIndex = index;
			this.fileCount = fileCount;
			this.fileType = fileType;
		}

		public Object call() throws Exception {
			try {
				// step2.1 : 不遍历子文件夹，如果是子文件夹则跳过
				if (file.isDirectory()) {
					return message;
				}

				// step2.2 : 如果扩展名不是xml则跳过
				String fileName = file.getName();
				String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
				if (!("xml").equals(suffix)) {
					messageLogger.log(LogService.LEVEL_ERROR, "初始化用户期初数据：导入文件" + file.getName() + "失败，此文件的后缀名不正确，跳过该文件");
					return message;
				}

				messageLogger.log(LogService.LEVEL_ERROR, "开始导入：" + file.getName() + "导入中-----:" + fileIndex + "-" + fileCount);
				System.out.println("开始导入：" + file.getName() + "导入中-----:" + fileIndex + "-" + fileCount);

				String filePath = file.getPath(); // 文件路径
				InitializeOMData initializeOMData = new InitializeOMData(filePath);

				// step2.3 : 按文件类型调用解析入库
				if (FILETYPE_INNERUSER.equals(fileType)) { // 内部用户

					initializeOMData.initInnerUserData();
				} else if (FILETYPE_OUTSIDEUSER.equals(fileType)) { // 外部用户

					initializeOMData.initOutsideUserData();
				} else if (FILETYPE_ORG.equals(fileType)) { // 机构

					initializeOMData.initOrganizationData();
				}
				messageLogger.log("导入文件" + file.getName() + "成功-----:" + fileIndex + "-" + fileCount);
				System.out.println("导入文件" + file.getName() + "成功");
			} catch (Exception e) {
				e.printStackTrace();
				messageLogger.log(LogService.LEVEL_ERROR, "初始化用户期初数据：导入文件" + file.getName() + "失败，跳过该文件抛出异常:" + e.getMessage());
				return message;
			}
			return message;
		}

	}
}
