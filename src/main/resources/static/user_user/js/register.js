$(function (){
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
function toLogin(){
    location.href=("user/login");
}