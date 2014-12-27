
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="base.jsp"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" type="text/css" />
    <link href="<%=request.getContextPath()%>/css/LoginAndReg.css" rel="stylesheet" type="text/css" />
    <link href="<%=request.getContextPath()%>/css/GetPwd.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div id="box">

    <!--body start -->
    <div id="body">
        <div id="Login">
            <h1 align="left" style="width:490px;"><span class="h1"><img src="<%=request.getContextPath()%>/images/buttonPassword.gif" alt="找回密码" /></span></h1>
            <div class="Emai">
                <div class="dlTitle">
                </div>
                <div class="dlContent">
                    <div class="dlContentC">
                        <p class="colSty1"> 请输入您在注册时使用的Email地址：</p>
                        <p class="hideMsg2" id="emailErrMsg"></p>
                        <p class="pSty1B pSty2B"> 请填写您的Email地址：
                            <input name="txtM2Email" id="txtM2Email" maxlength="128" type="text" />
                            <input name="hiddenUserIDAndEmail" id="hiddenUserIDAndEmail" type="hidden" />
                        </p>
                        <!-- onchange="EmailGetPwd(false);"-->
                        <p class="pSty1B" align="right"><a href="<%=request.getContextPath()%>/WEB-INF/views/GetPwd2.jsptPwd2.jsp"><img src="<%=request.getContextPath()%>/images/button_next.gif" border="0" /></a></p>
                        <p class="pSty4">如果该电子邮箱地址不正确，或者您已经忘记注册时填写的邮箱地址，那我们无法帮您找回密码，建议创建一个新帐户。</p>
                        <p class="pSty7 color3" style="margin-top:20px;">如果有任何疑问，请访问口口香<a href="#" target="_blank">帮助中心</a>，或与口口香客服部取得联系。</p>
                        <p class="pSty7">客服邮箱：service@koukouxiang.com</p>
                        <p class="pSty7">客服热线：400-650-7099 (仅收市话费，客服工作时间：8：00-次日凌晨1：00)</p>
                        <p class="pSty7">客服传真：0315-83607020</p>
                    </div>
                </div>
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
