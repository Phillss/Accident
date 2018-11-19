<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>事故信息列表</title>
<%@ include file="/font.jsp" %>
<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="css/header.css" />
		<link rel="stylesheet" type="text/css" href="css/base.css" />
		<!--<script type="text/javascript" src="js/switch.js"></script>-->
		<script src="js/echarts.min.js"></script>
		<script type="text/javascript">	
//			下拉框
			function ggle() {
				$('.bu_tr_cd_co').slideToggle(500);
			}
			function ggl() {
				$('.rank').slideToggle(500);
			}
			function gg() {
				$('.rank').slideToggle(500);
			}
//			238
			$(function(){
				$('.menu').bind({
					mouseover:function(){
						$(this).css('background-color','#213862');
						$(this).css('color','white');
					},
					mouseout:function(){
						$(this).css('background-color','#d1d5dc');
						$(this).css('color','#213862');
					}
				});
				$('.bu_tr_cd_co').bind({
					mouseover:function(){
						$(this).css('background-color','#213862');
						$(this).css('color','white');
					},
					mouseout:function(){
						$(this).css('background-color','#e2e5e9');
						$(this).css('color','#213862');
					}
				});
				$('.rank').bind({
					mouseover:function(){
						$(this).css('background-color','#213862');
						$(this).css('color','white');
					},
					mouseout:function(){
						$(this).css('background-color','#e2e5e9');
						$(this).css('color','#213862');
					}
				});
			});
		</script>
</head>
<body>
<center>
<h1 style="color: red">${message}</h1>
<form action="${pageContext.request.contextPath}/accident/.action">
<input name="name" type="text">
<input type="submit" value="查找事故信息">			
</form>
<h1>事故信息列表</h1>
	<table>
		<tr>
			<td>事故等级</td>
			<td>事故名称</td>
			<td>发生时间</td>
			<td>地点</td>
			
			<td>死亡人数</td>
			<td>受伤人数</td>
			<td>财产损失</td>
			<td>负责人</td>
			<td>所属公司</td>
			<td>事故报告</td>
			<td>所属行业</td>
			
			<td></td>
			<td></td>
		</tr>
		<c:forEach items="${listaccident.beanList}" var="item">
		<tr>
			<td>${item.acc_level}</td>
			<td>${item.acc_name}</td>
			<td><fmt:formatDate value="${item.acc_time}" pattern="yyyy-MM-dd"/></td>
			<td>${item.acc_site}</td>
			<td>${item.acc_deathSum}</td>
			<td>${item.acc_injuredSum}</td>
			<td>${item.acc_financial}</td>
			<td>${item.acc_boss}</td>
			<td>${item.acc_org}</td>
			<td>${item.acc_fileName}</td>
			<td>${item.acc_industryName}</td>
			<td><a href="${pageContext.request.contextPath}
			/accident/.action?us_id=${item.acc_id}">修改</a></td>
			<td><a href="${pageContext.request.contextPath}
			/accident/.action?us_id=${item.acc_id}">删除</a></td>
			</tr>
			</c:forEach>
		
	</table>
	
	<h3>第${listaccident.current+1}页 /共${listaccident.total_pages}页</h3>
	<a href="${pageContext.request.contextPath}/accident/findall.action?current=0">首页</a>
	<c:if test="${listaccident.current>0 }">
	<a href="${pageContext.request.contextPath}
	/accident/findall.action?current=${listaccident.current-1}">上一页</a>
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
	<c:if test="${listaccident.current+1<listaccident.total_pages}">
	<a href="${pageContext.request.contextPath}
	/accident/findall.action?current=${listaccident.current+1}">下一页</a>
	<a href="${pageContext.request.contextPath}
	/accident/findall.action?current=${listaccident.total_pages-1}">尾页</a>
	</c:if>
</center>

</body>
</html>