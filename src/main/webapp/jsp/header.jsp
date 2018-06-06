<%@ page contentType="text/html;charset=UTF-8"  %>
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
        <span class="rementDiv">地区：</span>
        <%--省下拉框--%>
        <select  class="selectpicker show-tick" style="outline: none;width:200px;"
                 data-live-search="true" id="select_article" >
            <option value="">请选择</option>
            <option value="安徽省">安徽省</option>
            <option value="澳门">澳门</option>
            <option value="北京市">北京市</option>
            <option value="重庆市">重庆市</option>
            <option value="福建省">福建省</option>
            <option value="甘肃省">甘肃省</option>
            <option value="广东省">广东省</option>
            <option value="广西壮族自治区">广西壮族自治区</option>
            <option value="贵州省">贵州省</option>
            <option value="海南省">海南省</option>
            <option value="黑龙江">黑龙江</option>
            <option value="河南省">河南省</option>
            <option value="湖北省">湖北省</option>
            <option value="湖南省">湖南省</option>
            <option value="江苏省">江苏省</option>
            <option value="江西省">江西省</option>
            <option value="吉林省">吉林省</option>
            <option value="辽宁省">辽宁省</option>
            <option value="内蒙古自治区">内蒙古自治区</option>
            <option value="宁夏回族自治区">宁夏回族自治区</option>
            <option value="青海省">青海省</option>
            <option value="山东省">山东省</option>
            <option value="陕西省">陕西省</option>
            <option value="山西省">山西省</option>
            <option value="四川省">四川省</option>
            <option value="天津市">天津市</option>
            <option value="香港">香港</option>
            <option value="新疆维吾尔自治区">新疆维吾尔自治区</option>
            <option value="西藏自治区">西藏自治区</option>
            <option value="云南省">云南省</option>
            <option value="浙江省">浙江省</option>
            <option value="上海市">上海市</option>
            <option value="河北省">河北省</option>
        </select>

        <%--市下拉框--%>
        <select  class="selectpicker show-tick" style="outline: none;width:200px;"
                 data-live-search="true" id="select_article2" >
            <option value="">请选择</option>

        </select>

        <button id="selectBtn" type="button" class="btn btn-success">查询</button>
    </div>
</div>

<div class="contentDiv">
    <div class="chartDiv" id="main" ></div>

    <div class="tableDiv container">

        <table id="table1"></table>
    </div>
</div>