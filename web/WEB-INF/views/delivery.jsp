<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/24
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="base.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>无标题文档</title>
    <link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" type="text/css"/>
    <link href="<%=request.getContextPath()%>/css/LoginAndReg.css" rel="stylesheet" type="text/css"/>
    <link href="<%=request.getContextPath()%>/css/gmxx.css" rel="stylesheet" type="text/css"/>
</head>

<body>
<div id="box">

    <!--body start -->
    <div id="body">
        <div id="Login">
            <DIV id="gwc">
                <div id="step_" align="left">结算步骤: <span class="" id="shoppingstep_0">1.登录注册</span> &gt;&gt; <span
                        class="shoppingstepcontrol" id="shoppingstep_2">2.填写核对订单信息</span> &gt;&gt; <span class=""
                                                                                                         id="shoppingstep_3">3.提交订单</span>
                </div>
                <div id="onEdit"></div>
                <DIV class="title"><SPAN id="transferSpan"></SPAN></DIV>
                <DIV id="divPointError" style="DISPLAY: none; FLOAT: left; MARGIN: 0px 0px 10px">
                    <DIV class="pointErrorMsg">您目前的积分为：<SPAN id="myPointNumber">0</SPAN>分，本次购物需支付：<SPAN
                            id="needPointNumber">0</SPAN>分，请修改购物车中的积分换购产品。
                    </DIV>
                    <IMG id="imgPointError"
                         src="<%=request.getContextPath()%>/images/jifenbuzhu.gif" useMap=#Map border=0>
                    <MAP id="Map"
                         name=Map>
                        <AREA shape=RECT coords=962,9,972,19
                              href="javascript:ClosePointError();">
                    </MAP>
                </DIV>
                <DIV id=OffProductList></DIV>
                <TABLE cellSpacing=0 cellPadding=0 width=100% border=0>
                    <TBODY>
                    <TR>
                        <TD vAlign=center align=left><SPAN
                                id="TenPayNotice"></SPAN></TD>
                    </TR>
                    </TBODY>
                </TABLE>
                <table class="tabSty01" border="0" cellpadding="0" cellspacing="0" width="100%">
                    <tbody>
                    <tr>
                        <td>
                            <div class="titleSty"> <span id="Label_Addressee">
        <h2 align="left">收货人信息<span class="reusableColor4 typeH2"><a href="#"><span
                class="addFontCol">修改</span></a></span></h2>
        <h4 align="left"><span class="reusableColor3 letterSpac">收货人</span><span
                class="reusableColor3 letterSpac1">：</span>刘德华<br/>
            <span class="reusableColor3">地　　区：</span>河北&nbsp;&nbsp;-&nbsp;&nbsp;唐山市&nbsp;&nbsp;-&nbsp;&nbsp;路北区<br/>
            <span class="reusableColor3">收货地址：</span>唐山火车站&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br/>
            <span class="reusableColor3">邮政编码：</span>063000<br/>
            <span class="reusableColor3">联系方式：</span>138********</h4>
      </span></div>
                        </td>
                    </tr>
                    </tbody>
                    <form method="post" name="Myform" id="Myform">
                    </form>
                    <tr class="trSty01" bgcolor="#7a7f89">
                        <td class="reusableColor5 xxSty01 typeBottom" align="left" valign="middle">&nbsp;&nbsp;&nbsp;&nbsp;请选择
                            <strong>配送方式　</strong> <span id="Lb1newChange"></span></td>
                    </tr>
                    <tr>
                        <td class="typeTd1">
                            <div class="psFs2 Paymentclass" align="left">
                                <li align="left">
                                    <input name="Transfer" value="01" checked="checked" type="radio"/>
                                    快递－支持货到付款－您目前可享受全场购物满59元免运费优惠。<span class="reusableColor1"><a href="#"
                                                                                                  target="_blank"><br/>
                                    查看货到付款配送范围</a></span></li>
                                <li align="left">
                                    <input name="Transfer" value="05" type="radio"/>
                                    EMS－不支持货到付款。<span class="reusableColor3">&quot;款到快递&quot;替代原&quot;平邮&quot;送货方式，送货更快。您目前可享受全场购物满59元免运费优惠。</span><span
                                        class="reusableColor1"><a href="#" target="_blank"><br/>
                                    查看货到付款配送范围</a></span></li>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td class="typeTd2"><span class="addDeleteSty addFontCol"><a href="#"><span class="addFontCol">修改</span></a><span
                                class="addFontCol">　|</span>　<a href="#"><span
                                class="addFontCol">删除</span></a></span><span class="addSpanSty"><a
                                href="<%=request.getContextPath()%>/WEB-INF/views/submitOrder.jspOrder.jsp"><img
                                src="<%=request.getContextPath()%>/images/button_qr.gif" border="0"
                                onclick="#"/></a></span><br/>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                    </tr>
                </table>
<SPAN
        id="leavelNotMustPresentLsit"></SPAN>

                <DIV class="sty006 reusableColor3" align=left>您在购物过程中有任何疑问，请查阅 <A
                        href="#" target=_blank><SPAN
                        class="reusableColor1">帮助中心</SPAN></A> 或 <A href="#"
                                                                    target=_blank><SPAN
                        class="reusableColor1">联系客服</SPAN></A></DIV>
                <DL class="dobuleBorder" style="display:none;">
                    <DT><STRONG>关于"我的购物车"</STRONG></DT>
                    <DD>·为方便您提交订单，您添加至"我的购物车"中已经选择的、尚未提交订单的商品清单，我们将为您保留90天。<BR>·在商品保留期间，您所选择商品的价格、优惠政策、库存、配送时间等信息可能会有所变化，请以网页最新信息为准。
                    </DD>
                </DL>
            </DIV>
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
        <p class="copyright">Copyright 2010 All Rights Reserved 冀ICP证xxxxxx号

        </p>

        <p class="design"><a href="#" target="_blank" class="link">启奥科技</a></p>
    </div>
    <!--footer end -->
    <!--body end -->
</div>
<!--box-->
</body>
</html>

