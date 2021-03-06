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
</head>
<body>
<jsp:include page="../header.jsp"/>
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-table.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-table-zh-CN.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-datetimepicker.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-select.js"></script>
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
        url:'${pageContext.request.contextPath}/userpay/payusersuccessrate',
        dataType:'json',
        async: false,
        processType:true,
        success: function(data) {
            seriesData=data;
        }
    })

    option = {
        title : {
            text: '全国支付成功和失败的比例'
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
            var provinceName = $('#select_article').val();
            var cityName = $('#select_article2').val();
            $.ajax({
                url:'${pageContext.request.contextPath}/userpay/payusersuccessrate?startDate='+startDate+
                '&endDate='+endDate+'&provinceName='+provinceName+'&cityName='+cityName,
                success: function(data) {
                    option.series[0].data=data;
                    initChart();
                    $('#table1').bootstrapTable('refresh',
                        {url: '${pageContext.request.contextPath}/userpay/payfailuser?startDate='+startDate+
                            '&endDate='+endDate+'&provinceName='+provinceName+
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
            url: '${pageContext.request.contextPath}/userpay/payfailuser', // 获取表格数据的url
            cache: false,
            striped: true,
            showRefresh:true,
            showColumns:true,
            showFooter:true,
            classes:'table table-hover',
            showToggle:true,
            // sortName:'date',
            search:true,
            pagination: true,
            // sortOrder:'desc',
            pageList: [5,10,15],
            pageSize: 5,
            pageNumber: 1,
            sidePagination: 'server',
            queryParams: function (params) {

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
                    // sortable:true,
                    // order:'desc'
                }, {
                    field: 'name',
                    title: '昵称',
                    align: 'center',
                    valign: 'middle'
                }, {
                    field: 'type',
                    title: '充值类型',
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
