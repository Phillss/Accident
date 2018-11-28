//超管下拉框
function ggle() {
	$('.bu_tr_cd_co').slideToggle(500);
}

function ggl() {
	$('.rank').slideToggle(500);
}

function gg() {
	$('.rank').slideToggle(500);
}
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

//导航栏
function oDiv(d) {
	var word = document.getElementById("word");
	var li = word.getElementsByTagName("li")
	var span = word.getElementsByTagName("span");
	for(var i = 0; i < span.length; i++) {
		li[i].style.paddingLeft = "40" + "px";
		span[i].style.display = "none";
	}
	li[d].style.paddingLeft = "0";
	span[d].style.display = "block";
}

//二级导航栏
function oBtn() {
	var txt1 = document.getElementById("txt1");
	txt1.value = "";
}

function oBtn1() {
	var txt2 = document.getElementById("txt2");
	txt2.value = "";
}

function s(j) {
	var left = document.getElementById("left");
	var div = left.getElementsByTagName("div");
	for(var i = 0; i < div.length; i++) {
		div[i].style.backgroundColor = "#dfe2e7";
		div[i].style.color = "#213862";
	}
	div[j].style.backgroundColor = "#213862";
	div[j].style.color = "#fff";
}