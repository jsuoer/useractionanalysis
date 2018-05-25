<%@ page contentType="text/html;charset=UTF-8"  %>
<html>
<head>
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/bootstrap-table.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/simple-sidebar.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/font-awesome.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/index.css" rel="stylesheet">

    <link href="${pageContext.request.contextPath}/css/bootstrap-datetimepicker.min.css" rel="stylesheet" />

    <link href="<%=request.getContextPath()%>/css/bootstrap-select.min.css">

    <!-- 引入bootstrap-table样式 -->
    <%--<link href="https://cdn.bootcss.com/bootstrap-table/1.11.1/bootstrap-table.min.css" rel="stylesheet">--%>
    <link href="${pageContext.request.contextPath}/css/top.css" rel="stylesheet" />

    <title>近十日注册分析</title>
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
    <script src="${pageContext.request.contextPath}/js/sidebar_menu.js"></script>
    <script src="${pageContext.request.contextPath}/js/slimscroll/jquery.slimscroll.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/layer/layer.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/contabs.js"></script>
    <script src="${pageContext.request.contextPath}/js/json/china.json"></script>
    <!--bootstrap下拉框-->
    <script src="<%=request.getContextPath()%>/js/bootstrap-select.js"></script>
    <!--bootstrap时间控件-->
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
                if (startDate != "" && endDate != ""){
                    if (Date.parse(startDate)-Date.parse(endDate)<0){
                        if (provinceName == ""){
                            // 直接按时间段查询全国的注册数量
                            $.ajax({
                                url:'${pageContext.request.contextPath}/userbytime?startDate='+startDate+'&endDate='+endDate,
                                dataType:'json',
                                processType:true,
                                async: false,
                                success: function(data) {
                                    xAxis_data = [];
                                    yAxis_data = [];
                                    for (var i = 0; i < data.length; i++) {
                                        xAxis_data.push(data[i]['date']);
                                        yAxis_data.push(data[i]['num']);
                                    }
                                }
                            })
                            option.xAxis.data = xAxis_data;
                            option.title.text = startDate +' 至 ' + endDate +'期间全国用户注册走势';
                            option.series[0].data = yAxis_data;
                            initChart();
                            $('#table1').bootstrapTable('refresh',
                                {url: '<%=request.getContextPath()%>/userbytimep?startDate='+startDate+'&endDate='+endDate});

                        } else {
                            if(cityName == ""){
                                //直接按时间段查询 指定省份 的注册数量
                                $.ajax({
                                    url:'${pageContext.request.contextPath}/userbytimeprovince?startDate='+startDate+
                                    '&endDate='+endDate+'&provinceName='+provinceName,
                                    dataType:'json',
                                    processType:true,
                                    async: false,
                                    success: function(data) {
                                        xAxis_data = [];
                                        yAxis_data = [];
                                        for (var i = 0; i < data.length; i++) {
                                            xAxis_data.push(data[i]['date']);
                                            yAxis_data.push(data[i]['num']);
                                        }
                                    }
                                })
                                option.xAxis.data = xAxis_data;
                                option.title.text = startDate +' 至 ' + endDate +' 期间  '+provinceName+'  用户注册走势';
                                option.series[0].data = yAxis_data;
                                initChart();
                                $('#table1').bootstrapTable('refresh',
                                    {url: '<%=request.getContextPath()%>/userbytimeprovincep?startDate='+startDate +
                                        '&endDate='+endDate+'&provinceName='+provinceName});

                            }else {
                                //直接按时间段查询 指定省份 市 的注册数量
                                $.ajax({
                                    url:'${pageContext.request.contextPath}/userbytimepandc?startDate='+startDate+
                                    '&endDate='+endDate+'&provinceName='+provinceName+'&cityName='+cityName,
                                    dataType:'json',
                                    processType:true,
                                    async: false,
                                    success: function(data) {
                                        xAxis_data = [];
                                        yAxis_data = [];
                                        for (var i = 0; i < data.length; i++) {
                                            xAxis_data.push(data[i]['date']);
                                            yAxis_data.push(data[i]['num']);
                                        }
                                    }
                                })
                                option.xAxis.data = xAxis_data;
                                option.title.text = startDate +' 至 ' + endDate +' 期间  '+provinceName+cityName+'  用户注册走势';
                                option.series[0].data = yAxis_data;
                                initChart();
                                $('#table1').bootstrapTable('refresh',
                                    {url: '<%=request.getContextPath()%>/userbytimepandcp?startDate='+startDate +
                                        '&endDate='+endDate+'&provinceName='+provinceName+'&cityName='+cityName});
                            }
                        }
                    } else {
                        alert("起始事件应该小于结束时间");
                    }
                } else if (startDate == "" && endDate == "") {
                    // if (provinceName == ""){
                    //     // 直接查询全国的注册数量
                    // } else {
                    //     if(cityName == ""){
                    //         //直接按 指定省份 的注册数量
                    //     }else {
                    //         //直接按 指定省份 市 的注册数量
                    //     }
                    // }
                    alert('请选择时间范围');
                } else {
                    if (startDate == ""){
                        alert('请选择起始时间');
                    }
                    if (endDate == ""){
                        alert('请选择结束时间');
                    }
                }
            })

            var cityMap = {
                "安徽省":['芜湖市','合肥市','六安市','宿州市','阜阳市','安庆市','马鞍山市','蚌埠市','淮北市','淮南市','宣城市','黄山市','铜陵市','亳州市','池州市','巢湖市','滁州市'],
                "澳门":[],
                "北京市":[],
                "重庆市":[],
                "福建省":['漳州市','泉州市','厦门市','福州市','莆田市','宁德市','三明市','南平市','龙岩市'],
                "甘肃省":['兰州市','天水市','庆阳市','武威市','酒泉市','张掖市','陇南地区','白银市','定西地区','平凉市','嘉峪关市','临夏回族自治州','金昌市','甘南州'],
                "广东省":['东莞市','广州市','中山市','深圳市','惠州市','江门市','珠海市','汕头市','佛山市','湛江市','河源市','肇庆市','潮州市','清远市','韶关市','揭阳市','阳江市','云浮市','茂名市','梅州市','汕尾市'],
                "广西壮族自治区":['贵港市','玉林市','北海市','南宁市','柳州市','桂林市','梧州市','钦州市','来宾市','河池市','百色市','贺州市','崇左市','防城港市'],
                "贵州省":['贵阳市','黔东南州','黔南州','遵义市','黔西南州','毕节地区','铜仁地区','安顺市','六盘水市'],
                "海南省":['三亚市','海口市','琼海市','文昌市','东方市','昌江县','陵水县','乐东县','五指山市','保亭县','澄迈县','万宁市','儋州市','临高县','白沙县','定安县','琼中县','屯昌县'],
                "黑龙江":['齐齐哈尔市','哈尔滨市','大庆市','佳木斯市','双鸭山市','牡丹江市','鸡西市','黑河市','绥化市','鹤岗市','伊春市','大兴安岭地区','七台河市'],
                "河南省":['郑州市','南阳市','新乡市','安阳市','洛阳市','信阳市','平顶山市','周口市','商丘市','开封市','焦作市','驻马店市','濮阳市','三门峡市','漯河市','许昌市','鹤壁市','济源市'],
                "湖北省":['武汉市','宜昌市','襄樊市','荆州市','恩施州','孝感市','黄冈市','十堰市','咸宁市','黄石市','仙桃市','随州市','天门市','荆门市','潜江市','鄂州市','神农架林区'],
                "湖南省":['长沙市','邵阳市','常德市','衡阳市','株洲市','湘潭市','永州市','岳阳市','怀化市','郴州市','娄底市','益阳市','张家界市','湘西州'],
                "江苏省":['苏州市','徐州市','盐城市','无锡市','南京市','南通市','连云港市','常州市','扬州市','镇江市','淮安市','泰州市','宿迁市'],
                "江西省":['南昌市','赣州市','上饶市','吉安市','九江市','新余市','抚州市','宜春市','景德镇市','萍乡市','鹰潭市'],
                "吉林省":['吉林市','长春市','白山市','白城市','延边州','松原市','辽源市','通化市','四平市'],
                "辽宁省":['大连市','沈阳市','丹东市','辽阳市','葫芦岛市','锦州市','朝阳市','营口市','鞍山市','抚顺市','阜新市','本溪市','盘锦市','铁岭市'],
                "内蒙古自治区":['赤峰市','包头市','通辽市','呼和浩特市','乌海市','鄂尔多斯市','呼伦贝尔市','兴安盟','巴彦淖尔盟','乌兰察布盟','锡林郭勒盟','阿拉善盟'],
                "宁夏回族自治区":['银川市','吴忠市','中卫市','石嘴山市','固原市'],
                "青海省":['西宁市','海西州','海东地区','海北州','果洛州','玉树州','黄南藏族自治州'],
                "山东省":['济南市','青岛市','临沂市','济宁市','菏泽市','烟台市','泰安市','淄博市','潍坊市','日照市','威海市','滨州市','东营市','聊城市','德州市','莱芜市','枣庄市'],
                "陕西省":['西安市','咸阳市','宝鸡市','汉中市','渭南市','安康市','榆林市','商洛市','延安市','铜川市'],
                "山西省":['太原市','大同市','运城市','长治市','晋城市','忻州市','临汾市','吕梁市','晋中市','阳泉市','朔州市'],
                "四川省":['成都市','绵阳市','广元市','达州市','南充市','德阳市','广安市','阿坝州','巴中市','遂宁市','内江市','凉山州','攀枝花市','乐山市','自贡市','泸州市','雅安市','宜宾市','资阳市','眉山市','甘孜州'],
                "天津市":[],
                "香港":[],
                "新疆维吾尔自治区":['乌鲁木齐市','伊犁州','昌吉州','石河子市','哈密地区','阿克苏地区','巴音郭楞州','喀什地区','塔城地区','克拉玛依市','和田地区','阿勒泰州','吐鲁番地区','阿拉尔市','博尔塔拉州','五家渠市','克孜勒苏州','图木舒克市'],
                "西藏自治区":['拉萨市','山南地区','林芝地区','日喀则地区','阿里地区','昌都地区','那曲地区'],
                "云南省":['昆明市','红河州','大理州','文山州','德宏州','曲靖市','昭通市','楚雄州','保山市','玉溪市','丽江地区','临沧地区','思茅地区','西双版纳州','怒江州','迪庆州'],
                "浙江省":['温州市','宁波市','杭州市','台州市','嘉兴市','金华市','湖州市','绍兴市','舟山市','丽水市','衢州市'],
                "上海市":[],
                "河北省":['石家庄市','唐山市','保定市','邯郸市','邢台市','河北区','沧州市','秦皇岛市','张家口市','衡水市','廊坊市','承德市']
            };

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

            initChart();
        })

        var xAxis_data = [];
        var yAxis_data = [];
        var title = '全国用户前十天注册的数据';
        $.ajax({
            url:'${pageContext.request.contextPath}/last10daynum',
            dataType:'json',
            processType:true,
            async: false,
            success: function(data) {
                for(var i=0; i<data.length; i++){
                    xAxis_data.push(data[i]['date']);
                    yAxis_data.push(data[i]['num']);
                }
            }
        })

        // echart 的 option
        option = {
            title: {
                text:title
            },
            xAxis: {
                type: 'category',
                name:'日期',
                nameGap:30,
                boundaryGap: ['20%', '20%'],
                // data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
                data: xAxis_data
            },
            yAxis: {
                type: 'value',
                minInterval: 1
            },
            series: [{
                data: yAxis_data,
                type: 'line',
                symbol: 'triangle',
                symbolSize: 20,
                lineStyle: {
                    normal: {
                        color: 'green',
                        width: 4,
                        type: 'dashed'
                    }
                },
                itemStyle: {
                    normal: {
                        borderWidth: 3,
                        borderColor: 'yellow',
                        color: 'blue'
                    }
                }
            }]
        };

        function initChart() {
            var myChart = echarts.init(document.getElementById('main'));
            myChart.clear();
            myChart.setOption(option);
        }

        function initTable() {
            $("#table1").bootstrapTable({
                url: '<%=request.getContextPath()%>/last10daynum2', // 获取表格数据的url
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
                        field: 'num',
                        title: '数量',
                        align: 'center',
                        valign: 'middle'
                    }
                ],
                onLoadSuccess: function(data){  //加载成功时执行
                    console.log(data);
                    console.info("加载成功");
                },
                onLoadError: function(){  //加载失败时执行
                    console.info("加载数据失败");
                }

            });

        }

    </script>

</body>
</html>
