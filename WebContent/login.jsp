<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>用户登陆页面</title>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/base.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css"/>
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
					<input type="text" placeholder="    Username" id="username" name=username autofocus="autofocus" maxlength="20"  />

					<p class="warnning" id="warnning1"></p>

					<div class="padding"></div>

					<input type="password" placeholder="    Password" id="password" name="pass" maxlength="8"  />
					
					<p class="warnning" id="warnning2"></p>
					
					<button type="submit" name="submit" id="login">登 录</button>
					
					<!-- <button type="button" name="submit" id="register" >注册</button> -->
					<a href="logup.jsp" id="register">注册</a>
				</form>
			</div>
		</div>
	</body>

	<script type="text/javascript">
		$("#login").click(function() {
			var usernameval = $("#username").val();
			var passwordval = $("#password").val();
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

			/* $.ajax({
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
			}); */
		});
	</script>

</html>