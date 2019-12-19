<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<td>用户id</td>
		<td>用户姓名</td>
		<td>用户密码</td>
	</tr>
	<s:forEach items="${users}" var="user">
	<tr>
		<td>${user.uid }</td>
		<td>${user.uname }</td>
		<td>${user.upwd }</td>
	</tr>
	</s:forEach>
	

</table>
</body>
</html>