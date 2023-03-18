$(function () {
    getOrderMess();
    getTravelOrderMess();
    getUnpaidOrderMess();
    getCommOrderMess()
})
function getOrderMess(){
    let htmlStr="";
    let conEdit=document.getElementById("liatContainer");
    $.ajax({
        url: window.location.protocol+"//"+window.location.host+"/user/doOrder",
        type:"POST",
        async:false,
        contentType:"application/json;charset=UTF-8",
        success:function(data){
            switch (data.code){
                case "0000":
                    htmlStr+="<tr><td><div style='text-align: center;margin-top: 40px'>"+data.msg+"</div></td></tr>";
                    conEdit.innerHTML=htmlStr;
                    break;
                case "1111":
                    for (var i in  data.data){
                        var startDate = dateFormat(data.data[i].orderStartTime);
                        var startTime = TimeFormat(data.data[i].orderStartTime);
                        var endDate = dateFormat(data.data[i].orderEndTime);
                        var endTime = TimeFormat(data.data[i].orderEndTime);
                        var orderState;
                        switch (data.data[i].orderState){
                            case "0":
                                orderState = "未出行";
                                break;
                            case "1":
                                orderState = "待支付";
                                break;
                            case "2":
                                orderState = "待点评";
                                break;
                        }
                        htmlStr+= "<div class=\"ticketCon\" onclick='viewOrder()'>\n" +
                            "        <div class=\"timeCon\">\n" +
                            "          <div class=\"ticketTime\">\n" +
                            "            <div>出发时间</div>\n" +
                            "            <div class=\"dateItem\">"+startDate+"</div>\n" +
                            "            <div class=\"timeItem\">"+startTime+"</div>\n" +
                            "          </div>\n" +
                            "          <div class=\"ticketTime\">\n" +
                            "            <div>车次</div>\n" +
                            "            <div style=\"text-align: center;\">\n" +
                            "              <div class=\"trainNo\">"+data.data[i].orderCard+"</div>\n" +
                            "              <hr style=\"width: 179px;margin: 4px 60px;\">\n" +
                            "              <div class=\"takeTime\" id='takeTime"+data.data[i].orderId+"'>"+data.data[i].timeDifferce+"</div>\n" +//2时1分
                            "            </div>\n" +
                            "          </div>\n" +
                            "          <div class=\"ticketTime\">\n" +
                            "            <div>到达时间</div>\n" +
                            "            <div class=\"dateItem\">"+endDate+"</div>\n" +
                            "            <div class=\"timeItem\">"+endTime+"</div>\n" +
                            "            <div class=\"stateItem\">"+orderState+"</div>\n" +
                            "          </div>\n" +
                            "        </div>\n" +
                            "        <hr>\n" +
                            "        <div class=\"siteCon\">\n" +
                            "          <div class=\"ViPSite\">\n" +
                            "            一等座:\n" +
                            "            <span class=\"tickState\">"+(data.data[i].orderVipSite)+"</span>\n" +
                            "          </div>\n" +
                            "          <div class=\"ordinary\">\n" +
                            "            二等座:\n" +
                            "            <span class=\"tickState\">"+(data.data[i].orderOrdinary)+"</span>\n" +
                            "          </div>\n" +
                            "          <div class=\"NoSite\">\n" +
                            "            无座:\n" +
                            "            <span class=\"tickState\">"+(data.data[i].orderNoSite)+"</span>\n" +
                            "          </div>\n" +
                            "        </div>\n" +
                            "      </div>";
                    }
                    conEdit.innerHTML=htmlStr;
                    break;
            }
        },
        error:function(){
            alert("请求错误了");
        }
    });
}
function getTravelOrderMess(){
    let htmlStr="";
    let conEdit=document.getElementById("noTravelContainer");
    $.ajax({
        url: window.location.protocol+"//"+window.location.host+"/user/doTravelOrder",
        type:"POST",
        async:false,
        contentType:"application/json;charset=UTF-8",
        success:function(data){
            switch (data.code){
                case "0000":
                    htmlStr+="<tr><td><div style='text-align: center;margin-top: 40px'>"+data.msg+"</div></td></tr>";
                    conEdit.innerHTML=htmlStr;
                    break;
                case "1111":
                    for (var i in  data.data){
                        var startDate = dateFormat(data.data[i].orderStartTime);
                        var startTime = TimeFormat(data.data[i].orderStartTime);
                        var endDate = dateFormat(data.data[i].orderEndTime);
                        var endTime = TimeFormat(data.data[i].orderEndTime);
                        htmlStr+= "<div class=\"ticketCon\" onclick='viewOrder()'>\n" +
                            "        <div class=\"timeCon\">\n" +
                            "          <div class=\"ticketTime\">\n" +
                            "            <div>出发时间</div>\n" +
                            "            <div class=\"dateItem\">"+startDate+"</div>\n" +
                            "            <div class=\"timeItem\">"+startTime+"</div>\n" +
                            "          </div>\n" +
                            "          <div class=\"ticketTime\">\n" +
                            "            <div>车次</div>\n" +
                            "            <div style=\"text-align: center;\">\n" +
                            "              <div class=\"trainNo\">"+data.data[i].orderCard+"</div>\n" +
                            "              <hr style=\"width: 179px;margin: 4px 60px;\">\n" +
                            "              <div class=\"takeTime\" id='takeTime"+data.data[i].orderId+"'>"+data.data[i].timeDifferce+"</div>\n" +//2时1分
                            "            </div>\n" +
                            "          </div>\n" +
                            "          <div class=\"ticketTime\">\n" +
                            "            <div>到达时间</div>\n" +
                            "            <div class=\"dateItem\">"+endDate+"</div>\n" +
                            "            <div class=\"timeItem\">"+endTime+"</div>\n" +
                            "          </div>\n" +
                            "        </div>\n" +
                            "        <hr>\n" +
                            "        <div class=\"siteCon\">\n" +
                            "          <div class=\"ViPSite\">\n" +
                            "            一等座:\n" +
                            "            <span class=\"tickState\">"+(data.data[i].orderVipSite)+"</span>\n" +
                            "          </div>\n" +
                            "          <div class=\"ordinary\">\n" +
                            "            二等座:\n" +
                            "            <span class=\"tickState\">"+(data.data[i].orderOrdinary)+"</span>\n" +
                            "          </div>\n" +
                            "          <div class=\"NoSite\">\n" +
                            "            无座:\n" +
                            "            <span class=\"tickState\">"+(data.data[i].orderNoSite)+"</span>\n" +
                            "          </div>\n" +
                            "        </div>\n" +
                            "      </div>";
                    }
                    conEdit.innerHTML=htmlStr;
                    break;
            }
        },
        error:function(){
            alert("请求错误了");
        }
    });
}
function getUnpaidOrderMess(){
    let htmlStr="";
    let conEdit=document.getElementById("unpaidOrderContainer");
    $.ajax({
        url: window.location.protocol+"//"+window.location.host+"/user/doUnpaidOrder",
        type:"POST",
        async:false,
        contentType:"application/json;charset=UTF-8",
        success:function(data){
            switch (data.code){
                case "0000":
                    htmlStr+="<tr><td><div style='text-align: center;margin-top: 40px'>"+data.msg+"</div></td></tr>";
                    conEdit.innerHTML=htmlStr;
                    break;
                case "1111":
                    for (var i in  data.data){
                        var startDate = dateFormat(data.data[i].orderStartTime);
                        var startTime = TimeFormat(data.data[i].orderStartTime);
                        var endDate = dateFormat(data.data[i].orderEndTime);
                        var endTime = TimeFormat(data.data[i].orderEndTime);
                        htmlStr+= "<div class=\"ticketCon\" onclick='viewOrder()'>\n" +
                            "        <div class=\"timeCon\">\n" +
                            "          <div class=\"ticketTime\">\n" +
                            "            <div>出发时间</div>\n" +
                            "            <div class=\"dateItem\">"+startDate+"</div>\n" +
                            "            <div class=\"timeItem\">"+startTime+"</div>\n" +
                            "          </div>\n" +
                            "          <div class=\"ticketTime\">\n" +
                            "            <div>车次</div>\n" +
                            "            <div style=\"text-align: center;\">\n" +
                            "              <div class=\"trainNo\">"+data.data[i].orderCard+"</div>\n" +
                            "              <hr style=\"width: 179px;margin: 4px 60px;\">\n" +
                            "              <div class=\"takeTime\" id='takeTime"+data.data[i].orderId+"'>"+data.data[i].timeDifferce+"</div>\n" +//2时1分
                            "            </div>\n" +
                            "          </div>\n" +
                            "          <div class=\"ticketTime\">\n" +
                            "            <div>到达时间</div>\n" +
                            "            <div class=\"dateItem\">"+endDate+"</div>\n" +
                            "            <div class=\"timeItem\">"+endTime+"</div>\n" +
                            "          </div>\n" +
                            "        </div>\n" +
                            "        <hr>\n" +
                            "        <div class=\"siteCon\">\n" +
                            "          <div class=\"ViPSite\">\n" +
                            "            一等座:\n" +
                            "            <span class=\"tickState\">"+(data.data[i].orderVipSite)+"</span>\n" +
                            "          </div>\n" +
                            "          <div class=\"ordinary\">\n" +
                            "            二等座:\n" +
                            "            <span class=\"tickState\">"+(data.data[i].orderOrdinary)+"</span>\n" +
                            "          </div>\n" +
                            "          <div class=\"NoSite\">\n" +
                            "            无座:\n" +
                            "            <span class=\"tickState\">"+(data.data[i].orderNoSite)+"</span>\n" +
                            "          </div>\n" +
                            "        </div>\n" +
                            "      </div>";
                    }
                    conEdit.innerHTML=htmlStr;
                    break;
            }
        },
        error:function(){
            alert("请求错误了");
        }
    });
}
function getCommOrderMess(){
    let htmlStr="";
    let conEdit=document.getElementById("commOrderContainer");
    $.ajax({
        url: window.location.protocol+"//"+window.location.host+"/user/doCommOrder",
        type:"POST",
        async:false,
        contentType:"application/json;charset=UTF-8",
        success:function(data){
            switch (data.code){
                case "0000":
                    htmlStr+="<tr><td><div style='text-align: center;margin-top: 40px'>"+data.msg+"</div></td></tr>";
                    conEdit.innerHTML=htmlStr;
                    break;
                case "1111":
                    for (var i in  data.data){
                        var startDate = dateFormat(data.data[i].orderStartTime);
                        var startTime = TimeFormat(data.data[i].orderStartTime);
                        var endDate = dateFormat(data.data[i].orderEndTime);
                        var endTime = TimeFormat(data.data[i].orderEndTime);
                        htmlStr+= "<div class=\"ticketCon\" onclick='viewOrder()'>\n" +
                            "        <div class=\"timeCon\">\n" +
                            "          <div class=\"ticketTime\">\n" +
                            "            <div>出发时间</div>\n" +
                            "            <div class=\"dateItem\">"+startDate+"</div>\n" +
                            "            <div class=\"timeItem\">"+startTime+"</div>\n" +
                            "          </div>\n" +
                            "          <div class=\"ticketTime\">\n" +
                            "            <div>车次</div>\n" +
                            "            <div style=\"text-align: center;\">\n" +
                            "              <div class=\"trainNo\">"+data.data[i].orderCard+"</div>\n" +
                            "              <hr style=\"width: 179px;margin: 4px 60px;\">\n" +
                            "              <div class=\"takeTime\" id='takeTime"+data.data[i].orderId+"'>"+data.data[i].timeDifferce+"</div>\n" +//2时1分
                            "            </div>\n" +
                            "          </div>\n" +
                            "          <div class=\"ticketTime\">\n" +
                            "            <div>到达时间</div>\n" +
                            "            <div class=\"dateItem\">"+endDate+"</div>\n" +
                            "            <div class=\"timeItem\">"+endTime+"</div>\n" +
                            "          </div>\n" +
                            "        </div>\n" +
                            "        <hr>\n" +
                            "        <div class=\"siteCon\">\n" +
                            "          <div class=\"ViPSite\">\n" +
                            "            一等座:\n" +
                            "            <span class=\"tickState\">"+(data.data[i].orderVipSite)+"</span>\n" +
                            "          </div>\n" +
                            "          <div class=\"ordinary\">\n" +
                            "            二等座:\n" +
                            "            <span class=\"tickState\">"+(data.data[i].orderOrdinary)+"</span>\n" +
                            "          </div>\n" +
                            "          <div class=\"NoSite\">\n" +
                            "            无座:\n" +
                            "            <span class=\"tickState\">"+(data.data[i].orderNoSite)+"</span>\n" +
                            "          </div>\n" +
                            "        </div>\n" +
                            "      </div>";
                    }
                    conEdit.innerHTML=htmlStr;
                    break;
            }
        },
        error:function(){
            alert("请求错误了");
        }
    });
}
function dateFormat(DateStr){
    let Str = DateStr.split('');
    var DateMsg = Str[0]+Str[1]+Str[2]+Str[3]+"年"+Str[5]+Str[6]+"月"+Str[8]+Str[9]+"日";
    return DateMsg;
}
function TimeFormat(TimeStr){
    let Str = TimeStr.split('');
    var TimeMsg = Str[11]+Str[12]+Str[13]+Str[14]+Str[15];
    return TimeMsg;
}
function revisePassBtn(passId){
    location.href=("toEditPass?userPassId="+passId)
    // getEditPssMess(passId);
}
function deleteItem(passId){
    document.cookie = "passId="+passId;
    showPopup("您确认要删除该条乘客信息吗？");
}
function viewOrder(){
    location.href=("/user/viewOrder");
}