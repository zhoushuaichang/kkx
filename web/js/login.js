/**
 * Created by Administrator on 2014/12/26.
 */
function checklogin (){
    var userName=document.getElementById('userName').value.trim();
    var password=document.getElementById('userPass').value.trim();
    var errorMsg="";
    if(userName.length==0){
        errorMsg+="用户名不能为空！";
    }if(password.length==0){
        errorMsg+="密码不能为空！";
        alert(errorMsg);
        return false;
    }

    var form=document.getElementById('loginForm');
    form.submit();
}