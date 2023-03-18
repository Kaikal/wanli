$(function () {
	var toUrl = getPar('goals');
	if (getPar('goals')){ //有值
		let strings = toUrl.split("**");
		if (strings.length>1){
			document.getElementById("frameCon").src=strings[0]+"?"+strings[1]+"="+strings[2]+"&"+strings[3]+"="+strings[4];
		}else {
			document.getElementById("frameCon").src=strings[0];
		}
	}
})
function getPar(par){
	//获取当前URL
	var local_url = document.location.href;
	//获取要取得的get参数位置
	var get = local_url.indexOf(par +"=");
	if(get == -1){
		return false;
	}
	//截取字符串
	var get_par = local_url.slice(par.length + get + 1);
	//判断截取后的字符串是否还有其他get参数
	var nextPar = get_par.indexOf("&");
	if(nextPar != -1){
		get_par = get_par.slice(0, nextPar);
	}
	return get_par;
}
var current1 = 0;
var current2 = 0;
//跳转到首页
function indexBtn(){
	location.href=("index");
}
function logOut(){
	location.href=("logOut");
}
//点击“我的订单”列表
function orderBtn(){
	document.getElementById("indexList").style.opacity = "1";
	document.getElementById("indexList").style.backgroundColor = "#ffffff";
	document.getElementById("orderList").style.opacity = "0.6";
	document.getElementById("orderList").style.backgroundColor = "#B5B5B5";
	document.getElementById("commenUser").style.opacity = "1";
	document.getElementById("commenUser").style.backgroundColor = "#ffffff";
	document.getElementById("commenCon").style.opacity = "1";
	document.getElementById("commenCon").style.backgroundColor = "#ffffff";
	document.getElementById("commenAddr").style.opacity = "1";
	document.getElementById("commenAddr").style.backgroundColor = "#ffffff";
	document.getElementById("myMess").style.opacity = "1";
	document.getElementById("myMess").style.backgroundColor = "#ffffff";
	document.getElementById("accountDet").style.opacity = "1";
	document.getElementById("accountDet").style.backgroundColor = "#ffffff";
	//将展开的列表收起来
	if(document.getElementById("moreMessContainer_1").style.display=="block"){
		document.getElementById("moreMessContainer_1").style.display="none";
		document.getElementById('shows_1').style.transform = 'rotate(' + ((current1) % 360) + 'deg)';
	}
	if(document.getElementById("moreMessContainer_2").style.display=="block"){
		document.getElementById("moreMessContainer_2").style.display="none";
		document.getElementById('shows_2').style.transform = 'rotate(' + ((current2) % 360) + 'deg)';
	}
	document.getElementById("frameCon").src="order";
}
//点击"常用信息”列表
function commenUserBtn(){
	document.getElementById("indexList").style.opacity = "1";
	document.getElementById("indexList").style.backgroundColor = "#ffffff";
	document.getElementById("orderList").style.opacity = "1";
	document.getElementById("orderList").style.backgroundColor = "#ffffff";
	document.getElementById("commenUser").style.opacity = "0.6";
	document.getElementById("commenUser").style.backgroundColor = "#B5B5B5";
	document.getElementById("commenCon").style.opacity = "1";
	document.getElementById("commenCon").style.backgroundColor = "#ffffff";
	document.getElementById("commenAddr").style.opacity = "1";
	document.getElementById("commenAddr").style.backgroundColor = "#ffffff";
	document.getElementById("myMess").style.opacity = "1";
	document.getElementById("myMess").style.backgroundColor = "#ffffff";
	document.getElementById("accountDet").style.opacity = "1";
	document.getElementById("accountDet").style.backgroundColor = "#ffffff";
	document.getElementById("frameCon").src="passenger";
}
//点击”常用乘客信息“列表
function commenConBtn(){
	document.getElementById("indexList").style.opacity = "1";
	document.getElementById("indexList").style.backgroundColor = "#ffffff";
	document.getElementById("orderList").style.opacity = "1";
	document.getElementById("orderList").style.backgroundColor = "#ffffff";
	document.getElementById("commenUser").style.opacity = "1";
	document.getElementById("commenUser").style.backgroundColor = "#ffffff";
	document.getElementById("commenCon").style.opacity = "0.6";
	document.getElementById("commenCon").style.backgroundColor = "#B5B5B5";
	document.getElementById("commenAddr").style.opacity = "1";
	document.getElementById("commenAddr").style.backgroundColor = "#ffffff";
	document.getElementById("myMess").style.opacity = "1";
	document.getElementById("myMess").style.backgroundColor = "#ffffff";
	document.getElementById("accountDet").style.opacity = "1";
	document.getElementById("accountDet").style.backgroundColor = "#ffffff";
	document.getElementById("frameCon").src="contacts";
}

