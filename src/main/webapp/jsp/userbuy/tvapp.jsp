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
<jsp:include page="../header.jsp"/>
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
        minView: "month"
    }).on("click",function(){
        var endVal = $("#datetimepickerVal2").val();
        $("#datetimepicker1").datetimepicker("setEndDate",endVal);
    });

    var seriesData = [];
    $.ajax({
        url:'${pageContext.request.contextPath}/buy/tvapp',
        dataType:'json',
        async: false,
        processType:true,
        success: function(data) {
            seriesData=data;
        }
    })

    option = {
        title : {
            text: '用户购买tv和app的比例'
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
                url:'${pageContext.request.contextPath}/buy/tvapp?startDate='+startDate+
                '&endDate='+endDate+'&provinceName='+provinceName+'&cityName='+cityName,
                success: function(data) {
                    option.title.text = "查询结果";
                    option.series[0].data=data;
                    initChart();
                    <%--$('#table1').bootstrapTable('refresh',--%>
                        <%--{url: '${pageContext.request.contextPath}/userpay/payfailuser?startDate='+startDate+--%>
                            <%--'&endDate='+endDate+'&provinceName='+provinceName+--%>
                            <%--'&cityName='+cityName});--%>
                }
            })
        })



        initChart();
        // initTable();
        $('ul[role="listbox"]').addClass('optionitems');
        $('.bootstrap-table').addClass('btstp_table');
    });

    function initChart() {
        var myChart = echarts.init(document.getElementById('main'));
        myChart.clear();
        myChart.setOption(option);
    }

</script>
</body>
</html>
