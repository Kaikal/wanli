$(function () {
    initAccount();
})

function initAccount(){
    let htmlStr="";
    let conEdit=document.getElementById("conEditContainer");
    $.ajax({
        url:window.location.protocol+"//"+window.location.host+"/user/doAccount",
        type:"POST",
        async:false,
        success:function(data){
            switch (data.code){
                case "0000":
                    htmlStr+="<div class=\"\" style=\"text-align: center;margin-top: 40px\">未查询到订单信息!</div>";
                    conEdit.innerHTML=htmlStr;
                    break;
                case "1111":
                    for (var i in data.data){
                        htmlStr+="<div class=\"conEdit\" id=\"conEdit\">"+
                            "<div class='statePartF'>"+
                            "     <img class='successImg' id='stateImg' src='"+(data.data[i].userMessStateIcon==0?("/user_user/img/success.png"):("/user_user/img/warnning.png"))+"'>"+
                            "    <span class='stateTitle' id='stateTitle'>"+(data.data[i].userMessState)+"</span>"+
                            "</div>"+
                            "<div class='advice' id='advice'>"+(data.data[i].userTitle)+"</div>"+
                            "<div class='statePart' id='describe'>"+data.data[i].userText+"</div>"+
                            "<div class='statePartEdit'><a href='#'>修改</a></div>"+
                            "    </div>";
                    }
                    conEdit.innerHTML=htmlStr;
                    break;
            }
        },
        error:function(){
            alert("请求错误");
        }
    });
}