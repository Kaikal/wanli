$(function () {
    getRotation();
    getCarList();
})
//注册功能
function doRegister(){
    if (document.getElementById('contract').checked==false){
        document.getElementById('msg-box').style.color="red";
        $('#msg-box').text("同意协议后才能注册！");
        return;
    }
    if($("#account").val().length<=4){
        document.getElementById('msg-box').style.color="red";
        $('#msg-box').text("账号太短，不能低于5位数！");
        return;
    }
    if($("#password").val().length<6){
        document.getElementById('msg-box').style.color="red";
        $('#msg-box').text("密码太短，不能低于6位数！");
        return;
    }
    if($("#password").val()!=$("#surePassword").val()){
        document.getElementById('msg-box').style.color="red";
        $('#msg-box').text("密码不一致，请重新输入！");
        return;
    }
    let param = {
        "account":$("#account").val(),
        "phone":$("#phone").val(),
        "userName":$("#userName").val(),
        "email":$("#email").val()==null?'':$("#email").val(),
        "password":$("#password").val()
    }
    $.ajax({
        url: window.location.protocol+"//"+window.location.host+"/user/register",
        type:"POST",
        async:false,
        data:JSON.stringify(param),
        contentType:"application/json;charset=UTF-8",
        success:function(data){
            switch (data.code){
                case "0000":
                    document.getElementById('msg-box').style.color="red";
                    $('#msg-box').text(data.msg);
                    break;
                case "1111":
                    location.href=("user/login");
                    break;
            }
        },
        error:function(){
            alert("请求错误了");
        }
    });
}
//本函数主要实现点击后判断是否登录状态，如果是，则跳转到订单详情页面，否则跳转到登录界面
function userTipBtn(num){   //num传递的是session中的用户名
    if (num==''||num==null){
        location.href=("login");
    }else{
        location.href=("about");
    }
}
//退出登录，跳转到controller执行操作
function logOut(){
    location.href=("logOut");
}
//跳转到登录界面
function toLogin(){
    location.href=("user/login");
}
//登录传递数值
//跳转到首页
function toIndex(){
    location.href=("index");
}
function getRotation(){
    let htmlStr="";
    let conEdit=document.getElementById("rotationContainer");
    $.ajax({
        url:window.location.protocol+"//"+window.location.host+"/user/getRotation",
        type:"GET",
        async:false,
        contentType:"application/json;charset=UTF-8",
        success:function(data){
            for (var i in  data.data){
                htmlStr+= "<div><a href='"+data.data[i].rotationUrl+"'><img class='rotationImg' src='"+data.data[i].rotationLocation+"'></a></div>";
            }
            conEdit.innerHTML=htmlStr;
        },
        error:function(){
            alert("请求错误了");
        }
    });
}
function getCarList(){
    let htmlStr="";
    let conEdit=document.getElementById("carListContainer");
    $.ajax({
        url:window.location.protocol+"//"+window.location.host+"/user/getCarList",
        type:"POST",
        async:false,
        contentType:"application/json;charset=UTF-8",
        success:function(data){
            console.dir(data.data)
            htmlStr = "<table>\n" +
                "            <tr>";
            for (var i in data.data){
                if (i>0&&i%4==0){
                    htmlStr += "</tr>\n" +
                        "            <tr>\n";
                }
                htmlStr+= "<td class=\"mess\" onclick='toDetails("+data.data[i].carId+")'>\n" +
                    "                <img class=\"colLongImg\" src='"+data.data[i].carPic+"'/>\n" +
                    "                <div><p class=\"phoneName\">路线：<span>"+data.data[i].carRoute+"</span>号线</p>\n" +
                    "                <p class=\"phonePrice\"><span>"+data.data[i].carPrice+"</span>元起</p></div>\n" +
                    "                <p class=\"phoneIntr\"><span>"+data.data[i].carPersonName+"</span> | <span>"+data.data[i].carPhone+"</span></p>\n" +
                    "              </td>\n";
            }
            htmlStr += "            </tr>\n" +
                "          </table>";
            conEdit.innerHTML=htmlStr;
        },
        error:function(){
            alert("请求错误了");
        }
    });
}
function toDetails(id){
    location.href=("toDetails?carId="+id);
}