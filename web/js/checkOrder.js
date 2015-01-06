/**
 * Created by Administrator on 2015/1/5.
 */
function checktheRecvName(){
    var recvName=document.getElementById('recvName').value;
    if(recvName.trim().length==0||recvName==null){
        document.getElementById('errorRecvName').style.color='#f00';
        document.getElementById('errorRecvName').innerHTML='请输入有效的收货人姓名！';
        return false;
    }else{
        document.getElementById('errorRecvName').innerHTML='';
        return true;
    }

}
function checktheDetailAddress(){
    var detailAddress=document.getElementById('Address').value;
    if(detailAddress.trim().length==0||detailAddress==null){
        document.getElementById('')
    }
}