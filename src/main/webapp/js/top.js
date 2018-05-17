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


});