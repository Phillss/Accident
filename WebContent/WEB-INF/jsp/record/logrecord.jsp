<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>记录</title>
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
		<div class="t6 main">
			<div class="sac">
				<div class="search fr">
					<input type="text" name="" id="" value="" />
				</div>
				<div class="accident">
					<form action="">
						<table>
							<tr>
								<th class="number">信息</th>
								<th class="manage">操作人员</th>
								<th class="manage">操作时间</th>
								<th class="manage">操作类型</th>
							</tr>
							<c:forEach items="${listlog.beanList}" var="item">
								<tr>
									<td>${item.lo_text}</td>
									<td>${item.lo_name}</td>
									<td><fmt:formatDate value="${item.lo_createTime}"
											pattern="yyyy-MM-dd HH:mm:ss" /></td>
									<td><c:choose>
											<c:when test="${item.lo_class==0}">员工管理记录</c:when>
											<c:when test="${item.lo_class==1}">课程更改记录</c:when>
											<c:when test="${item.lo_class==2}">岗位管理记录</c:when>
											<c:when test="${item.lo_class==3}">分析人员提交记录</c:when>
											<c:when test="${item.lo_class==4}">分析人员未通过记录</c:when>
											<c:when test="${item.lo_class==5}">分析人员通过记录</c:when>
											<c:when test="${item.lo_class==6}">审核人员未通过记录</c:when>
											<c:when test="${item.lo_class==7}">审核人员通过记录</c:when>
											<c:when test="${item.lo_class==8}">账户管理记录</c:when>
											<c:when test="${item.lo_class==9}">课程管理记录</c:when>
											<c:when test="${item.lo_class==10}">事故管理记录</c:when>
											<c:when test="${item.lo_class==11}">分类管理记录</c:when>
										</c:choose></td>
								</tr>
							</c:forEach>
						</table>
					</form>
				</div>
			</div>
		</div>
		<div class="skip">

			<h3>第${listlog.current+1}页 /共${listlog.total_pages}页</h3>

			<a
				href="${pageContext.request.contextPath}/log/loglist.action?current=0">首页</a>
			<c:if test="${listlog.current>0 }">
				<a
					href="${pageContext.request.contextPath}
	/log/loglist.action?current=${listlog.current-1}">上一页</a>
			</c:if>
			<c:if test="${listlog.current+1<listlog.total_pages}">
				<a
					href="${pageContext.request.contextPath}
	/log/loglist.action?current=${listlog.current+1}">下一页</a>

				<a
					href="${pageContext.request.contextPath}
	/log/loglist.action?current=${listlog.total_pages-1}">尾页</a>
			</c:if>
		</div>
	</div>

	<!--底部S-->
	<footer></footer>
	<!--底部E-->
</body>
</html>