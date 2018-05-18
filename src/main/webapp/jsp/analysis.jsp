<%@ page contentType="text/html;charset=UTF-8"  %>
<!DOCTYPE html>
<html >
<head>
    <meta charset="utf-8" />
    <title>Dashboard - Bootstrap Admin</title>

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/echarts.js"></script>
    <style>
        body{
            background-color: white;
        }
    </style>

<body>

<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
<div id="id" style="width: 1600px;height:1000px;"></div>

<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-datetimepicker.min.js"></script>
<script src="${pageContext.request.contextPath}/js/locales/bootstrap-datetimepicker.fr.js"></script>
<script src="${pageContext.request.contextPath}/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
<script type="text/javascript">

    $(function () {

        // // 基于准备好的dom，初始化echarts实例
        // var myChart = echarts.init(document.getElementById('main'));


        var anhui = "${pageContext.request.contextPath}/js/json/anhui.json";
        var china = "${pageContext.request.contextPath}/js/json/china.json";
        var aomen = "${pageContext.request.contextPath}/js/json/aomen.json";
        var beijing = "${pageContext.request.contextPath}/js/json/beijing.json";
        var chongqing = "${pageContext.request.contextPath}/js/json/chongqing.json";
        var fujian = "${pageContext.request.contextPath}/js/json/fujian.json";
        var gansu = "${pageContext.request.contextPath}/js/json/gansu.json";
        var guangdong = "${pageContext.request.contextPath}/js/json/guangdong.json";
        var guangxi = "${pageContext.request.contextPath}/js/json/guangxi.json";
        var guizhou = "${pageContext.request.contextPath}/js/json/guizhou.json";
        var hainan = "${pageContext.request.contextPath}/js/json/hainan.json";
        var hebei = "${pageContext.request.contextPath}/js/json/hebei.json";
        var heilongjiang = "${pageContext.request.contextPath}/js/json/heilongjiang.json";
        var henan = "${pageContext.request.contextPath}/js/json/henan.json";
        var hubei = "${pageContext.request.contextPath}/js/json/hubei.json";
        var hunan = "${pageContext.request.contextPath}/js/json/hunan.json";
        var jiangsu = "${pageContext.request.contextPath}/js/json/jiangsu.json";
        var jiangxi = "${pageContext.request.contextPath}/js/json/jiangxi.json";
        var jilin = "${pageContext.request.contextPath}/js/json/jilin.json";
        var liaoning = "${pageContext.request.contextPath}/js/json/liaoning.json";
        var neimenggu = "${pageContext.request.contextPath}/js/json/neimenggu.json";
        var ningxia = "${pageContext.request.contextPath}/js/json/ningxia.json";
        var qinghai = "${pageContext.request.contextPath}/js/json/qinghai.json";
        var shandong = "${pageContext.request.contextPath}/js/json/shandong.json";
        var shanghai = "${pageContext.request.contextPath}/js/json/shanghai.json";
        var shanxi = "${pageContext.request.contextPath}/js/json/shanxi.json";
        var shanxi1 = "${pageContext.request.contextPath}/js/json/shanxi1.json";
        var sichuan = "${pageContext.request.contextPath}/js/json/sichuan.json";
        var tianjin = "${pageContext.request.contextPath}/js/json/tianjin.json";
        var xianggang = "${pageContext.request.contextPath}/js/json/xianggang.json";
        var xinjiang = "${pageContext.request.contextPath}/js/json/xinjiang.json";
        var xizang = "${pageContext.request.contextPath}/js/json/xizang.json";
        var yunnan = "${pageContext.request.contextPath}/js/json/yunnan.json";
        var zhejiang = "${pageContext.request.contextPath}/js/json/zhejiang.json";

        echarts.extendsMap = function(id, opt){
            // echarts实例
            var chart = this.init(document.getElementById(id));

            var curGeoJson = {};
            //城市对应的 地图json
            var cityMap = {
                "安徽": anhui,
                "澳门": aomen,
                "北京": beijing,
                "重庆": chongqing,
                "福建": fujian,
                "甘肃": gansu,
                "广东": guangdong,
                "广西": guangxi,
                "贵州": guizhou,
                "海南": hainan,
                "黑龙江": heilongjiang,
                "河南": henan,
                "湖北": hubei,
                "湖南": hunan,
                "江苏": jiangsu,
                "江西": jiangxi,
                "吉林": jilin,
                "辽宁": liaoning,
                "内蒙古": neimenggu,
                "宁西": ningxia,
                "青海": qinghai,
                "山东": shandong,
                "陕西": shanxi1,
                "山西": shanxi,
                "四川": sichuan,
                "天津": tianjin,
                "香港": xianggang,
                "新疆": xinjiang,
                "西藏": xizang,
                "云南": yunnan,
                "浙江": zhejiang,
                "上海": shanghai,
                "河北": hebei
            };
            //地理位置
            /*var geoCoordMap = {
                '南昌': [115.89, 28.48],
                '景德镇': [117.28, 29.09],
                '萍乡': [113.93, 27.41],
                '九江': [115.97,29.51],
                '新余': [114.81, 27.72],
                '鹰潭': [117.12, 28.10],
                '赣州': [115.04, 25.67],
                '吉安': [115.05, 26.88],
                '宜春': [114.41, 28.03],
                '抚州': [116.45, 27.79],
                '上饶': [117.92, 28.22]
            };*/


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
                // visualMap:[{
                //     min:0,
                //     max:500,
                //     color: ['orangered','yellow','lightskyblue'],
                //     text:['多','少']
                // }],
                // data: [],
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
                        if(o.graphic.length > 2){
                            for(var x = 0; x < opt.data.length; x++){
                                if(n === opt.data[x].name + '市'){
                                    o.series[0].data = handleEvents.initSeriesData([opt.data[x]]);
                                    break;
                                }else o.series[0].data = [];
                            }
                        };
                        name.push(n);
                        idx++;
                    }else{
                        //Array.splice(start: number,deleteCount?: number): T[]
                        // Removes elements from an array and, if necessary, inserts new elements in their place,
                        // returning the deleted elements.
                        //     Params:
                        // start – The zero-based location in the array from which to start removing elements.
                        // deleteCount – The number of elements to remove
                        //将多余的删除
                        o.graphic.splice(j + 2, l);
                        if(o.graphic.length <= 2){
                            o.graphic[0].children[0].shape.x2 = 60;
                            o.graphic[0].children[1].shape.x2 = 60;
                            o.series[0].data = handleEvents.initSeriesData(opt.data);
                        };
                        name.splice(j + 1, l);
                        idx = j;
                        pos.leftCur -= pos.leftPlus * (l - j - 1);
                    };

                    o.geo.map = n;
                    o.geo.zoom = 0.4;
                    i.clear();
                    i.setOption(o);
                    this.zoomAnimation();
                    opt.callback(n, o, i);
                },

                /**
                 * name 地图名
                 * 创建面包屑
                 **/
                createBreadcrumb: function(name){
                    var cityToPinyin = {
                        "安徽": "anhui",
                        "澳门": "aomen",
                        "北京": "beijing",
                        "重庆": "chongqing",
                        "福建": "fujian",
                        "甘肃": "gansu",
                        "广东": "guangdong",
                        "广西": "guangxi",
                        "贵州": "guizhou",
                        "海南": "hainan",
                        "黑龙江":"heilongjiang",
                        "河南": "henan",
                        "湖北": "hubei",
                        "湖南": "hunan",
                        "江苏": "jiangsu",
                        "江西": "jiangxi",
                        "吉林": "jilin",
                        "辽宁": "liaoning",
                        "内蒙古":"neimenggu",
                        "宁西": "ningxia",
                        "青海": "qinghai",
                        "山东": "shandong",
                        "陕西": "shanxi",
                        "山西": "shanxi",
                        "四川": "sichuan",
                        "天津": "tianjin",
                        "香港": "xianggang",
                        "新疆": "xinjiang",
                        "西藏": "xizang",
                        "云南": "yunnan",
                        "浙江": "zhejiang",
                        "上海": "shanghai",
                        "河北": "hebei"
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
                        var geoCoord = data[i].name;
                        if(geoCoord){
                            temp.push({
                                name: data[i].name,
                                value: geoCoord.concat(data[i].value)
                            });
                        }
                    };
                    return temp;
                },
                zoomAnimation: function(){
                    var count = null;
                    var zoom = function(per){
                        if(!count) count = per;
                        count = count + per;
                        // console.log(per,count);
                        chart.setOption({
                            geo: {
                                zoom: count
                            }
                        });
                        if(count < 1) window.requestAnimationFrame(function(){
                            zoom(0.2);
                        });
                    };
                    window.requestAnimationFrame(function(){
                        zoom(0.2);
                    });
                }
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
                            font: '12px "Microsoft YaHei", sans-serif',
                        },
                        onclick: function(){
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
                    })
                },
                series: [{
                    type: 'effectScatter',
                    coordinateSystem: 'geo',
                    // symbol: 'diamond',
                    showEffectOn: 'render',
                    rippleEffect: {
                        period: 15,
                        scale: 6,
                        brushType: 'fill'
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
                    data: handleEvents.initSeriesData(opt.data)
                }]
            };

            chart.setOption(option);
            // 添加事件
            chart.on('click', function(params){
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

        $.getJSON(china, function(geoJson){
            //获取地区json，，之后向echarts注册
            echarts.registerMap('中国', geoJson);
            // chart-panel 是一个div的id名
            echarts.extendsMap('id', {
                bgColor: '#154e90', // 画布背景色
                mapName: '中国',    // 地图名
                goDown: true,       // 是否下钻
                // 数据展示
                data:[{"name": "上海市", "value": 5}, {"name": "云南省", "value": 6}, {"name": "内蒙古自治区", "value": 18}, {
                    "name": "北京市",
                    "value": 40
                }, {"name": "吉林省", "value": 256}, {"name": "四川省", "value": 15}, {"name": "天津市", "value": 3}, {
                    "name": "宁夏回族自治区",
                    "value": 26
                }, {"name": "安徽省", "value": 132}, {"name": "山东省", "value": 180}, {"name": "山西省", "value": 10}, {
                    "name": "广东省",
                    "value": 17
                }, {"name": "广西壮族自治区", "value": 7}, {"name": "新疆维吾尔自治区", "value": 3}, {
                    "name": "江苏省",
                    "value": 9
                }, {"name": "江西省", "value": 6}, {"name": "河北省", "value": 143}, {"name": "河南省", "value": 23}, {
                    "name": "浙江省",
                    "value": 13
                }, {"name": "海南省", "value": 9}, {"name": "湖北省", "value": 6}, {"name": "湖南省", "value": 32}, {
                    "name": "甘肃省",
                    "value": 14
                }, {"name": "福建省", "value": 6}, {"name": "西藏自治区", "value": 1}, {"name": "贵州省", "value": 1}, {
                    "name": "辽宁省", "value": 606
                }, {"name": "重庆市", "value": 6}, {"name": "陕西省", "value": 8}, {"name": "青海省", "value": 1}, {
                    "name": "黑龙江", "value": 224}]
                /*data: [{
                    name: '南昌',
                    value: 10,
                    level: 1
                }, {
                    name: '景德镇',
                    value: 12,
                    level: 2
                }, {
                    name: '萍乡',
                    value: 11,
                    level: 3
                }, {
                    name: '赣州',
                    value: 16,
                    level: 2
                }, {
                    name: '吉安',
                    value: 12,
                    level: 1
                }]*/
            });
        })

    });
</script>
</body>
</html>

