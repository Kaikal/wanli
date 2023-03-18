function doLogin(){
    var msgBox = document.getElementById("msg-box");
    var capacity = document.getElementById("capacityUser").checked;
    var reqUrl;
    //判断选中的是用户还是管理员，选中管理员把index换成管理员controller
    if (capacity){
        reqUrl = window.location.protocol+"//"+window.location.host+"/user/doLogin";
    }else{
        reqUrl = window.location.protocol+"//"+window.location.host+"/admin/doLogin";
    }
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
        "reqCode":$("#req-code-input").val()
    }
    $.ajax({
        url:reqUrl,
        type:"POST",
        async:false,
        data:JSON.stringify(param),
        contentType:"application/json;charset=UTF-8",
        success:function(data){
            console.dir(data.msg)
            if (capacity){
                if(data.code=="1111"){
                    // 登录成功
                    msgBox.hidden=true;
                    document.getElementById("req-code-input").value='';
                    location.href=window.location.protocol+"//"+window.location.host+"/user/about";
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
            }else{
                if(data.code==0){
                    // 登录成功
                    msgBox.hidden=true;
                    document.getElementById("req-code-input").value='';
                    location.href=window.location.protocol+"//"+window.location.host+"/toAdmin";
                }else if(data.code==9999){
                    // 密码错误
                    msgBox.hidden=false;
                    $(".msg-box").html(data.msg);
                    // alert(data.msg);
                    document.getElementById("req-code-input").value='';
                }else if(data.code==9998){//需要刷新验证码
                    msgBox.hidden=false;
                    document.getElementById("req-code-input").value='';
                }else{
                    msgBox.hidden=false;
                    $(".msg-box").html(data.msg);
                    document.getElementById("req-code-input").value='';
                }
            }

        },
        error:function(){
            alert("请求错误了");
        }
    });
}
function toIndex(){
    location.href=("index");
}