<%@ page import="com.shinowit.entity.Product" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/25
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="hotsale" id="productContent">
    <%
        List<Product> productList = (List<Product>) request.getSession().getAttribute("product_list");

    %>
    <c:forEach items="<%=productList %>" var="product">
        <dl>
            <dt><a href="<%=request.getContextPath()%>/WEB-INF/views/inner-page.jsp" target="_new"><img
                    src="<%=request.getContextPath()%>/${product.picPath}" width="310" height="310"
                    border="0"/></a>
            </dt>
            <dd>${product.productName}</dd>
            <dd><span class="viv1">￥:${product.price}</span><span class="viv2"><a
                    href="<%=request.getContextPath()%>/WEB-INF/views/inner-page.jsp" target="_new"><img
                    src="<%=request.getContextPath()%>/images/vivioow_b2.jpg" width="80" height="24"
                    border="0"/></a></span></dd>
        </dl>
    </c:forEach>

    <br class="spacer"/>
</div>
</body>
</html>
