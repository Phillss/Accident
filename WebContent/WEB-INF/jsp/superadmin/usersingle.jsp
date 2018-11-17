<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>更改用户信息</title>
<%@ include file="/font.jsp" %>
<script type="text/javascript">
	window.onload = function() {
		var role = ${showuser.us_roles}
		var AU=${showuser.us_flag}
		var selectR=document.getElementById("selectRoles");
		var selectF=document.getElementById("flag");
		var arr=selectR.getElementsByTagName("option");
		var ar=selectF.getElementsByTagName("option");
		arr[role].selected="selected";
		ar[AU].selected="selected";
	}
</script>
</head>
<body>
	<center>
		<form
			action="${pageContext.request.contextPath}/userhandler/update.action"
			method="post">
			<input type="hidden" name="us_id" value="${showuser.us_id}">
			<table>
				<tr>
					<td>用户权限</td>
					<td><select name="us_roles" id="selectRoles">
							<option value="0" id="0">企业员工</option>
							<option value="1" id="1">企业管理员</option>
							<option value="2" id="2">分析人员</option>
							<option value="3" id="3">审核人员</option>
					</select></td>
				</tr>
				<tr>
					<td>用户账户</td>
					<td>${showuser.us_account}</td>
				</tr>
				<tr>
					<td>创建时间</td>
					<td><fmt:formatDate value="${showuser.us_createTime}" pattern="yyyy-MM-dd"/></td>
				</tr>
				<tr>
					<td>审核</td>
					<td><select name="us_flag" id="flag">
							<option value="0" id="AuF">审核未通过</option>
							<option value="1" id="AuT">通过审核</option>
					</select></td>
				</tr>
				<tr>
					<td><input type="submit" value="提交"></td>
					<td><a
						href="${pageContext.request.contextPath}/userhandler/findAllUsers.action">返回</a></td>
				</tr>
			</table>
		</form>
	</center>

</body>
</html>