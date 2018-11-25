<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>统计图</title>
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
			<div class="t4 main">
				<div class="fl w">
					<div class="menu" onclick="ggle()">
						行业
					</div>
					<div class="cht">
						<ul>
							<li id="builder" class="bu_tr_cd_co">建筑</li>
							<li id="chemical" class="bu_tr_cd_co">化工</li>
							<li id="traffic" class="bu_tr_cd_co">交通</li>
							<li id="coalmine" class="bu_tr_cd_co">煤矿</li>
						</ul>
					</div>
					<div class="menu" onclick="ggl()">
						等级
					</div>
					<div class="chc">
						<ul>
							<li id="" class="rank">一般</li>
							<li id="" class="rank">较大</li>
							<li id="" class="rank">重大</li>
							<li id="" class="rank">特别重大</li>
						</ul>
					</div>
				</div>
				<div class="fl" style="width: 1040px;height: 350px;">
					<div class="fl charts">
						<div id="main0" name="pie0" style="width: 340px;height:300px;" class="fl"></div>
						<p>死亡人数</p>
					</div>
					<div class="fl charts">
						<div onclick="a()" id="main1" name="pie1" style="width: 340px;height:300px;" class="fl"></div>
						<p>伤亡人数</p>
					</div>
					<div class="fl charts">
						<div onclick="a()" id="main2" name="pie2" style="width: 340px;height:300px;" class="fl"></div>
						<p>损失钱数</p>
					</div>
				</div>
			</div>
		</div>
		
		<!--底部S-->
		<footer></footer>
		<!--底部E-->
		</body>
	<script type="text/javascript">
		var pieOption0;
		var pieOption1;
		var pieOption2;
		var pieOption3;
		var trade = "";
		$(function(){
			pieOption0 = {
				series: {
					type: 'pie',
					data: [{
							name: '建筑',
							value: 1 
						},
						{
							name: '化工',
							value: 2 
						},
						{
							name: '交通',
							value: 3 
						},
						{
							name: '煤矿',
							value: 4 
						}
					]
				}
			}
		pieOption1 = pieOption0;
		pieOption2 = pieOption0;
		// 绘制图表
		echarts.init(document.getElementById('main0')).setOption(pieOption0);
		echarts.init(document.getElementById('main1')).setOption(pieOption1)
		echarts.init(document.getElementById('main2')).setOption(pieOption2);
		$.ajax({
		 	url:"",//值为：请求页名？ChartData=dataIndex
		 	type :"post",
		 	dataType:"json",
		 	success:function(ret){
		 		//ret中的数据类型与上方开始时一致
		 		var newPieData0 = ret.dileNum;
		 		var newPieData1 = ret.hurtNum;
		 		var newPieData2 = ret.loss;
		 		setpieData(newPieData0,option0);
		 		setpieData(newPieData1,option0);
		 		setpieData(newPieData2,option2);
		 	},
		 	error:function(err){
		 		// alert("点击失败，请重试");
		 		console.log(err);
		 	}
		 });
		});
		//点击导航栏中的“统计图调用该方法”
		$("#chart").click(function() {
			$.ajax({
 			 	url:"",//值为：请求页名？getChartData=byTrade
 			 	type :"post",
 			 	dataType:"json",
 			 	success:function(ret){
 			 		//ret中的数据类型与上方开始时一致
 			 	},
 			 	error:function(err){
 			 		alert("点击失败，请重试");
 			 		console.log(err);
 			 	}
 			 });
		});
		//点击等级后应跳转到三个饼状图的页
		$(".rank").bind({
			click:function(){
				trade = $(this).attr("id");
				//postUrl +="tradeId="+trade;
				//alert(postUrl);
				$.ajax({
				 	url:"",//值为：请求页名？getChartData=byGrade&grande = trade且trede为变量（点击的等级的id）
				 	type :"post",
				 	dataType:"json",
				 	success:function(ret){
				 		//ret中的数据类型与上方开始时一致
				 		var newPieData0 = ret.dileNum;
				 		var newPieData1 = ret.hurtNum;
				 		var newPieData2 = ret.loss;
				 		setpieData(newPieData0,option0);
				 		setpieData(newPieData1,option1);
				 		setpieData(newPieData2,option2);
				 	},
				 	error:function(err){
				 		alert("点击失败，请重试");
				 		console.log(err);
				 	}
		 		});
			}
		});
		//点击行业后调用该方法
		$(".bu_tr_cd_co").bind({
			click:function(){
				// trade = $(this).attr("id");
				//postUrl +="tradeId="+trade;
				//alert(postUrl);
				$.ajax({
     			 	url:"",//值为：请求页名？getChartData=ByGrade
     			 	type :"post",
     			 	dataType:"json",
     			 	success:function(ret){
     			 		//ret中的数据类型与上方开始时一致
     			 	},
     			 	error:function(err){
     			 		alert("点击失败，请重试");
     			 		console.log(err);
     			 	}
     			 });  
			}
		});
		var setPieData = function(datas,pieOption){
				for(var i =0;i<datas.length;i++){
					pieOption.series.data[i].value = datas[i].data;
					echarts.init($("#main"+i+"")).setOption(pieOption); 
				}  
		}
		
	</script>

</html>