<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>事故信息列表</title>
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
		<div class="t2 main">
			<div class="sac">
				<div class="fr search">
					<form>
						<input type="text" name="" id="" value="" />
					</form>
				</div>
				<div class="accident">
					<form action="">
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
								<td>删除</td>
								<td></td>
							</tr>
							<c:forEach items="${listaccident.beanList}" var="item">
								<tr>
									<td>${item.acc_level}</td>
									<td>${item.acc_name}</td>
									<td><fmt:formatDate value="${item.acc_time}"
											pattern="yyyy-MM-dd" /></td>
									<td>${item.acc_site}</td>
									<td>${item.acc_deathSum}</td>
									<td>${item.acc_injuredSum}</td>
									<td>${item.acc_financial}</td>
									<td>${item.acc_boss}</td>
									<td>${item.acc_org}</td>
									<td>${item.acc_fileName}</td>
									<td>${item.acc_industryName}</td>
									<td class="de"><a href="${pageContext.request.contextPath}/accident/delete.action?acc_id=${item.acc_id}"></a></td>
									<td><a href="${pageContext.request.contextPath}/accident/downloadfile.action?id=${item.acc_id}">下载</a></td>
								</tr>
							</c:forEach>
						</table>
					</form>
					<div class="upload">
						<a href="${pageContext.request.contextPath}/accident/showadd.action" onclick="addaccidents()"></a>
					</div>
				</div>
			</div>
		</div>
		<div class="skip">
			<h3>第${listaccident.current+1}页 /共${listaccident.total_pages}页</h3><br>
			<a
				href="${pageContext.request.contextPath}/accident/findall.action?current=0">首页</a>
			<c:if test="${listaccident.current>0 }">
				<a
					href="${pageContext.request.contextPath}
	/accident/findall.action?current=${listaccident.current-1}">上一页</a>
			</c:if>
			<c:if test="${listaccident.current+1<listaccident.total_pages}">
				<a
					href="${pageContext.request.contextPath}
	/accident/findall.action?current=${listaccident.current+1}">下一页</a>
				<a
					href="${pageContext.request.contextPath}
	/accident/findall.action?current=${listaccident.total_pages-1}">尾页</a>
			</c:if>
		</div>
	</div>




	<!--底部S-->
	<footer></footer>
	<!--底部E-->
</body>
</html>