<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/index.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/bootstrap-datetimepicker.min.css" rel="stylesheet" />
    <link href="<%=request.getContextPath()%>/css/bootstrap-select.min.css">
    <link href="${pageContext.request.contextPath}/css/top.css" rel="stylesheet" />
    <title>title</title>
</head>
<body>



<style type="text/css">
    .optionitems{
        height: 100px;
        overflow: scroll;
    }
    .btstp_table{
        height: 80%;
        overflow: scroll;
    }
    .chartDiv{
        height: 100%;
    }
    .rementDiv,.form-control{
        float: left;
    }


</style>
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
    <span class="rementDiv">类型：</span>
    <select class="selectpicker show-tick" style="outline: none;width:200px;"
            id="select_article3">
        <option>app</option>
        <option>tv</option>
    </select>

    <button id="selectBtn" type="button" class="btn btn-success">查询</button>
</div>

<div class="contentDiv">
    <div class="chartDiv" id="main" ></div>
</div>

<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/js/json/china.json"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap-select.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-datetimepicker.min.js"></script>
<script src="${pageContext.request.contextPath}/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/echarts.js"></script>
<script type="text/javascript">

    $(function () {

        /*var cityMap ;
        $.ajax({
            url:'/js/provinceCity.json',
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
        })*/

        $('#select_article3').selectpicker({
            noneSelectedText: '请选择',
            liveSearch: true,
            size:40,
            showIcon:false
        });

        $("[data-toggle='popover']").popover();

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
            minView: "month"
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
            minView: "month"
        }).on("click",function(){
            var startVal = $("#datetimepickerVal1").val();
            $("#datetimepicker2").datetimepicker("setStartDate",startVal);
        });



        $(".conditionDiv select").hide();//隐藏bootstrap select的原始下拉框
        // 查询按钮点击事件
        var endDate = '';
        var startDate = '';
        var type = '';
        $('#selectBtn').on('click',function () {
            startDate = $('#datetimepickerVal1').val();
            endDate = $('#datetimepickerVal2').val();
            type = $('#select_article3').val();
            initChart(endDate,startDate,type);
        })

        initChart(endDate,startDate,type);

        $('ul[role="listbox"]').addClass('optionitems');
        $('.bootstrap-table').addClass('btstp_table');

    });

    // 初始化echarts
    function initChart(endDate,startDate,type) {
        // // 基于准备好的dom，初始化echarts实例
        // var myChart = echarts.init(document.getElementById('main'));
        var anhui = "../../js/json/anhui.json";
        // var china = "../../js/json/china.json";
        var china = "../../js/json/china.json";
        var aomen = "../../js/json/aomen.json";
        var beijing = "../../js/json/beijing.json";
        var chongqing = "../../js/json/chongqing.json";
        var fujian = "../../js/json/fujian.json";
        var gansu = "../../js/json/gansu.json";
        var guangdong = "../../js/json/guangdong.json";
        var guangxi = "../../js/json/guangxi.json";
        var guizhou = "../../js/json/guizhou.json";
        var hainan = "../../js/json/hainan.json";
        var hebei = "../../js/json/hebei.json";
        var heilongjiang = "../../js/json/heilongjiang.json";
        var henan = "../../js/json/henan.json";
        var hubei = "../../js/json/hubei.json";
        var hunan = "../../js/json/hunan.json";
        var jiangsu = "../../js/json/jiangsu.json";
        var jiangxi = "../../js/json/jiangxi.json";
        var jilin = "../../js/json/jilin.json";
        var liaoning = "../../js/json/liaoning.json";
        var neimenggu = "../../js/json/neimenggu.json";
        var ningxia = "../../js/json/ningxia.json";
        var qinghai = "../../js/json/qinghai.json";
        var shandong = "../../js/json/shandong.json";
        var shanghai = "../../js/json/shanghai.json";
        var shanxi = "../../js/json/shanxi.json";
        var shanxi1 = "../../js/json/shanxi1.json";
        var sichuan = "../../js/json/sichuan.json";
        var tianjin = "../../js/json/tianjin.json";
        var xianggang = "../../js/json/xianggang.json";
        var xinjiang = "../../js/json/xinjiang.json";
        var xizang = "../../js/json/xizang.json";
        var yunnan = "../../js/json/yunnan.json";
        var zhejiang = "../../js/json/zhejiang.json";
        echarts.extendsMap = function(id, opt){
            // echarts实例
            var chart = this.init(document.getElementById('main'));
            var curGeoJson = {};

            //城市对应的 地图json
            var cityMap = {
                "安徽省": anhui,
                "澳门": aomen,
                "北京市": beijing,
                "重庆市": chongqing,
                "福建省": fujian,
                "甘肃省": gansu,
                "广东省": guangdong,
                "广西壮族自治区": guangxi,
                "贵州省": guizhou,
                "海南省": hainan,
                "黑龙江": heilongjiang,
                "河南省": henan,
                "湖北省": hubei,
                "湖南省": hunan,
                "江苏省": jiangsu,
                "江西省": jiangxi,
                "吉林省": jilin,
                "辽宁省": liaoning,
                "内蒙古自治区": neimenggu,
                "宁夏回族自治区": ningxia,
                "青海省": qinghai,
                "山东省": shandong,
                "陕西省": shanxi1,
                "山西省": shanxi,
                "四川省": sichuan,
                "天津市": tianjin,
                "香港": xianggang,
                "新疆维吾尔自治区": xinjiang,
                "西藏自治区": xizang,
                "云南省": yunnan,
                "浙江省": zhejiang,
                "上海市": shanghai,
                "河北省": hebei
            };



            var geoCoordMap;
            $.ajax({
                url:'${pageContext.request.contextPath}/js/json/geoCoordMap.json',
                dataType:'json',
                async: false,
                processType:true,
                success: function(data) {
                    geoCoordMap=data;
                }
            })

            //设置不同level的颜色
            var levelColorMap = {
                '1': 'rgba(241, 109, 115, .8)',
                '2': 'rgba(255, 235, 59, .7)',
                '3': 'rgba(147, 235, 248, 1)'
            };

            var defaultOpt = {
                mapName: 'china',     // 地图展示
                goDown: false,        // 是否下钻
                bgColor: '#404a59',   // 画布背景色
                activeArea: [],       // 区域高亮,同echarts配置项
                // 下钻回调(点击的地图名、实例对象option、实例对象)
                callback: function(name, option, instance){}
            };
            if(opt) opt = this.util.extend(defaultOpt, opt);
            // 层级索引
            //地图的名字
            var name = [opt.mapName];
            var idx = 0;
            var pos = {
                leftPlus: 115,
                leftCur: 150,
                left: 198,
                top: 50
            };
            var line = [[0, 0], [8, 11], [0, 22]];
            // style
            var style = {
                font: '18px "Microsoft YaHei", sans-serif',
                textColor: '#eee',
                lineColor: 'rgba(147, 235, 248, .8)'
            };
            //处理事件
            var handleEvents = {
                /**
                 * i 实例对象
                 * o option
                 * n 地图名
                 **/
                resetOption: function(i, o, n){
                    //根据这个地图名创建一个breadcrumb导航
                    var breadcrumb = this.createBreadcrumb(n);
                    //这个地图名第一次出现的位置
                    //name 地图名 -> 中国
                    var j = name.indexOf(n);
                    var l = o.graphic.length;
                    if(j < 0){
                        //和name的值不一样，添加都dao graphic
                        o.graphic.push(breadcrumb);
                        o.graphic[0].children[0].shape.x2 = 145;
                        o.graphic[0].children[1].shape.x2 = 145;
                        o.series[0].data = handleEvents.initSeriesData(opt.data);
                        name.push(n);
                        idx++;
                    }else{
                        o.graphic.splice(j + 2, l);
                        if(o.graphic.length <= 2){
                            o.graphic[0].children[0].shape.x2 = 60;
                            o.graphic[0].children[1].shape.x2 = 60;
                            o.series[0].data = handleEvents.initSeriesData(opt.data);
                        };
                        name.splice(j + 1, l);
                        idx = j;
                        pos.leftCur -= pos.leftPlus * (l - j - 1);
                        o.series[0].data = handleEvents.initSeriesData(opt.data);
                    };
                    o.geo.map = n;
                    o.geo.zoom = 1;
                    i.clear();
                    console.log(o)
                    i.setOption(o);
                    opt.callback(n, o, i);
                },
                /**
                 * name 地图名
                 * 创建面包屑
                 **/
                createBreadcrumb: function(name){
                    var cityToPinyin = {
                        "安徽省": "anhui",
                        "澳门": "aomen",
                        "北京市": "beijing",
                        "重庆市": "chongqing",
                        "福建省": "fujian",
                        "甘肃省": "gansu",
                        "广东省": "guangdong",
                        "广西壮族自治区": "guangxi",
                        "贵州省": "guizhou",
                        "海南省": "hainan",
                        "黑龙江":"heilongjiang",
                        "河南省": "henan",
                        "湖北省": "hubei",
                        "湖南省": "hunan",
                        "江苏省": "jiangsu",
                        "江西省": "jiangxi",
                        "吉林省": "jilin",
                        "辽宁省": "liaoning",
                        "内蒙古自治区":"neimenggu",
                        "宁夏回族自治区": "ningxia",
                        "青海省": "qinghai",
                        "山东省": "shandong",
                        "陕西省": "shanxi",
                        "山西省": "shanxi",
                        "四川省": "sichuan",
                        "天津市": "tianjin",
                        "香港": "xianggang",
                        "新疆维吾尔自治区": "xinjiang",
                        "西藏自治区": "xizang",
                        "云南省": "yunnan",
                        "浙江省": "zhejiang",
                        "上海市": "shanghai",
                        "河北省": "hebei"
                    };
                    //面包屑导航是一个 json 数组
                    var breadcrumb = {
                        type: 'group',
                        id: name,
                        left: pos.leftCur + pos.leftPlus,
                        top: pos.top + 3,
                        children: [{
                            type: 'polyline',
                            left: -90,
                            top: -5,
                            shape: {
                                points: line
                            },
                            style: {
                                stroke: '#fff',
                                key: name
                                // lineWidth: 2,
                            },
                            onclick: function(){
                                var name = this.style.key;
                                handleEvents.resetOption(chart, option, name);
                            }
                        }, {
                            //显示的地图名
                            type: 'text',
                            left: -68,
                            top: 'middle',
                            style: {
                                text: name,
                                textAlign: 'center',
                                fill: style.textColor,
                                font: style.font
                            },
                            onclick: function(){
                                var name = this.style.text;
                                handleEvents.resetOption(chart, option, name);
                            }
                        }, {
                            //显示的地图拼音大写
                            type: 'text',
                            left: -68,
                            top: 10,
                            style: {
                                name: name,
                                text: cityToPinyin[name] ? cityToPinyin[name].toUpperCase() : '',
                                textAlign: 'center',
                                fill: style.textColor,
                                font: '12px "Microsoft YaHei", sans-serif',
                            },
                            onclick: function(){
                                // console.log(this.style);
                                var name = this.style.name;
                                handleEvents.resetOption(chart, option, name);
                            }
                        }]
                    }
                    pos.leftCur += pos.leftPlus;
                    return breadcrumb;
                },
                // 设置effectscatter
                initSeriesData: function(data){
                    var temp = [];
                    for(var i = 0;i < data.length;i++){
                        var geoCoord = geoCoordMap[data[i].name];
                        if(geoCoord){
                            temp.push({
                                name: data[i].name,
                                // value: data[i].value
                                //  地理位置的坐标数组 连接到 地理位置对应的值
                                value: geoCoord.concat(data[i].value)
                            });
                        }
                    };
                    return temp;
                },
            };
            var option = {
                backgroundColor: opt.bgColor,
                //地理位置
                graphic: [{
                    type: 'group',
                    left: pos.left,
                    top: pos.top - 4,
                    children: [{
                        type: 'line',
                        left: 0,
                        top: -20,
                        shape: {
                            x1: 0,
                            y1: 0,
                            x2: 60,
                            y2: 0
                        },
                        style: {
                            stroke: style.lineColor,
                        }
                    }, {
                        type: 'line',
                        left: 0,
                        top: 20,
                        shape: {
                            x1: 0,
                            y1: 0,
                            x2: 60,
                            y2: 0
                        },
                        style: {
                            stroke: style.lineColor,
                        }
                    }]
                }, {
                    id: name[idx],
                    type: 'group',
                    left: pos.left + 2,
                    top: pos.top,
                    children: [{
                        type: 'polyline',
                        left: 90,
                        top: -12,
                        shape: {
                            points: line
                        },
                        style: {
                            stroke: 'transparent',
                            key: name[0]
                        },
                        onclick: function(){
                            //key  也是  name   中国
                            var name = this.style.key;
                            opt.data = dd;


                            handleEvents.resetOption(chart, option, name);
                        }
                    }, {
                        type: 'text',
                        left: 0,
                        top: 'middle',
                        style: {
                            text: name[0] === '中国' ? '中国' : name[0],
                            textAlign: 'center',
                            fill: style.textColor,
                            font: style.font
                        },
                        onclick: function(){
                            opt.data = dd;

                            handleEvents.resetOption(chart, option, '中国');
                        }
                    }, {
                        type: 'text',
                        left: 0,
                        top: 10,
                        style: {
                            text: 'ZHONGGUO',
                            textAlign: 'center',
                            fill: style.textColor,
                            font: '12px "Microsoft YaHei", sans-serif'
                        },
                        onclick: function(){
                            opt.data = dd;

                            handleEvents.resetOption(chart, option, '中国');
                        }
                    }]
                }],
                geo: {
                    map: opt.mapName,
                    // roam: true,
                    zoom: 1,
                    label: {
                        normal: {
                            show: true,
                            textStyle: {
                                color: '#fff'
                            }
                        },
                        emphasis: {
                            textStyle: {
                                color: '#fff'
                            }
                        }
                    },
                    itemStyle: {
                        normal: {
                            borderColor: 'rgba(147, 235, 248, 1)',
                            borderWidth: 1,
                            areaColor: {
                                type: 'radial',
                                x: 0.5,
                                y: 0.5,
                                r: 0.8,
                                colorStops: [{
                                    offset: 0,
                                    color: 'rgba(147, 235, 248, 0)' // 0% 处的颜色
                                }, {
                                    offset: 1,
                                    color: 'rgba(147, 235, 248, .2)' // 100% 处的颜色
                                }],
                                globalCoord: false // 缺省为 false
                            },
                            shadowColor: 'rgba(128, 217, 248, 1)',
                            // shadowColor: 'rgba(255, 255, 255, 1)',
                            shadowOffsetX: -2,
                            shadowOffsetY: 2,
                            shadowBlur: 10
                        },
                        emphasis: {
                            areaColor: '#389BB7',
                            borderWidth: 0
                        }
                    },
                    regions: opt.activeArea.map(function(item){
                        if(typeof item !== 'string'){
                            return {
                                name: item.name,
                                itemStyle: {
                                    normal: {
                                        areaColor: item.areaColor || '#389BB7'
                                    }
                                },
                                label: {
                                    normal: {
                                        show: item.showLabel,
                                        textStyle: {
                                            color: '#fff'
                                        }
                                    }
                                }
                            }
                        }else{
                            return {
                                name: item,
                                itemStyle: {
                                    normal: {
                                        borderColor: '#91e6ff',
                                        areaColor: '#389BB7'
                                    }
                                }
                            }
                        }
                    }),
                    nameMap:{

                    }
                },
                visualMap:[{
                    min: 0,
                    max: 50000,
                    text:['High','Low'],
                    // color: ['orangered','yellow','lightskyblue']
                    realtime: false,
                    calculable: true,
                    inRange: {
                        color: ['lightskyblue','orange', 'orangered']
                    }
                }],
                tooltip:{
                    show: true,
                    trigger: 'item',
                    formatter: function(params){
                        return (params.value)[2];
                    }
                },
                series: [{
                    type: 'effectScatter',
                    // type: 'map',
                    coordinateSystem: 'geo',
                    // symbol: 'diamond',
                    showEffectOn: 'render',
                    rippleEffect: {
                        period: 15,
                        scale: 1,
                        // brushType: 'fill'
                        brushType: 'stroke'
                    },
                    hoverAnimation: true,
                    itemStyle: {
                        normal: {
                            color: function(params){
                                return levelColorMap[params.value[3]];
                            },
                            shadowBlur: 10,
                            shadowColor: '#333'
                        }
                    },
                    label: {
                        normal: {
                            formatter: function(params){
                                return (params.value)[2];
                            },
                            position: 'right'
                            // show: true
                            // color: '#000'
                        }
                    },

                    data: handleEvents.initSeriesData(opt.data)
                }]
            };
            chart.setOption(option);
            // 添加事件
            chart.on('click', function(params){
                //先查询出省份下的所有数据
                $.ajax({
                    type:"post",
                    url:"${pageContext.request.contextPath}/buy/buyerinprovince?startDate="+startDate+
                    '&endDate='+endDate+'&provinceName='+params.name+'&type='+type,
                    async:false,
                    success: function(data) {
                        opt.data = data;
                        console.log(data)
                    }
                })

                //注册省份地图
                //更改option
                var _self = this;
                if(opt.goDown && params.name !== name[idx]){
                    if(cityMap[params.name]){
                        var url = cityMap[params.name];
                        $.get(url, function(response){
                            curGeoJson = response;
                            echarts.registerMap(params.name, response);
                            handleEvents.resetOption(_self, option, params.name);
                        });
                    }
                }
            });
            return chart;
        };

        //获取省份信息
        var dd = [];
        $.ajax({
            url: "${pageContext.request.contextPath}/buy/provincebuyer?startDate="+startDate+"&endDate="+endDate+
                "&type="+type,
            dataType:'json',
            processType:true,
            async: false,
            success: function(data) {
                dd = data;
            }
        });

        //  获取中国地图json
        $.getJSON(china, function(geoJson){
            //获取地区json，，之后向echarts注册
            echarts.registerMap('中国', geoJson);
            // chart-panel 是一个div的id名
            echarts.extendsMap('id', {
                bgColor: '#154e90', // 画布背景色
                mapName: '中国',    // 地图名
                goDown: true,       // 是否下钻
                // 数据展示
                data: dd

            });
        })
    }



</script>

</body>
</html>
