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
								if(i==0){
									/* onclick = 'datass("+id+")' 
									var str = "<li  ><a class='hvr-bounce-to-right' href='javascript:void(0);'    name='"+name+"' id='"+id+"'>"+name+"</a></li>";						
								}else{
									var str = "<li  ><a class='hvr-bounce-to-right' href='javascript:void(0);'   name='"+name+"' id='"+id+"'>"+name+"</a></li>";
								}
								$("#list").append(str);
							}
						}else{
							return false;
						}
								
					}
		})
	});  */
	 
	 $(function(){
		 	
			$.ajax({
					url:'User_LogOrder.action',
					type:'post',
					dataType:'Text',
					error:function(){
					},
					success:function(data){
						if(data!=null){
						 var data=eval("("+data+")");
							for(var i = 0;i<data.length;i++){
								var name = data[i].user;
								var date = data[i].date;
								var contain = data[i].contain;
								var minute = data[i].minute;
								
								var str = "<li><p><a target='_blank'>"+date+"</a><a target='_blank' class='btn_lh'>"+minute+"</a></p><p><a target='_blank' class='a_blue'>"+name+"</a><span>"+contain+"</span></p></li>";
								$("#listlog").append(str);
							}  
						}else{
							return false;
						}
								
					}
		})
	}); 

	
	
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
							<li><a class="hvr-underline-from-center" href="#" onclick="add()">地图</a></li>
						</ul>
					</nav>
				</div>
			</header>
			<aside id="siad-nav" class="siad-nav">
				<ul id="list">
					
					<li class="siad-active"><a class=" hvr-bounce-to-right" name="氨基磺酸" id="25">氨基磺酸</a></li>
					<li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="氨溶液[含氨＞10%]" id="35">氨溶液[含氨＞10%]</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="苯" id="49">苯</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="1,2-苯二酚" id="56">1,2-苯二酚</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="2-丙醇" id="111">2-丙醇</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="丙酮" id="137">丙酮</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="次氯酸钠溶液[含有效氯＞5%]" id="166">次氯酸钠溶液[含有效氯＞5%]</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="氮[压缩的或液化的]" id="172">氮[压缩的或液化的]</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="氨基磺酸" id="25">氨基磺酸</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="叠氮化钠" id="217">叠氮化钠</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="对氨基苯磺酸" id="254">对氨基苯磺酸</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="二碘化汞" id="328">二碘化汞</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="二氯甲烷" id="541">二氯甲烷</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="氟化钾" id="751">氟化钾</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="氟化钠" id="754">氟化钠</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="高氯酸[浓度＞72%]" id="798">高氯酸[浓度＞72%]</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="高锰酸钾" id="813">高锰酸钾</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="铬酸钾" id="819">铬酸钾</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="过氧化氢溶液[含量＞8%]" id="903">过氧化氢溶液[含量＞8%]</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="氦[压缩的或液化的]" id="929">氦[压缩的或液化的]</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="环己烷" id="953">环己烷</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="甲醇" id="1022">甲醇</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="甲基叔丁基醚" id="1148">甲基叔丁基醚</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="甲烷" id="1188">甲烷</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="硫脲" id="1291">硫脲</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="硫酸" id="1302">硫酸</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="硫酸汞" id="1314">硫酸汞</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="氯化钡" id="1457">氯化钡</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="氯化汞" id="1464">氯化汞</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="氯化锌" id="1480">氯化锌</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="1-萘胺" id="1586">1-萘胺</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="硼酸" id="1609">硼酸</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="偏钒酸铵" id="1614">偏钒酸铵</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="氢氧化钾" id="1667">氢氧化钾</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="氢氧化钠" id="1669">氢氧化钠</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="三氯化铁" id="1850">三氯化铁</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="三氯甲烷" id="1852">三氯甲烷</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="四氯化碳" id="2056">四氯化碳</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="硝酸" id="2285">硝酸</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="硝酸钾" id="2303">硝酸钾</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="硝酸钠" id="2311">硝酸钠</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="硝酸银" id="2340">硝酸银</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="溴化汞" id="2400">溴化汞</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="亚硝酸钠" id="2492">亚硝酸钠</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="氩[压缩的或液化的]" id="2505">氩[压缩的或液化的]</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="盐酸" id="2507">盐酸</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="盐酸-1-萘乙二胺" id="2509">盐酸-1-萘乙二胺</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="氧[压缩的或液化的]" id="2528">氧[压缩的或液化的]</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="乙醇[无水]" id="2568">乙醇[无水]</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="乙腈" id="2622">乙腈</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="乙醚" id="2625">乙醚</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="乙酸[含量＞80%]" id="2630">乙酸[含量＞80%]</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="乙酸铅" id="2641">乙酸铅</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="乙酸乙酯" id="2651">乙酸乙酯</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="正己烷" id="2789">正己烷</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="正磷酸" id="2790">正磷酸</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="重铬酸钾" id="2817">重铬酸钾</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="过二硫酸铵" id="851">过二硫酸铵</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="过二硫酸钾" id="852">过二硫酸钾</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="过硫酸钠" id="858">过硫酸钠</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="甲苯" id="1014">甲苯</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="酒石酸锑钾" id="1227">酒石酸锑钾</a></li>
					  <li><a class="hvr-bounce-to-right" href="javascript:void(0);" name="硼氢化钾" id="1605">硼氢化钾</a></li>
				</ul>
			</aside>
			<section id="siad-src">
				<div class="middle search-w">
					<!-- <form action="" method="">
						<input type="search" class="form-control" placeholder="输入关键词" />
						<input type="submit" class="sprite-img search_btn" value="">
					</form> -->
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
						<ul id="listlog">
						
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
            var str1=null;//查询出来的库存集合
            var company = [];//公司
            var all = [];//总量
            var apply = [];//使用量
            var buy = [];//采购量
            $(function(){    		 	
    			$.ajax({
    					url:'Storage_searchOrder.action',
    					type:'post',
    					dataType:'Text',
    					async: false,
    					error:function(){
    					},
    					success:function(data){
    						if(data!=null){
    							var data=eval("("+data+")");
    							str1 = data;
    							datas(str1);
    						}else{
    							return false;
    						}
    								
    					}
    		})
    	});
            
        //页面初始化填充数据
        function datas(str1){
        //首先查询出水厂列表，不能重复，然后循环水厂列表通过每一个水厂查询列去查询list集合中的对象，取出对象中的库存总量	      
        	for(var i = 0;i<str1.length;i++){
        		company[i] = str1[i].swork;
        	}
        	$.unique(company);
        	console.log("company:"+company)
        	for(var i = 0;i<company.length;i++){
        		var work = company[i];
        		for(var j = 0;j<str1.length;j++){  
        			var swork = str1[j].swork;
        			var sname = str1[j].sname;
        			var sall = str1[j].sall;
        			if(work==swork&&"氨基磺酸"==sname){
        				//console.log("str1[j].sall:"+str1[j].sall)
        				all[i] = str1[j].sall;break;
        			}
        		}
        	}
        	console.log("all:"+all)
        	initChart($.unique(company),all);
        	
        }
        //通过点击危化品名称填充库存数据
        function datass(strs){
        	for(var i = 0;i<str1.length;i++){
        		company[i] = str1[i].swork;
        	}
        	$.unique(company);
        	console.log("company:"+company)
        	for(var i = 0;i<company.length;i++){
        		var work = company[i];
        		for(var j = 0;j<str1.length;j++){  
        			var swork = str1[j].swork;
        			var snum = str1[j].snum;
        			var sall = str1[j].sall;
        			if(work==swork&&strs==snum){
        				//console.log("str1[j].sall:"+str1[j].sall)
        				all[i] = str1[j].sall;break;
        			}
        		}
        	}
        	console.log("all:"+all)
        	initChart($.unique(company),all);
        	
        	
        }
        
         
		 //初始化统计图表
         function initChart(company,all) {
             // 基于准备好的dom，初始化echarts实例

             /* var xdata = ["上海某某厂1","上海咩咩咩咩咩某某厂2","上海某啦啦啦啦啦啦啦某厂3","上海发还好某某厂4","上海某某厂5","上海地方如果二哥某某厂6","上海日法国饿的的某某厂7","上海某某厂8","上海某某厂9",
                 "上海某某厂1","上海咩咩咩咩咩某某厂2","上海某啦啦啦啦啦啦啦某厂3","上海发还好某某厂4","上海某某厂5","上海地方如果二哥某某厂6","上海日法国饿的的某某厂7","上海某某厂8","上海某某厂9",
                 "上海某某厂1","上海咩咩咩咩咩某某厂2","上海某啦啦啦啦啦啦啦某厂3","上海发还好某某厂4","上海某某厂5","上海地方如果二哥某某厂6","上海日法国饿的的某某厂7","上海某某厂8","上海某某厂9","上海某某厂10"
			]; */
			var xdata = company;
             /* var sdata = [5, 20, 36, 10, 10, 20 , 45 , 60 , 50,
                 5, 20, 36, 10, 10, 20 , 45 , 60 , 50,
                 5, 20, 36, 10, 10, 20 , 45 , 60 , 50 , 40]; */
             var sdata = all; 
             //var sdata = all;
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
            //initChart();
//            获取参数
            function getData(ele , dosage){//ele——危化品元素，dosage——（库存，采购量，使用量）

//                $.ajax({url:"",method:"post",data:{"ele":ele,"dosage":dosage},dataType:"json",success:function(data){
				console.log(str1);
//                    测试数据
                var data = [{"id":"id1",eleId:"idele001","name":"****厂1","value":35,"dosId":"idos001","dosage":"库存"},
                    {"id":"id2",eleId:"idele002","name":"****厂2","value":20,"dosId":"idos002","dosage":"库存"},
                    {"id":"id3",eleId:"idele003","name":"****厂3","value":40,"dosId":"idos003","dosage":"库存"},
                    ];
                var xData = [];
                var yData = [];
                var scompany = [];
                var stall = [];
                var smonth = [];
                var sapply = [];
                var iName = "";
               if(dosage=="idos001"){
            	   for(var i = 0;i<str1.length;i++){
            		   scompany[i] = str1[i].swork;
               		}
	               	$.unique(scompany);
	               	console.log("company:"+scompany)
	               	for(var i = 0;i<scompany.length;i++){
	               		var work = scompany[i];
	               		for(var j = 0;j<str1.length;j++){  
	               			var swork = str1[j].swork;
	               			var snum = str1[j].snum;
	               			var sall = str1[j].sall;
	               			if(work==swork&&ele==snum){
	               				//console.log("str1[j].sall:"+str1[j].sall)
	               				stall[i] = str1[j].sall;break;
	               			}
	               		}
	               	}
	                xData = scompany;
	                yData = stall;
               }
               if(dosage=="idos002"){
            	  
            	   for(var i = 0;i<str1.length;i++){
            		   scompany[i] = str1[i].swork;
               		}
	               	$.unique(scompany);
	               	console.log("company:"+scompany)
	               	for(var i = 0;i<scompany.length;i++){
	               		var work = scompany[i];
	               		for(var j = 0;j<str1.length;j++){  
	               			var swork = str1[j].swork;
	               			var snum = str1[j].snum;
	               			var ssmonth = str1[j].smonth;
	               			if(work==swork&&ele==snum){
	               				//console.log("str1[j].sall:"+str1[j].sall)
	               				smonth[i] = str1[j].smonth;break;
	               			}
	               		}
	               	}
	                xData = scompany;
	                yData = smonth;
               }
               if(dosage=="idos003"){
            	   for(var i = 0;i<str1.length;i++){
            		   scompany[i] = str1[i].swork;
               		}
	               	$.unique(scompany);
	               	console.log("company:"+scompany)
	               	for(var i = 0;i<scompany.length;i++){
	               		var work = scompany[i];
	               		for(var j = 0;j<str1.length;j++){  
	               			var swork = str1[j].swork;
	               			var snum = str1[j].snum;
	               			var ssapply = str1[j].sapply;
	               			if(work==swork&&ele==snum){
	               				//console.log("str1[j].sall:"+str1[j].sall)
	               				sapply[i] = str1[j].sapply;break;
	               			}
	               		}
	               	}
	                xData = scompany;
	                yData = sapply;
               }
                /* $(data).each(function(index,item){
                    xData.push(item.name);
                    yData.push(item.value);
                    if(index==0)
                    iName = item.dosage;

                }); */

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
				var eleVal = $(".siad-nav .siad-active").find("a").attr("id");
				var dosVal = $(".figure-nav .figure-active").attr("name");

                getData(eleVal,dosVal); 
            })
//			按危化品元素统计
            $(".siad-nav li").on("click",function () {
                $(this).addClass("siad-active").siblings("li").removeClass("siad-active");
                var eleVal = $(".siad-nav .siad-active").find("a").attr("id");
                var dosVal = $(".figure-nav .figure-active").attr("name");
                getData(eleVal,dosVal);

            });
		</script>
	</body>
</html>
