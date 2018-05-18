$(function () {
    $("[data-toggle='popover']").popover();

    $('#datetimepicker1').datetimepicker({
        format: 'yyyy-mm-dd',
        autoclose: true,
        language: 'zh-CN',
        minView: "month", //选择日期后，不会再跳转去选择时分秒
        val:new Date()
        }).on("click",function(){
        var endVal = $("#datetimepickerVal2").val();
        $("#datetimepicker1").datetimepicker("setEndDate",endVal);
    });
    $('#datetimepicker2').datetimepicker({
        format: 'yyyy-mm-dd',
        autoclose: true,
        language: 'zh-CN',
        minView: "month", //选择日期后，不会再跳转去选择时分秒
        // startDate:new Date()
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

    initChart();

});

function initChart() {
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
}

function initTable() {
    $('#table1').bootstrapTable({
        columns: [
            { field: 'sno', title: '学生编号' },
            { field: 'sname', title: '学生姓名' },
            { field: 'ssex', title: '性别' },
            { field: 'sbirthday', title: '生日' },
            { field: 'class', title: '课程编号' },
        ],
        url:'@Url.Action("GetStudent","DataOne")'
    });
}


