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
            <h1 align="left"><span class="h1"><img src="<%=request.getContextPath()%>/images/buttonPassword.gif" alt="找回密码" /></span></h1>
            <div class="FPaContent">
                <form name="Form1" method="post" action="GetPwdStep2_email.aspx" id="Form1">
                    <div>
                        <input name="__EVENTTARGET" id="__EVENTTARGET" value="" type="hidden" />
                        <input name="__EVENTARGUMENT" id="__EVENTARGUMENT" value="" type="hidden" />
                        <input name="__VIEWSTATE" id="__VIEWSTATE" value="/wEPDwUJMjcxMDA0NzQ3DxYGHgdfdXNlcklEBQc4MTAyNzEzHgdfbTJNYWlsBRAxNzk3NzgzMThAcXEuY29tHglfY2hlY2tOdW0FJGVhYzViZWU0LTg3OTMtNDkxNy1hM2ZjLWQ5MzYzYjUyYjBmNmRk" type="hidden" />
                    </div>
                    <script type="text/javascript">
                        //<![CDATA[
                        var theForm = document.forms['Form1'];
                        if (!theForm) {
                            theForm = document.Form1;
                        }
                        function __doPostBack(eventTarget, eventArgument) {
                            if (!theForm.onsubmit || (theForm.onsubmit() != false)) {
                                theForm.__EVENTTARGET.value = eventTarget;
                                theForm.__EVENTARGUMENT.value = eventArgument;
                                theForm.submit();
                            }
                        }
                        //]]>
                    </script>
                    <div>
                        <input name="__EVENTVALIDATION" id="__EVENTVALIDATION" value="/wEWAgL+lPmEAwLM9PumDw==" type="hidden" />
                    </div>
                    <p class="mailTi"><span class="mailTitle">我们已经把验证邮件发送至您的邮箱，请在24小时内通过邮件内的链接继续设置新的密码。</span><br />
                    </p>
                </form>
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
