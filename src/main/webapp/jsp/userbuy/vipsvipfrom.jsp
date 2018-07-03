<%@ page contentType="text/html;charset=UTF-8"  %>
<html>
<head>
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/index.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/bootstrap-datetimepicker.min.css" rel="stylesheet" />
    <link href="<%=request.getContextPath()%>/css/bootstrap-select.min.css">
    <link href="${pageContext.request.contextPath}/css/top.css" rel="stylesheet" />
    <title>Title</title>
    <style type="text/css">
        .tableDiv {
            width: 100%;
            margin: 0 auto;
            height: 100%;
        }
        .btstp_table {
            height: 100%;
            overflow: scroll;
        }
        .contentDiv {
            margin-top: 1%;
            height: 100%;
            width: 100%;
            background: white;
        }
    </style>
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
        <select class="selectpicker show-tick" style="outline: none;width:200px;"
                id="select_article3">
            <option>vip</option>
            <option>svip</option>
        </select>

        <button id="selectBtn" type="button" class="btn btn-success">查询</button>
    </div>
</div>

<div class="contentDiv">
   <%-- <div class="tableDiv container">
    </div>--%>
    <table id="table1"></table>
</div>

<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-table.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-table-zh-CN.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap-select.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-datetimepicker.min.js"></script>
<script src="${pageContext.request.contextPath}/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/echarts.js"></script>
<script type="text/javascript">
    $(function () {

        $('#selectBtn').on('click',function () {
            var startDate = $('#datetimepickerVal1').val();
            var endDate = $('#datetimepickerVal2').val();
            var provinceName = $('#select_article').val();
            var cityName = $('#select_article2').val();
            var type = $('#select_article3').val();
            $('#table1').bootstrapTable('refresh',
                {url: '<%=request.getContextPath()%>/userpay/userfrominfo?startDate='+startDate +
                    '&endDate='+endDate+'&provinceName='+provinceName+'&cityName='+cityName+'&type='+type});

        })


        var cityMap ;
        $.ajax({
            url:'${pageContext.request.contextPath}/js/provinceCity.json',
            dataType:'json',
            async: false,
            processType:true,
            success: function(data) {
                cityMap = data;
            }
        })
        $("#select_article").on('changed.bs.select',function(){
            var pValue = cityMap[this.value];
            $("#select_article2").html("<option value=\"\">请选择</option>");
            for (var i=0; i<pValue.length; i++){
                $("#select_article2").append("<option value=\""+pValue[i]+"\">"+pValue[i]+"</option>");
            }
            $("#select_article2").selectpicker('refresh');
        })

        $('#datetimepicker1').datetimepicker({
            language:  "zh-CN",
            weekStart: 1,
            todayBtn:  1,
            todayHighlight: 1,
            startView: 2,
            forceParse: 0,
            showMeridian: 1,
            format: 'yyyy-mm-dd',
            autoclose: true,
            minView: "month", //选择日期后，不会再跳转去选择时分秒
        }).on("click",function(){
            var endVal = $("#datetimepickerVal2").val();
            $("#datetimepicker1").datetimepicker("setEndDate",endVal);
        });

        $('#datetimepicker2').datetimepicker({
            language:  "zh-CN",
            weekStart: 1,
            todayBtn:  1,
            todayHighlight: 1,
            startView: 2,
            forceParse: 0,
            showMeridian: 1,
            format: 'yyyy-mm-dd',
            autoclose: true,
            minView: "month", //选择日期后，不会再跳转去选择时分秒
        }).on("click",function(){
            var startVal = $("#datetimepickerVal1").val();
            $("#datetimepicker2").datetimepicker("setStartDate",startVal);
        });

        $('.selectpicker').selectpicker({
            noneSelectedText: '',
            noneResultsText: '',
            liveSearch: true,
            tickIcon:'',//不显示下拉选项中的对号
            size:50   //设置select高度，同时显示5个值
        });

        $(".conditionDiv select").hide();//隐藏bootstrap select的原始下拉框

        initTable();
        $('ul[role="listbox"]').addClass('optionitems');
        $('.bootstrap-table').addClass('btstp_table');

    })

    function initTable() {
        $("#table1").bootstrapTable({
            url: '<%=request.getContextPath()%>/userpay/userfrominfo', // 获取表格数据的url
            cache: false, // 设置为 false 禁用 AJAX 数据缓存， 默认为true
            striped: true,  //表格显示条纹，默认为false
            showRefresh:true,
            showColumns:true,
            showFooter:true,
            classes:'table table-hover',
            showToggle:true,
            search:true,
            pagination: true, // 在表格底部显示分页组件，默认false
            pageList: [5,10,15], // 设置页面可以显示的数据条数
            pageSize: 5, // 页面数据条数
            pageNumber: 1, // 首页页码
            sidePagination: 'server', // 设置为服务器端分页
            queryParams: function (params) { // 请求服务器数据时发送的参数，可以在这里添加额外的查询参数，返回false则终止请求
                return {
                    limit: params.limit,
                    offset: (params.offset/params.limit)+1
                }
            },
            columns: [
                {
                    checkbox: true, // 显示一个勾选框
                    align: 'center' // 居中显示
                }, {
                    field: 'date', // 返回json数据中
                    title: '日期', // 表格表头显示文字
                    align: 'center', // 左右居中
                    valign: 'middle' // 上下居中
                }, {
                    field: 'name',
                    title: '用户名',
                    align: 'center',
                    valign: 'middle'
                }, {
                    field: 'proxy',
                    title: '代理',
                    align: 'center',
                    valign: 'middle'
                }, {
                    field: 'invited',
                    title: '邀请',
                    align: 'center',
                    valign: 'middle'
                }
            ]

        });

    }

</script>

</body>
</html>
