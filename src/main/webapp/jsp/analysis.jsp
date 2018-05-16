<%@ page contentType="text/html;charset=UTF-8"  %>
<!DOCTYPE html>
<html >
<head>
    <meta charset="utf-8" />
    <title>Dashboard - Bootstrap Admin</title>

    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="apple-mobile-web-app-capable" content="yes" />

    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" />
    <link href="${pageContext.request.contextPath}/css/bootstrap-responsive.min.css" rel="stylesheet" />


    <link href="${pageContext.request.contextPath}/css/font-awesome.min.css" rel="stylesheet" />

    <link href="${pageContext.request.contextPath}/css/adminia.css" rel="stylesheet" />
    <link href="${pageContext.request.contextPath}/css/adminia-responsive.css" rel="stylesheet" />

    <link href="${pageContext.request.contextPath}/css/pages/dashboard.css" rel="stylesheet" />


    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>

    <style>
        body{
            background-color: white;
        }
    </style>

<body>

<div class="navbar navbar-fixed-top">

    <div class="navbar-inner">

        <div class="container">

            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>

            <a class="brand" href="./">Adminia Admin</a>

            <div class="nav-collapse">

                <ul class="nav pull-right">
                    <!--<li>
                        <a href="#"><span class="badge badge-warning">7</span></a>
                    </li>-->

                    <li class="divider-vertical"></li>

                    <li class="dropdown">

                        <a data-toggle="dropdown" class="dropdown-toggle " href="#">
                            Rod Howard <b class="caret"></b>
                        </a>

                        <ul class="dropdown-menu">
                            <li>
                                <a href="#"><i class="icon-user"></i> Account Setting  </a>
                            </li>

                            <li>
                                <a href="#"><i class="icon-lock"></i> Change Password</a>
                            </li>

                            <li class="divider"></li>

                            <li>
                                <a href="./"><i class="icon-off"></i> Logout</a>
                            </li>
                        </ul>
                    </li>
                </ul>

            </div> <!-- /nav-collapse -->

        </div> <!-- /container -->

    </div> <!-- /navbar-inner -->

</div> <!-- /navbar -->


