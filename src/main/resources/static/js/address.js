$(function () {
    getContactsMess();
})
function getContactsMess(){
    let htmlStr="";
    let conEdit=document.getElementById("conAddrContainer");
    $.ajax({
        url: window.location.protocol+"//"+window.location.host+"/user/doAddress",
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
                            "                <td class='tableAListName' onclick='revisePassBtn("+data.data[i].addrId+")'>"+data.data[i].addrName+"</td>\n" +
                            "                <td class='tableAListType' onclick='revisePassBtn("+data.data[i].addrId+")'>"+data.data[i].addrProvince+"</td>\n" +
                            "                <td class='tableAListId' onclick='revisePassBtn("+data.data[i].addrId+")'>"+data.data[i].addrCity+"</td>\n" +
                            "                <td class='tableAListC' onclick='revisePassBtn("+data.data[i].addrId+")'>"+data.data[i].addrCounty+"</td>\n" +
                            "                <td class='tableAListSex' onclick='revisePassBtn("+data.data[i].addrId+")'>"+data.data[i].addrDetail+"</td>\n" +
                            "                <td class='tableAListCard' onclick='revisePassBtn("+data.data[i].addrId+")'>"+data.data[i].addrCode+"</td>\n" +
                            "                <td class='EditBtn' onclick='revisePassBtn("+data.data[i].addrId+")'>编辑</td>\n" +
                            "                <td class='deleteBtn' onclick='deleteItem("+data.data[i].addrId+")'>删除</td>\n" +
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