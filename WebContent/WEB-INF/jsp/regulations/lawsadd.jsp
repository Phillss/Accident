<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加法规</title>
<%@ include file="/font.jsp" %>
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
			<div class="t1 main">
				<div class="industry">
					<form action="${pageContext.request.contextPath}/laws/insert.action" method="post">
						<div class="ch">
							<span>法律法规名称：</span>
							<input type="text" value="" style="width: 150px; height: 20px;" placeholder="法律法规名称" /><br /><br />
							<span>制定修订(生效)日期：</span>
							<input type="text" value="" style="width: 150px; height: 20px;" placeholder="制定修订(生效)日期" /><br /><br />
							<span>修订次数：</span>
							<input type="text" value="" style="width: 150px; height: 20px;" placeholder="修订次数" /><br /><br />
							<span>编号：</span>
							<input type="text" value="" style="width: 150px; height: 20px;" placeholder="编号" /><br /><br />
							<span>颁发机关：</span>
							<input type="text" value="" style="width: 150px; height: 20px;" placeholder="颁发机关" /><br /><br />
							<span>类别：</span>
							<select name="">
								<option value="">安全标志</option>
								<option value="">安全管理</option>
								<option value="">安全消防设施</option>
								<option value="">劳动防护</option>
								<option value="">设计</option>
								<option value="">危险化学品分类</option>
								<option value="">危险作业</option>
								<option value="">职业卫生</option>
								<option value="">法律</option>
								<option value="">法规</option>
								<option value="">规章</option>
							</select><br /><br />
							<span>适用行业：</span>
							<input type="radio" name="" id="" value="建筑" />建筑
							<input type="radio" name="" id="" value="化工" />化工
							<input type="radio" name="" id="" value="交通" />交通
							<input type="radio" name="" id="" value="工矿商贸" />工矿商贸
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