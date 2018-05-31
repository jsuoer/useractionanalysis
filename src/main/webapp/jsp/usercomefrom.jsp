<%@ page contentType="text/html;charset=UTF-8"  %>
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
</head>
<body>
<jsp:include page="header.jsp"/>
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
        url:'${pageContext.request.contextPath}/userfrom/alltpc',
        dataType:'json',
        async: false,
        processType:true,
        success: function(data) {
            seriesData=data;
        }
    })

    option = {
        title : {
            text: '全国用户来源'

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

        //查询按钮点击事件
        $('#selectBtn').on('click',function () {
            var startDate = $('#datetimepickerVal1').val();
            var endDate = $('#datetimepickerVal2').val();
            var provinceName = $('#select_article').val();
            var cityName = $('#select_article2').val();
            if (startDate != "" && endDate != "") {
                if(Date.parse(startDate)-Date.parse(endDate)<0){
                    if (provinceName == '') {
                        //查询时间段内 全国 的用户来源比例
                        $.ajax({
                            url:'${pageContext.request.contextPath}/userfrom/alltpcdate?startDate='+startDate+
                            '&endDate='+endDate,
                            success: function(data) {
                                option.series[0].data = data;
                                option.title.text = startDate+' 至 '+endDate+'全国用户来源比例';
                                initChart();
                                $('#table1').bootstrapTable('refresh',
                                    {url: '<%=request.getContextPath()%>/userfrom/alltpcdatefort?startDate='+startDate+'&endDate='+endDate});
                            }
                        })
                    }else {
                        if (cityName != ''){
                            //查询时间段内 市 的用户来源比例
                            $.ajax({
                                url:'${pageContext.request.contextPath}/userfrom/alltpcdateinc?startDate='+startDate+
                                '&endDate='+endDate+'&cityName='+cityName,
                                success: function(data) {
                                    console.log(data)
                                    option.series[0].data = data;
                                    option.title.text = startDate+' 至 '+endDate+cityName+'用户来源比例';
                                    initChart();
                                    $('#table1').bootstrapTable('refresh',
                                        {url: '<%=request.getContextPath()%>/userfrom/alltpcdateincfort?startDate='+startDate+'&endDate='+endDate
                                        +'&cityName='+cityName});
                                }
                            })
                        }else {
                            //查询时间段内 省 的用户来源比例
                            $.ajax({
                                url:'${pageContext.request.contextPath}/userfrom/alltpcdateinp?startDate='+startDate+
                                '&endDate='+endDate+'&provinceName='+provinceName,
                                success: function(data) {
                                    console.log(data)
                                    option.series[0].data = data;
                                    option.title.text = startDate+' 至 '+endDate+provinceName+'用户来源比例';
                                    initChart();
                                    $('#table1').bootstrapTable('refresh',
                                        {url: '<%=request.getContextPath()%>/userfrom/alltpcdateinpfort?startDate='+startDate+'&endDate='+endDate
                                            +'&provinceName='+provinceName});
                                }
                            })
                        }
                    }
                }else {
                    alert('请选择正确的时间段')
                }

            }else {
                if (provinceName == "") {
                    alert('请选择查询条件')
                }else {
                    if (cityName == ""){
                        //查询 省
                        $.ajax({
                            url:'${pageContext.request.contextPath}/userfrom/alltpcinp?provinceName='+provinceName,
                            success: function(data) {
                                console.log(data)
                                option.series[0].data = data;
                                option.title.text = provinceName+'用户来源比例';
                                initChart();
                                $('#table1').bootstrapTable('refresh',
                                    {url: '<%=request.getContextPath()%>/userfrom/alltpcinpfort?provinceName='+provinceName});
                            }
                        })
                    }else {
                        // 查询 市
                        $.ajax({
                            url:'${pageContext.request.contextPath}/userfrom/alltpcinc?cityName='+cityName,
                            success: function(data) {
                                console.log(data)
                                option.series[0].data = data;
                                option.title.text = cityName+'用户来源比例';
                                initChart();
                                $('#table1').bootstrapTable('refresh',
                                    {url: '<%=request.getContextPath()%>/userfrom/alltpcincfort?cityName='+cityName});
                            }
                        })
                    }
                }
            }


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
            url: '${pageContext.request.contextPath}/userfrom/alltpcfort', // 获取表格数据的url
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
            sidePagination: 'client',
            // queryParams: function (params) {
            //
            //     return {
            //         // limit: params.limit,
            //         // offset: (params.offset/params.limit)+1
            //     }
            // },
            columns: [
                {
                    checkbox: true, // 显示一个勾选框
                    align: 'center' // 居中显示
                }, {
                    field: 'type', // 返回json数据中
                    title: '注册方式', // 表格表头显示文字
                    align: 'center', // 左右居中
                    valign: 'middle' // 上下居中
                }, {
                    field: 'num',
                    title: '人数',
                    align: 'center',
                    valign: 'middle'
                }
            ],
            responseHandler: function(data){
                return data.rows;
            },
            onLoadSuccess: function(data){  //加载成功时执行
                console.log(data)
            },
            onLoadError: function(){  //加载失败时执行
            }

        });

    }
</script>
</body>
</html>
