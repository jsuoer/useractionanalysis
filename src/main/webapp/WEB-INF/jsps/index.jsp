<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>奖聊用户行为分析</title>
    <%--<meta http-equiv="X-UA-Compatible" content="IE=edge">--%>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Simple Sidebar - Start Bootstrap Template</title>
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/simple-sidebar.css" rel="stylesheet">
    <%--<link href="http://netdna.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">--%>
    <link href="${pageContext.request.contextPath}/css/font-awesome.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/index.css" rel="stylesheet">
</head>
<body style="height:100%;">

<!--导航条 START-->
<nav class="navbar navbar-default navbar-fixed-top no-margin">

    <div class="navbar-header fixed-brand">
        <%--<button type="button" class="navbar-toggle collapsed" data-toggle="collapse"  id="menu-toggle"></button>--%>
        <a class="navbar-brand" href="#"><span style="font-family: 微软雅黑;font-size: 25px;color: white;">
            <i class="fa fa-bar-chart fa--stack-2x" style="margin-right: 5px;"></i>奖聊用户行为分析</span></a>
    </div>

</nav>
<!--导航条 END-->

<!--页面中间内容 START-->
<!-- Sidebar  START-->
<div id="wrapper" style="position:absolute;top:50px;bottom:0;">
    <div id="sidebar-wrapper">
        <ul class="sidebar-nav nav-pills nav-stacked" id="menu">

            <li>
                <a href="#">
                        <span class="fa-stack fa-lg pull-left">
                             <i class="fa fa-users fa-stack-1x "></i>
                        </span>
                    用户数据分析
                </a>
                <ul class="nav-pills nav-stacked" style="list-style-type:none;">
                    <li><a href="${pageContext.request.contextPath}/jsp/analysisDemo.jsp" class="J_menuItem">
                            <span class="fa-stack fa-lg pull-left">
                                <i class="fa fa-users fa-stack-1x "></i></span>用户区域分析</a></li>
                    <li><a href="${pageContext.request.contextPath}/jsp/last10dayregisteruser.jsp" class="J_menuItem">
                            <span class="fa-stack fa-lg pull-left">
                                <i class="fa fa-users fa-stack-1x "></i></span>用户近十日注册状况</a></li>
                    <li><a href="${pageContext.request.contextPath}/jsp/growthrate.jsp" class="J_menuItem">
                            <span class="fa-stack fa-lg pull-left">
                                <i class="fa fa-users fa-stack-1x "></i></span>用户增长比例状况</a></li>
                    <li><a href="${pageContext.request.contextPath}/jsp/usercomefrom.jsp" class="J_menuItem">
                            <span class="fa-stack fa-lg pull-left">
                                <i class="fa fa-users fa-stack-1x "></i></span>用户来源分布状况</a></li>
                    <li><a href="${pageContext.request.contextPath}/jsp/usercolorcoin.jsp" class="J_menuItem">
                            <span class="fa-stack fa-lg pull-left">
                                <i class="fa fa-users fa-stack-1x "></i></span>用户奖豆状况</a></li>
                </ul>
            </li>

            <li>
                <a href="#">
                        <span class="fa-stack fa-lg pull-left">
                            <i class="fa fa-vcard fa-stack-1x "></i>
                        </span>
                    用户充值行为分析
                </a>

                <ul class="nav-pills nav-stacked" style="list-style-type:none;">
                    <li><a href="${pageContext.request.contextPath}/jsp/analysis.jsp" class="J_menuItem">
                            <span class="fa-stack fa-lg pull-left">
                                <i class="fa fa-flag fa-stack-1x "></i></span>分析数据</a></li>
                    <li><a href="http://www.layui.com/doc/" class="J_menuItem"><span class="fa-stack fa-lg pull-left">
                            <i class="fa fa-flag fa-stack-1x "></i></span>link2</a></li>
                    <li><a href="<%=request.getContextPath()%>/jsp/analysisDemo.jsp" class="J_menuItem"><span
                            class="fa-stack fa-lg pull-left">
                            <i class="fa fa-flag fa-stack-1x "></i></span>测试</a></li>
                    <li><a href="<%=request.getContextPath()%>/jsp/analysisDemo.jsp" class="J_menuItem">
                        <span class="fa-stack fa-lg pull-left">
                            <i class="fa fa-flag fa-stack-1x "></i></span>分析样式demo页</a></li>

                </ul>
            </li>







            <li>
                <a href="#">
                        <span class="fa-stack fa-lg pull-left">
                            <i class="fa fa-dollar fa-stack-1x "></i>
                        </span>
                    用户消费行为分析
                </a>
                <ul class="nav-pills nav-stacked" style="list-style-type:none;">
                    <li>
                        <a href="https://www.baidu.com/" class="J_menuItem">
                                <span class="fa-stack fa-lg pull-left">
                                    <i class="fa fa-flag fa-stack-1x "></i>
                                </span>
                            消费用户区域分析
                        </a>
                    </li>
                </ul>
            </li>

        </ul>
    </div>
    <!-- Sidebar END -->

    <!-- tab 导航条 -->
    <div class="row content-tabs" style="margin-right:0;">

        <button id="left-button" class="roll-nav roll-left J_tabLeft">
            <i class="fa fa-backward"></i>
        </button>

        <nav class="page-tabs J_menuTabs">
            <div class="page-tabs-content">
                <a href="javascript:;" class="active J_menuTab" data-id="${pageContext.request.contextPath}/jsp/echart.jsp">
                    首页
                    <i class="fa fa-times-circle"></i></a>
            </div>
        </nav>

        <button class="roll-nav roll-right J_tabRight">
            <i class="fa fa-forward"></i>
        </button>

        <div class="btn-group roll-nav roll-right">
            <button class="dropdown J_tabClose" data-toggle="dropdown" >关闭操作
                <span class="caret"></span>
            </button>
            <ul role="menu" class="dropdown-menu dropdown-menu-right">
                <li class="J_tabShowActive"><a>定位当前选项卡</a>
                </li>
                <li class="divider"></li>
                <li class="J_tabCloseAll"><a>关闭全部选项卡</a>
                </li>
                <li class="J_tabCloseOther"><a>关闭其他选项卡</a>
                </li>
            </ul>
        </div>

        <a href="#" class="roll-nav roll-right J_tabExit">
            <i class="fa fa fa-sign-out"></i>
            退出
        </a>
    </div>

    <div class="row J_mainContent" id="content-main">
        <iframe class="J_iframe" name="iframe0" width="100%" height="100%" src="${pageContext.request.contextPath}/jsp/echart.jsp" frameborder="0" data-id="${pageContext.request.contextPath}/jsp/echart.jsp" ></iframe>'
    </div>

</div>
<!--页面中间内容 END-->




<!-- /#wrapper -->
<%--<footer class="en text-center navbar-fixed-bottom" style="color: black;">
    Designed By jiangliao &copy; 2016 - 2020 All Right Reserved.
</footer>--%>



<!-- jQuery -->
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/js/sidebar_menu.js"></script>
<script src="${pageContext.request.contextPath}/js/slimscroll/jquery.slimscroll.min.js"></script>
<script src="${pageContext.request.contextPath}/js/layer/layer.min.js"></script>
<script src="${pageContext.request.contextPath}/js/contabs.js"></script>
<!--<script src="js/metisMenu/jquery.metisMenu.js"></script>-->
<!--<script src="js/hplus.min.js"></script>-->
<%--<script type="text/javascript" src="${pageContext.request.contextPath}/js/contabs.min.js"></script>--%>

</body>
</html>
