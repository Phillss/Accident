<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>超管</title>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/header.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/base.css" />
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/switch.js"></script>
		<script src="${pageContext.request.contextPath}/js/echarts.min.js"></script>
		<script type="text/javascript">			
//			$('#visit').click(function() {
//				$(this).addClass('bgcolor');
//				$(this).siblings().removeClass('bgcolor');
//			});
			
//			下拉框
			function ggle() {
				$('.bu_tr_cd_co').slideToggle(500);
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
						$(this).css('color','white');
					}
				});
				$('.bu_tr_cd_co').bind({
					mouseover:function(){
						$(this).css('background-color','#d1d5dc');
						$(this).css('color','white');
					},
					mouseout:function(){
						$(this).css('background-color','#e2e5e9');
						$(this).css('color','#213862');
					}
				});
			});
		</script>
		<style type="text/css">
			/*.bgcolor {
				color: white;
				background-color: #213862;
			}*/
		</style>
			</head>
		<!--顶部S-->
		<div class="head">
			<!--logo-->
			<div class="im">

			</div>

			<%-- <!-- 个人中心和退出 -->
			<div class="dropdown fr bu">
			<!-- 按钮 -->
			<div class="fr">
					<button class="btn btn-info" data-toggle="dropdown">
	            		<!-- Person -->
	            		<span class="caret"></span>
	            	</button>
					<ul class="dropdown-menu">
						<li>
							<a href="#">个人中心</a>
						</li>
						<li>
							<a href="${pageContext.request.contextPath}/shiro/logout.action">退出</a>
						</li>
					</ul>
				</div>
				<div class="fr">
					<img src="img/4.jpg" />
				</div>
			</div> --%>

		</div>
		<!--顶部E-->

		<!--导航栏S-->
		<div class="topnav">
			<table>
				<tr>
					<td>
						<a href="${pageContext.request.contextPath}
					/course/findAll.action" >
							课程
						</a>
					</td>
					<td>
						<a href="#" >
							行业法规(建设中……)
						</a>
					</td>
					<td>
						<a href="${pageContext.request.contextPath}
			/accident/findall.action" >
							事故报告管理
						</a>
					</td>
					<td>
						<a href="#" >
							管理分类(建设中……)
						</a>
					</td>
					<td id="chart">
						<a href="${pageContext.request.contextPath}
				/eChar.jsp" >
							统计图
						</a>
					</td>
					<td>
						<a href="${pageContext.request.contextPath}
					/userhandler/findAllUsers.action" >
							账户管理
						</a>
					</td>
					<td>
						<a href="#" >
							记录管理(建设中……)
						</a>
					</td>
					<td>
						<a href="#" >
							题库(建设中……)
						</a>
					</td>
				</tr>
			</table>
		</div>