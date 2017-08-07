<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<link rel="stylesheet" href="css/new_file.css" type="text/css" />
		<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
		
	</head>
	
	<script type="text/javascript">
	/*  $(function(){
		 	
			$.ajax({
					url:'HC_selectHazardousChemicalsOrder.action',
					type:'post',
					dataType:'Text',
					error:function(){
					},
					success:function(data){
						if(data!=null){
							var data=eval("("+data+")");
							for(var i = 0;i<data.length;i++){
								var name = data[i].name;
								var id = data[i].hnum;
								var str = "<li class='siad-active'><a class='hvr-bounce-to-right' href='javascript:void(0);' name='"+name+"' id='"+id+"'>"+name+"</a></li>";
								console.log(data);
								$("#list").append(str);
							}
							console.log(data);	
						}else{
							return false;
						}
								
					}
		})
	});  */
	
	
	</script>
	<body>
		<div class="box">
			<header id="nav">
				<div class="middle">
					<div class="top-nav">
						<img src="image/logo.png">
					</div>
					<nav class="nav">
						<ul>
							<li><a class=" nav-a-active hvr-underline-from-center" href="Order.jsp">总览 </a></li>
							<li><a class="hvr-underline-from-center" href="OrderDetail.jsp">详情</a></li>
							<li><a class="hvr-underline-from-center" href="#">地图</a></li>
						</ul>
					</nav>
				</div>
			</header>
			<aside id="siad-nav" class="siad-nav">
				<ul id="list">
					 <li class="siad-active"><a class=" hvr-bounce-to-right" href="javascript:void(0);" name="idele001">硫酸</a></li>
					<li><a class=" hvr-bounce-to-right" href="javascript:void(0);" name="idele002">钠</a></li>
					<li><a class=" hvr-bounce-to-right" href="javascript:void(0);" name="idele003">硫酸</a></li>
					<li><a class=" hvr-bounce-to-right" href="javascript:void(0);" name="idele004">钾</a></li>
					<li><a class=" hvr-bounce-to-right" href="javascript:void(0);">锂</a></li>
					<li><a class=" hvr-bounce-to-right" href="javascript:void(0);">钡</a></li>
					<li><a class=" hvr-bounce-to-right" href="javascript:void(0);">铷</a></li>
					<li><a class=" hvr-bounce-to-right" href="javascript:void(0);">碳化钙</a></li>
					<li><a class=" hvr-bounce-to-right" href="javascript:void(0);">臭氧化钾</a></li>
					<li><a class=" hvr-bounce-to-right" href="javascript:void(0);">超氧化钾</a></li>
					<li><a class=" hvr-bounce-to-right" href="javascript:void(0);">超氧化钾</a></li>
					<li><a class=" hvr-bounce-to-right" href="javascript:void(0);">臭氧化铷</a></li>
					<li><a class=" hvr-bounce-to-right" href="javascript:void(0);">氢氧化钠</a></li>
					<li><a class=" hvr-bounce-to-right" href="javascript:void(0);">氰化钾</a></li>
					<li><a class=" hvr-bounce-to-right" href="javascript:void(0);">三氧化二砷</a></li>
					<li><a class=" hvr-bounce-to-right" href="javascript:void(0);">氢氧化钠</a></li>
					<li><a class=" hvr-bounce-to-right" href="javascript:void(0);">氢氧化钙</a></li>
					<li><a class=" hvr-bounce-to-right" href="javascript:void(0);">二氯化钡</a></li>
					<li><a class=" hvr-bounce-to-right" href="javascript:void(0);">氢氧化钡</a></li>
					<li><a class=" hvr-bounce-to-right" href="javascript:void(0);">四氯化碳</a></li>
					<li><a class=" hvr-bounce-to-right" href="javascript:void(0);">三氯甲烷</a></li>
					<li><a class=" hvr-bounce-to-right" href="javascript:void(0);">乙酸铅</a></li>
					<li><a class=" hvr-bounce-to-right" href="javascript:void(0);">水银</a></li>
					<li><a class=" hvr-bounce-to-right" href="javascript:void(0);">镁</a></li> 


				</ul>
			</aside>
			<section id="siad-src">
				<div class="middle search-w">
					<form action="" method="">
						<input type="search" class="form-control" placeholder="输入关键词" />
						<input type="submit" class="sprite-img search_btn" value="">
					</form>
				</div>
			</section>
			<div class="middle">
				<div id="figure-w" class="figure-w">
					<div id="figure-nav" class="figure-nav">
						<ul>
							<li name="idos001" class="figure-active"><span><small class="sprite-img icon1"></small>库存</span><span><small class="sprite-img icon1_h"></small>库存</span></li>
							<li name="idos002"><span><small class="sprite-img icon2"></small>采购量</span><span><small class="sprite-img icon2_h"></small>采购量</span></li>
							<li name="idos003"><span><small class="sprite-img icon3"></small>使用量</span><span><small class="sprite-img icon3_h"></small>使用量</span></li>
						</ul>
					</div>
					<div id="data-figure" class="data-figure"></div>
				</div>
				<div class="data-rolling">
					<h1>用户操作记录</h1>
					<div class="list_lh">
						<ul>
							<li>
								<p><a target="_blank">2017-03-28</a><a target="_blank" class="btn_lh">17:28:05</a></p>
								<p><a target="_blank" class="a_blue">众毅工控</a><span>查询使用信息</span></p>
							</li>
							<li>
								<p><a target="_blank">2017-03-28</a><a target="_blank" class="btn_lh">17:28:05</a></p>
								<p><a target="_blank" class="a_blue">众毅工控</a><span>查询使用信息</span></p>
							</li>
							<li>
								<p><a target="_blank">2017-03-28</a><a target="_blank" class="btn_lh">17:28:05</a></p>
								<p><a target="_blank" class="a_blue">众毅工控</a><span>查询使用信息</span></p>
							</li>
							<li>
								<p><a target="_blank">2017-03-28</a><a target="_blank" class="btn_lh">17:28:05</a></p>
								<p><a target="_blank" class="a_blue">众毅工控</a><span>查询使用信息</span></p>
							</li>
							<li>
								<p><a target="_blank">2017-03-28</a><a target="_blank" class="btn_lh">17:28:05</a></p>
								<p><a target="_blank" class="a_blue">众毅工控</a><span>查询使用信息</span></p>
							</li>
							<li>
								<p><a target="_blank">2017-03-28</a><a target="_blank" class="btn_lh">17:28:05</a></p>
								<p><a target="_blank" class="a_blue">众毅工控</a><span>查询使用信息</span></p>
							</li>
							<li>
								<p><a target="_blank">2017-03-28</a><a target="_blank" class="btn_lh">17:28:05</a></p>
								<p><a target="_blank" class="a_blue">众毅工控</a><span>查询使用信息</span></p>
							</li>
							<li>
								<p><a target="_blank">2017-03-28</a><a target="_blank" class="btn_lh">17:28:05</a></p>
								<p><a target="_blank" class="a_blue">众毅工控</a><span>查询使用信息</span></p>
							</li>
							<li>
								<p><a target="_blank">2017-03-28</a><a target="_blank" class="btn_lh">17:28:05</a></p>
								<p><a target="_blank" class="a_blue">众毅工控</a><span>查询使用信息</span></p>
							</li>
							<li>
								<p><a target="_blank">2017-03-28</a><a target="_blank" class="btn_lh">17:28:05</a></p>
								<p><a target="_blank" class="a_blue">众毅工控</a><span>查询使用信息</span></p>
							</li>
							<li>
								<p><a target="_blank">2017-03-28</a><a target="_blank" class="btn_lh">17:28:05</a></p>
								<p><a target="_blank" class="a_blue">众毅工控</a><span>查询使用信息</span></p>
							</li>
							<li>
								<p><a target="_blank">2017-03-28</a><a target="_blank" class="btn_lh">17:28:05</a></p>
								<p><a target="_blank" class="a_blue">众毅工控</a><span>查询使用信息</span></p>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>

		<script type="text/javascript" src="js/scroll.js"></script>
		<script type="text/javascript" src="js/jquery.scrollbar.min.js"></script>
		<script type="text/javascript" src="js/echarts.min.js"></script>
		<script type="text/javascript">
            $(document).ready(function(){
                $('.list_lh li:even').addClass('lieven');
                $('.siad-nav ul').scrollbar();
                $('body').scrollbar();
            })
            $(function(){
//                用户操作记录
                $("div.list_lh").myScroll({
                    speed:40,
                    rowHeight:68
                });


            });
		</script>

		<script type="text/javascript">
            var myChart = echarts.init($("#data-figure")[0]);

