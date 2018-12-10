<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>统计信息</title>
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
		<div class="t4 main">
			<div class="fl w">
				<div class="menu" onclick="ggle()">行业</div>
				<div class="cht">
					<ul>
						<li id="builder" class="bu_tr_cd_co">建筑</li>
						<li id="chemical" class="bu_tr_cd_co">化工</li>
						<li id="traffic" class="bu_tr_cd_co">交通</li>
						<li id="coalmine" class="bu_tr_cd_co">煤矿</li>
					</ul>
				</div>
				<div class="menu" onclick="ggl()">等级</div>
				<div class="chc">
					<ul>
						<li id="" class="rank"><a href="${pageContext.request.contextPath}/accident/accidentrank.action">一般</a></li>
						<li id="" class="rank">较大</li>
						<li id="" class="rank">重大</li>
						<li id="" class="rank">特别重大</li>
					</ul>
				</div>
			</div>
			<div class="fl" style="width: 800px;height:500px;">
				<div onclick="a()" id="main2" style="width: 400px;height:400px;" class="fl"></div>

				<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
				<div id="main" style="width: 400px;height:400px;" class="fl"></div>
			</div>
		</div>
	</div>

	<!--底部S-->
	<footer></footer>
	<!--底部E-->
</body>

<script type="text/javascript">
	//假数据后台写完后应将来要清掉这四行
	var general = 1;
	var larger = 2;
	var great = 3;
	var especially = 4;
	var dieNum = [ 1, 3, 1, 1, 9, 2, 2, 1, 1, 9, 2, 20 ];
	var hurtNum = [ 220, 182, 191, 234, 290, 330, 191, 234, 290, 330, 310, 300 ];
	var loss = [ 150, 232, 201, 154, 190, 330, 410, 232, 201, 190, 330, 410 ];
	var pieOption = {
		series : {
			type : 'pie',
			data : [ {
				name : '一般',
				value : general
			}, {
				name : '较大',
				value : larger
			}, {
				name : '重大',
				value : great
			}, {
				name : '特大',
				value : especially
			} ]
		}
	}
	// 绘制图表
	echarts.init(document.getElementById('main2')).setOption(pieOption);
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
		series : [ {
			name : '死亡人数',
			type : 'line',
			stack : '总量',
			data : dieNum
		//后期改为charData.dieNum
		}, {
			name : '伤亡人数',
			type : 'line',
			stack : '总量',
			data : hurtNum
		//后期改为charData.hurtNum
		}, {
			name : '损失钱数',
			type : 'line',
			stack : '总量',
			data : loss
		//后期改为charData。loss
		}, ]
	};
	// 使用刚指定的配置项和数据显示图表。
	myChart.setOption(option);
	//点击导航栏中的“统计图调用该方法”
	$("#chart").click(function() {
		$.ajax({
			rul : "", //c请求表格数据数,据格式为json 分两个属性第一个为event下有属性 属性为'死亡人数'(dieNum), '伤亡人数'(hurtNum), '损失钱数(loss)'且每个属性下都为数组，长度为12
			type : "post",
			dataType : "json",
			seccess : function(ret) {
				charData = ret.chartData;
				pieData = ret.pieData;
				setpieData(pieData, option);
				setChartData(newChartData, option);
			},
			error : function() {
				//alert("点击统计图，请求失败，请重试");
			}
		});
	});
	//点击等级后应跳转到三个饼状图的页
	$(".rank").bind({
		click : function() {
			trade = $(this).attr("id");
			//postUrl +="tradeId="+trade;
			//alert(postUrl);
			$.ajax({
				url : "${pageContext.request.contextPath}/accident/accidentrank.action",//值为：请求页名？ChartData=dataIndex
				type : "post",
				//dataType : "json",
				success : function(ret) {
					//ret中的数据类型与上方开始时一致
				},
				error : function(err) {
					//alert("点击失败，请重试");
					console.log(err);
				}
			});
		}
	});
	//点击行业后调用该方法
	$(".bu_tr_cd_co").bind({
		click : function() {
			trade = $(this).attr("id");
			//postUrl +="tradeId="+trade;
			//alert(postUrl);
			$.ajax({
				url : "",//值为：请求页名？ChartData=dataIndex
				type : "post",
				dataType : "json",
				success : function(ret) {
					//ret中的数据类型与上方开始时一致
					var newPieData = ret.chartData;
					setpieData(newPieData, option);
				},
				error : function(err) {
					//alert("点击失败，请重试");
					console.log(err);
				}
			});
		}
	});
	//饼状图扇形区的点击事件，点击后获取图表数据并返回返回视图
	echarts.init(document.getElementById('main2')).on('click',
			function(params) {
				//dataIndex 饼状图中被点击的扇形区   以0开始
				var dataIndex = params.dataIndex;
				alert("点击了了第" + dataIndex + "扇形区");
				$.ajax({
					url : "",//值为：请求页名？ChartData=dataIndex
					type : "post",
					dataType : "json",
					success : function(ret) {
						var newChartData = ret.chartData;
						setChartData(newChartData, option);
					},
					error : function() {
						//alert("获取图表数据失败，请重试");
					}
				});
			})

	var setChartData = function(data, option) {
		option.series[0].data = data.dieNum;
		option.series[1].data = data.hurtNum;
		option.series[2].data = data.loss;
		myChart.setOption(option);
	}
	var setPieData = function(data, option) {
		option.series.data[0].value = data.general;
		option.series.data[1].value = data.larger;
		option.series.data[2].value = data.great;
		option.series.data[3].value = data.especially;
		echarts.init(document.getElementById('main2')).setOption(pieOption);
	}
</script>
</html>