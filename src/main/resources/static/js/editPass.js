
function showPopup(msg){
    var overlay = window.parent.document.getElementById("overlay");
    window.parent.document.getElementById('popup_content').innerHTML=msg;
    overlay.style.display = "block";
}