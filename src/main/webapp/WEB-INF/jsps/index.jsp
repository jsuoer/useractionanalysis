<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Simple Sidebar - Start Bootstrap Template</title>
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/simple-sidebar.css" rel="stylesheet">
    <link href="http://netdna.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
    <%--<link href="${pageContext.request.contextPath}/css/font-awesome.min.css" rel="stylesheet">--%>
    <link href="${pageContext.request.contextPath}/css/index.css" rel="stylesheet">
</head>
<body style="height:100%;">

<!--导航条 START-->
<nav class="navbar navbar-default navbar-fixed-top no-margin">

    <div class="navbar-header fixed-brand">
        <%--<button type="button" class="navbar-toggle collapsed" data-toggle="collapse"  id="menu-toggle"></button>--%>
        <a class="navbar-brand" href="#"><i class="fa fa-rocket fa-4"></i>  SEEGATESITE</a>
    </div>

</nav>
<!--导航条 END-->

<!--页面中间内容 START-->
<!-- Sidebar  START-->
<div id="wrapper" style="position:absolute;top:54px;bottom:0;">
    <div id="sidebar-wrapper">
        <ul class="sidebar-nav nav-pills nav-stacked" id="menu">

            <li>
                <a href="#">
                        <span class="fa-stack fa-lg pull-left">
                             <i class="fa fa-dashboard fa-stack-1x "></i>
                        </span>
                    Dashboard
                </a>
            </li>

            <li>
                <a href="#">
                        <span class="fa-stack fa-lg pull-left">
                            <i class="fa fa-dashboard fa-stack-1x "></i>
                        </span>
                    Shortcut
                </a>

                <ul class="nav-pills nav-stacked" style="list-style-type:none;">
                    <li><a href="${pageContext.request.contextPath}/jsp/analysis.jsp" class="J_menuItem">
                            <span class="fa-stack fa-lg pull-left">
                                <i class="fa fa-flag fa-stack-1x "></i></span>分析数据</a></li>
                    <li><a href="http://www.layui.com/doc/" class="J_menuItem"><span class="fa-stack fa-lg pull-left">
                            <i class="fa fa-flag fa-stack-1x "></i></span>link2</a></li>
                    <li><a href="http://www.runoob.com/bootstrap/bootstrap-tab-plugin.html" class="J_menuItem"><span
                            class="fa-stack fa-lg pull-left">
                            <i class="fa fa-flag fa-stack-1x "></i></span>link3</a></li>
                    <li><a href="http://echarts.baidu.com/tutorial.html#%E8%87%AA%E5%AE%9A%E4%B9%89%E6%9E%84%E5%BB%BA%20ECharts" class="J_menuItem">
                        <span class="fa-stack fa-lg pull-left">
                            <i class="fa fa-flag fa-stack-1x "></i></span>用户管理</a></li>

                </ul>
            </li>







            <li>
                <a href="#">
                        <span class="fa-stack fa-lg pull-left">
                            <i class="fa fa-flag fa-stack-1x "></i>
                        </span>
                    Shortcut2
                </a>
                <ul class="nav-pills nav-stacked" style="list-style-type:none;">
                    <li>
                        <a href="https://www.baidu.com/" class="J_menuItem">
                                <span class="fa-stack fa-lg pull-left">
                                    <i class="fa fa-flag fa-stack-1x "></i>
                                </span>
                            link2
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
            <button class="dropdown J_tabClose" data-toggle="dropdown" >
                关闭操作
                <%--<span class="caret"></span>--%>
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
<footer class="en text-center navbar-fixed-bottom">
    Designed By kingdee &copy; 2012 - 2014 All Right Reserved.
</footer>



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
