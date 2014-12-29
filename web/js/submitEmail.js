/**
 * Created by Administrator on 2014/12/28.
 */
function submitEmail(){
    var email = document.getElementById('email_address').value.trim();
    var emailReg = /^[\w-]+(\.[\w-]+)*@[\w-]+(\.[\w-]+)+$/;
    if (emailReg.test(email)) {
        document.getElementById('emailForm').submit();
        return true;
    } else {
        var errorMsg=document.getElementById('emailErrMsg');
        errorMsg.color="#ff0000";
        errorMsg.innerHTML='您输入的Email格式不正确！';
        return false;
    }
}