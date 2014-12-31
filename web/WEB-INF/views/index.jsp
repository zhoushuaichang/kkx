<%@ page import="java.util.List" %>
<%@ page import="com.shinowit.entity.ProductType" %>
<%@ page import="com.shinowit.entity.Product" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="base.jsp" %>
<%
    int pageIndex = (Integer) request.getSession().getAttribute("pageIndex");
    int pageCount = (Integer) request.getSession().getAttribute("pageCount");
%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>口口香-首页</title>
    <link href="${ctx}/css/style.css" rel="stylesheet" type="text/css"/>
    <link href="${ctx}/css/page.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="${ctx}/js/jquery.js"></script>
    <script type="text/javascript">
        /**
         * 局部刷新页面
         */
        $(document).ready(function () {
            $('.sb').click(function () {
                $.ajax({
                    type: "get",
                    url: "${ctx}/product/productByType",
                    data: "typeCode=" + $(this).attr('data'),
                    contentType: "application/json",
                    success: function (data) {
                        var refreshHtml = '';
                        for (var i = 0; i < data.length; i++) {
                            refreshHtml += '<dl>' +
                                    '<dt><a href="${ctx}/product/productByCode/' + data[i].productCode + '" target="_new">' +
                                    '<img src="${ctx}/' + data[i].picPath + '" width="310" height="310" border="0"/></a>' +
                                    '</dt>' +
                                    '<dd>' + data[i].productName + '</dd>' +
                                    '<dd><span class="viv1">￥:' + data[i].price + '</span><span class="viv2">' +
                                    '<a href="${ctx}/product/productByCode/' + data[i].productCode + '" target="_new">' +
                                    '<img src="${ctx}/images/vivioow_b2.jpg" width="80" height="24" border="0"/></a></span></dd>' +
                                    '</dl>';
                        }
                        var refreshPage =
                                <%
                                    for(int i=1;i<=pageCount;i++){
                                out.print("'<a href=\""+request.getContextPath()+"/base?pageIndex="+i+"\">"+i+"</a>'+");
                                }
                                %>
                                '';
                        document.getElementById('productContent').innerHTML = refreshHtml;
                        document.getElementById('tres').innerHTML=refreshPage;

                    }
                });
            });
        });
    </script>
</head>

<body>

<div id="box">

    <!--guide02 start-->
    <div class="guide02"><a href="#"><img src="${ctx}/images/guide_02.jpg" width="492"
                                          height="107" border="0"/></a><a href="#"><img
            src="${ctx}/images/guide_03.jpg" width="481" height="107" border="0"/></a></div>
    <!--guide02 end -->
    <!--recommend start-->
    <div class="recommend">
        <h2>推荐美国山核桃长寿果 大杏仁 15.8/半斤 奶香味</h2>

        <p><img src="${ctx}/images/coma.gif" width="15" height="12" style="margin-right:12px;"/>山核桃,又名胡桃、马核桃、核桃楸果,是乔木核桃楸的种子。山核桃营养丰富,价值很高,是一种优质木本高级油料作物。此外,还含锌、锰、铬等微量元素与尼克酸等。<img
                src="${ctx}/images/coma_inverse.gif" width="15" height="12"
                style="margin-left:12px;"/></p>
    </div>
    <!--recommend end-->
    <!--body start -->
    <div id="body">
        <!--leftMain start -->
        <div id="leftMain">
            <!--left start -->
            <div id="left">
                <h2>商品分类</h2>
                <ul>

                    <c:forEach items="${product_type_list}" var="current_type">
                        <li><a class="sb" data="${current_type.typeCode}">${current_type.typeName}</a></li>
                    </c:forEach>

                </ul>
                <h2 class="detail">优惠促销</h2>
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
                <br class="spacer"/>
<span style="color:#f9c441;">ssss<br/>
<br/>
</span>
            </div>
            <!--left end -->
        </div>
        <!--leftMain end -->
        <!--mid start -->
        <div id="mid">
            <h2>新品上市</h2>
            <!--hotsale_ad start -->
            <div class="hotsale_ad"><img src="${ctx}/images/pic1.jpg" width="780" height="274"/>
            </div>
            <!--hotsale_ad end -->
            <!--hotsale start -->
            <%--<iframe src="<%=request.getContextPath()%>/product/productAll" name="part_product_show" style="width:728px;height:auto;" scrolling="no"></iframe>--%>
            <div class="hotsale" id="productContent">

                <c:forEach items="${product_list}" var="product">
                    <dl>
                        <dt><a href="${ctx}/product/productByCode/${product.productCode}" target="_new"><img
                                src="${ctx}/${product.picPath}" width="310" height="310"
                                border="0"/></a>
                        </dt>
                        <dd>${product.productName}</dd>
                        <dd><span class="viv1">￥:${product.price}</span><span class="viv2">
                            <a href="${ctx}/product/productByCode/${product.productCode}" target="_new">
                                <img src="${ctx}/images/vivioow_b2.jpg" width="80" height="24" border="0"/></a></span>
                        </dd>
                    </dl>
                </c:forEach>

                <br class="spacer"/>

            </div>
            <span>
                    	<div class="tres">
                            <span class="disabled"> <a class="current">1</a></span>
                            <%
                                for (int i = 1; i <= pageCount; i++) {
                                    if(i==pageIndex){
                                        out.print("<span ><a class=\"current\" style=\"COLOR:#f00\" href=\"" + request.getContextPath() + "/base?pageIndex=" + i + "\">" + i + "</a></span>");
                                    }else{
                                        out.print("<a href=\"" + request.getContextPath() + "/base?pageIndex=" + i + "\">" + i + "</a>");
                                    }
                                }
                            %>
                        </div>
                </span>
            <!--hotsale end -->
        </div>
        <!--mid end -->
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
