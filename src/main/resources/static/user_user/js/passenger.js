$(function () {
    getPassengerMess();
})
function getPassengerMess(){
    let htmlStr="";
    let conEdit=document.getElementById("conPassContainer");
    $.ajax({
        url: window.location.protocol+"//"+window.location.host+"/user/doPassenger",
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
                    htmlStr+="<table class=\"passTable\">";
                    for (var i in  data.data){
                        htmlStr+= "<tr class='tableT'>\n" +
                            "                <td class='tableTListCheck'>\n" +
                            "                    <input type='checkbox' class='checkOne' name='selectOne'>\n" +
                            "                </td>\n" +
                            "                <td class='tableTListName' onclick='revisePassBtn("+data.data[i].passId+")'>"+data.data[i].passName+"</td>\n" +
                            "                <td class='tableTListPhone' onclick='revisePassBtn("+data.data[i].passId+")'>"+data.data[i].passPhone+"</td>\n" +
                            "                <td class='tableTListType' onclick='revisePassBtn("+data.data[i].passId+")'>身份证</td>\n" +
                            "                <td class='tableTListId' onclick='revisePassBtn("+data.data[i].passId+")'>"+data.data[i].passCode+"</td>\n" +
                            "                <td class='tableTListC' onclick='revisePassBtn("+data.data[i].passId+")'>中国</td>\n" +
                            "                <td class='tableTListSex' onclick='revisePassBtn("+data.data[i].passId+")'>"+(data.data[i].passSex==0?'男':'女')+"</td>\n" +
                            "                <td class='tableTListCard' onclick='revisePassBtn("+data.data[i].passId+")'>无</td>\n" +
                            "                <td class='EditBtn' onclick='revisePassBtn("+data.data[i].passId+")'>编辑</td>\n" +
                            "                <td class='deleteBtn' onclick='deleteItem("+data.data[i].passId+")'>删除</td>\n" +
                            "            </tr>\n";
                    }
                    htmlStr+= "        </table>";
                    conEdit.innerHTML=htmlStr;
                    break;
            }
        },
        error:function(){
            alert("请求错误了");
        }
    });
}
function revisePassBtn(passId){
    location.href=("toEditPass?userPassId="+passId)
    // getEditPssMess(passId);
}
function deleteItem(passId){
    document.cookie = "passId="+passId;
    showPopup("您确认要删除该条乘客信息吗？");
}