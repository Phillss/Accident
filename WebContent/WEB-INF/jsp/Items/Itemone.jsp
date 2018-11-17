<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Item detail one</title>
<%@ include file="/font.jsp" %>
</head>
<body>
<center>
	<table>
		<tr>
			<td>事故名称</td>
			<td>时间</td>
			<td>地点</td>
			<td>死亡人数</td>
			<td>伤亡人数</td>
			<td>财产损失</td>
			<td>责任人</td>
			<td>公司</td>
			<td>调查报告</td>
			<td>报告位置</td>
			<td>报告上传时间</td>
		</tr>
		<tr>
				<td>${item.acc_name}</td>
				<td><fmt:formatDate value="${item.acc_time}" pattern="yyyy-MM-dd"/></td>
				<td>${item.acc_site}</td>
				<td>${item.acc_death_sum}</td>
				<td>${item.acc_injured_sum}</td>
				<td>${item.acc_financial}</td>
				<td>${item.acc_boss}</td>
				<td>${item.acc_org}</td>
				<td>${item.acc_file_name}</td>
				<td>${item.acc_file_url}</td>
				<td><fmt:formatDate value="${item.acc_upload_time}" pattern="yyyy-MM-dd"/></td>
			</tr>
		<tr>
			<td><a href="${pageContext.request.contextPath}
			/Accident/findAllAccidents.action">返回</a></td>
		</tr>
	</table>
</center>
</body>
</html>