<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/24
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="base.jsp"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>修改密码2</title>
    <link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" type="text/css" />
    <link href="<%=request.getContextPath()%>/css/LoginAndReg.css" rel="stylesheet" type="text/css" />
    <link href="<%=request.getContextPath()%>/css/GetPwd.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div id="box">

    <!--body start -->
    <div id="body">
        <div id="Login">
            <h1 align="left"><span class="h1"><img src="<%=request.getContextPath()%>/images/buttonPassword.gif" alt="找回密码" /></span></h1>
            <div class="FPaContent">
                    <p class="mailTi"><span class="mailTitle">${messageTip}</span><br />
                    </p>

                <p class="dxSty">　</p>
                <p class="textSty">如果有任何疑问，请访问口口香 <span class="color3"><a href="#" target="_blank">帮助中心</a></span>，或与口口香客服部取得联系。<br />
                    客服邮箱：service@koukouxiang.com<br />
                    客服热线：400-650-7099 (仅收市话费，客服工作时间：8：00-次日凌晨1：00)<br />
                    客服传真：0315-83603605</p>
            </div>
        </div>
        <br class="spacer" />
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
    </div><!--footer end -->
    <!--body end -->
</div><!--box-->
</body>
</html>
