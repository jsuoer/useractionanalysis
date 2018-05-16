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
    <link href="${pageContext.request.contextPath}/css/bootstrap-datetimepicker.min.css" rel="stylesheet" />
    <link href="${pageContext.request.contextPath}/css/font-awesome.min.css" rel="stylesheet" />

    <link href="${pageContext.request.contextPath}/css/adminia.css" rel="stylesheet" />
    <link href="${pageContext.request.contextPath}/css/adminia-responsive.css" rel="stylesheet" />

    <link href="${pageContext.request.contextPath}/css/pages/dashboard.css" rel="stylesheet" />

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/echarts.js"></script>

    <style>
        body{
            background-color: white;
        }
    </style>

<body>
<%-- 导航条 START --%>
<%-- 导航条 END --%>

<%-- 日期控件 START --%>
    <div class="container">
        <form action="" class="form-horizontal"  role="form">

            <div>
                <%--<label style="float: left" class="control-label">起始日期</label>--%>
                <div style="float: left;width: 20%" class="input-group date form_date " data-date=""
                     data-date-format="dd MM yyyy" data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
                    <input class="form-control" type="text" value="起始日期" readonly>
                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                    <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
                </div>

                <%--<label style="float: left" class="control-label">截止日期</label>--%>
                <div style="float: left;width: 20%" class="input-group date form_date " data-date=""
                     data-date-format="dd MM yyyy" data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
                    <input class="form-control" type="text" value="截止日期" readonly>
                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                    <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
                </div>
            </div>

        </form>
    </div>
<%-- 日期控件 END--%>

<%-- 折线图 START --%>
<div style="margin-top: 15px" class="container">
    <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
    <div id="main" style="width: 600px;height:400px;"></div>
</div>

<%-- 折线图 END --%>

<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-datetimepicker.min.js"></script>
<script src="${pageContext.request.contextPath}/js/locales/bootstrap-datetimepicker.fr.js"></script>
<script src="${pageContext.request.contextPath}/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
<script type="text/javascript">
    var myChart = echarts.init(document.getElementById('main'));
    option = {
        title: {
            text: '未来一周气温变化',
            subtext: '纯属虚构'
        },
        tooltip: {
            trigger: 'axis'
        },
        legend: {
            data:['最高气温','最低气温']
        },
        toolbox: {
            show: true,
            feature: {
                dataZoom: {
                    yAxisIndex: 'none'
                },
                dataView: {readOnly: false},
                magicType: {type: ['line', 'bar']},
                restore: {},
                saveAsImage: {}
            }
        },
        xAxis:  {
            type: 'category',
            boundaryGap: false,
            data: ['周一','周二','周三','周四','周五','周六','周日']
        },
        yAxis: {
            type: 'value',
            axisLabel: {
                formatter: '{value} °C'
            }
        },
        series: [
            {
                name:'最高气温',
                type:'line',
                data:[11, 11, 15, 13, 12, 13, 10],
                markPoint: {
                    data: [
                        {type: 'max', name: '最大值'},
                        {type: 'min', name: '最小值'}
                    ]
                },
                markLine: {
                    data: [
                        {type: 'average', name: '平均值'}
                    ]
                }
            },
            {
                name:'最低气温',
                type:'line',
                data:[1, -2, 2, 5, 3, 2, 0],
                markPoint: {
                    data: [
                        {name: '周最低', value: -2, xAxis: 1, yAxis: -1.5}
                    ]
                },
                markLine: {
                    data: [
                        {type: 'average', name: '平均值'},
                        [{
                            symbol: 'none',
                            x: '90%',
                            yAxis: 'max'
                        }, {
                            symbol: 'circle',
                            label: {
                                normal: {
                                    position: 'start',
                                    formatter: '最大值'
                                }
                            },
                            type: 'max',
                            name: '最高点'
                        }]
                    ]
                }
            }
        ]
    };
    myChart.setOption(option)


    $(function () {
        $('#collapseTwo').collapse({
            toggle: false
        })
    })
    $('.form_date').datetimepicker({
        language:  'fr',
        weekStart: 1,
        todayBtn:  1,
        autoclose: 1,
        todayHighlight: 1,
        startView: 2,
        minView: 2,
        forceParse: 0
    });
</script>
</body>
</html>

