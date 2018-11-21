<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"><html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>课程</title>
		<%@ include file="/font.jsp" %>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/header.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/base.css" />
		<!--<script type="text/javascript" src="js/switch.js"></script>-->
		<script src="${pageContext.request.contextPath}/js/echarts.min.js"></script>
		<script type="text/javascript">	
//			ä¸ææ¡
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
		<!--é¡¶é¨S-->
		<div class="head">
			<!--logo-->
			<div class="im"></div>
			<!--éåº-->
			<div class="fr exit">
				<input type="button" name="" id="" />
			</div>

		</div>
		<!--é¡¶é¨E-->

		<!--å¯¼èªæ S-->
		<div class="topnav">
			<table>
				<tr>
					<td>
						<a href="#" onclick="table1()">
							è¯¾ç¨
						</a>
					</td>
					<td>
						<a href="#" onclick="table2()">
							è¡ä¸æ³è§
						</a>
					</td>
					<td>
						<a href="#" onclick="table3()">
							äºææ¥åç®¡ç
						</a>
					</td>
					<td>
						<a href="#" onclick="table4()">
							ç®¡çåç±»
						</a>
					</td>
					<td id="chart">
						<a href="#" onclick="table5()">
							ç»è®¡å¾
						</a>
					</td>
					<td>
						<a href="#" onclick="table6()">
							è´¦æ·ç®¡ç
						</a>
					</td>
					<td>
						<a href="#" onclick="table7()">
							è®°å½ç®¡ç
						</a>
					</td>
					<td>
						<a href="#" onclick="table8()">
							é¢åº
						</a>
					</td>
				</tr>
			</table>
		</div>
		<!--å¯¼èªæ E-->
		
		
		<div class="t">
			<div class="t0 main">
				<div class="fl tle">
					<table>
						<tr id="visit">
							<td>
								<a href="#" onclick="course()">
									ç®¡çè¯¾ç¨
								</a>
							</td>
						</tr>
						<tr id="visit">
							<td>
								<a href="#" onclick="addcourse()">
									æ·»å è¯¾ç¨
								</a>
							</td>
						</tr>
						<tr id="visit">
							<td>
								<a href="#" onclick="theory()">
									äºæè´å çè®º
								</a>
							</td>
						</tr>
					</table>
				</div>
				<div class="fl import">
					<form>
						<label for="audioFile" class="l1" style="text-align: center;">æ·»å è§é¢</label>&nbsp;

						<input type="file" id="audioFile" style="position:absolute;clip:rect(0 0 0 0);"><br /><br />

						<label for="xFile" class="l2">æ·»å å¹è®­åå®¹</label>&nbsp;

						<input type="file" id="xFile" style="position:absolute;clip:rect(0 0 0 0);"><br /><br />

						<label for="information" class="l3">æ·»å åºç¡ä¿¡æ¯</label>&nbsp;

						<input type="file" id="information" style="position:absolute;clip:rect(0 0 0 0);"><br /><br />

						<label for="test" class="l4">æ·»å è¯¾åé¢</label>&nbsp;

						<input type="file" id="test" style="position:absolute;clip:rect(0 0 0 0);"><br /><br />
					</form>
				</div>
			</div>
		</div>
		
		<!--åºé¨S-->
		<footer></footer>
		<!--åºé¨E-->
	</body>
</html>
