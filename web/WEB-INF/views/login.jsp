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
    <title>无标题文档</title>
    <link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" type="text/css"/>
    <link href="<%=request.getContextPath()%>/css/LoginAndReg.css" rel="stylesheet" type="text/css"/>
    <script src="../../js/login.js" type="text/javascript"></script>
    <style>
        .errClass {
            color: #ff0000 ;border : 1px #ff0000

        }

    </style>

</head>

<body>
<div id="box">

    <!--body start -->
    <div id="body">
        <div id="Login">
            <h1 align="left" style="width:343px;"><img src="${ctx}/images/pic_dl.gif"></h1>

            <div class="dlC">
                <div class="regSetTabBox">
                    <div class="regSetTabMenu">
                        <ul>
                            <li id="one1" onclick="setTab('one',1,2)" class="hover">口口香用户</li>
                            <li class="" id="one2" onclick="setTab('one',2,2)" style="display:none;">VIP用户</li>
                        </ul>
                    </div>
                    <div class="regSetTabCon">
                        <div style="display: block;" id="con_one_1"><span class="blank20"></span>
                            <form:form action="${ctx}/checkLogin" method="post" modelAttribute="webUser" id="loginForm">
                                <div class="FTextArea"><span>用户名：</span>
                                    <form:input path="userName" id="userName" cssErrorClass="errClass"/><form:errors path="userName" cssErrorClass="errClass"></form:errors>
                                </div>
                                <span class="blank20"></span>

                                <div class="FTextArea"><span>密&nbsp;&nbsp;码：</span>
                                    <form:password path="userPass" id="userPass" /><form:errors path="userPass" cssErrorClass="errClass"></form:errors>
                                </div>
                                <span class="blank15">${loginError}</span>

                                <div class="btnReg">
                                    <button type="button" onclick="checklogin();"></button>
                                <span><a href="${ctx}/WEB-INF/views/GetPwd1.jsp" title=""
                                         target="_new">密码忘记了？</a></span></div>
                                <span class="blank20"></span>
                            </form:form>
                        </div>
                        <div id="con_one_2" style="display: none;"><span class="blank20"></span>

                            <form name="PartnerForm" id="PartnerForm" method="post" style="margin: 0px;">
                                <div class="FTextArea"><span>用户名：</span>
                                    <input name="PartnerUserName" id="PartnerUserName" class="" type="text"/>
                                </div>
                                <span class="blank20"></span>

                                <div class="FTextArea"><span>密&nbsp;&nbsp;码：</span>
                                    <input name="PartnerPassword" id="PartnerPassword" class=""
                                           onkeypress="PartLoginKeyDown(event);" type="password"/>
                                </div>
                                <span class="blank15"></span>

                                <div class="btnReg">
                                    <button type="button" onclick="CheckPartLogin();" class=""></button>
                                </div>
                                <input name="Logintrue" value="true" type="hidden"/>
                                <input name="IsVjia" id="IsVjia" type="hidden"/>
                                <input name="IsLogIn" value="1" type="hidden"/>
                            </form>
                            <span class="blank20"></span></div>
                    </div>
                    <span class="blank20"></span>

                    <div class="tishiArea">
                        <div class="tishiHead">温馨提示：</div>
                        <ul>
                            <li>1、请输入您的口口香用户名及密码进行登陆；</li>
                            <li>
                                2、如果还未注册口口香用户名，您可以使用VJIA用户名进行登陆,登陆后系统会自动为您注册一个与VJIA帐户相关联的口口香帐户。帐户关联后您可共享VJIA的会员积分和累积消费金额。
                            </li>
                        </ul>
                        <div class="">如有疑问请进入<a href="#" target="_blank">帮助中心</a>或<a href="#" target="_blank">联系客服</a>
                        </div>
                    </div>
                </div>
            </div>
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