//            初始化统计图表
            function initChart() {
                // 基于准备好的dom，初始化echarts实例

                var xdata = ["上海某某厂1","上海咩咩咩咩咩某某厂2","上海某啦啦啦啦啦啦啦某厂3","上海发还好某某厂4","上海某某厂5","上海地方如果二哥某某厂6","上海日法国饿的的某某厂7","上海某某厂8","上海某某厂9",
                    "上海某某厂1","上海咩咩咩咩咩某某厂2","上海某啦啦啦啦啦啦啦某厂3","上海发还好某某厂4","上海某某厂5","上海地方如果二哥某某厂6","上海日法国饿的的某某厂7","上海某某厂8","上海某某厂9",
                    "上海某某厂1","上海咩咩咩咩咩某某厂2","上海某啦啦啦啦啦啦啦某厂3","上海发还好某某厂4","上海某某厂5","上海地方如果二哥某某厂6","上海日法国饿的的某某厂7","上海某某厂8","上海某某厂9","上海某某厂10"
				];
                var sdata = [5, 20, 36, 10, 10, 20 , 45 , 60 , 50,
                    5, 20, 36, 10, 10, 20 , 45 , 60 , 50,
                    5, 20, 36, 10, 10, 20 , 45 , 60 , 50 , 40];
                // 指定图表的配置项和数据
                var option = {
                    title: {text: ''},
                    tooltip: {},
                    legend: {},
                    grid: { left: '10%', bottom:'25%' },
                    xAxis: {
                        data:xdata,
                        axisLabel: {
                            interval:0,
                            rotate:-40
                        },
                        axisTick: {
                            show: false
                        },
                        axisLine: {
                            show: true
                        },
                        z: 10,
                    },
                    yAxis: {},
                    dataZoom: [
                        {
                            type: 'inside'
                        }
                    ],
                    series: [{
                        name: '库存',
                        type: 'bar',
                        itemStyle: {
                            normal: {
                                color: new echarts.graphic.LinearGradient(
                                    0, 0, 0, 1,
                                    [
                                        {offset: 0, color: '#f7d477'},
                                        {offset: 0.5, color: '#e5c372'},
                                        {offset: 1, color: '#f0be6a'}
                                    ]
                                )
                            },
                            emphasis: {
                                color: new echarts.graphic.LinearGradient(
                                    0, 0, 0, 1,
                                    [
                                        {offset: 0, color: '#e5b354'},
                                        {offset: 0.7, color: '#e5b354'},
                                        {offset: 1, color: '#f1cf73'}
                                    ]
                                )
                            }
                        },
                        data: sdata
                    }
                    ]
                };


                // 使用刚指定的配置项和数据显示图表。
                myChart.setOption(option);
            }
            initChart();
