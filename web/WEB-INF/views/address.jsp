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
    <title>收货信息</title>
    <link href="${ctx}/css/style.css" rel="stylesheet" type="text/css"/>
    <link href="${ctx}/css/LoginAndReg.css" rel="stylesheet" type="text/css"/>
    <link href="${ctx}/css/gmxx.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="${ctx}/js/jquery.js"></script>
    <script type="text/javascript" src="${ctx}/js/checkOrder.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $.ajax({
                type: 'get',
                url: '${ctx}/address/province',
                contentType: "application/json",
                success: function (data) {
                    $(data).each(function () {
                        var opt = $("<option/>").text(this.name).attr("value", this.id);
                        $("#ProvinceID").append(opt);
                    })
                }
            })
        });
        function showCity(provinceId) {
            $("#CityID").empty();
            var cityOpt = $("<option/>").text("--请选择--").attr("value", "-1");
            $("#CityID").append(cityOpt);
            $("#DistrictID").empty();
            var districtOpt = $("<option/>").text("--请选择--").attr("value", "-1");
            $("#DistrictID").append(districtOpt);
            $.ajax({
                type: 'get',
                url: '${ctx}/address/city',
                data: 'provinceId=' + provinceId,
                contentType: "application/json",
                success: function (data) {
                    $(data).each(function () {
                        var opt = $("<option/>").text(this.name).attr("value", this.id);
                        $("#CityID").append(opt);
                    })
                }
            })
        }
        function ShowDistrict(cityId) {
            $("#DistrictID").empty();
            var districtOpt = $("<option/>").text("--请选择--").attr("value", "-1");
            $("#DistrictID").append(districtOpt);
            $.ajax({
                type: 'get',
                url: '${ctx}/address/district',
                data: 'cityId=' + cityId,
                contentType: "application/json",
                success: function (data) {
                    $(data).each(function () {
                        var opt = $("<option/>").text(this.name).attr("value", this.id);
                        $("#DistrictID").append(opt);
                    })
                }
            })
        }
    </script>
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
                <div id="AddressContent">
                    <!--begin-->
  <span id="Label_AddressList">
    <div class="bxSty4">
        <table width="100%" cellpadding="0" cellspacing="0" class="addDivTab tabSty01">
            <tbody>
            <tr class="addbgcolor trSty01">
                <td class="reusableColor5 xxSty01" align="left" height="30">
                    &nbsp;&nbsp;&nbsp;&nbsp;<strong>地址簿 </strong>（您的默认地址）
                </td>
            </tr>
            <tr>
                <td align="left" valign="top" height="145">
                    <div class="changeAdd" align="center">
                        <ul class="ulSty">
                            <li>收 货 人：${default_address.recvMan}<br/>
                                收货地址:${default_address.recvAddress}<br/>
                                邮政编码：${default_address.postCode}<br/>
                                联系电话：${default_address.tel}<br/>
                                <span class="addDeleteSty addFontCol"><a href="#"><span class="addFontCol">修改</span></a><span
                                        class="addFontCol">　|</span>　<a href="#"><span class="addFontCol">删除</span></a></span><span
                                        class="addSpanSty"><a
                                        href="<%=request.getContextPath()%>/WEB-INF/views/address.jsp"><img
                                        src="<%=request.getContextPath()%>/images/button_pszADd.gif" border="0"
                                        onclick="#"/></a></span></li>
                            <li class="liSty"></li>
                        </ul>
                        <div style="height:25px!important;color:#fff;">dddddddddddd</div>
                    </div>
                    <div id="edit">
                        <div class="bxSty1">
                            <table class="tabSty01" border="0" cellpadding="0" cellspacing="0" width="100%">
                                <tbody>
                                <tr class="trSty01" bgcolor="#7a7f89">
                                    <td class="reusableColor5 xxSty01" align="left" height="30">&nbsp;&nbsp;&nbsp;&nbsp;请输入新的
                                        <strong>配送地址</strong></td>
                                </tr>
                                <tr>
                                    <form action="${ctx}/" method="post">
                                        <td align="center" valign="top">
                                            <ul class="psAdd" align="left">
                                                <li>
                                                    <p class="pSty01" align="right">收货人姓名：</p>

                                                    <p class="pSty02 reusableColor3" align="left">
                                                        <input name="recvMan" id="recvMan" size="20"
                                                               onblur="return checktheRecvMan()" type="text"/>
                                                        &nbsp;&nbsp;<span class="reusableColor4">*</span>&nbsp;&nbsp;
                                                        请准确填写真实姓名，以便确保商品准确无误送达。</p>
                                                </li>
                                                <li class="conLi1"><span class="errorstring" id="errorRecvMan"></span></li>
                                                <li>
                                                    <p class="pSty01" align="right">省份/直辖市：</p>

                                                    <p>
                                                        <select id="ProvinceID" name="ProvinceID"
                                                                onchange="showCity(this.options[selectedIndex].value)">
                                                            <option selected="selected" value="-1">--请选择--</option>
                                                        </select>
                                                        &nbsp;&nbsp;市：
                                                        <select id="CityID" name="CityID"
                                                                onchange="ShowDistrict(this.options[selectedIndex].value)">
                                                            <option selected="selected" value="-1">--请选择--</option>
                                                        </select>
                                                        &nbsp;&nbsp;县/区：
                                                        <select id="DistrictID" name="DistrictID">
                                                            <option selected="selected" value="-1">--请选择--</option>
                                                        </select>
                                                        &nbsp;&nbsp;<span class="reusableColor4">*</span>&nbsp;&nbsp;
                                                    </p>
                                                </li>
                                                <li class="conLi2"><span id="errorArea"></span></li>
                                                <li>
                                                    <p class="pSty01" align="right">详细地址：</p>

                                                    <p class="pSty02">
                                                        <input name="Address" id="Address" size="40"
                                                               onchange="checktheDetailAddress()" maxlength="500"
                                                               type="text"/>
                                                        &nbsp;&nbsp;<span class="reusableColor4">*</span>&nbsp;&nbsp;
                                                        <br/>
                                                    <span class="fontSty reusableColor3">862城市送货上门，货到付款。&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span
                                                            class="reusableColor1"><a href="#" target="_blank">
                                                        查看详细的配送范围 </a></span></span></p>
                                                </li>
                                                <li class="conLi3"><span id="errorAddress" class="errorstring"></span>
                                                </li>
                                                <li>
                                                    <p class="pSty01" align="right">邮政编码：</p>

                                                    <p class="pSty02 reusableColor3">
                                                        <input name="Zip" id="Zip" size="7"
                                                               onchange="ChecktheForm_Zip()"
                                                               type="text"/>
                                                        &nbsp;&nbsp;<span
                                                            class="reusableColor4">*</span>&nbsp;&nbsp; <span
                                                            id="SetPostalCode"></span></p>
                                                </li>
                                                <li class="conLi4"><span id="errorPostal" class="errorstring"></span>
                                                </li>
                                                <li>
                                                    <p class="pSty01" align="right">联系电话：</p>

                                                    <p class="pSty02 reusableColor3" align="left">
                                                        <input name="linkTel" id="linkTel" size="11"
                                                               onchange="ChecktheLinkTel()" type="text"/>
                                                        &nbsp;&nbsp;<span class="reusableColor4">*</span>&nbsp;&nbsp;
                                                        请准确填写联系电话，以便确保商品及时送达。</p>
                                                </li>
                                                <li class="conLi5"><span id="errorPhone" class="errorstring"></span>
                                                </li>

                                                <li class="conLi6"><span id="errorMobile"></span></li>
                                                <li class="conLi7"><span class="addSpanSty"><a
                                                        href="<%=request.getContextPath()%>/WEB-INF/views/address.jsp"><img
                                                        src="<%=request.getContextPath()%>/images/button_pszADd.gif"
                                                        alt=""
                                                        border="0" onclick="#"/></a></span></li>
                                            </ul>
                                        </td>
                                    </form>
                                </tr>
                                <tr class="trSty01" bgcolor="#dcdfe5">
                                    <td class="reusableColor3 xxSty01" align="left" height="26">&nbsp;&nbsp;&nbsp;&nbsp;接下来您还需要选择
                                        配送方式、支付方式、送货时间。
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </td>
            </tr>
            </tbody>
        </table>
        <div class="addDivPage" id="all_main_down_bottom">
            <div class="pagebtn"><span class="current">1</span>&nbsp;共1页</div>
        </div>
    </div>
    </span><!--end-->
                </div>
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

