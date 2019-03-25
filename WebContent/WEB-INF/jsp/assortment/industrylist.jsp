<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>行业列表</title>
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
						<tr id="visit">
							<td>
								<a href="${pageContext.request.contextPath}/assort/reason.action" onclick="course()">
									原因分类
								</a>
							</td>
						</tr>
					</table>
				</div>
				<div class="ind">
					<form action="" method="post">
						<table>
							<tr>
								<th style="text-align: center;" class="indu">行业</th>
								<th style="text-align: center;" class="re_de">修改</th>
								<th style="text-align: center;" class="re_de">删除</th>
							</tr>
							<c:forEach items="${industrylist}" var="item">
							<tr>
								<td>${item.in_name}</td>
								<td>
									<div class="rs">
										<a href="${pageContext.request.contextPath}/assort/modifyindustry.action?in_id=${item.in_id}" onclick="modifyind()"></a>
									</div>
								</td>
								<td>
									<div class="de">
										<a href="${pageContext.request.contextPath}/assort/deleteindus.action?in_id=${item.in_id}"></a>
									</div>
								</td>
							</tr>
							</c:forEach>
						</table>
					</form>	
					<div class="upload_in_du">
						<a href="${pageContext.request.contextPath}/assort/addindustryorcause.action" onclick="add_in_ca()"></a>
					</div>
				</div>
			</div>
		</div>
		
		<!--底部S-->
		<footer></footer>
		<!--底部E-->
</body>
</html>