<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/style.js"></script>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/header.css" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/base.css" />
	<script src="${pageContext.request.contextPath}/js/echarts.min.js"></script>
	
</head>
	<!--header-->
		<div id="header">
			<div class="boy">
				<ul>
					<li class="a">
						<a href="#">个人中心</a>
					</li>
					<li class="b">
						<a href="${pageContext.request.contextPath}/shiro/logout.action">注销</a>
					</li>
				</ul>
			</div>
		</div>
		<!--header-->
		<!--导航栏S-->
		<div class="mainl">
			<div class="word" id=word>
				<ul>
					<li>
						<a href="${pageContext.request.contextPath}
						/course/findAll.action" onclick="oDiv(0)"><span><img src="${pageContext.request.contextPath}/img/small.png"></span>课程</a>
					</li>
					<li>
						<a href="${pageContext.request.contextPath}/laws/findall.action" onclick="oDiv(1)"><span><img src="${pageContext.request.contextPath}/img/small.png"></span>行业法规</a>
					</li>
					<li>
						<a href="${pageContext.request.contextPath}
				/accident/findall.action" onclick="oDiv(2)"><span><img src="${pageContext.request.contextPath}/img/small.png"></span>事故报告管理</a>
					</li>
					<li>
						<a href="${pageContext.request.contextPath}/assort/reason.action" onclick="oDiv(3)"><span><img src="${pageContext.request.contextPath}/img/small.png"></span>原因分类</a>
					</li>
					<li>
						<a href="${pageContext.request.contextPath}
					/accident/cartogram.action" onclick="oDiv(4)"><span><img src="${pageContext.request.contextPath}/img/small.png"></span>统计图</a>
					</li>
					<li>
						<a href="${pageContext.request.contextPath}
						/userhandler/findAllUsers.action" onclick="oDiv(5)"><span><img src="${pageContext.request.contextPath}/img/small.png"></span>账户管理</a>
					</li>
					<li>
						<a href="${pageContext.request.contextPath}/log/loglist.action" onclick="oDiv(6)"><span><img src="${pageContext.request.contextPath}/img/small.png"></span>记录管理</a>
					</li>
					<!-- <li class="bg">
						<a href="javascript:void(0)" onclick="oDiv(7)"><span><img src="img/small.png"></span>题库</a>
					</li> -->
				</ul>
			</div>
		</div>
		<!--导航栏E-->