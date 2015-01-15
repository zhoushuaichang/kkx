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
    <link href=<%=request.getContextPath()%>"/css/style.css" rel="stylesheet" type="text/css" />
    <link href=<%=request.getContextPath()%>"/css/LoginAndReg.css" rel="stylesheet" type="text/css" />
    <link href=<%=request.getContextPath()%>"/css/gmxx.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div id="box">

    <!--body start -->
    <div id="body">
        <div id="Login">
            <DIV id="gwc">
                <div id="step_" align="left">结算步骤: <span class="" id="shoppingstep_0">1.登录注册</span> &gt;&gt; <span class="" id="shoppingstep_2">2.填写核对订单信息</span> &gt;&gt; <span class="shoppingstepcontrol" id="shoppingstep_3">3.提交订单</span></div>
                <div id="onEdit"></div>
                <DIV class="title"><SPAN id="transferSpan"></SPAN></DIV>
                <DIV id="divPointError" style="DISPLAY: none; FLOAT: left; MARGIN: 0px 0px 10px">
                    <DIV class="pointErrorMsg">您目前的积分为：<SPAN id="myPointNumber">0</SPAN>分，本次购物需支付：<SPAN
                            id="needPointNumber">0</SPAN>分，请修改购物车中的积分换购产品。</DIV><IMG id="imgPointError"
                                                                                     src="<%=request.getContextPath()%>/images/jifenbuzhu.gif" useMap=#Map border=0> <MAP id="Map"
                                                                                                                                            name=Map><AREA shape=RECT coords=962,9,972,19
                                                                                                                                                           href="javascript:ClosePointError();"></MAP></DIV>
                <DIV id=OffProductList></DIV>
                <TABLE cellSpacing=0 cellPadding=0 width=100% border=0>
                    <TBODY>
                    <TR>
                        <TD vAlign=center align=left></TD></TR></TBODY></TABLE>
                <table class="tabSty01" border="0" cellpadding="0" cellspacing="0" width="100%">
                    <tr class="trSty01" bgcolor="#7a7f89">
                        <td class="reusableColor5 xxSty01 typeBottom" align="left" valign="middle">&nbsp;&nbsp;&nbsp;&nbsp;<strong>订单已提交</strong> <span id="Lb1newChange"></span></td>
                    </tr>
                    <tr>
                        <td height="100" align="center" ><h3><span style="color:#f90;">您好，您的订单已提交，我们会在第二个工作日进行审核请耐心等待！</span></h3></td>
                    </tr>
                    <tr>
                        <td height="50" class="typeTd2"><a href="#"><img src="<%=request.getContextPath()%>/images/button_close.gif" border="0" onclick="javascript:window.close()" /></a><br />
                        </td>
                </table>
<SPAN
        id="leavelNotMustPresentLsit"></SPAN>
                <DIV class="sty006 reusableColor3" align=left>您在购物过程中有任何疑问，请查阅 <A
                        href="#" target=_blank><SPAN
                        class="reusableColor1">帮助中心</SPAN></A> 或 <A href="#"
                                                                    target=_blank><SPAN class="reusableColor1">联系客服</SPAN></A></DIV>
                <DL class="dobuleBorder" style="display:none;">
                    <DT><STRONG>关于"我的购物车"</STRONG> </DT>
                    <DD>·为方便您提交订单，您添加至"我的购物车"中已经选择的、尚未提交订单的商品清单，我们将为您保留90天。<BR>·在商品保留期间，您所选择商品的价格、优惠政策、库存、配送时间等信息可能会有所变化，请以网页最新信息为准。
                    </DD></DL></DIV>
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
        <p class="copyright">Copyright 2010 All Rights Reserved 冀ICP证xxxxxx号

        </p>
        <p class="design"><a href="#" target="_blank" class="link">启奥科技</a></p>
    </div><!--footer end -->
    <!--body end -->
</div><!--box-->
</body>
</html>

