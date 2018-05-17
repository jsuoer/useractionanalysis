<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/5/16
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="common.jsp"></jsp:include>
    <link href="<%=request.getContextPath()%>/css/top.css" rel="stylesheet" />
    <script src="<%=request.getContextPath()%>/js/top.js"></script>
    <title>布局demo页</title>

</head>
<body>
    <div class="topDiv" >
        <!--当前分析名称及介绍放置位置-->
        <div class="title" data-toggle="popover" title="分析介绍"  data-container="body" style="cursor: pointer;"
             data-toggle="popover" data-placement="bottom"
             data-content="分析每日用户增长趋势图，以折线形式展现">用户分析
                    <i class="fa fa-align-justify fa-fw"></i>

        </div>

        <div class="conditionDiv">
            <span class="rementDiv">选择时间：</span>
                <div class="form-group">
                    <!--指定 date标记-->
                    <div class='input-group date' id='datetimepicker1'>
                        <input type='text' class="form-control" id="datetimepickerVal1"/>
                        <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                    </div>
                </div>
                <div class="form-group">
                    <!--指定 date标记-->
                    <div class='input-group date' id='datetimepicker2'>
                        <input type='text' class="form-control" id="datetimepickerVal2"/>
                        <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                     </span>
                    </div>
                </div>
        </div>



    </div>
    <div class="contentDiv">

    </div>

</body>
</html>
