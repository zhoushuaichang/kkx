<%@ page import="com.shinowit.entity.Product" %>
<%@ page import="java.util.List" %>
<%@include file="base.jsp" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/24
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    List<Product> productList = (List<Product>) request.getSession().getAttribute("productList");
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>无标题文档</title>
    <link href="${ctx}/css/style.css" rel="stylesheet" type="text/css"/>
    <link href="${ctx}/css/LoginAndReg.css" rel="stylesheet" type="text/css"/>
    <link href="${ctx}/css/gmxx.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="${ctx}/js/jquery.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $('.delProduct').click(function () {
                $.ajax({
                    type: "get",
                    url: "${ctx}/order/delProduct",
                    data: "productCode=" + $(this).attr('data'),
                    contentType: "application/json",
                    success: function (data) {
                        var refreshHtml = '<tr class="trSty01" bgcolor="#7a7f89">' +
                                '<td align="center" height="32">商品</td>' +
                                '<td align="center" height="32">名称</td>' +
                                '<td align="center" height="32">单价</td>' +
                                '<td align="center" height="32">数量</td>' +
                                '<td align="center" height="32">小计</td>' +
                                '<td align="center">操作</td>' +
                                '</tr>';
                        for (var i = 0; i < data.length; i++) {
                            refreshHtml += '<tr>' +
                                    '<td width="160" height="160" align="center" valign="middle"><span class="imgw"><a href="#" target="_blank"><img src="${ctx}/images/pro_04.jpg"  border="0" width="160" /></a></span></td>' +
                                    '<td><a href="#" target="_blank"><span class="STYLE5">' + data[i].productName + '</span></a></td>' +
                                    '<td align="center">￥<span id="productPrice">' + data[i].price + '</span></td>' +
                                    '<td align="center"><input name="OrderAmount_2" id="OrderAmount_' + data[i].productCode + '" class="OrderCount" style="width: 20px; height: 15px; color: rgb(75, 75, 75);" value="1" type="text" onchange="orderCountChange(' + data[i].productCode + ',' + data[i].price + ')" /></td>' +
                                    '<td align="center">￥<span id="productTotal_' + data[i].productCode + '">' + data[i].price + '</span></td>' +
                                    '<td align="center"><a class="delProduct" data="' + data[i].productCode + '" >删除</a></td>' +
                                    '</tr>';
                        }
                        document.getElementById('shoppingCatTable').innerHTML = refreshHtml;

                    }
                });
            });
        });
        function orderCountChange(productCode, productPrice) {
            var orderCount = parseFloat(document.getElementById('OrderAmount_' + productCode).value);
            productPrice = parseFloat(productPrice);
            document.getElementById('productTotal_' + productCode).innerHTML = orderCount * productPrice;
//            document.getElementById('spRealTotalAmount').innerHTML=orderCount*productPrice;
        }
        function delProduct(productCode) {

        }
    </script>
</head>

