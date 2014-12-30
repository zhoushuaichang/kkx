<%@ page import="com.shinowit.entity.ProductType" %>
<%@ page import="java.util.List" %>
<%@ page import="com.shinowit.entity.Product" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="base.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
    <title>启奥</title>
    <link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" type="text/css" />
    <link href="<%=request.getContextPath()%>/css/innerstyle.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.js"></script>
    <script type="text/javascript">
        /**
         * 局部刷新页面
         */

        $(document).ready(function () {

            $(".sb").click(function(){
                $.ajax({
                    type: "get",
                    url: "<%=request.getContextPath()%>/product/productByType",
                    data: "typeCode=" + $(this).attr('data'),
                    contentType:"application/json",
                    success: function (data) {
                        var refreshHtml= '<h2>新品上市</h2>' +
                                '<div class="hotsale_ad"><img src="<%=request.getContextPath()%>/images/pic1.jpg" width="780" height="274"/>' +
                                '</div>' +
                                '<div class="hotsale" id="productContent">';
                        for(var i=0;i<data.length;i++){
                            refreshHtml+='<dl>'+
                                    '<dt><a href="<%=request.getContextPath()%>/product/productByCode/'+data[i].productCode+'" target="_new">'+
                                    '<img src="<%=request.getContextPath()%>/'+data[i].picPath+'" width="310" height="310" border="0"/></a>'+
                                    '</dt>'+
                                    '<dd>'+data[i].productName+'</dd>'+
                                    '<dd><span class="viv1">￥:'+data[i].price+'}</span><span class="viv2">'+
                                    '<a href="<%=request.getContextPath()%>product/productByCode/'+data[i].productCode+'" target="_new">' +
                                    '<img src="<%=request.getContextPath()%>/images/vivioow_b2.jpg" width="80" height="24" border="0"/></a></span></dd>'+
                                    '</dl>';
                        }
                        refreshHtml+='<br class="spacer"/>' +
                                '</div>';
                        document.getElementById('mid').innerHTML=refreshHtml;
                    }
                });
            });
        });

    </script>
</head>
<body>
<div id="box">

<!--guide02 start-->
<div class="guide02"> <a href="#"><img src="<%=request.getContextPath()%>/images/guide_02.jpg" width="492" height="107" border="0" /></a><a href="#"><img src="<%=request.getContextPath()%>/images/guide_03.jpg" width="481" height="107" border="0" /></a></div>
<!--guide02 end -->
<!--body start -->
<div id="body" style="margin-top:1px;">
    <!--leftMain start -->
    <div id="leftMain">
        <!--left start -->
        <div id="left">
            <h2>商品分类</h2>
            <ul id="productTypeList">

                <c:forEach items="${productTypeList}" var="current_type">
                    <li><a class="sb" data="${current_type.typeCode}">${current_type.typeName}</a></li>
                </c:forEach>
            </ul>
            <h2 class="detail">纸皮巴旦木龙果</h2>
            <ul class="leftLink">
                <li><a href="#">特级椒盐味</a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
                <li><a href="#">特级椒盐味</a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
                <li><a href="#">特级椒盐味</a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
                <li><a href="#">特级椒盐味</a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
            </ul>
            <br class="spacer" />
    <span style="color:#f9c441;"><br />
    <br />
    </span> </div>
        <!--left end -->
    </div>
    <!--leftMain end -->
    <!--mid start -->
    <div id="mid">
        <h6><img height="28" src="<%=request.getContextPath()%>/images/cp_1.jpg" width="584" border="0" /></h6>
        <!--pro_price start -->
        <div class="pro_price">
            <dl>
                <dt><img src="<%=request.getContextPath()%>/images/T1.jpg" width="310" height="310" /></dt>
                <dd><table height="413" border="1" cellpadding="0" cellspacing="0" style="border-collapse:collapse; border:#ccc 1px solid;">
                    <tbody>
                    <tr>
                        <td valign="top" align="middle" width="323" colspan="2"
                            height="30"><font color="#bb1213"><strong>${product.getProductName()}</strong></font></td>
                    </tr>
                    <tr>
                        <td valign="top" align="right" width="111" height="28">价&nbsp;&nbsp;&nbsp;格：</td>
                        <td valign="top" width="212" height="28"><span style=" font-size:14px;color:#c00; font-weight:bold;">￥${product.getPrice()}</span></td>
                    </tr>
                    <tr>
                        <td valign="top" align="right" width="111" height="28">规&nbsp;&nbsp;&nbsp; 格：</td>
                        <td valign="top" width="212" height="28">${product.getSpec()}</td>
                    </tr>
                    <tr>
                        <td valign="top" align="right" width="111" height="28">批 发 价：</td>
                        <td valign="top" width="212" height="28">电话咨询</td>
                    </tr>

                    <tr>
                        <td valign="top" align="right" width="111" height="21">内&nbsp;&nbsp;&nbsp; 配：</td>
                        <td valign="top" width="212" height="125" rowspan="2"><table height="32" cellspacing="0" cellpadding="0"  width="100%" border="0" style="border:none;">
                            <tbody>
                            <tr>
                                <td valign="top">750g有机全麦粉<br /> 750g黄金玉米粉<br /> 750g玉米糁</td>
                            </tr>
                            </tbody>
                        </table></td>
                    </tr>
                    <tr>
                        <td width="111" height="100"><input type="button" value="立即购买" onclick=window.open("${ctx}/order/order/${product.getProductCode()}")>　</td>
                    </tr>
                    <tr>
                        <td align="middle" width="323" colspan="2"
                            height="50"><span style="font-size:20px; color:#f00; font-weight:bold;">批发价热线：0315-3876584</span></td>
                    </tr>
                    </tbody>
                </table></dd>
                <br class="spacer" />
            </dl>
        </div>
        <!--pro_detail start -->
        <div class="pro_detail">
            <h3>--详细介绍--</h3>
            <!--pro_detail_con start -->
            <div class="pro_detail_con">
                ${product.getDescribe()}
            </div>
            <!--pro_detail_con end -->
        </div>
        <!--pro_detail end -->
        <br class="spacer" />
    </div>
    <!--mid end -->
    <br class="spacer" />
</div>
<!--body end -->
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
</div><!--box-->
</body>
</html>

