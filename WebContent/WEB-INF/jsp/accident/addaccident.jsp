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
					<form action="${pageContext.request.contextPath}/accident/insert.action" method="post" enctype="multipart/form-data">
						<div class="ch">
							
							<div class="ku">
								<span>事故等级：</span>
								<select name="acc_level" style="width: 150px">
									<option value="000">一般事故</option>
									<option value="001">普通事故</option>
									<option value="010">重大事故</option>
									<option value="011">特别重大事故</option>
								</select>
							</div>
							<div class="ku">
								<span>事故名称：</span>
								<input type="text" value="" name="acc_name" style="width: 150px; height: 20px;" placeholder="事故名称" />
							</div>
							<div class="ku">
								<span>发生时间：</span>
								<input type="datetime-local" value="" name="acc_time" style="width: 150px; height: 20px;" />
							</div>
							<div class="ku">
								<span>发生地点：</span>
								<input type="text" value="" name="acc_site" style="width: 150px; height: 20px;" placeholder="发生地点" />
							</div>
							<div class="ku">
								<span>死亡人员：</span>
								<input type="text" value="" name="acc_deathSum" style="width: 150px; height: 20px;" placeholder="死亡人员" />
							</div>
							<div class="ku">
								<span>人员伤亡：</span>
								<input type="text" value="" name="acc_injuredSum" style="width: 150px; height: 20px;" placeholder="人员伤亡" />
							</div>
							<div class="ku">
								<span>财产损失：</span>
								<input type="text" value="" name="acc_financial" style="width: 150px; height: 20px;" placeholder="财产损失" />
							</div>
							<div class="ku">
								<span>负责人：</span>
								<input type="text" value="" name="acc_boss" style="width: 150px; height: 20px;" placeholder="负责人" />
							</div>
							<div class="ku">
								<span>公司名称：</span>
								<input type="text" value="" name="acc_org" style="width: 150px; height: 20px;" placeholder="公司名称" />
							</div>
							<div class="ku">
								<span>事故文档名称：</span>
								<input type="file" value="" name="acc_file" style="width: 150px; height: 20px; display: inline-block;" placeholder="事故文档名称" />
							</div>
							<div class="kut">
								<span>所属行业：</span>
								<select name="acc_industryName" style="width: 150px">
									<option value="矿工行业">矿工行业</option>
									<option value="电子行业">电子行业</option>
								</select>
							</div>
							<div></div>
						</div>
						<div class="po">
							<input type="submit" value="提交" />
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