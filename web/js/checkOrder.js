/**
 * Created by Administrator on 2015/1/5.
 */
function checktheRecvMan() {
    var recvMan = document.getElementById('recvMan').value;
    if (recvMan.trim().length == 0 || recvMan == null) {
        document.getElementById('errorRecvMan').style.color = '#f00';
        document.getElementById('errorRecvMan').innerHTML = '请输入有效的收货人姓名！';
        return false;
    } else {
        document.getElementById('errorRecvMan').innerHTML = '';
        return true;
    }

}
function checktheDetailAddress() {
    var detailAddress = document.getElementById('Address').value;
    var province = document.getElementById('ProvinceID').value;
    var city = document.getElementById('CityID').value;
    var district = document.getElementById('DistrictID').value;

    if ((detailAddress.trim().length > 0 || detailAddress != null) && province > 0 && city > 0 && district > 0) {
        return true;
    } else {
        document.getElementById('errorArea').style.color = '#f00';
        document.getElementById('errorArea').innerHTML = '请输入全部的地址';
    }
}

function ChecktheZip(){
    var zip=document.getElementById('Zip').value;
    if(zip.trim().length==0||zip==null){
        document.getElementById('errorPostal').style.color = '#f00';
        document.getElementById('errorPostal').innerHTML = '请输入邮编';
    }
}
function ChecktheinkTel(){
    var linkTel=document.getElementById('linkTel').value;
    if(linkTel.trim().length==0||linkTel==null){
        document.getElementById('errorPhone').style.color = '#f00';
        document.getElementById('errorPhone').innerHTML = '请输入联系电话';
    }
}