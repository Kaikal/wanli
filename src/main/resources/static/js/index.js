$(function () {
    $("#account:text").bind("input propertychange",function(){
        if ($("#account").val().length<=4){
            document.getElementById('msg-box').style.color="red";
            $('#msg-box').text("账号太短！");
        }else{
            document.getElementById('msg-box').style.color="#676a6c";
            $('#msg-box').text("请填写6到12位密码！");
        }
    });
    $("#password:password").bind("input propertychange",function(){
        if($("#password").val().length<6){
            document.getElementById('msg-box').style.color="red";
            $('#msg-box').text("密码太短！");
        }else{
            document.getElementById('msg-box').style.color="#676a6c";
            $('#msg-box').text("请填写6到12位密码！");
        }
    });
    $("#surePassword:password").bind("input propertychange",function(){
        if($("#password").val()!=$("#surePassword").val()){
            document.getElementById('msg-box').style.color="red";
            $('#msg-box').text("密码不一致，请检查！");
        }else{
            document.getElementById('msg-box').style.color="#676a6c";
            $('#msg-box').text("请填写6到12位密码！");
        }
    });
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
        url: "http://localhost:8080/user/register",
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
function doLogin(){
    var msgBox = document.getElementById("msg-box");
    var capacity = document.getElementById("capacityUser").checked;
    var reqUrl;
    //判断选中的是用户还是管理员，选中管理员把index换成管理员controller
    if (capacity){
        reqUrl = "http://localhost:8090/user/doLogin";
    }else{
        reqUrl = "http://localhost:8090/admin/doLogin";
    }
    var userName=document.getElementById(userName);
    if($("#userName").val()==null||$("#userName").val()==""){
        msgBox.hidden=false;
        $(".msg-box").html("用户名必填");
        return;
    }
    if($("#password").val()==null||$("#password").val()==""){
        msgBox.hidden=false;
        $(".msg-box").html("密码必填");
        return;
    }
    if($("#req-code-input").val()==null||$("#req-code-input").val()==""){
        msgBox.hidden=false;
        $(".msg-box").html("验证码必填");
        return;
    }
    var param = {
        "userName":$("#userName").val(),
        "userPwd":$("#password").val(),
        "reqCode":$("#req-code-input").val(),
        // "isRemember":document.getElementById("isRemember").checked==true?1:0
    }
    console.log(param)
    console.log(reqUrl)
    $.ajax({
        url:reqUrl,
        type:"POST",
        async:false,
        data:JSON.stringify(param),
        contentType:"application/json;charset=UTF-8",
        success:function(data){
            console.dir(data.msg)
            if(data.code=="1111"){
                // 登录成功
                msgBox.hidden=true;
                document.getElementById("req-code-input").value='';
                location.href="http://localhost:8080/user/about";
            }else if (data.code==0){
                msgBox.hidden=true;
                document.getElementById("req-code-input").value='';
                location.href="http://localhost:8090/toAdmin";
            }else if(data.code=="0000"){
                // 密码错误
                msgBox.hidden=false;
                $(".msg-box").html(data.msg);
                // alert(data.msg);
                document.getElementById("req-code-input").value='';
            }else if(data.code=="9998"){//需要刷新验证码
                msgBox.hidden=false;
                document.getElementById("req-code-input").value='';
            }else{
                msgBox.hidden=false;
                $(".msg-box").html(data.msg);
                document.getElementById("req-code-input").value='';
            }
        },
        error:function(){
            alert("请求错误了");
        }
    });
}
//跳转到首页
function toIndex(){
    location.href=("index");
}