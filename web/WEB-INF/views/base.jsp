
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>
<div id="box">
    <!--top start -->
    <div id="top">
        <a href="<%=request.getContextPath()%>/base"><img src="<%=request.getContextPath()%>/images/logo.gif"
                                                                    alt="Estimation" width="255" height="58" border="0"
                                                                    class="logo"/></a>

        <p class="topDiv"></p>

        <p class="navLeft"></p>
        <ul>
            <li><a href="<%=request.getContextPath()%>/base" class="hover">首页</a></li>
            <li><a href="#">关于我们</a></li>
            <li><a href="#">在线客服</a></li>
            <li class="chart"><a href="<%=request.getContextPath()%>/WEB-INF/views/order.jsp">购物车</a></li>
        </ul>
        <p class="navRight"></p>

        <p class="topDiv"></p>

        <form name="serch" action="#" method="post">
            <input type="text" name="txtbox" value="购物搜索" class="txtBox"/>
            <input type="submit" name="go" value="搜" class="go"/>
        </form>
    </div>
    <!--top end -->

    <!--header start -->
    <div id="header">
        <!--nav start -->
        <div class="nav">
            <ul>
                <li class="first"><a href="#">新品上架</a></li>
                <li><a href="#">坚果炒货</a></li>
                <li><a href="#">补血大枣</a></li>
                <li><a href="#">经典肉类</a></li>
                <li><a href="#">进口零食</a></li>
                <li><a href="#">美味糖果</a></li>
                <li><a href="#">天然干果</a></li>
                <li><a href="#">蒙古奶酪</a></li>
                <li><a href="#">台湾牛轧糖</a></li>
                <li><a href="#">蜜饯果脯</a></li>
                <li class="last">
                    <div id="welcome" class="welmsgdiv2"><span>您好，欢迎光临果果香。</span><a
                            href="<%=request.getContextPath()%>/login">登录</a><span
                            class="Lloginfg">&nbsp;</span><a href="<%=request.getContextPath()%>/reg">注册</a>
                    </div>
                </li>
            </ul>
        </div>
        <!--nav end -->
        <div class="spacer"></div>
    </div>
    <!--header end -->

    <!--guide01 start -->
    <div class="guide01">
        <img src="<%=request.getContextPath()%>/images/guide_01.jpg" width="973" height="62" border="0" usemap="#Map"/>
        <map name="Map" id="Map">
            <area shape="rect" coords="398,11,493,51" href="#"/>
            <area shape="rect" coords="540,12,633,51" href="#"/>
            <area shape="rect" coords="684,12,790,53" href="#"/>
            <area shape="rect" coords="830,10,953,54" href="#"/>
        </map>
    </div>
    <!--guide01 end -->
</div>
</body>
</html>
