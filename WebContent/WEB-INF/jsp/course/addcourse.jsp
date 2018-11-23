<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"><html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>添加课程</title>
		<%@ include file="/font.jsp" %>
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

		<div class="t">
			<div class="t0 main">
				<div class="fl tle">
					<table>
						<tr id="visit">
							<td>
								<a href="#" onclick="course()">
								管理课程
								</a>
							</td>
						</tr>
						<tr id="visit">
							<td>
								<a href="${pageContext.request.contextPath}/course/addcourse.action" onclick="addcourse()">
									添加课程
								</a>
							</td>
						</tr>
						<tr id="visit">
							<td>
								<a href="#" onclick="theory()">
									事故致因理论
								</a>
							</td>
						</tr>
					</table> 
				</div>
				<div class="fl import">
					<form>
						<label for="audioFile" class="l1" style="text-align: center;">添加视频</label>&nbsp;

						<input type="file" id="audioFile" style="position:absolute;clip:rect(0 0 0 0);"><br /><br />

						<label for="xFile" class="l2">添加培训内容</label>&nbsp;

						<input type="file" id="xFile" style="position:absolute;clip:rect(0 0 0 0);"><br /><br />

						<label for="information" class="l3">添加基础信息</label>&nbsp;

						<input type="file" id="information" style="position:absolute;clip:rect(0 0 0 0);"><br /><br />

						<label for="test" class="l4">添加课后题</label>&nbsp;

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
