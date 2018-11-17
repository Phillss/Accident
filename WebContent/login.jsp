<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
</head>
<body>
<center><h1>please login</h1>
	<form action="${pageContext.request.contextPath}/shiro/login.action" method="post">
	<table>
		<tr>
			<td>用户名：<input type="text" name="userid"></td>
			<td>密码：<input type="password" name="pass"></td>
		</tr>
		<tr>
			<td><a href="${pageContext.request.contextPath}/logup.jsp">注册</a></td>
		</tr>
		<tr>
			<td><input type="checkbox" name="check" value=""></td>
			<td><input type="submit" value="登陆"></td>
		</tr>
	</table>
	</form>
</center>
</body>
</html>