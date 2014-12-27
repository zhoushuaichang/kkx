<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/24
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="base.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>用户注册</title>
    <link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" type="text/css"/>
    <link href="<%=request.getContextPath()%>/css/LoginAndReg.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/check_valid.js"></script>
    <script type="text/javascript">
        function reloadValidate() {
            document.getElementById('Img1').src = '/html/validCode.jsp?r=' + Math.random()
        }
    </script>
</head>

<body>
<div id="box">

    <!--body start -->
    <div id="body">
        <div id="Login">
            <h1 align="left"><img src="<%=request.getContextPath()%>/images/pic_title.gif"></h1>
            <table width="800" border="0" align="center" cellpadding="0" cellspacing="0" class="lineJL">
                <form:form action="/checkReg" method="post" modelAttribute="webUser">
                    <tbody>
                    <tr>
                        <td class="sty03" valign="top" width="236" align="right">请填写您的Email地址：</td>
                        <td class="sty01" valign="top" width="219">
                            <form:input path="email" id="Email" onblur="Check_Email()"/>
                            <span class="Reginput" id="span_CheckUsername"></span>
                        </td>
                        <td class="sty04" valign="top" width="425" align="left" id="emailTip">　请填写有效的 Email地址<br>我们会给这个地址发送帐户信息、订单通知等。
                        </td>
                    </tr>
                    <tr>
                        <td class="sty03" valign="top" align="right">请设定密码：</td>
                        <td class="sty01" valign="top">
                            <form:password path="userPass"maxlength="16" id="PassWord" onblur="ChangePassword();"/>
                            <span id="CheckRePassWord" class="Reginput"></span></td>
                        <td class="sty03 sty04" valign="top" align="left" id="passwordTip">　密码请设为6-16位字母或数字</td>
                    </tr>
                    <tr>
                        <td class="sty03" valign="top" align="right">请再次输入设定密码：</td>
                        <td class="sty01" valign="top">
                            <input id="RexPassWord" name="RexPassWord" maxlength="16" onblur="Check_RePassWord()" value="" type="password">
                            <span id="ReCheckRePassWord" class="Reginput"></span></td>
                        <td align="left" id="rexPasswordTip">　</td>
                    </tr>
                    <tr>
                        <td class="sty03" valign="top" align="right">昵称：</td>
                        <td class="sty01" valign="top">
                            <form:input path="userName"maxlength="16" id="UserName" onblur="CheckUserName()"/>
                            <span id="CheckNewUserName" class="Reginput"></span></td>
                        <td class="sty03 sty04" valign="top" align="left" id="userNameTip">　请输入中英文、数字、下划线或它们的组合作为登录名
                        </td>
                    </tr>
                    <tr>
                        <td class="sty03" valign="top" align="right">请输入验证码：</td>
                        <td class="sty02" colspan="2" valign="top">
                            <input name="Validate_Code" id="Validate_Code" class="inputSty01"
                                   onblur='CheckValidateCode(<%=(String)request.getSession().getAttribute("rand")%>)'
                                   style="width:100px;" type="text">
                            <img id="Img1"
                                 style="height:20px;width: 60px;vertical-align: top; padding: 0pt 0pt 0pt 8px;"
                                 src="<%=request.getContextPath()%>/WEB-INF/views/validCode.jspdCode.jsp"
                                 onclick=this.src="/html/validCode.jsp?r="+Math.random()>
                            <span class="sty03 sty04" id="validCodeTip"><a href="javascript:reloadValidate()">看不清，换一张</a></span>
                            <span class="Reginput" id="CheckValidateCode" style="width: 220px;"></span>
                        </td>
                    </tr>
                    <tr>
                        <td>　</td>
                        <td align="right"><input src="<%=request.getContextPath()%>/images/submit.gif"
                                                 style="width:91px; height:25px; border:0;" alt="完成注册" type="image">
                        </td>
                        <td>　</td>
                    </tr>
                    <tr>
                        <td colspan="3">&nbsp;</td>
                    </tr>
                    </tbody>
                </form:form>
            </table>

        </div>
        <br class="spacer"/>
    </div>
    <!--footer start -->
    <div id="footer">
        <ul>
            <li><a href="#">首页</a>|</li>
            <li><a href="#">关于我们</a>|</li>
            <li><a href="#">新闻资讯</a>|</li>
            <li><a href="#">价单下载</a>|</li>
            <li><a href="#">联系我们</a>|</li>
        </ul>
        <p class="copyright">Copyright 2010 vancl.com All Rights Reserved 冀ICP证xxxxxx号

        </p>

        <p class="design"><a href="http://www.CSSK8.com/" target="_blank" class="link">启奥科技</a></p>
    </div>
    <!--footer end -->
    <!--body end -->
</div>
<!--box-->
</body>
</html>

