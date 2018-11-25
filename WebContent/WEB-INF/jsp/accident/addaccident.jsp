<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>事故上传</title>
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
					mouseover: function() {
						$(this).css('background-color', '#213862');
						$(this).css('color', 'white');
					},
					mouseout: function() {
						$(this).css('background-color', '#d1d5dc');
						$(this).css('color', '#213862');
					}
				});
				$('.bu_tr_cd_co').bind({
					mouseover: function() {
						$(this).css('background-color', '#213862');
						$(this).css('color', 'white');
					},
					mouseout: function() {
						$(this).css('background-color', '#e2e5e9');
						$(this).css('color', '#213862');
					}
				});
				$('.rank').bind({
					mouseover: function() {
						$(this).css('background-color', '#213862');
						$(this).css('color', 'white');
					},
					mouseout: function() {
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
				<div class="uploadad">
					<form action="${pageContext.request.contextPath}/accident/insert.action" method="post">
						<div class="ch">
							<span>事故编号：</span>
							<input type="text" value="" name="acc_id" style="width: 150px; height: 20px;" placeholder="事故编号" /><br /><br />
							<span>事故名称：</span>
							<input type="text" value="" name="acc_name" style="width: 150px; height: 20px;" placeholder="事故名称" /><br /><br />
							<span>事故等级：</span>
							<select name="acc_level">
								<option value="000">一般事故</option>
								<option value="001">普通事故</option>
								<option value="010">重大事故</option>
								<option value="011">特别重大事故</option>
							</select><br /><br />
							<span>发生时间：</span>
							<input type="text" value="" name="acc_time" style="width: 150px; height: 20px;" placeholder="发生时间" /><br /><br />
							<span>发生地点：</span>
							<input type="text" value="" name="acc_site" style="width: 150px; height: 20px;" placeholder="发生地点" /><br /><br />
							<span>人员伤亡：</span>
							<input type="text" value="" name="acc_deathSum" style="width: 150px; height: 20px;" placeholder="人员伤亡" /><br /><br />
							<span>财产损失：</span>
							<input type="text" value="" name="acc_financial" style="width: 150px; height: 20px;" placeholder="财产损失" /><br /><br />
							<span>所属行业：</span>
							<input type="radio" name="acc_industryId" id="" value="000" />建筑
							<input type="radio" name="acc_industryId" id="" value="001" />化工
							<input type="radio" name="acc_industryId" id="" value="010" />交通
							<input type="radio" name="acc_industryId" id="" value="011" />工矿商贸
						</div>
						<div class="po">
							<input type="submit" name="" id="" value="提交" />
						</div>
					</form>
				</div>
			</div>
		</div>

		<!--底部S-->
		<footer></footer>
		<!--底部E-->
	</body>

</html>