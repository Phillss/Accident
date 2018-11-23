<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>课程列表</title>
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
						<td><a href="${pageContext.request.contextPath}/course/addcourse.action" onclick="addcourse()"> 添加课程 </a></td>
					</tr>
					<tr id="visit">
						<td><a href="${pageContext.request.contextPath}/course/theory.action" onclick="theory()"> 事故致因理论 </a></td>
					</tr>
				</table>
			</div>
			<div class="fl cour">
				<form action="" method="post">
					<table>
						<tr>
							<th style="text-align: center;">课程编号</th>
							<th style="text-align: center;">课程名称</th>
							<th style="text-align: center;">所属行业</th>
							<th style="text-align: center;">课程介绍</th>
							<th style="text-align: center;">上传时间</th>
							<th style="width: 60px; text-align: center;">修改</th>
							<th style="width: 60px; text-align: center;">删除</th>
						</tr>
						<c:forEach items="${listcourse.beanList}" var="item">
							<tr>
								<td>${item.cu_id}</td>
								<td>${item.cu_name}</td>
								<td>${item.cu_industry}</td>
								<td>${item.cu_introduce}</td>
								<td><fmt:formatDate value="${item.cu_uploadTime}"
										pattern="yyyy-MM-dd" /></td>
								<td>
									<div class="rs">
										<a
											href="${pageContext.request.contextPath}
			/course/updatelist.action?cu_id=${item.cu_id}"></a>
									</div>
								</td>
								<td>
									<div class="de">
										<a
											href="${pageContext.request.contextPath}
			/course/deletecourse.action?cu_id=${item.cu_id}"></a>
									</div>
								</td>
							</tr>
						</c:forEach>
					</table>
				</form>
			</div>
		</div>
		<div class="skip main">
			<h3>第${listcourse.current+1}页 /共${listcourse.total_pages}页</h3><br>
			<a
				href="${pageContext.request.contextPath}
						/course/findAll.action?current=0">首页</a>
			<c:if test="${listcourse.current>0 }">
				<a
					href="${pageContext.request.contextPath}
	/course/findAll.action?current=${listcourse.current-1}">上一页</a>
			</c:if>
			<c:if test="${listcourse.current+1<listcourse.total_pages}">
				<a
					href="${pageContext.request.contextPath}
	/course/findAll.action?current=${listcourse.current+1}">下一页</a>
				<a
					href="${pageContext.request.contextPath}
	/course/findAll.action?current=${listcourse.total_pages-1}">尾页</a>
			</c:if>
		</div>
	</div>





	<!--底部S-->
	<footer></footer>
	<!--底部E-->
</body>
</html>