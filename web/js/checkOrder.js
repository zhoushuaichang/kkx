/**
 * Created by Administrator on 2015/1/5.
 */
function checktheRecvMan(){
    var recvMan=document.getElementById('recvMan').value;
    if(recvMan.trim().length==0||recvMan==null){
        document.getElementById('errorRecvMan').style.color='#f00';
        document.getElementById('errorRecvMan').innerHTML='请输入有效的收货人姓名！';
        return false;
    }else{
        document.getElementById('errorRecvMan').innerHTML='';
        return true;
    }

}
function checktheDetailAddress(){
    var detailAddress=document.getElementById('Address').value;
    if(detailAddress.trim().length==0||detailAddress==null){
        document.getElementById('')
    }
}