function commenAddrBtn(){
	document.getElementById("indexList").style.opacity = "1";
	document.getElementById("indexList").style.backgroundColor = "#ffffff";
	document.getElementById("orderList").style.opacity = "1";
	document.getElementById("orderList").style.backgroundColor = "#ffffff";
	document.getElementById("commenUser").style.opacity = "1";
	document.getElementById("commenUser").style.backgroundColor = "#ffffff";
	document.getElementById("commenCon").style.opacity = "1";
	document.getElementById("commenCon").style.backgroundColor = "#ffffff";
	document.getElementById("commenAddr").style.opacity = "0.6";
	document.getElementById("commenAddr").style.backgroundColor = "#B5B5B5";
	document.getElementById("myMess").style.opacity = "1";
	document.getElementById("myMess").style.backgroundColor = "#ffffff";
	document.getElementById("accountDet").style.opacity = "1";
	document.getElementById("accountDet").style.backgroundColor = "#ffffff";
	document.getElementById("frameCon").src="address";
}
//点击用户名
function myMessBtn(){
	myMess();
}
function userMessBtn(){
	showMore_3();
	myMess();
}
function accountDetBtn(){
	document.getElementById("indexList").style.opacity = "1";
	document.getElementById("indexList").style.backgroundColor = "#ffffff";
	document.getElementById("orderList").style.opacity = "1";
	document.getElementById("orderList").style.backgroundColor = "#ffffff";
	document.getElementById("commenUser").style.opacity = "1";
	document.getElementById("commenUser").style.backgroundColor = "#ffffff";
	document.getElementById("commenCon").style.opacity = "1";
	document.getElementById("commenCon").style.backgroundColor = "#ffffff";
	document.getElementById("commenAddr").style.opacity = "1";
	document.getElementById("commenAddr").style.backgroundColor = "#ffffff";
	document.getElementById("myMess").style.opacity = "1";
	document.getElementById("myMess").style.backgroundColor = "#ffffff";
	document.getElementById("accountDet").style.opacity = "0.6";
	document.getElementById("accountDet").style.backgroundColor = "#B5B5B5";
	document.getElementById("frameCon").src="toAccount";
}
function myMess(){
	document.getElementById("indexList").style.opacity = "1";
	document.getElementById("indexList").style.backgroundColor = "#ffffff";
	document.getElementById("orderList").style.opacity = "1";
	document.getElementById("orderList").style.backgroundColor = "#ffffff";
	document.getElementById("commenUser").style.opacity = "1";
	document.getElementById("commenUser").style.backgroundColor = "#ffffff";
	document.getElementById("commenCon").style.opacity = "1";
	document.getElementById("commenCon").style.backgroundColor = "#ffffff";
	document.getElementById("commenAddr").style.opacity = "1";
	document.getElementById("commenAddr").style.backgroundColor = "#ffffff";
	document.getElementById("myMess").style.opacity = "0.6";
	document.getElementById("myMess").style.backgroundColor = "#B5B5B5";
	document.getElementById("accountDet").style.opacity = "1";
	document.getElementById("accountDet").style.backgroundColor = "#ffffff";
	document.getElementById("frameCon").src="toEditMess";
}
function adminBtn(){
	if(document.getElementById("moreMessContainer_1").style.display=="block"){
		document.getElementById("moreMessContainer_1").style.display="none";
		document.getElementById('shows_1').style.transform = 'rotate(' + ((current1) % 360) + 'deg)';
	}
	document.getElementById("moreMessContainer_2").style.display="block";
	document.getElementById('shows_2').style.transform =  'rotate(' + ((current2 - 180) % 360) + 'deg)';
	myMess();
}
//展开列表
function showMore_1(){
	if(document.getElementById("moreMessContainer_1").style.display=="block"){
		document.getElementById("moreMessContainer_1").style.display="none";
		document.getElementById('shows_1').style.transform = 'rotate(' + ((current1) % 360) + 'deg)';
	}else{
		if(document.getElementById("moreMessContainer_2").style.display=="block"){
			document.getElementById("moreMessContainer_2").style.display="none";
			document.getElementById('shows_2').style.transform = 'rotate(' + ((current2) % 360) + 'deg)';;
		}
		document.getElementById("moreMessContainer_1").style.display="block";
		document.getElementById('shows_1').style.transform =  'rotate(' + ((current1 - 180) % 360) + 'deg)';
	}
}
//展开列表
function showMore_2(){
	if(document.getElementById("moreMessContainer_2").style.display=="block"){
		document.getElementById("moreMessContainer_2").style.display="none";
		document.getElementById('shows_2').style.transform = 'rotate(' + ((current2) % 360) + 'deg)';;
	}else{
		if(document.getElementById("moreMessContainer_1").style.display=="block"){
			document.getElementById("moreMessContainer_1").style.display="none";
			document.getElementById('shows_1').style.transform = 'rotate(' + ((current1) % 360) + 'deg)';
		}
		document.getElementById("moreMessContainer_2").style.display="block";
		document.getElementById('shows_2').style.transform =  'rotate(' + ((current2 - 180) % 360) + 'deg)';
	}
}
function showMore_3(){
	if(document.getElementById("moreMessContainer_1").style.display=="block"){
		document.getElementById("moreMessContainer_1").style.display="none";
		document.getElementById('shows_1').style.transform = 'rotate(' + ((current1) % 360) + 'deg)';
	}
	document.getElementById("moreMessContainer_2").style.display="block";
	document.getElementById('shows_2').style.transform =  'rotate(' + ((current2 - 180) % 360) + 'deg)';
}
function showPopup(msg){
	var overlay = window.parent.document.getElementById("overlay");
	window.parent.document.getElementById('popup_content').innerHTML=msg;
	overlay.style.display = "block";
}
function cancelBtn(){
	var overlay = document.getElementById("overlay");
	overlay.style.display = "none";
	if (document.getElementById('popup_content').innerHTML=="修改成功，需要立即返回首页吗?"){
		location.href=("about");
	}
}
function reviseBtn(){
	if (document.getElementById('popup_content').innerHTML=="修改成功，需要立即返回首页吗?"){
		location.href=("index");
	}else if (document.getElementById('popup_content').innerHTML=="确认要修改您的信息吗?"){
		var param = {
			"userAccount":window.frames['frameCon'].document.getElementById("account").value,
			"userPhone":window.frames['frameCon'].document.getElementById("phone").value,
			"userName":window.frames['frameCon'].document.getElementById("userName").value,
			"userEmail":window.frames['frameCon'].document.getElementById("email").value,
			"userCode":window.frames['frameCon'].document.getElementById("userCode").value,
			"userBirth":window.frames['frameCon'].document.getElementById("date").value,
			"userSex":window.frames['frameCon'].document.getElementById("sexMale").checked==true?0:1
		}
		var msgBox = window.frames['frameCon'].document.getElementById("msg-box");
		$.ajax({
			url:window.location.protocol+"//"+window.location.host+"/user/doEditMess",
			type:"POST",
			async:false,
			data:JSON.stringify(param),
			contentType:"application/json;charset=UTF-8",
			success:function(data){
				if (data.code=="1111"){
					msgBox.hidden=true;
					cancelBtn();
					var timer = setTimeout(function () {
						showPopup("修改成功，需要立即返回首页吗?")
					}, 20);
				}else{
					msgBox.hidden=false;
					$(".msg-box").html(data.msg);
				}
			},
			error:function(){
				alert("请求错误了");
			}
		});
	}else if (document.getElementById('popup_content').innerHTML=="确认要修改乘客信息吗?"){
		var param = {
			"passName":window.frames['frameCon'].document.getElementById("passName").value,
			"passPhone":window.frames['frameCon'].document.getElementById("phone").value,
			"passCode":window.frames['frameCon'].document.getElementById("userCode").value,
			"passSex":window.frames['frameCon'].document.getElementById("sexMale").checked==true?0:1
		}
		var msgBox = window.frames['frameCon'].document.getElementById("msg-box");
		$.ajax({
			url:window.location.protocol+"//"+window.location.host+"/user/editPass",
			type:"POST",
			async:false,
			data:JSON.stringify(param),
			contentType:"application/json;charset=UTF-8",
			success:function(data){
				if (data.code=="1111"){
					msgBox.hidden=true;
					cancelBtn();
					commenUserBtn();
				}else{
					msgBox.hidden=false;
					$(".msg-box").html(data.msg);
				}
			},
			error:function(){
				alert("请求错误了");
			}
		});
	}else if (document.getElementById('popup_content').innerHTML=="您确认要删除该条乘客信息吗？"){
		// location.href=("deletePass?"+document.cookie);
		$.ajax({
			url:window.location.protocol+"//"+window.location.host+"/user/deletePass",
			type:"POST",
			async:false,
			data:{"passId":document.cookie},
			contentType:"application/json;charset=UTF-8",
			success:function(data){
				if (data.code=="1111"){
					cancelBtn();
					commenUserBtn();
				}else{
					alert(data.msg);
				}
			},
			error:function(){
				alert("请求错误了");
			}
		});
	}else{
		location.href=("about");
	}
}