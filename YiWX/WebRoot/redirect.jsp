<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="com.zhike.sql.beans.CheckLoginBean"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script type="text/javascript" src="<%=path%>/js/jquery-1.8.3.js"></script>
	<% 
	 String url = (String)request.getAttribute("url");
	%>
<script type="text/javascript">
$(document).ready(function(){
	//初始化
	var url = "<%=url%>";
	window.location.href = url;

})
</script>
	</head>
	<body>
	
	</body>
</html>
