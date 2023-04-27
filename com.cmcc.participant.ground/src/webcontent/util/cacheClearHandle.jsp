<%@page import="com.cmcc.participant.ground.service.WFPUserCacheService"%>
<%@page import="com.cmcc.participant.ground.service.WFPOrgCacheService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- 
  - Author(s): YunTao.Li
  - Date: 2018-12-18 15:04:38
  - Description:
-->
<head>
<title>Title</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    <script src="<%= request.getContextPath() %>/common/nui/nui.js" type="text/javascript"></script>
    
</head>
<body>

<%
WFPOrgCacheService.clearCache();
WFPUserCacheService.clearCache();

int orgCacheNum = WFPOrgCacheService.getCacheNum();
int userCacheNum = WFPUserCacheService.getCacheNum();

out.print("clear cache success!! </br>cache num info is:");
out.print("</br>---orgCacheNum : " + orgCacheNum);
out.print("</br>---userCacheNum : " + userCacheNum);
 %>

	<script type="text/javascript">
    	nui.parse();
    </script>
</body>
</html>