<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>课程列表</title>
<%@ include file="/font.jsp" %>
</head>
<body>
<center>
<h1 style="color: red">${message}</h1>
<form action="${pageContext.request.contextPath}/course/likefinds.action">
<input name="name" type="text">
<input type="submit" value="查找课程">			
</form>
<h1>课程列表</h1>
	<table>
		<tr>
			<td>所属行业</td>
			<td>课程名字</td>
			<td>课程介绍</td>
			<td>上传时间</td>
			<td></td>
			<td></td>
		</tr>
		<c:forEach items="${listcourse.beanList}" var="item">
		<tr>
			<td>${item.cu_industry}</td>
			<td>${item.cu_name}</td>
			<td>${item.cu_introduce}</td>
			<td><fmt:formatDate value="${item.cu_uploadTime}" pattern="yyyy-MM-dd"/></td>
			<td><a href="${pageContext.request.contextPath}
			/course/updatecourse.action?us_id=${item.cu_id}">修改</a></td>
			<td><a href="${pageContext.request.contextPath}
			/course/deletecourse.action?us_id=${item.cu_id}">删除</a></td>
			</tr>
			</c:forEach>
		
	</table>
	
	<h3>第${listcourse.current+1}页 /共${listcourse.total_pages}页</h3>
	<a href="${pageContext.request.contextPath}/userhandler/findAllUsers.action?current=0">首页</a>
	<c:if test="${listcourse.current>0 }">
	<a href="${pageContext.request.contextPath}
	/userhandler/findAllUsers.action?current=${listcourse.current-1}">上一页</a>
	</c:if>
	<!-- private int tr;  //总记录数
	private int tp;  //总页数
	private int pp=10;   //每页记录数
	private int pr;  //当前页码 -->
	
	<%-- <c:choose>
		<c:when test="${pb.tp<=10 }">
			<c:set var="begin" value="${1 }"></c:set>
			<c:set var="end" value="${pb.tp }"></c:set>
		</c:when>
		<c:otherwise>
			<c:set var="begin" value="${pb.pr-5 }"></c:set>
			<c:set var="end" value="${pb.pr+4 }"></c:set>
			<c:if test="${begin<1 }">
				<c:set var="begin" value="1"></c:set>
				<c:set var="end" value="${10 }"></c:set>
			</c:if>
			<c:if test="${end>pb.tp }">
				<c:set var="begin" value="${pb.tp-9 }"></c:set>
				<c:set var="end" value="${pb.tp }"></c:set>
			</c:if>
		</c:otherwise>
	</c:choose>
	<c:forEach var="i" begin="${begin }" end="${end }">
		<a href="<c:url value='processServlet?method=queryPage&pr=${i }'></c:url>">[${i }]</a>  
	</c:forEach> --%>
	<c:if test="${listcourse.current+1<listcourse.total_pages}">
	<a href="${pageContext.request.contextPath}
	/userhandler/findAllUsers.action?current=${listuser.current+1}">下一页</a>
	<a href="${pageContext.request.contextPath}
	/userhandler/findAllUsers.action?current=${listcourse.total_pages-1}">尾页</a>
	</c:if>
</center>

</body>
</html>