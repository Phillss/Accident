<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
		<div class="t">
			<div class="t2 main">
				<div class="sac">
					<div class="search">
						<input type="text" name="" id="" value="" />
					</div>
					<div class="accident">
						<form action="">
							<table>
								<tr>
									<th>事故编号</th>
									<th>行业分类</th>
									<th>原因分析</th>
									<th>原因分类</th>
									<th>违反条款</th>
									<th>对应措施</th>
								</tr>
								
								<tr>
									<td>1</td>
									<td>2</td>
									<td>3</td>
									<td>4</td>
									<td>5</td>
									<td>6</td>
								</tr>
							</table>
						</form>
					</div>
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

		<!--底部S-->
			<footer></footer>
			<!--底部E-->
	</body>
</html>