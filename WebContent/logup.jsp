<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>注册</title>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/base.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/register.css">
		<style type="text/css">
			.warnning {
				display: inline-block;
				font-size: 10px;
				color: #f10215;
				width: 80px;
				height: 10px;
				margin-right: -80px;
			}
		</style>

	</head>

	<body>
		<div class="re">
			<h3>Register</h3>
			<div class="rg">
				<form action="${pageContext.request.contextPath}/shiro/logup.action" method="post">
					<table>
						<tr>
							<td class="cl">
								<span>姓&nbsp;&nbsp;名:</span>
								<input type="text" placeholder="  Name" id="username" name="username" autofocus="autofocus" maxlength="20" />
							</td>
							<td class="cl">
								<span>公&nbsp;&nbsp;司:</span>
								<input type="text" placeholder="  Company" id="company" name="username" autofocus="autofocus" maxlength="20" />
							</td>
						</tr>
						<tr>
							<td class="cl">
								<span>年&nbsp;&nbsp;龄:</span>
								<input type="text" placeholder="  Age" id="age" name="username" autofocus="autofocus" maxlength="20" />
							</td>
							<td class="cl">
								<span>职&nbsp;&nbsp;位:</span>
								<input type="text" placeholder="  Work" id="post" name="password" maxlength="8" />
							</td>

						</tr>
						<tr>
							<td class="cl">
								<div class="rw">
									<p style="display: inline-block; margin-left: -66px;">性&nbsp;&nbsp;别:</p>
									<input type="radio" name="1" value="man" class="sx" checked="checked"><span>男</span>
									<input type="radio" name="1" value="women" class="sx"><span>女</span>
								</div>
							</td>
							<td class="cl">
								<span>工&nbsp;&nbsp;号:</span>
								<input type="text" placeholder="  ID" id="workNum" name="us_account" autofocus="autofocus" maxlength="20" />
							</td>
						</tr>
						<tr>
							<td class="cl">
								<span>身份证号:</span>
								<input type="text" placeholder="  ID-Card" id="idCard" name="username" autofocus="autofocus" maxlength="20" />
							</td>
							<td class="cl">
								<span>密&nbsp;&nbsp;码:</span>
								<input type="password" placeholder="  Passwd" id="password" name="us_passwd" autofocus="autofocus" maxlength="20" />
							</td>
						</tr>
						<tr>
							<td class="cl"></td>
							<td class="cl">
								<span>确认密码:</span>
								<input type="password" placeholder="  Passwd" id="surePassword" name="username" autofocus="autofocus" maxlength="20" />
							</td>
						</tr>
						<tr>
							<td class="cm">
								<button type="button" name="submit" id="register">注 册</button>
							</td>
							<td class="cm">
								<button type="reset" name="submit" id="res">重 置</button>
							</td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</body>

	<script type="text/javascript">
		var workNumFlag = false;
		 $("#workNum").blur(function(){
		 	//此为工号失去焦点是触发，即异步表单验证工号是否重复
			 	$.ajax({
					url: "${pageContext.request.contextPath}/userhandler/vertify.action",
					type: "post",
					/* contentType:'application/json;charset=utf-8', */
					/* dataType: "json", */
					data: 'us_account='+$("#workNum").val(),
					success: function(res) {
						if(res!=true){
							workNumFlag = false;
							$("#workNum").after('<p class ="warnning" id="wordW">此工号重复请重新输入</p>');
						}else{
							workNumFlag = true;
							$("#wordW").text("");
						}
					},
					error: function() {

					}
				});
		 });
		

		$("#register").click(function() {
			var companyval = $("#company").val();
			var postval = $("#post").val();
			var workNumval = $("#workNum").val();
			var usernameval = $("#username").val();
			var sexval = $('input:radio[name="1"]:checked').val()
			var ageval = $("#age").val();
			var idCardval = $("#idCard").val();
			var passwordval = $("#password").val();
			var surePasswordval = $("#surePassword").val();
			
			if(!usernameval) {
				if($("#wordU").length == 0) {
					$("#username").after('<p class ="warnning" id="wordU">姓名不能为空</p>');
				}

				return false;
			} else {
				$("#wordU").text("");
			}
			
			if(!ageval) {
				if($("#wordA").length == 0) {
					$("#age").after('<p class ="warnning" id="wordA">年龄不能为空</p>');
				}

				return false;
			} else {
				$("#wordA").text("");
			}
			
			if(isNaN(ageval)) {
				if($("#wordA").length == 0) {
					$("#age").after('<p class ="warnning" id="wordA">年龄必须为填写数字</p>');
				}

				return false;
			} else {
				$("#wordA").text("");
			}

			if(!idCardval) {
				if($("#wordI").length == 0) {
					$("#idCard").after('<p class ="warnning" id="wordI">身份证不能为空</p>');
				}

				return false;
			} else {
				$("#wordI").text("");
			}
			
			if(idCardval.length != 18) {
				if($("#wordI2").length == 0) {
					$("#idCard").after('<p class ="warnning" id="wordI2">身份证格式不正确</p>');
				}
				return false;
			} else {
				$("#wordI2").text("");
			}
			
			if(!companyval) {
				if($("#wordC").length == 0) {
					$("#company").after('<p class ="warnning" id="wordC" >公司不能为空</p>');
				}

				return false;
			} else {
				$("#wordC").remove();
			}
			
			if(!postval) {
				if($("#wordPwd").length == 0) {
					$("#post").after('<p class ="warnning" id="wordPwd" >职位不能为空</p>');
				}
				return false;
			} else {
				$("#wordPwd").text("");
			}
			
			if(!workNumval) {
				if($("#wordW").length == 0) {
					$("#workNum").after('<p class ="warnning" id="wordW">工号不能为空</p>');
				}

				return false;
			} else {
				$("#wordW").remove();
			}
			
			if(!checkWorkNum(workNumval)) {
				alert(workNumval);
				if($("#wordW").length == 0) {
					$("#workNum").after('<p class ="warnning" id="wordW2">工号只能由字母数字构成</p>');
				}
				return false;
			} else {
				$("#wordW2").text("");
			}
			
			/*if(!workNumFlag) {
				return false;
			}*/
			
			if(!passwordval) {
				if($("#wordP").length == 0) {
					$("#password").after('<p class ="warnning" id="wordP">密码不能为空</p>');
				}

				return false;
			} else {
				$("#wordP").text("");
			}

			if(passwordval.length<8) {
				if($("#wordP").length == 0) {
					$("#password").after('<p class ="warnning" id="wordP">密码不能小于八位</p>');
				}

				return false;
			} else {
				$("#wordP").text("");
			}
			
			if(!surePasswordval) {
				if($("#wordSP").length == 0) {
					$("#surePassword").after('<p class ="warnning" id="wordSP">确认密码不能为空</p>');
				}

				return false;
			} else {
				$("#wordSP").text("");
			}
			
			if(surePasswordval != passwordval) {
				if($("#wordSP2").length == 0) {
					$("#surePassword").after('<p class ="warnning" id ="wordSP2">确认密码与密码需一致</p>');
				}
				return false;
			} else {
				$("#wordSP2").text("");
				
			}

			$.ajax({
				url: "${pageContext.request.contextPath}/shiro/logup.action",
				type: "post",
				dataType: "json",
				data: {"a":123},
				success: function() {

				},
				error: function() {

				}
			});
		})

		var checkWorkNum = function(str){
			var re;
			re = /^[0-9a-zA-Z]*$/g; 
			if (re.test(str)) {
				return true;
			}else {
				return false;
			}
		}
	</script>

</html>