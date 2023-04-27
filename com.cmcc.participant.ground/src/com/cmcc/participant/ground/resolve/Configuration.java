package com.cmcc.participant.ground.resolve;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * ��װProperties
 * 
 * @author suyang
 * 2008-9-19 ����10:36:46
 */
public class Configuration {
	private Properties propertie;

	private FileInputStream inputFile;

	private FileOutputStream outputFile;

	public Configuration()
	{
		propertie = new Properties();
	}

	public Configuration(String filePath)
	{
		propertie = new Properties();
		try
		{
			inputFile = new FileInputStream(filePath);
			propertie.load(inputFile);
			inputFile.close();
		} catch (FileNotFoundException ex)
		{
			ex.printStackTrace();
		} catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public Configuration(InputStream inputFile)
	{
		propertie = new Properties();
		try
		{
			propertie.load(inputFile);
			inputFile.close();
		} catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}

	public String getValue(String key)
	{
		if (propertie.containsKey(key))
		{
			String value = propertie.getProperty(key);
			return value;
		} else
			return "";
	}

	public String getValue(String fileName, String key)
	{
		try
		{
			String value = "";
			inputFile = new FileInputStream(fileName);
			propertie.load(inputFile);
			inputFile.close();
			if (propertie.containsKey(key))
			{
				value = propertie.getProperty(key);
				return value;
			} else
				return value;
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
			return "";
		} catch (IOException e)
		{
			e.printStackTrace();
			return "";
		} catch (Exception ex)
		{
			ex.printStackTrace();
			return "";
		}
	}

	public void clear()
	{
		propertie.clear();
	}

	public void setValue(String key, String value)
	{
		propertie.setProperty(key, value);
	}
	public void saveFile(String fileName, String comments)
	{
		try
		{
			outputFile = new FileOutputStream(fileName);
			propertie.store(outputFile, comments);
			outputFile.close();
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}

}