//            获取参数
            function getData(ele , dosage){//ele——危化品元素，dosage——用量

//                $.ajax({url:"",method:"post",data:{"ele":ele,"dosage":dosage},dataType:"json",success:function(data){

//                    测试数据
                var data = [{"id":"id1",eleId:"idele001","name":"****厂1","value":35,"dosId":"idos001","dosage":"库存"},
                    {"id":"id2",eleId:"idele002","name":"****厂2","value":20,"dosId":"idos002","dosage":"库存"},
                    {"id":"id3",eleId:"idele003","name":"****厂3","value":40,"dosId":"idos003","dosage":"库存"},
                    ];
                var xData = [];
                var yData = [];
                var iName = "";
                $(data).each(function(index,item){
                    xData.push(item.name);
                    yData.push(item.value);
                    if(index==0)
                    iName = item.dosage;

                });
                myChart.setOption({
                    xAxis: {
                        data: xData
                    },
                    series: [{
                        name: iName,
                        type: 'bar',
                        itemStyle: {
                            normal: {
                                color: function(){
                                    if(dosage=="idos001"){
                                        return new echarts.graphic.LinearGradient(
                                            0, 0, 0, 1,
                                            [
                                                {offset: 0, color: '#f7d477'},
                                                {offset: 0.5, color: '#e5c372'},
                                                {offset: 1, color: '#e3b168'}
                                            ]
                                        )
                                    }else if(dosage=="idos002"){
                                        return new echarts.graphic.LinearGradient(
                                            0, 0, 0, 1,
                                            [
                                                {offset: 0, color: '#4afc86'},
                                                {offset: 0.5, color: '#42df74'},
                                                {offset: 1, color: '#3ec564'}
                                            ]
                                        )
                                    }else{
                                        return new echarts.graphic.LinearGradient(
                                            0, 0, 0, 1,
                                            [
                                                {offset: 0, color: '#64b2f5'},
                                                {offset: 0.5, color: '#5da5e3'},
                                                {offset: 1, color: '#5898d2'}
                                            ]
                                        )
                                    }


                                }
                            },
                            emphasis: {
                                color: function () {
                                    if(dosage=="idos001"){
                                        return new echarts.graphic.LinearGradient(
                                            0, 0, 0, 1,
                                            [
                                                {offset: 0, color: '#e5b354'},
                                                {offset: 0.7, color: '#e5b354'},
                                                {offset: 1, color: '#f1cf73'}
                                            ]
                                        )
                                    }else if(dosage=="idos001"){
                                        return new echarts.graphic.LinearGradient(
                                            0, 0, 0, 1,
                                            [
                                                {offset: 0, color: '#3ec564'},
                                                {offset: 0.5, color: '#42df74'},
                                                {offset: 1, color: '#4afc86'}
                                            ]
                                        )
                                    }else{
                                        return new echarts.graphic.LinearGradient(
                                            0, 0, 0, 1,
                                            [
                                                {offset: 0, color: '#5898d2'},
                                                {offset: 0.5, color: '#5da5e3'},
                                                {offset: 1, color: '#64b2f5'}
                                            ]
                                        )
                                    }


                                }
                            }
                        },
                        data: yData
                    }]
                });

//                }})


            }
//			按用量统计
            $(".figure-nav li").on("click",function (i) {
                $(this).addClass("figure-active").siblings("li").removeClass("figure-active");
				var eleVal = $(".siad-nav .siad-active").find("a").attr("name");
				var dosVal = $(".figure-nav .figure-active").attr("name");
                getData(eleVal,dosVal); 
            })
//			按危化品元素统计
            $(".siad-nav li").on("click",function () {
                $(this).addClass("siad-active").siblings("li").removeClass("siad-active");
                var eleVal = $(".siad-nav .siad-active").find("a").attr("name");
                var dosVal = $(".figure-nav .figure-active").attr("name");
                getData(eleVal,dosVal);

            });
		</script>
	</body>
</html>
