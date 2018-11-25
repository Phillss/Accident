<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>课程修改</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="/font.jsp"%>
<script type="text/javascript">
window.onload = function() {
	var indus = ${updatelist.cu_industry};
	var intro=${updatelist.cu_introduce};
	var file=${updatelist.cu_fileName};
	var industry=document.getElementById("industry");
	var introduce=document.getElementById("introduce");
	var fileName=document.getElementById("fileName");
	var arr=industry.getElementsByTagName("option");
	var ar=introduce.getElementsByTagName("option");
	var a=fileName.getElementsByTagName("option");
	arr[indus].selected="selected";
	ar[intro].selected="selected";
	a[file].selected="selected";
}
</script>
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
			<div class="fl modifycourse">
				<form action="${pageContext.request.contextPath}
			/course/updatecourse.action" method="post">
					<div class="ch">
						<span>课程编号：</span> <input type="text" value="${updatelist.cu_id}"
							name="cu_id" style="width: 100px; height: 20px;" placeholder="课程编号" /><br />
						<br /> 
						<span>课程名称：</span> <input type="text" value="${updatelist.cu_name}"
							name="cu_name" style="width: 100px; height: 20px;" placeholder="课程名称" /><br />
						<br /> <span>所属行业：</span> <select name="cu_industry" id="industry">
							<option value="0" id="0">建筑</option>
							<option value="1" id="1">化工</option>
							<option value="2" id="2">交通</option>
							<option value="3" id="3">煤矿</option>
						</select><br />
						<br /> <span>课程属性：</span> <select name="cu_introduce" id="introduce">
							<option value="0" id="0">必学</option>
							<option value="1" id="1">选学</option>
						</select><br />
						<br /> <span>课程类型：</span> <select name="cu_fileName" id="fileName">
							<option value="0" id="0">文本</option>
							<option value="1" id="1">图片</option>
						</select><br />
						<br />
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