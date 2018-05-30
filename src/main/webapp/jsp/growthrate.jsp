<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/bootstrap-table.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/font-awesome.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/index.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/bootstrap-datetimepicker.min.css" rel="stylesheet" />
    <link href="<%=request.getContextPath()%>/css/bootstrap-select.min.css">
    <link href="${pageContext.request.contextPath}/css/top.css" rel="stylesheet" />
    <title>Title</title>
    <style type="text/css">
        .optionitems{
            height: 400px;
            overflow: scroll;
        }

        .btstp_table{
            height: 80%;
            overflow: scroll;
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
            <option value="河南省">湖南省</option>
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
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-table.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-table-zh-CN.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap-select.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-datetimepicker.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/echarts.js"></script>
<script type="text/javascript">
    // 隐藏下拉框
    $(".selectpicker.show-tick").hide();
    $('.selectpicker').selectpicker({
        noneSelectedText: '',
        noneResultsText: '',
        liveSearch: true,
        tickIcon:'',//不显示下拉选项中的对号
        size:50   //设置select高度，同时显示5个值
    });


    var xAxis_data = [];
    var yAxis_data = [];
    //获取当前日期 格式化  yyyy-MM-dd
    var date = new Date();
    var month = date.getMonth()+1;
    var day = date.getDate();
    if (month < 10) {
        month = '0'+month;
    }
    if (day < 10) {
        day = '0' + day;
    }
    var ss = date.getFullYear()+'-'+month+'-'+day;
    xAxis_data.push(ss);
    $.ajax({
        url:'${pageContext.request.contextPath}/growthrate?date='+ss,
        dataType:'json',
        async: false,
        processType:true,
        success: function(data) {
            yAxis_data.push(data);
            // option.xAxis.data = xAxis_data;
            // option.series[0].data = yAxis_data;

        }
    })

    $('#datetimepicker1,#datetimepicker2').datetimepicker({
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


    // echart 的 option
    var option = {
        backgroundColor: "#344b58",
        title: {
            text: '今日用户增长比例',
            // x: "4%",

            textStyle: {
                color: '#fff',
                fontSize: '22'
            }
        },
        tooltip: {
            trigger: "axis",
            axisPointer: {
                type: "line",
                textStyle: {
                    color: "#fff"
                }

            },
        },
        grid: {
            borderWidth: 0,
            top: 110,
            bottom: 95,
            textStyle: {
                color: "#fff"
            }
        },
        legend: {
            x: '4%',
            top: '11%',
            textStyle: {
                color: '#90979c',
            }
        },


        // calculable: true,
        xAxis: [{
            type: "category",
            axisLine: {
                lineStyle: {
                    color: '#90979c'
                }
            },
            "splitLine": {
                "show": false
            },
            "axisTick": {
                "show": false
            },
            "splitArea": {
                "show": false
            },
            "axisLabel": {
                "interval": 0,

            },
            data: xAxis_data
        }],
        "yAxis": [{
            "type": "value",
            "splitLine": {
                "show": false
            },
            "axisLine": {
                lineStyle: {
                    color: '#90979c'
                }
            },
            "axisTick": {
                "show": false
            },
            "axisLabel": {
                "interval": 0,

            },
            "splitArea": {
                "show": false
            }
        }],
        "dataZoom": [{
            "show": true,
            "height": 20,
            "xAxisIndex": [
                0
            ],
            bottom: 30,
            "start": 10,
            "end": 80,

            handleStyle:{
                color:"#d3dee5"

            },
            textStyle:{
                color:"#fff"},
            borderColor:"#90979c"


        }, {
            "type": "inside",
            "show": true,
            "height": 15,
            "start": 1,
            "end": 35
        }],
        series: [

            {
                "name": "比例",
                "type": "line",
                "stack": "总量",
                symbolSize:10,
                symbol:'circle',
                "itemStyle": {
                    "normal": {
                        "color": "rgba(252,230,48,1)",
                        "barBorderRadius": 0,
                        "label": {
                            "show": true,
                            "position": "top",
                            formatter: function(p) {
                                return p.value > 0 ? (p.value) : '';
                            }
                        }
                    }
                },
                data: yAxis_data
            }
        ]
    }
    $(function () {


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

        //省下拉框change事件
        $("#select_article").on('changed.bs.select',function(){
            var pValue = cityMap[this.value];
            $("#select_article2").html("<option value=\"\">请选择</option>");
            for (var i=0; i<pValue.length; i++){
                $("#select_article2").append("<option value=\""+pValue[i]+"\">"+pValue[i]+"</option>");
            }
            $("#select_article2").selectpicker('refresh');
        })

        //查询按钮点击事件
        $('#selectBtn').on('click',function () {
            var startDate = $('#datetimepickerVal1').val();
            var endDate = $('#datetimepickerVal2').val();
            var provinceName = $('#select_article').val();
            var cityName = $('#select_article2').val();
            if (startDate != "" && endDate != "") {
                if(Date.parse(startDate)-Date.parse(endDate)<0){
                    if (provinceName == '') {
                        //查询全国的具体时间段的增长比例
                        $.ajax({
                            url:'${pageContext.request.contextPath}/usersinbatchdays?startDate='+startDate+'&endDate='+endDate,
                            dataType:'json',
                            async: false,
                            processType:true,
                            success: function(data) {
                                xAxis_data = [];
                                yAxis_data = [];

                                for (var i=0,l=data.length; i<l; i++){
                                    for (var ss in data[i]){
                                        xAxis_data.push(ss);
                                        yAxis_data.push(data[i][ss]);
                                    }
                                }
                                option.xAxis[0].data = xAxis_data;
                                option.series[0].data = yAxis_data;
                                option.title.text = '全国用户在'+startDate+'之后到'+endDate+'的增长比例';
                                initChart();
                                $('#table1').bootstrapTable('refresh',
                                    {url: '<%=request.getContextPath()%>/userratefort?startDate='+startDate+'&endDate='+endDate});
                            }
                        })
                    }else {
                        if (cityName != ""){
                            //查询全国的具体时间段 某个城市 的增长比例
                            $.ajax({
                                url:'${pageContext.request.contextPath}/usersinbatchdaysinc?startDate='+startDate+'&endDate='+endDate
                                +'&cityName='+cityName,
                                dataType:'json',
                                async: false,
                                processType:true,
                                success: function(data) {
                                    xAxis_data = [];
                                    yAxis_data = [];

                                    for (var i=0,l=data.length; i<l; i++){
                                        for (var ss in data[i]){
                                            xAxis_data.push(ss);
                                            yAxis_data.push(data[i][ss]);
                                        }
                                    }
                                    option.xAxis[0].data = xAxis_data;
                                    option.series[0].data = yAxis_data;
                                    option.title.text = cityName+'用户在'+startDate+'之后到'+endDate+'的增长比例';
                                    initChart();
                                    $('#table1').bootstrapTable('refresh',
                                        {url: '<%=request.getContextPath()%>/userrateincfort?startDate='+startDate+'&endDate='+endDate+
                                            '&cityName='+cityName});
                                }
                            })

                        } else {
                            //查询全国的具体时间段 某个省 的增长比例
                            $.ajax({
                                url:'${pageContext.request.contextPath}/usersinbatchdaysinp?startDate='+startDate+'&endDate='+endDate
                                +'&provinceName='+provinceName,
                                dataType:'json',
                                async: false,
                                processType:true,
                                success: function(data) {
                                    xAxis_data = [];
                                    yAxis_data = [];

                                    for (var i=0,l=data.length; i<l; i++){
                                        for (var ss in data[i]){
                                            xAxis_data.push(ss);
                                            yAxis_data.push(data[i][ss]);
                                        }
                                    }
                                    option.xAxis[0].data = xAxis_data;
                                    option.series[0].data = yAxis_data;
                                    option.title.text = provinceName+'用户在'+startDate+'之后到'+endDate+'的增长比例';

                                    initChart();
                                    $('#table1').bootstrapTable('refresh',
                                        {url: '<%=request.getContextPath()%>/userrateinpfort?startDate='+startDate+'&endDate='+endDate+
                                            '&provinceName='+provinceName});
                                }
                            })
                        }
                    }
                }else {
                    alert("请选择正确的时间范围")
                }
            }else {
                if (provinceName == '') {
                   //没有查询条件
                    alert('请选择查询条件')
                } else {
                    if (cityName == '') {
                        //查询某个省的具体日期的增长比例
                        $.ajax({
                            url:'${pageContext.request.contextPath}/growthrateinp?date='+ss+'&provinceName='+provinceName,
                            dataType:'json',
                            async: false,
                            processType:true,
                            success: function(data) {
                                xAxis_data = [];
                                yAxis_data = [];
                                xAxis_data.push(ss);
                                yAxis_data.push(data);
                                option.xAxis[0].data = xAxis_data;
                                option.series[0].data = yAxis_data;
                                option.title.text = provinceName+ss+'增长比例';
                                initChart();
                            }
                        })

                    } else {
                        //查找某个 市 增长比例
                        $.ajax({
                            url:'${pageContext.request.contextPath}/growthrateinc?date='+ss+'&cityName='+cityName,
                            dataType:'json',
                            async: false,
                            processType:true,
                            success: function(data) {
                                xAxis_data = [];
                                yAxis_data = [];
                                xAxis_data.push(ss);
                                yAxis_data.push(data);
                                option.xAxis[0].data = xAxis_data;
                                option.series[0].data = yAxis_data;
                                option.title.text = provinceName+cityName+ss+'增长比例';
                                initChart();
                            }
                        })
                    }
                }
            }
        })


        initChart();
        initTable();
        $('ul[role="listbox"]').addClass('optionitems');
        $('.bootstrap-table').addClass('btstp_table');

    })


    function initChart() {
        var myChart = echarts.init(document.getElementById('main'));
        myChart.clear();
        myChart.setOption(option);
    }

    function initTable() {
        $("#table1").bootstrapTable({
            url: '', // 获取表格数据的url
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
            sidePagination: 'client', // 设置为服务器端分页
            queryParams: function (params) { // 请求服务器数据时发送的参数，可以在这里添加额外的查询参数，返回false则终止请求

                return {
                    // limit: params.limit,
                    // offset: (params.offset/params.limit)+1
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
                    field: 'num',
                    title: '比例',
                    align: 'center',
                    valign: 'middle'
                }
            ],
            responseHandler: function(data){
                return data.rows;
            },
            onLoadSuccess: function(data){  //加载成功时执行
            },
            onLoadError: function(){  //加载失败时执行
            }

        });

    }


</script>
</body>
</html>