<div id="content">

    <div class="container">

        <div class="row">

            <div class="span9">

                <h1 class="page-title">
                    <i class="icon-home"></i>
                    Dashboard
                </h1>

                <div class="stat-container">

                    <div class="stat-holder">
                        <div class="stat">
                            <span>564</span>
                            Completed Sales
                        </div> <!-- /stat -->
                    </div> <!-- /stat-holder -->

                    <div class="stat-holder">
                        <div class="stat">
                            <span>423</span>
                            Pending Sales
                        </div> <!-- /stat -->
                    </div> <!-- /stat-holder -->

                    <div class="stat-holder">
                        <div class="stat">
                            <span>96</span>
                            Returned Sales
                        </div> <!-- /stat -->
                    </div> <!-- /stat-holder -->

                    <div class="stat-holder">
                        <div class="stat">
                            <span>2</span>
                            Chargebacks
                        </div> <!-- /stat -->
                    </div> <!-- /stat-holder -->

                </div> <!-- /stat-container -->

                <div class="widget">

                    <div class="widget-header">
                        <i class="icon-signal"></i>
                        <h3>Area Chart</h3>
                    </div> <!-- /widget-header -->

                    <div class="widget-content">
                        <div id="bar-chart" class="chart-holder"></div> <!-- /bar-chart -->
                    </div> <!-- /widget-content -->

                </div> <!-- /widget -->



                <div class="widget widget-table">

                    <div class="widget-header">
                        <i class="icon-th-list"></i>
                        <h3>Table</h3>
                    </div> <!-- /widget-header -->

                    <div class="widget-content">

                        <table class="table table-striped table-bordered">
                            <thead>
                            <tr>
                                <th>#</th>
                                <th>First Name</th>
                                <th>Last Name</th>
                                <th>Username</th>
                                <th>Company</th>
                                <th>&nbsp;</th>
                            </tr>
                            </thead>

                            <tbody>
                            <tr>
                                <td>1</td>
                                <td>Michael</td>
                                <td>Jordan</td>
                                <td>@mjordan</td>
                                <td>Chicago Bulls</td>
                                <td class="action-td">
                                    <a href="javascript:;" class="btn btn-small btn-warning">
                                        <i class="icon-ok"></i>
                                    </a>
                                    <a href="javascript:;" class="btn btn-small">
                                        <i class="icon-remove"></i>
                                    </a>
                                </td>
                            </tr>
                            <tr>
                                <td>2</td>
                                <td>Magic</td>
                                <td>Johnson</td>
                                <td>@mjohnson</td>
                                <td>Los Angeles Lakers</td>
                                <td class="action-td">
                                    <a href="javascript:;" class="btn btn-small btn-warning">
                                        <i class="icon-ok"></i>
                                    </a>
                                    <a href="javascript:;" class="btn btn-small">
                                        <i class="icon-remove"></i>
                                    </a>
                                </td>
                            </tr>
                            <tr>
                                <td>3</td>
                                <td>Charles</td>
                                <td>Barkley</td>
                                <td>@cbarkley</td>
                                <td>Phoenix Suns</td>
                                <td class="action-td">
                                    <a href="javascript:;" class="btn btn-small btn-warning">
                                        <i class="icon-ok"></i>
                                    </a>
                                    <a href="javascript:;" class="btn btn-small">
                                        <i class="icon-remove"></i>
                                    </a>
                                </td>
                            </tr>
                            <tr>
                                <td>4</td>
                                <td>Karl</td>
                                <td>Malone</td>
                                <td>@kmalone</td>
                                <td>Utah Jazz</td>
                                <td class="action-td">
                                    <a href="javascript:;" class="btn btn-small btn-warning">
                                        <i class="icon-ok"></i>
                                    </a>
                                    <a href="javascript:;" class="btn btn-small">
                                        <i class="icon-remove"></i>
                                    </a>
                                </td>
                            </tr>
                            <tr>
                                <td>5</td>
                                <td>David</td>
                                <td>Robinson</td>
                                <td>@drobinson</td>
                                <td>San Antonio Spurs</td>
                                <td class="action-td">
                                    <a href="javascript:;" class="btn btn-small btn-warning">
                                        <i class="icon-ok"></i>
                                    </a>
                                    <a href="javascript:;" class="btn btn-small">
                                        <i class="icon-remove"></i>
                                    </a>
                                </td>
                            </tr>
                            <tr>
                                <td>6</td>
                                <td>Reggie</td>
                                <td>Miller</td>
                                <td>@rmiller</td>
                                <td>Indiana Pacers</td>
                                <td class="action-td">
                                    <a href="javascript:;" class="btn btn-small btn-warning">
                                        <i class="icon-ok"></i>
                                    </a>
                                    <a href="javascript:;" class="btn btn-small">
                                        <i class="icon-remove"></i>
                                    </a>
                                </td>
                            </tr>
                            <tr>
                                <td>7</td>
                                <td>Clyde</td>
                                <td>Drexler</td>
                                <td>@cdrexler</td>
                                <td>Portland Trail Blazers</td>
                                <td class="action-td">
                                    <a href="javascript:;" class="btn btn-small btn-warning">
                                        <i class="icon-ok"></i>
                                    </a>
                                    <a href="javascript:;" class="btn btn-small">
                                        <i class="icon-remove"></i>
                                    </a>
                                </td>
                            </tr>
                            <tr>
                                <td>8</td>
                                <td>Hakeem</td>
                                <td>Olajuwon</td>
                                <td>@holajuwon</td>
                                <td>Houston Rockets</td>
                                <td class="action-td">
                                    <a href="javascript:;" class="btn btn-small btn-warning">
                                        <i class="icon-ok"></i>
                                    </a>
                                    <a href="javascript:;" class="btn btn-small">
                                        <i class="icon-remove"></i>
                                    </a>
                                </td>
                            </tr>
                            </tbody>
                        </table>

                    </div> <!-- /widget-content -->

                </div> <!-- /widget -->


            </div> <!-- /span9 -->


        </div> <!-- /row -->

    </div> <!-- /container -->

</div> <!-- /content -->


<!-- Le javascript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/excanvas.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.flot.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.flot.pie.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.flot.orderBars.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.flot.resize.js"></script>


<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/js/charts/bar.js"></script>
</body>
</html>
