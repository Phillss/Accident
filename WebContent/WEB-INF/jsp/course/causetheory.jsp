<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>事故致因</title>
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
						<td><a href="${pageContext.request.contextPath}
						/course/findAll.action" onclick="course()"> 管理课程 </a></td>
					</tr>
					<tr id="visit">
						<td><a href="${pageContext.request.contextPath}/course/addcourse.action" onclick="addcourse()"> 添加课程 </a></td>
					</tr>
					<tr id="visit">
						<td><a href="${pageContext.request.contextPath}/course/theory.action" onclick="theory()"> 事故致因理论 </a></td>
					</tr>
				</table>
			</div>
			<div class="fr Causationtheory">
				<form action="" method="post">
					<table>
						<tr>
							<th style="text-align: center;">致因理论名称</th>
							<th style="text-align: center;">理论提出者</th>
							<th style="text-align: center;">年份</th>
							<th style="text-align: center;">提出地点</th>
							<th style="text-align: center;">理论概要</th>
							<th style="width: 60px; text-align: center;">上传</th>
							<th style="width: 60px; text-align: center;">删除</th>
						</tr>
						<tr>
							<td>123</td>
							<td>123</td>
							<td>123</td>
							<td>123</td>
							<td>123</td>
							<td><label for="uploadFile" style="text-align: center;"></label>&nbsp;

								<input type="file" id="uploadFile"
								style="position: absolute; clip: rect(0, 0, 0, 0);"></td>
							<td>
								<div class="de">
									<a href="#"></a>
								</div>
							</td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>

	<!--底部S-->
	<footer></footer>
	<!--底部E-->
</body>
</html>