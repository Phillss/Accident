<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
		<div class="t5 main">
			<div class="fl w">
				<div class="menu" onclick="">政府</div>
				<div class="menu" onclick="">企业</div>
				<div class="menu" onclick="">分析人员</div>
				<div class="menu" onclick="">审核人员</div>
			</div>
			<div class="fl sac">
				<div class="search fr">
					<form action="">
						<input type="text" name="" id="" value="" />
					</form>
				</div>
				<div class="accident fl">
					<form action="">
						<table>
							<tr>
								<th>角色</th>
								<th>账户名</th>
								<th>创建时间</th>
								<th>审核信息</th>
								<th>修改</th>
								<th>删除</th>
							</tr>
							<c:forEach items="${listuser.beanList}" var="item">
								<tr>
									<td><c:choose>
											<c:when test="${item.us_roles==0}">企业员工</c:when>
											<c:when test="${item.us_roles==1}">企业管理员</c:when>
											<c:when test="${item.us_roles==2}">分析人员</c:when>
											<c:when test="${item.us_roles==3}">审核人员</c:when>
											<c:when test="${item.us_roles==4}">政府人员</c:when>
										</c:choose></td>
									<td>${item.us_account}</td>
									<td><fmt:formatDate value="${item.us_createTime}"
											pattern="yyyy-MM-dd" /></td>
									<td><c:choose>
											<c:when test="${item.us_flag==0}">未过审</c:when>
											<c:when test="${item.us_flag==1}">通过审核</c:when>
										</c:choose></td>
									<td>
										<div class="po">
											<a
												href="${pageContext.request.contextPath}
			/userhandler/updatelist.action?us_id=${item.us_id}"></a>
										</div>
									</td>

									<td>
										<div class="de">
											<a
												href="${pageContext.request.contextPath}
			/userhandler/deleteUser.action?us_id=${item.us_id}"></a>
										</div>
									</td>
								</tr>
							</c:forEach>

						</table>
					</form>
				</div>
			</div>
		</div>
		<div class="skip main">

			<h3>第${listuser.current+1}页 /共${listuser.total_pages}页</h3>

			<a
				href="${pageContext.request.contextPath}/userhandler/findAllUsers.action?current=0">首页</a>
			<c:if test="${listuser.current>0 }">
				<a
					href="${pageContext.request.contextPath}
	/userhandler/findAllUsers.action?current=${listuser.current-1}">上一页</a>
			</c:if>
			<c:if test="${listuser.current+1<listuser.total_pages}">
				<a
					href="${pageContext.request.contextPath}
	/userhandler/findAllUsers.action?current=${listuser.current+1}">下一页</a>

				<a
					href="${pageContext.request.contextPath}
	/userhandler/findAllUsers.action?current=${listuser.total_pages-1}">尾页</a>
			</c:if>
		</div>
	</div>





	<!--底部S-->
	<footer></footer>
	<!--底部E-->
</body>
</html>