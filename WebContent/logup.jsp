<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>logup</title>
</head>
<body>
<center><h1>please logup</h1>
	<form action="${pageContext.request.contextPath}/shiro/logup.action" method="post">
	<table>
		<tr>
			<td>用户名：<input type="text" name="us_account"></td>
			<td>密码：<input type="password" name="us_passwd"></td>
			<td>确认密码：<input type="password" name="m_passwd2"></td>
		</tr>
		<tr>
			<td><input type="checkbox" name="check" value=""></td>
			<td><input type="submit" value="注册"></td>
		</tr>
	</table>
	</form>
</center>
</body>
</html>