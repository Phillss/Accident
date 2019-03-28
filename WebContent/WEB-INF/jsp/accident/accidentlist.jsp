<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../css/superstyle.css" />
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
			<div class="w">
				<a href="${pageContext.request.contextPath}/accident/ClassFinds.action?clazz=建筑">建筑</a>
				<a href="${pageContext.request.contextPath}/accident/ClassFinds.action?clazz=建筑">建筑</a>
				<a href="${pageContext.request.contextPath}/accident/ClassFinds.action?clazz=道路交通">道路交通</a>
				<a href="${pageContext.request.contextPath}/accident/ClassFinds.action?clazz=火灾">火灾</a>
				<a href="${pageContext.request.contextPath}/accident/ClassFinds.action?clazz=工矿商贸">工矿商贸</a>
			</div>
			<div class="sac">
				<div class="search">
					<form action="${pageContext.request.contextPath}/accident/likefind.action">
						<input type="submit" value="查找" class="i1">
						<input type="text" name="" id="" value="" class="i2">
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
								<td style="width: auto;">财产损失(万元)</td>
								<!-- <td>负责人</td>
								<td>所属公司</td>
								<td>事故报告</td> -->
								<td>所属行业</td>
								<td>删除</td>
								<td>下载</td>
							</tr>
							<c:forEach items="${listaccident.beanList}" var="item">
								<tr>
									<td>${item.acc_level}</td>
									<td>${item.acc_name}</td>
									<td><fmt:formatDate value="${item.acc_time}"
											pattern="yyyy-MM-dd" /></td>
									<td>${item.acc_site}</td>
									<td><c:if test="${item.acc_deathSum==0 }">-</c:if>
									<c:if test="${item.acc_deathSum!=0 }">${item.acc_deathSum}</c:if></td>
									<td><c:if test="${item.acc_injuredSum==0 }">-</c:if>
									<c:if test="${item.acc_injuredSum!=0 }">${item.acc_injuredSum}</c:if>
									</td>
									<td><c:if test="${item.acc_financial==0 }">-</c:if>
									<c:if test="${item.acc_financial!=0 }">${item.acc_financial}</c:if></td>
									<td>${item.acc_industryName}</td>
									<td class="de"><a
										href="${pageContext.request.contextPath}/accident/delete.action?acc_id=${item.acc_id}"></a></td>
									<td class="up"><a
										href="${pageContext.request.contextPath}/accident/downloadfile.action?id=${item.acc_id}"></a></td>
								</tr>
							</c:forEach>
						</table>
					</form>
					<div class="upload">
						<a
							href="${pageContext.request.contextPath}/accident/showadd.action"
							onclick="addaccidents()"></a>
					</div>
				</div>
				<div class="skipaccident">
					<h3>第${listaccident.current+1}页 /共${listaccident.total_pages}页</h3>
					<br> <a
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
			

		</div>
		<!--底部S-->
				<footer></footer>
				<!--底部E-->
	</div>
			



	
</body>
</html>