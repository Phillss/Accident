<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加用戶</title>
<%@ include file="/font.jsp"%>
<script type="text/javascript">
			//			下拉框
			function ggle() {
				$('.bu_tr_cd_co').slideToggle(500);
			}

			function ggl() {
				$('.rank').slideToggle(500);
			}

			$(function() {
				$('.menu').bind({
					mouseover: function() {
						$(this).css('background-color', '#213862');
						$(this).css('color', 'white');
					},
					mouseout: function() {
						$(this).css('background-color', '#d1d5dc');
						$(this).css('color', '#213862');
					}
				});
				$('.bu_tr_cd_co').bind({
					mouseover: function() {
						$(this).css('background-color', '#213862');
						$(this).css('color', 'white');
					},
					mouseout: function() {
						$(this).css('background-color', '#e2e5e9');
						$(this).css('color', '#213862');
					}
				});
				$('.rank').bind({
					mouseover: function() {
						$(this).css('background-color', '#213862');
						$(this).css('color', 'white');
					},
					mouseout: function() {
						$(this).css('background-color', '#e2e5e9');
						$(this).css('color', '#213862');
					}
				});
			});
		</script>
</head>
<body>



<div class="t">
			<div class="t5 main">
				<div class="fl w">
					<div class="menu" onclick="">
						政府
					</div>
					<div class="menu" onclick="">
						企业
					</div>
					<div class="menu" onclick="">
						分析人员
					</div>
					<div class="menu" onclick="">
						审核人员
					</div>
				</div>

				<div class="add">
					<form action="${pageContext.request.contextPath}/userhandler/" method="post">
						<table>
							<tr>
								<td>用户权限</td>
								<td><select name="us_roles" id="selectRoles">
									<option value="0" id="0">企业员工</option>
									<option value="1" id="1">企业管理员</option>
									<option value="2" id="2">分析人员</option>
									<option value="3" id="3">审核人员</option>
									<option value="4" id="4">政府人员</option>
							</select></td>
							</tr>
							<tr>
							<td>审核</td>
							<td><select name="us_flag" id="flag">
									<option value="0" id="AuF">审核未通过</option>
							<option value="1" id="AuT">通过审核</option>
							</select></td>
						</tr>
							<tr>
								<td>用户账户</td>
								<td class="p">
									<input type="text" name="us_account" placeholder="    账户名"/>
								</td>
							</tr>
							<tr>
								<td>密码</td>
								<td class="p">
									<input type="text" name="us_passwd" placeholder="    密码"/>
								</td>
							</tr>
							<tr>
								<td class="po">
									<input type="submit" value="提交" />
								</td>
								<td class="return">
									<input type="button" value="返回" />
								</td>
							</tr>
						</table>
					</form>
				</div>
			</div>
		</div>


</body>
</html>