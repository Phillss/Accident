<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>法规列表</title>
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
		<div class="t1 main">
			<div class="regulation">
				<form action="" method="post">
					<table>
						<tr>
							<th style="text-align: center;">法律法规名称</th>
							<th style="text-align: center;">制定修订(生效)日期</th>
							<th style="text-align: center;">修订次数</th>
							<th style="text-align: center;">编号</th>
							<th style="text-align: center;">颁发机关</th>
							<th style="text-align: center;">类别</th>
							<th style="text-align: center;">适用行业</th>
							<th style="width: 60px; text-align: center;">查看</th>
							<th style="width: 60px; text-align: center;">删除</th>
						</tr>
						<tr>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td>
								<div class="rs">
									<a href=".txt" download=""></a>
								</div>

							</td>
							<td>
								<div class="de">
									<a href="${pageContext.request.contextPath}/laws/delete.action"></a>
								</div>
							</td>
						</tr>
					</table>
				</form>
				<div class="upload">
					<a href="${pageContext.request.contextPath}/laws/findall.action"
						onclick="addregulations()"></a>
				</div>
			</div>
		</div>
	</div>

	<!--底部S-->
	<footer></footer>
	<!--底部E-->
</body>
</html>