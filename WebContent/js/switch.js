//上侧导航栏切换
function table1() {
	$('.t0').show();
	$('.tle').show();
	$('.cour').show();
	$('.cour').siblings().not('.tle').hide();
	$('.t0').siblings().hide();
}

function table2() {
	$('.t1').show();
	$('.regulation').show();
	$('.t1').siblings().hide();
	$('.industry').hide();
}

function table3() {
	$('.t2').show();
	$('.t2').siblings().hide();
	$('.sac').show();
	$('.uploadad').hide();
}

function table4() {
	$('.t3').show();
	$('.t3').siblings().hide();
	$('.incause').show();
	$('.ind').show();
	$('.cause').hide();
	$('.addinca').hide();
	$('.addin').hide();
	$('.addca').hide();
}

function table5() {
	$('.t4').show();
	$('.t4').siblings().hide();
}

function table6() {
	$('.t5').show();
	$('.t5').siblings().hide();
}

function table7() {
	$('.t6').show();
	$('.t6').siblings().hide();
}

function table8() {
	$('.t7').show();
	$('.t7').siblings().hide();
}

//中间主要内容切换
//课程
function addcourse() {
	$('.import').show();
	$('.import').siblings().not('.tle').hide();
}
function course() {
	$('.cour').show();
	$('.cour').siblings().not('.tle').hide();
}
function modify() {
	$('.modifycourse').show();
	$('.cour').hide();
}
function theory() {
	$('.Causationtheory').show();
	$('.Causationtheory').siblings().not('.tle').hide();
}
//行业法规
function addregulations() {
	$('.industry').show();
	$('.industry').siblings().hide();
}
//事故报告
function addaccidents() {
	$('.uploadad').show();
	$('.uploadad').siblings().hide();
}
//管理分类
function industry() {
	$('.ind').show();
	$('.cause').hide();
	$('.addinca').hide();
	$('.addin').hide();
	$('.addca').hide();
}
function course() {
	$('.ind').hide();
	$('.cause').show();
	$('.addinca').hide();
	$('.addin').hide();
	$('.addca').hide();
}
function add_in_ca() {
	$('.addinca').show();
	$('.ind').hide();
	$('.cause').hide();
}
function modifyind() {
	$('.addin').show();
	$('.ind').hide();
}
function modifycause() {
	$('.addca').show();
	$('.cause').hide();
}