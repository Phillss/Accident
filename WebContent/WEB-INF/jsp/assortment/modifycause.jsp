<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加原因</title>
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
			<div class="t3 main">
				<div class="fl incause">
					<table>
						<tr id="visit">
							<td>
								<a href="${pageContext.request.contextPath}/assort/industrylist.action" onclick="industry()">
									行业
								</a>
							</td>
						</tr>
						<tr id="visit">
							<td>
								<a href="${pageContext.request.contextPath}/assort/causelist.action" onclick="course()">
									原因
								</a>
							</td>
						</tr>
					</table>
				</div>
				<div class="addca">
					<form action="${pageContext.request.contextPath}/assort/subcause.action" method="post">
					<input type="hidden" name="ca_id" value="${cause.ca_id}">
						<div class="ch">
							<span>类别：</span>
							<span style="width: 28px;">原因</span>
							<br /><br />
							<span>名称：</span>	
							<input type="text" name="ca_name" id="" value="${cause.ca_name}" />
						</div>
						<div class="po">
							<input type="submit"  value="修改" />
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