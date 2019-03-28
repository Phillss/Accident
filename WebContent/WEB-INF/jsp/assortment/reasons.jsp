<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../css/Analyststyle.css" />
<title>原因列表</title>
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
<head>
		<meta charset="UTF-8">
		<title>超管</title>
		<script type="text/javascript" src="../js/jquery.min.js"></script>
		<script type="text/javascript" src="../js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="../css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="../css/superstyle.css" />
		<link rel="stylesheet" type="text/css" href="../css/base.css" />
		<script src="../js/echarts.min.js"></script>
		<!-- <script type="text/javascript">	
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
		</script> -->
	</head>

	<body>
		<div class="t">
			<div class="t2 mai">
			<div class="fl inca">
					<table>
						<tr id="visit">
							<td>
								<a href="${pageContext.request.contextPath}/assort/industrylist.action">
									行业
								</a>
							</td>
						</tr>
						<tr id="visit">
							<td>
								<a href="${pageContext.request.contextPath}/assort/causelist.action">
									原因
								</a>
							</td>
						</tr>
						<tr id="visit">
							<td>
								<a onclick="cause()">
									原因分类
								</a>
								<a href="${pageContext.request.contextPath}/assort/reasonClass.action?clazz=根源原因" class="l1" onclick="cause1()" style="display:none;">
									根源原因
								</a>
								<a href="${pageContext.request.contextPath}/assort/reasonClass.action?clazz=根本原因" class="l1" onclick="cause2()" style="display:none;">
									根本原因
								</a>
								<a href="${pageContext.request.contextPath}/assort/reasonClass.action?clazz=间接原因" class="l1" onclick="cause3()" style="display:none;">
									间接原因
								</a>
								<a class="l1" onclick="cause4()" style="display:none;">
									直接原因
								</a>
								<a href="${pageContext.request.contextPath}/assort/reasonClass.action?clazz=VO" class="l2" style="display:none;">
									VO
								</a>
								<a href="${pageContext.request.contextPath}/assort/reasonClass.action?clazz=AV" class="l2" style="display:none;">
									VA
								</a>
								<a href="${pageContext.request.contextPath}/assort/reasonClass.action?clazz=VC" class="l2" style="display:none;">
									VC
								</a>
								<a href="${pageContext.request.contextPath}/assort/reasonClass.action?clazz=HA" class="l2" style="display:none;">
									HA
								</a>
								<a href="${pageContext.request.contextPath}/assort/reasonClass.action?clazz=AA" class="l2" style="display:none;">
									AA
								</a>
								<a href="${pageContext.request.contextPath}/assort/reasonClass.action?clazz=AC" class="l2" style="display:none;">
									AC
								</a>
								<a href="${pageContext.request.contextPath}/assort/reasonClass.action?clazz=HO" class="l2" style="display:none;">
									HO
								</a>
								<a href="${pageContext.request.contextPath}/assort/reasonClass.action?clazz=HA" class="l2" style="display:none;">
									HA
								</a>
								<a href="${pageContext.request.contextPath}/assort/reasonClass.action?clazz=HC" class="l2" style="display:none;">
									HC
								</a>
								<a href="${pageContext.request.contextPath}/assort/reasonClass.action?clazz=V" class="l2" style="display:none;">
									V
								</a>
								<a href="${pageContext.request.contextPath}/assort/reasonClass.action?clazz=A" class="l2" style="display:none;">
									A
								</a>
								<a href="${pageContext.request.contextPath}/assort/reasonClass.action?clazz=H" class="l2" style="display:none;">
									H
								</a>
							</td>
						</tr>
					</table>
				</div>
			
			<div class="sac">
					<div class="search" style="margin-right: -60px;">
						<input type="submit" value="查找" class="i1">
						<input type="text" name="" id="" value="" class="i2">
					</div>
					<div class="accident" style="margin-left: 60px;">
						<form action="">
							<table>
								<tr>
									<th>事故编号</th>
									<th>原因分析</th>
									<th>原因分类</th>
									<th>违反条款</th>
									<th>对应措施</th>
									<th>所属行业</th>
									<th>删除</th>
									<th>下载</th>
								</tr>
								<c:forEach items="${reasonlist.beanList}" var="item">
								<tr>
									<td>${item.re_acc_number}</td>
									<td>${item.re_reasonAn}</td>
									<td>${item.re_reasonClass}</td>
									<td>${item.re_Tiaokuan}</td>
									<td>${item.re_measure}</td>
									<td>${item.re_industry}</td>
									<td class="de"><a
										href="${pageContext.request.contextPath}/assort/delete.action?acc_id=${item.re_id}"></a></td>
										<!--需要修改  -->
									<td class="up"><a
										href="${pageContext.request.contextPath}/assort/downloadfile.action?id=${item.re_id}"></a></td>
										<!--需要修改  -->
								</tr>
							</c:forEach>
							</table>
						</form>
					</div>
			</div>
			</div>
			<div class="skipaccident">
					<h3>第${reasonlist.current+1}页 /共${reasonlist.total_pages}页</h3>
					<br> <a
						href="${pageContext.request.contextPath}/assort/reason.action?current=0">首页</a>
					<c:if test="${reasonlist.current>0 }">
						<a
							href="${pageContext.request.contextPath}
	/assort/reason.action?current=${reasonlist.current-1}">上一页</a>
					</c:if>
					<c:if test="${reasonlist.current+1<reasonlist.total_pages}">
						<a
							href="${pageContext.request.contextPath}
	/assort/reason.action?current=${reasonlist.current+1}">下一页</a>
						<a
							href="${pageContext.request.contextPath}
	/assort/reason.action?current=${reasonlist.total_pages-1}">尾页</a>
					</c:if>
				</div>
			
		</div>

		<!--底部S-->
		<footer></footer>
		<!--底部E-->
	</body>
</html>