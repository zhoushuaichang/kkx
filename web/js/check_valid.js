/**
 * Created by Administrator on 2014/12/25.
 */

/*
 验证邮箱
 */
function Check_Email() {
    var email = document.getElementById('Email').value.trim();
    var emailReg = /^[\w-]+(\.[\w-]+)*@[\w-]+(\.[\w-]+)+$/;
    if (emailReg.test(email)) {
        document.getElementById('CheckUsername').style.color = "#00ff00";
        document.getElementById('CheckUsername').style.fontSize = "12";
        document.getElementById('CheckUsername').innerHTML = 'Email格式正确！';
        return true;
    } else {
        document.getElementById('CheckUsername').style.color = "#ff0000";
        document.getElementById('CheckUsername').style.fontSize = "12";
        document.getElementById('CheckUsername').innerHTML = '您输入的Email格式不正确！';
        return false;
    }
}

/*
 验证密码
 */
function ChangePassword() {
    var password = document.getElementById('PassWord').value.trim();
    if (password == null || password === "") {
        document.getElementById('CheckRePassWord').style.color = "#ff0000";
        document.getElementById('CheckRePassWord').style.fontSize = "12";
        document.getElementById('CheckRePassWord').innerHTML = '您没有输入有效密码，为6-16位字母或数字';
        return false;
    }
    if (password.length < 6) {
        document.getElementById('CheckRePassWord').style.color = "#ff0000";
        document.getElementById('CheckRePassWord').style.fontSize = "12";
        document.getElementById('CheckRePassWord').innerHTML = '您输入的密码过短，为6-16位字母或数字';
        return false;
    }
    if (password.length > 16) {
        document.getElementById('CheckRePassWord').style.color = "#ff0000";
        document.getElementById('CheckRePassWord').style.fontSize = "12";
        document.getElementById('CheckRePassWord').innerHTML = '您输入的密码过长，为6-16位字母或数字';
        return false;
    }
    var PasswordReg = "^[0-9a-zA-Z_]+$";
    var re = new RegExp(PasswordReg);
    if (re.test(password)) {
        document.getElementById('CheckRePassWord').style.color = "#00ff00";
        document.getElementById('CheckRePassWord').style.fontSize = "12";
        document.getElementById('CheckRePassWord').innerHTML = '密码可用！';
        return true;
    }
}

/*
 验证重复密码
 */
function Check_RePassWord() {
    var password = document.getElementById('PassWord').value.trim();
    var RexPassword = document.getElementById('RexPassWord').value.trim();
    if (RexPassword.length < 6 || RexPassword === null) {
        document.getElementById('ReCheckRePassWord').style.color = "#ff0000";
        document.getElementById('ReCheckRePassWord').style.fontSize = "12";
        document.getElementById('ReCheckRePassWord').innerHTML = '您输入的重复密码有误！';
        return false;
    }
    if (RexPassword.length > 16 || RexPassword === null) {
        document.getElementById('ReCheckRePassWord').style.color = "#ff0000";
        document.getElementById('ReCheckRePassWord').style.fontSize = "12";
        document.getElementById('ReCheckRePassWord').innerHTML = '您没有输入有效重复密码！';
        return false;
    } else {
        if (password === RexPassword) {
            document.getElementById('ReCheckRePassWord').style.color = "#00ff00";
            document.getElementById('ReCheckRePassWord').style.fontSize = "12";
            document.getElementById('ReCheckRePassWord').innerHTML = '密码有效！';
            return true;
        } else {
            document.getElementById('ReCheckRePassWord').style.color = "#ff0000";
            document.getElementById('ReCheckRePassWord').style.fontSize = "12";
            document.getElementById('ReCheckRePassWord').innerHTML = '两次密码不一致！';
            return false;
        }
    }
}

/*
 验证昵称
 */
function CheckUserName() {
    var userName = document.getElementById('UserName').value;
    var userNameReg = "^[0-9a-zA-Z\u4e00-\u9fa5_]+$";
    var re = new RegExp(userNameReg);
    if (re.test(userName)) {
        document.getElementById('CheckNewUserName').style.color = "#00ff00";
        document.getElementById('CheckNewUserName').style.fontSize = "12";
        document.getElementById('CheckNewUserName').innerHTML = '用户名格式正确！';
        return true;
    } else {
        document.getElementById('CheckNewUserName').style.color = "#ff0000";
        document.getElementById('CheckNewUserName').style.fontSize = "12";
        document.getElementById('CheckNewUserName').innerHTML = '请输入中英文、数字、下划线或它们的组合';
        return false;
    }
}


function CheckValidateCode(rand) {
    var validCode = document.getElementById('Validate_Code').value.trim();
    if (rand == validCode) {
        document.getElementById('CheckValidateCode').innerHTML = '<a href="javascript:reloadValidate()">看不清，换一张</a>OK';
    } else {
        document.getElementById('CheckValidateCode').style.color = "#ff0000";
        document.getElementById('CheckValidateCode').style.fontSize = "12";
        document.getElementById('CheckValidateCode').innerHTML = '验证码错误';
    }
}

/*
 * 提交注册信息*/
function submitRegForm() {

    if (Check_Email() && ChangePassword() && Check_RePassWord() && CheckUserName()) {
        document.getElementById("regForm").submit();
    }
    else {
        alert("存在未通过校验的数据，请修改！");
    }


}