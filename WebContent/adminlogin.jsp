<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		
		<title>后台登陆</title>
		<link rel="stylesheet" type="text/css" href="css/base.css"/>
		<link rel="stylesheet" type="text/css" href="css/superlogin.css"/>
		<style type="text/css">
			.warnning {
				font-size: 10px;
				color: #f10215;
				width: 148px;
				height: 20px;
				display: block;
				margin-left: 346px;
				margin-top: -30px;
			}

			.padding {
				height: 10px;
			}
		</style>
	</head>
	<body>
		<div class="lo">
			<h3>事故预防学习系统</h3>
			<div class="g">
				<form action="${pageContext.request.contextPath}/shiro/login.action" method="post">
					<div class="wd">
						<img src="img/spirit/wd.jpg"/>
						<input type="text" placeholder="用户名" id="username" name="username" autofocus="autofocus" maxlength="20" />
					</div>
					<p class="warnning" id="warnning1"></p>
					<div class="padding"></div>
					<div class="ps">
						<img src="img/spirit/wd.jpg"/>
						<input type="password" placeholder="密码" id="password" name="pass" maxlength="8" />
					</div>
					<p class="warnning" id="warnning2"></p>
					
					<button type="submit" name="submit" id="login">登 录</button>
					
				</form>
			</div>
		</div>
	</body>
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript">
		$(function() {

		});
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

			$.ajax({
				url: "", //通过ajax后端
				type: "post",
				dataType: "json",
				data: {
					username: usernameval,
					password: passwordval
				},
				success: function(mes) {

				},
				error: function(err) {
					//alert("ajax跳转错误");
				}
			});
		});
	</script>
</html>