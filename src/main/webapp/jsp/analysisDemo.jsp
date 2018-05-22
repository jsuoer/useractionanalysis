<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <jsp:include page="common.jsp"></jsp:include>
    <link href="<%=request.getContextPath()%>/css/top.css" rel="stylesheet" />

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

        <div class="conditionDiv">
            <span class="rementDiv">区域：</span>
            <select  class="selectpicker show-tick" style="outline: none;width:200px;" data-live-search="true" id="select_article" >
                <option value="">选择省</option>
                <option value="1">广东省</option>
                <option value="2">广西省</option>
                <option value="3">福建省</option>
                <option value="4">湖南省</option>
                <option value="5">山东省</option>
            </select>

            <select  class="selectpicker show-tick" style="outline: none;width:200px;" data-live-search="true" id="select_article2" >
                <option value="">选择市</option>
                <option value="1">沈阳市</option>
                <option value="2">大连市</option>
            </select>
        </div>



    </div>
    <div class="contentDiv">
        <div class="chartDiv" id="main" ></div>

        <div class="tableDiv">
            <table id="table1"
                   data-classes="table table-hover "
                   data-search="true"
                   data-show-refresh="true"
                   data-show-toggle="true"
                   data-show-columns="true"></table>
        </div>
    </div>
    <script src="${pageContext.request.contextPath}/js/top.js"></script>
</body>
</html>
