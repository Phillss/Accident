<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="font.jsp" %>

<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/echarts.min.js"></script>
<script type="text/javascript">
	/*请求json  */
	function requestAJ() {
		$.ajax({
					type : 'post',
					url : '${pageContext.request.contextPath}/Accident/responseAjax.action',
					contentType : 'application/json;charset=utf-8',
					data : '{"us_id":"0000"}',
					success : function(data) {
						alert(data.us_id);
					}
				})
	}
	/*请求key/value  */
	function requestKey() {
		$.ajax({
					type : 'post',
					url : '${pageContext.request.contextPath}/Accident/responseValue.action',
					data : 'us_id=哇哈哈',
					success : function(data) {
						alert(data.us_id);
					}
				})
	}
</script>
<div onclick="a()" id="main2" style="width: 600px; height: 400px;"></div>
<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
<div id="main" style="width: 600px; height: 400px;"></div>
<script>
	// 绘制图表。
	echarts.init(document.getElementById('main2')).setOption({
		series : {
			type : 'pie',
			data : [ {
				name : 'A',
				value : 1212
			}, {
				name : 'B',
				value : 2323
			}, {
				name : 'C',
				value : 1919
			} ]
		}
	});
</script>
<script type="text/javascript">
	// 基于准备好的dom，初始化echarts实例
	var myChart = echarts.init(document.getElementById('main'));
	// 指定图表的配置项和数据
	var option = {
		tooltip : {
			trigger : 'axis'
		},
		legend : {
			data : [ '死亡人数', '伤亡人数', '损失钱数' ]
		},
		toolbox : {
			show : true,
			feature : {
				mark : {
					show : true
				},
				dataView : {
					show : true,
					readOnly : false
				},
				magicType : {
					show : true,
					type : [ 'line', 'bar', 'stack', 'tiled' ]
				},
				restore : {
					show : true
				},
				saveAsImage : {
					show : true
				}
			}
		},
		calculable : true,
		xAxis : [ {
			type : 'category',
			boundaryGap : false,
			data : [ '一', '二', '三', '四', '五', '六', '七', '九', '十', '十一', '十二' ]
		} ],
		yAxis : [ {
			type : 'value'
		} ],
		series : [
				{
					name : '死亡人数',
					type : 'line',
					stack : '总量',
					data : [ 1, 3, 1, 1, 9, 2, 2, 1, 1, 9, 2, 20 ]
				},
				{
					name : '伤亡人数',
					type : 'line',
					stack : '总量',
					data : [ 220, 182, 191, 234, 290, 330, 191, 234, 290, 330,
							310, 300 ]
				},
				{
					name : '损失钱数',
					type : 'line',
					stack : '总量',
					data : [ 150, 232, 201, 154, 190, 330, 410, 232, 201, 190,
							330, 410 ]
				}, ]
	};
	// 使用刚指定的配置项和数据显示图表。
	myChart.setOption(option);
</script>
</head>
<body>
	<input type="button" value="发送数据" onclick="requestAJ()">
	<br />
	<input type="button" value="发送数据" onclick="requestKey()">
</body>

</html>