<body>
<div id="box">

    <!--body start -->
    <div id="body">
        <div id="Login">
            <DIV id="gwc">
                <DIV class="mcar" style="width:774px; margin:auto"><IMG alt=我的购物车
                                                                        src="${ctx}/images/pic_gwc__r2_c2.jpg"></DIV>
                <DIV class="title"><SPAN id="transferSpan"></SPAN></DIV>
                <DIV id="divPointError" style="DISPLAY: none; FLOAT: left; MARGIN: 0px 0px 10px">
                    <DIV class="pointErrorMsg">您目前的积分为：<SPAN id="myPointNumber">0</SPAN>分，本次购物需支付：<SPAN
                            id="needPointNumber">0</SPAN>分，请修改购物车中的积分换购产品。
                    </DIV>
                    <IMG id="imgPointError" src="${ctx}/images/jifenbuzhu.gif" useMap=#Map border=0>
                    <MAP id="Map" name=Map>
                        <AREA shape=RECT coords=962,9,972,19 href="javascript:ClosePointError();">
                    </MAP>
                </DIV>
                <DIV class="bxSty"><!--Product-->
                    <table width="80%" border="0" align="center" cellpadding="0" cellspacing="0" class="tabSty01"
                           id="shoppingCatTable">
                        <tr class="trSty01" bgcolor="#7a7f89">
                            <td align="center" height="32">商品</td>
                            <td align="center" height="32">名称</td>
                            <td align="center" height="32">单价</td>
                            <td align="center" height="32">数量</td>
                            <td align="center" height="32">小计</td>
                            <td align="center">操作</td>
                        </tr>
                        <% for (Product product : productList) {%>
                        <tr>
                            <td width="160" height="160" align="center" valign="middle"><span class="imgw"><a href="#"
                                                                                                              target="_blank"><img
                                    src="<%=request.getContextPath()%>/images/pro_04.jpg" border="0"
                                    width="160"/></a></span></td>
                            <td><a href="#" target="_blank"><span
                                    class="STYLE5"><%=product.getProductName()%></span></a></td>
                            <td align="center">￥<span id="productPrice"><%=product.getPrice()%></span></td>
                            <td align="center"><input name="OrderAmount_2"
                                                      id="OrderAmount_<%=product.getProductCode()%>" class="OrderCount"
                                                      style="width: 20px; height: 15px; color: rgb(75, 75, 75);"
                                                      value="1" type="text"
                                                      onchange="orderCountChange('<%=product.getProductCode()%>',<%=product.getPrice()%>)"/>
                            </td>
                            <td align="center">￥<span
                                    id="productTotal_<%=product.getProductCode()%>"><%=product.getPrice()%></span></td>
                            <td align="center"><a class="delProduct" data="<%=product.getProductCode()%>">删除</a></td>
                        </tr>
                        <%} %>

                    </table>
                    <TABLE width="80%" border=0 align="center" cellPadding=0 cellSpacing=0 class="dobuleBorder">
                        <TBODY>
                        <TR>
                            <TD class="tdStyProductTotal" vAlign=top align=right>
                                产品数量总计：<SPAN class="colSty " id="spTotalCount">0</SPAN><SPAN
                                    class="colSty sty008">件</SPAN>
                                赠送积分总计：<SPAN class="colSty" id="giftPoint">0</SPAN><SPAN class="colSty sty008">分</SPAN>
                                花费积分总计：<SPAN class="colSty " id="totalPoint">0</SPAN><SPAN
                                    class="colSty sty010">分</SPAN>
                                <SPAN id="decspan">
                                    产品金额总计：<SPAN class="colSty ">￥</SPAN><SPAN class="colSty sty008" id="spTotalAmount">0.00</SPAN><BR>
                                    <SPAN class="fontSty01">实际金额：<SPAN
                                            class="colSty"><STRONG>￥</STRONG></SPAN><STRONG><SPAN class="colSty"
                                                                                                  id="spRealTotalAmount">0.00</SPAN></STRONG>
                                    </SPAN>
                                </SPAN>
                            </TD>
                        </TR>
                        </TBODY>
                    </TABLE>
                    <TABLE width="80%" border=0 align="center" cellPadding=0 cellSpacing=0 class="tabSty001">
                        <TBODY>
                        <TR>
                            <TD class="tdSty03" vAlign=top align=left colSpan=2>
                                <A href="#"><IMG src="<%=request.getContextPath()%>/images/pic_gwc__r10_c3.jpg" alt=继续购物 width=95 height=25 border="0"></A>
                                <A href="${ctx}/order/clearAll">&nbsp;<IMG src="<%=request.getContextPath()%>/images/pic_gwc__r10_c8.jpg" alt=清空购物车 width=95 height=25 border="0" class="jl02"></A>
                            </TD>
                            <TD align=left>&nbsp;</TD>
                            <TD align=middle>&nbsp;</TD>
                            <TD class="tdSty04" vAlign=top align=right colSpan=3>
                                <A href="<%=request.getContextPath()%>/WEB-INF/views/address.jsp"><IMG src="<%=request.getContextPath()%>/images/pic_gwc__r2_c10.jpg" alt=去结算 border="0"></A>
                            </TD>
                        </TR>
                        </TBODY>
                    </TABLE>
                    <!--Product end--></DIV>
                <DIV id=OffProductList></DIV>
                <TABLE cellSpacing=0 cellPadding=0 width=760 border=0>
                    <TBODY>
                    <TR>
                        <TD vAlign=center align=left><SPAN
                                id="TenPayNotice"></SPAN></TD>
                    </TR>
                    </TBODY>
                </TABLE><SPAN
                    id="leavelNotMustPresentLsit"></SPAN>

                <DIV class="sty006 reusableColor3" align=left style="width:774px; padding:0; margin:auto">
                    您在购物过程中有任何疑问，请查阅 <A
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

