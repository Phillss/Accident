<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
	<head>
		<meta charset="UTF-8">
		<title>login</title>
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<link rel="stylesheet" type="text/css" href="css/base.css"/>
		<link rel="stylesheet" type="text/css" href="css/login.css">
		<style type="text/css">
			.warnning {
				font-size: 10px;
				color: #f10215;
				width: 148px;
				height: 20px;
				display: block;
				margin-left: 306px;
				margin-top: -15px;

			}
			.padding {
				height: 10px;
			}
		</style>

	</head>

	<body>
		<div class="lo">
			<h3>Login form</h3>
			<div class="g">
				<form action="${pageContext.request.contextPath}/shiro/login.action" method="post">
					<input type="text" placeholder="    Username" id="username" name="userid" autofocus="autofocus" maxlength="20"  />

					<p class="warnning" id="warnning1"></p>

					<div class="padding"></div>

					<input type="password" placeholder="    Password" id="password" name="pass" maxlength="8"  />
					
					<p class="warnning" id="warnning2"></p>
					
					<button type="submit" name="submit" id="login">登 录</button>
					
					<button type="button" name="submit" id="register">注 册</button>
					
				</form>
			</div>
		</div>
	</body>

	<script type="text/javascript">
		$(function() {

		});
		$("#login").click(function() {
			var usernameval = $("#userid").val();
			var passwordval = $("#pass").val();
			if(!usernameval) {
				$("#warnning1").text("账号不能为空");
				if(!passwordval) {
				$("#warnning2").text("密码不能为空");
				}else{
					$("#warnning2").text("");
				}
			return false;
			} else {
				$("#warnning1").text("");
			}

			if(!passwordval) {
				$("#warnning2").text("密码不能为空");
				return false;
			} else {
				$("#warnning2").text("");
			}

			$.ajax({
				url: "", //通过ajax舔砖后端
				type: "post",
				dataType: "json",
				data: {
					username: usernameval,
					password: passwordval
				},
				success: function(mes) {

				},
				error: function(err) {
					alert("ajax跳转错误");
				}
			});
		});
	</script>

</html>
<!--<html>
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
			<td></td>
			<td><input type="submit" value="登陆"></td>
		</tr>
	</table>
	</form>
</center>
</body>
</html>-->