<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>课程列表</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/header.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/base.css" />
<!--		<script type="text/javascript" src="js/switch.js"></script>-->
<script src="${pageContext.request.contextPath}/js/echarts.min.js"></script>
<%@ include file="/font.jsp"%>
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
	$(function() {
		$('.menu').bind({
			mouseover : function() {
				$(this).css('background-color', '#213862');
				$(this).css('color', 'white');
			},
			mouseout : function() {
				$(this).css('background-color', '#d1d5dc');
				$(this).css('color', '#213862');
			}
		});
		$('.bu_tr_cd_co').bind({
			mouseover : function() {
				$(this).css('background-color', '#213862');
				$(this).css('color', 'white');
			},
			mouseout : function() {
				$(this).css('background-color', '#e2e5e9');
				$(this).css('color', '#213862');
			}
		});
		$('.rank').bind({
			mouseover : function() {
				$(this).css('background-color', '#213862');
				$(this).css('color', 'white');
			},
			mouseout : function() {
				$(this).css('background-color', '#e2e5e9');
				$(this).css('color', '#213862');
			}
		});
	});
</script>
</head>
<body>


	<div class="t">
		<div class="t0 main">
			<div class="fl tle">
				<table>
					<tr id="visit">
						<td><a href="#" onclick="course()"> 管理课程 </a></td>
					</tr>
					<tr id="visit">
						<td><a href="#" onclick="addcourse()"> 添加课程 </a></td>
					</tr>
					<tr id="visit">
						<td><a href="#" onclick="theory()"> 事故致因理论 </a></td>
					</tr>
				</table>
			</div>
			<div class="fr cour">
				<form action="" method="post">
					<table>
						<tr>
							<th style="text-align: center;">课程名称</th>
							<th style="text-align: center;">所属行业</th>
							<th style="text-align: center;">课程介绍</th>
							<th style="text-align: center;">上传时间</th>
							<th style="width: 60px; text-align: center;">修改</th>
							<th style="width: 60px; text-align: center;">删除</th>
						</tr>
						<c:forEach items="${listcourse.beanList}" var="item">
							<tr>
								<td>${item.cu_name}</td>
								<td>${item.cu_industry}</td>
								<td>${item.cu_introduce}</td>
								<td><fmt:formatDate value="${item.cu_uploadTime}"
										pattern="yyyy-MM-dd" /></td>
								<td><a
									href="${pageContext.request.contextPath}
			/course/updatecourse.action?us_id=${item.cu_id}">修改</a></td>
								<td><a
									href="${pageContext.request.contextPath}
			/course/deletecourse.action?us_id=${item.cu_id}">删除</a></td>
							</tr>
						</c:forEach>
					</table>
				</form>
			</div>
		</div>
		</div>



		<h3>第${listcourse.current+1}页 /共${listcourse.total_pages}页</h3>
		<a
			href="${pageContext.request.contextPath}/userhandler/findAllUsers.action?current=0">首页</a>
		<c:if test="${listcourse.current>0 }">
			<a
				href="${pageContext.request.contextPath}
	/userhandler/findAllUsers.action?current=${listcourse.current-1}">上一页</a>
		</c:if>
		<c:if test="${listcourse.current+1<listcourse.total_pages}">
			<a
				href="${pageContext.request.contextPath}
	/userhandler/findAllUsers.action?current=${listuser.current+1}">下一页</a>
			<a
				href="${pageContext.request.contextPath}
	/userhandler/findAllUsers.action?current=${listcourse.total_pages-1}">尾页</a>
		</c:if>

		<!--底部S-->
		<footer></footer>
		<!--底部E-->
</body>
</html>