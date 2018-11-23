<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
<%@ include file="/font.jsp" %>
</head>
<body>
<center>
<form action="${pageContext.request.contextPath}/userhandler/findLikeUsers.action">
<input name="us_account" type="text">
<input type="submit" value="查找">			
</form>
<h1>列表信息</h1>
	<table>
		<tr>
			<td>角色</td>
			<td>账户名</td>
			<td>创建时间</td>
			<td>审核信息</td>
			<td></td>
			<td></td>
		</tr>
		<c:forEach items="${listuser.beanList}" var="item">
		<tr>
			<td><c:choose>
			<c:when test="${item.us_roles==0}">企业员工</c:when>
			<c:when test="${item.us_roles==1}">企业管理员</c:when>
			<c:when test="${item.us_roles==2}">分析人员</c:when>
			<c:when test="${item.us_roles==3}">审核人员</c:when>
			</c:choose></td>
			<td>${item.us_account}</td>
			<td><fmt:formatDate value="${item.us_createTime}" pattern="yyyy-MM-dd"/></td>
			<td><c:choose>
				<c:when test="${item.us_flag==0}">未过审</c:when>
				<c:when test="${item.us_flag==1}">通过审核</c:when>
			</c:choose></td>
			<td><a href="${pageContext.request.contextPath}
			/userhandler/updatelist.action?us_id=${item.us_id}">修改</a></td>
			<td><a href="${pageContext.request.contextPath}
			/userhandler/deleteUser.action?us_id=${item.us_id}">删除</a></td>
			</tr>
			</c:forEach>
		
	</table>
	
</center>

</body>
</html>