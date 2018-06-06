<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/bootstrap-table.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/font-awesome.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/index.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/bootstrap-datetimepicker.min.css" rel="stylesheet" />
    <link href="${pageContext.request.contextPath}/css/top.css" rel="stylesheet" />
    <link href="<%=request.getContextPath()%>/css/bootstrap-select.css">
    <style type="text/css">
        .conditionDiv {
            width: 33%;
            height: 50px;
            margin-top: 0.5%;
            line-height: 2;
            float: left;
        }
        .rementDiv,.form-control{
            float: left;
        }
        #min,#max{
            width: 98px;
        }
    </style>
</head>
<body>
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

<div style="float: left;margin-top: 0.5%;">
    <span style="line-height: 36px;" class="rementDiv">金额：</span>
    <input type="number" id="min" class="form-control" placeholder="最小金额">
    <input type="number" id="max" class="form-control" placeholder="最大金额">
</div>



<div class="conditionDiv">
    <span class="rementDiv">地区：</span>
    <%--省下拉框--%>
    <select  class="selectpicker" id="select_article" >
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
<script src="${pageContext.request.contextPath}/js/bootstrap-datetimepicker.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-select.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/echarts.js"></script>
<script type="text/javascript">
    $('#select_article,#select_article2').hide();

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

    var seriesData = [];
    $.ajax({
        url:'${pageContext.request.contextPath}/userpay/typenum',
        dataType:'json',
        async: false,
        processType:true,
        success: function(data) {
            seriesData=data;
        }
    })

    option = {
        title : {
            text: '全国支付类型比例'
        },
        tooltip : {
            trigger: 'item',
            formatter: "{b} : {c} ({d}%)"
        },

        series : [
            {
                name: '访问来源',
                type: 'pie',
                radius : '55%',
                center: ['50%', '60%'],
                data:seriesData,
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    };

    $(function () {
        $('.selectpicker').selectpicker({
            noneSelectedText: '',
            noneResultsText: '',
            liveSearch: true,
            tickIcon:'',//不显示下拉选项中的对号
            size:50   //设置select高度，同时显示5个值
        });

        //查询按钮点击事件
        $('#selectBtn').on('click',function () {
            var startDate =  $('#datetimepickerVal1').val();
            var endDate =  $('#datetimepickerVal2').val();
            var min = $('#min').val();
            var max = $('#max').val();
            var provinceName = $('#select_article').val();
            var cityName = $('#select_article2').val();
            $.ajax({
                url:'${pageContext.request.contextPath}/userpay/typenum?startDate='+startDate+
                '&endDate='+endDate+'&min='+min+'&max='+max+'&provinceName='+provinceName+
                '&cityName='+cityName,
                success:function (data) {
                    option.title.text = "查询结果";
                    option.series[0].data = data;
                    initChart();
                    $('#table1').bootstrapTable('refresh',
                        {url: '${pageContext.request.contextPath}/userpay/payuserinfo?startDate='+startDate+
                            '&endDate='+endDate+'&min='+min+'&max='+max+'&provinceName='+provinceName+
                            '&cityName='+cityName});
                }

            })
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
        });

        //省下拉框change事件
        $("#select_article").on('changed.bs.select',function(){
            var pValue = cityMap[this.value];
            $("#select_article2").html("<option value=\"\">请选择</option>");
            for (var i=0; i<pValue.length; i++){
                $("#select_article2").append("<option value=\""+pValue[i]+"\">"+pValue[i]+"</option>");
            }
            $("#select_article2").selectpicker('refresh');
        })

        initChart();
        initTable();
        $('ul[role="listbox"]').addClass('optionitems');
        $('.bootstrap-table').addClass('btstp_table');
    });

    function initChart() {
        var myChart = echarts.init(document.getElementById('main'));
        myChart.clear();
        myChart.setOption(option);
    }

    function initTable() {
        $("#table1").bootstrapTable({
            url: '${pageContext.request.contextPath}/userpay/payuserinfo', // 获取表格数据的url
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
                    title: '昵称',
                    align: 'center',
                    valign: 'middle'
                }, {
                    field: 'total',
                    title: '总计',
                    align: 'center',
                    valign: 'middle'
                }, {
                    field: 'pname',
                    title: '省份',
                    align: 'center',
                    valign: 'middle'
                }, {
                    field: 'cname',
                    title: '城市',
                    align: 'center',
                    valign: 'middle'
                }
            ],
            // responseHandler: function(data){
            //     return data.rows;
            // },
            onLoadSuccess: function(data){  //加载成功时执行
            },
            onLoadError: function(){  //加载失败时执行
            }

        });

    }

</script>
</body>
</html>
