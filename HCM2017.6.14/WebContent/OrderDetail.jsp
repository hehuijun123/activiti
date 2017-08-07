<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<link rel="stylesheet" href="css/new_file.css" type="text/css" />
		<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
				<script type="text/javascript" src="js/echarts.min.js"></script>

	</head>
	<script type="text/javascript">
	  /* $(function(){
		 	
			$.ajax({
					url:'User_selectRoles.action',
					type:'post',
					dataType:'Text',
					error:function(){
					},
					success:function(data){
						if(data!=null){
							var data=eval("("+data+")");
							for(var i = 0;i<data.length;i++){
								var name = data[i].name;
								var id = data[i].rid;
								
								var str = "<a  class='hvr-ripple-out' href='javascript:void(0)' name ='"+name+"' id='"+id+"'>"+name+"</a>";						
								
								$("#factory").append(str);
							}
						}else{
							return false;
						}
								
					}
		})
	});   */
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
							<li><a class=" hvr-underline-from-center" href="Order.jsp">总览</a></li>
							<li><a class=" nav-a-active hvr-underline-from-center" href="OrderDetail.jsp">详情<span></span></a></li>
							<li><a class="hvr-underline-from-center" href="##">地图</a></li>
						</ul>
					</nav>
				</div>
			</header>

			<section id="siad-src">
				<div class="middle search-w">
					<!-- <form action="" method="">
						<input type="search" class="form-control" placeholder="输入关键词" />
						<input type="submit" class="sprite-img search_btn" value="">
					</form> -->
				</div>
			</section>
			<div class="middle">
				<div class="btn-box comp-box">
					<span class="comp-menu"><small class="comp-icon"></small></span>
					<section id="factory">
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="黄浦江原水厂" id="8">黄浦江原水厂</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="长江原水厂" id="9">长江原水厂</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="松浦原水厂" id="10">松浦原水厂</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="青草沙原水厂" id="11">青草沙原水厂</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="青草沙水库管理分公司" id="12">青草沙水库管理分公司</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="杨树浦水厂" id="13">杨树浦水厂</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="闸北水厂" id="14">闸北水厂</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="吴淞水厂" id="15">吴淞水厂</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="月浦水厂" id="16">月浦水厂</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="泰和水厂" id="17">泰和水厂</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="长兴水厂" id="18">长兴水厂</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="市北泵站管理所" id="19">市北泵站管理所</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="市南泵站管理所" id="20">市南泵站管理所 </a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="徐泾水厂" id="21">徐泾水厂</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="南市水厂" id="22">南市水厂</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="长桥水厂" id="23">长桥水厂</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="闵行水厂" id="24">闵行水厂</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="罗泾水厂" id="25">罗泾水厂</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="金山海川" id="26">金山海川 </a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="白龙港污水处理厂" id="27">白龙港污水处理厂 </a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="石洞口污水处理厂" id="28">石洞口污水处理厂</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="曲阳污水处理厂" id="29">曲阳污水处理厂</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="天山污水处理厂" id="30">天山污水处理厂 </a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="吴淞污水处理厂" id="31">吴淞污水处理厂</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="桃浦污水处理厂" id="32">桃浦污水处理厂</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="水质检测中心" id="33">水质检测中心</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="竹园第二污水处理厂" id="34">竹园第二污水处理厂</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="竹园污泥处理厂" id="35">竹园污泥处理厂</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="城市排水监测站" id="36">城市排水监测站</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="浦东川沙自来水" id="37">浦东川沙自来水</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="临江水厂" id="38">临江水厂</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="凌桥水厂" id="39">凌桥水厂</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="金海水厂" id="40">金海水厂</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="浦东水厂" id="41">浦东水厂</a>
						 <a class="hvr-ripple-out" href="javascript:void(0)" name="泵站管理所" id="42">泵站管理所</a>

					</section>


				</div>
				<div class="data-box">
					<div class="line-box">
						<div class="line-chart"></div>
						<div class="line-chart"></div>
					</div>
					<div class="form-table">
						<table id="list" >
							<thead>
								<tr>
									<th>名称</th>
									<th>单位</th>
									<th>是否有剧毒</th>
								</tr>
							</thead>
							<tbody>
							<!-- <tr>
								<td name="idele001">钠</td>
								<td name="idcomp001">众毅工控技术有限公司</td>
								<td>是</td>
							</tr>
							<tr>
								<td name="idele002">钾</td>
								<td name="idcomp001">众毅工控技术有限公司</td>
								<td>是</td>
							</tr>
							<tr>
								<td name="idele003">锂</td>
								<td name="idcomp001">众毅工控技术有限公司</td>
								<td>是</td>
							</tr>
							<tr>
								<td>硫酸</td>
								<td>众毅工控技术有限公司</td>
								<td>是</td>
							</tr>
							<tr>
								<td>铷</td>
								<td>众毅工控技术有限公司</td>
								<td>是</td>
							</tr>
							<tr>
								<td>钡</td>
								<td>众毅工控技术有限公司</td>
								<td>是</td>
							</tr>
							<tr>
								<td>碳化钙</td>
								<td>众毅工控技术有限公司</td>
								<td>是</td>
							</tr>
							<tr>
								<td>臭氧化钾</td>
								<td>众毅工控技术有限公司</td>
								<td>是</td>
							</tr>
							<tr>
								<td>超氧化钾</td>
								<td>众毅工控技术有限公司</td>
								<td>是</td>
							</tr>
							<tr>
								<td>臭氧化铷</td>
								<td>众毅工控技术有限公司</td>
								<td>是</td>
							</tr>
							<tr>
								<td>氢氧化钠</td>
								<td>众毅工控技术有限公司</td>
								<td>是</td>
							</tr>
							<tr>
								<td>氰化钾</td>
								<td>众毅工控技术有限公司</td>
								<td>是</td>
							</tr>
							<tr>
								<td>三氧化二砷</td>
								<td>众毅工控技术有限公司</td>
								<td>是</td>
							</tr>
							<tr>
								<td>氢氧化钠</td>
								<td>众毅工控技术有限公司</td>
								<td>是</td>
							</tr>
							<tr>
								<td>氢氧化钙</td>
								<td>众毅工控技术有限公司</td>
								<td>是</td>
							</tr>
							<tr>
								<td>二氯化钡</td>
								<td>众毅工控技术有限公司</td>
								<td>是</td>
							</tr>
							<tr>
								<td>氢氧化钡</td>
								<td>众毅工控技术有限公司</td>
								<td>是</td>
							</tr>
							<tr>
								<td>四氯化碳</td>
								<td>众毅工控技术有限公司</td>
								<td>是</td>
							</tr>
							<tr>
								<td>三氯甲烷</td>
								<td>众毅工控技术有限公司</td>
								<td>是</td>
							</tr>
							<tr>
								<td>乙酸铅</td>
								<td>众毅工控技术有限公司</td>
								<td>是</td>
							</tr>
							<tr>
								<td>水银</td>
								<td>众毅工控技术有限公司</td>
								<td>是</td>
							</tr>
							<tr>
								<td>镁</td>
								<td>众毅工控技术有限公司</td>
								<td>是</td>
							</tr> -->
							</tbody>
						</table>
						<div class="page-black">
							<select>
								<option value="页数">1</option>
							    <option value="页数">2</option>
							    <option value="页数">3</option>
							    <option value="页数">4</option>
							</select>
							<a href=""><span class="sprite-img pageL"></span></a>
							<span class="pagetxt">第</span>
							<span class="pagecur"><input type="text" value="1"></span>
							<span class="pagetxt">页</span>
							<a href=""><span class="sprite-img pageR"></span></a>
							<span class="pagetxt">共3页</span>
						</div>
					</div>
				</div>
			</div>
		</div>





<script type="text/javascript">
		var purchase = null;
		var purpose = null;
		 $(function(){ 
			 purposes();
 			$.ajax({
 					url:'Purchase_selectOrder.action',
 					type:'post',
 					dataType:'Text',
 					error:function(){
 					},
 					success:function(data){
 						if(data!=null){
 							var data=eval("("+data+")");
 							purchase = data;
 							show(purchase);

 						}else{
 							return false;
 						}
 								
 					}
 		})
 	});
	 function purposes(){    
				$.ajax({
						url:'Purchase_selectOrders.action',
						type:'post',
						dataType:'Text',
						error:function(){
						},
						success:function(data){
							if(data!=null){
								var data=eval("("+data+")");
								purpose = data;
							}else{
								return false;
							}
									
						}
			})
		}
		 //初始化显示
	function show(pur){
			 for(var i = 0;i<pur.length;i++){
					var name ;
					var ppoison ;
					var punit ;
					var str;
					var sc = pur[i].sc
					if(sc=="11"){
						name = pur[i].pname;
						ppoison = pur[i].ppoison;
						punit = pur[i].punit;
						str = "<tr>"+
						"<td name='"+name+"'>"+name+"</td>"+
						"<td name='"+sc+"'>"+punit+"</td>"+
						"<td>"+ppoison+"</td></tr>";
					}
											
					
					$("#list tbody").append(str);
				}
			 
			 
	}
	
	function showafter(pur){
		 for(var i = 0;i<pur.length;i++){
				var name =null ;
				var ppoison=null ;
				var punit =null;
				var str;
				var sc = pur[i].sc
				if(sc=="11"){
					name = pur[i].pname;
					ppoison = pur[i].ppoison;
					punit = pur[i].punit;
					str = "<tr>"+
					"<td name='"+name+"'>"+name+"</td>"+
					"<td name='"+sc+"'>"+punit+"</td>"+
					"<td>"+ppoison+"</td></tr>";
				}		
				$("#list tbody").append(str);
			}		 
	}
//			水厂的预览与显示
		 	var  boolean  = true;
			var autoHeight = $(".comp-box section").css('height');
			var fixHeight = $(".comp-box").css('height');
            $('.comp-menu').on("click",function () {
                if(boolean){
                    $(this).addClass('icon-active');
                    $(".comp-box").animate({"height":autoHeight },"slow");
                }else{
                    $(this).removeClass('icon-active');
                    $(".comp-box").animate({"height":fixHeight},"slow");
                }
                    boolean = !boolean;
            });
			//采购量和使用量折线图表的展示
            var myChart0 = echarts.init($(".line-chart")[0]);//采购量
            var myChart1 = echarts.init($(".line-chart")[1]);//使用量
            function initChart() {
                var xdata = ["2017-01-05","2017-01-10","2017-01-15","2017-06-20","2017-02-25","2017-03-05","2017-03-25","2017-04-10","2017-04-20"];
                var sdata = [5, 20, 36, 10, 10, 20 , 45 , 60 , 50];
              /*   for(var i = 0;i<purchase.length;i++){
    				var name =null ;
    				var ppoison=null ;
    				var punit =null;
    				var str;
    				var sc = pur[i].sc
    				if(sc=="11"){
    					name = pur[i].pname;
    					ppoison = pur[i].ppoison;
    					punit = pur[i].punit;
    					str = "<tr>"+
    					"<td name='"+name+"'>"+name+"</td>"+
    					"<td name='"+sc+"'>"+punit+"</td>"+
    					"<td>"+ppoison+"</td></tr>";
    				} */
                
                var option0 = {
                    title: {
                        text: '采购量'
                    },
                    tooltip: {},
                    legend: {},
                    xAxis: {
                        data:xdata,
                        axisLabel: {
                            interval:0,
                            rotate:-20
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
                        name: '采购量',
                        type: 'line',
                        itemStyle: {
                            normal: {
                                color: '#e3b443'
                            }
                        },
                        data: sdata
                    }
                    ]
                };
                var option1 = {
                    title: {
                        text: '使用量'
                    },
                    tooltip: {},
                    legend: {},
                    xAxis: {
                        data:xdata,
                        axisLabel: {
                            interval:0,
                            rotate:-20
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
                        name: '采购量',
                        type: 'line',
                        itemStyle: {
                            normal: {
                                color: '#e3b443'
                            }
                        },
                        data: sdata
                    }
                    ]
                };
                myChart0.setOption(option0);
                myChart1.setOption(option1);
            }
            initChart();

//            按照单位名称查看具体的危化品元素是否含有剧毒
         /*    $(".comp-box section a").on("click",function () {
				var compid = $(this).attr("name");
				var compName = $(this).text();
				var htmlTable = "" , dangerTxt = "";
//				$.ajax({url:"",method:"post",dataType:"json",data:{"compid":compid},success:function (data) {
//                测试数据
				var data = [{"id":"id1","eleId":"idele001","eleName":"钠","isDanger":1},
                        {"id":"id2","eleId":"idele002","eleName":"钾","isDanger":0},
                        {"id":"id3","eleId":"idele003","eleName":"镁","isDanger":1},
					];
				    $(data).each(function(index , item){
                        item.isDanger == 1?dangerTxt ="是":dangerTxt = "否";
				        htmlTable +="<tr> <td name="+item.eleId+">"+item.eleName+"</td> <td name="+compid+">"+compName+"</td> <td>"+dangerTxt+"</td></tr>";
					});
//                }})

				$(".form-table table tbody").html(htmlTable);
            }) */
            
             $(".comp-box section a").on("click",function () {
				var compid = $(this).attr("id");
				var compName = $(this).text();
				$("#list tbody").html("");
				 for(var i = 0;i<purchase.length;i++){
						var name = null ;
						var ppoison= null ;
						var punit = null;
						var str= null;
						var sc = purchase[i].sc
						if(sc==compid){
							name = purchase[i].pname;
							ppoison = purchase[i].ppoison;
							punit = purchase[i].punit;
							pcompany = purchase[i].pcompany;
							str = "<tr>"+
							"<td name='"+name+"'>"+name+"</td>"+
							"<td name='"+sc+"'>"+punit+"</td>"+
							"<td>"+ppoison+"</td></tr>";
							$("#list tbody").append(str);
						}					
					}

            })
//			按照指定单位指定的危化品查看采购量和使用量
			$("body").on("click",".form-table tbody tr",function () {
			    $(this).addClass("tr-active").siblings("tr").removeClass("tr-active");
			    var eleId = $(this).children("td:eq(0)").attr("name");//危化品Id
			    var compId = $(this).children("td:eq(1)").attr("name");//水厂单位Id
				var buyAmount = [], useAmount = [] , recordDate = [];//采购，使用，日期
			    data(eleId,compId);
			    
//			    $.ajax({url:"",method:"post",dataType:"json",data:{"eleId":eleId,"compId":compId},success:function (data) {
//					测试数据
					/* var data = [{"id":"id1","eleId":"idele001","eleName":"钠","recordDate":"2017-03-01","buyAmount":120,"useAmount":80},
                        		{"id":"id2","eleId":"idele001","eleName":"钠","recordDate":"2017-01-11","buyAmount":220,"useAmount":180},
                        		{"id":"id3","eleId":"idele001","eleName":"钠","recordDate":"2017-01-21","buyAmount":150,"useAmount":80},
                        		{"id":"id3","eleId":"idele001","eleName":"钠","recordDate":"2017-02-01","buyAmount":350,"useAmount":90},
                        		{"id":"id4","eleId":"idele001","eleName":"钠","recordDate":"2017-02-11","buyAmount":410,"useAmount":48},
                        		{"id":"id5","eleId":"idele001","eleName":"钠","recordDate":"2017-02-21","buyAmount":150,"useAmount":140},
                        		{"id":"id6","eleId":"idele001","eleName":"钠","recordDate":"2017-03-21","buyAmount":450,"useAmount":180},
					];
			        $(data).each(function (index, item) {
			            buyAmount.push(item.buyAmount);
			            useAmount.push(item.useAmount);
                        recordDate.push(item.recordDate);
                    }) */
//                }})

//			


            })
            //封装数据(purchase,purpose)
            function data(eleId,compId){//危化品,水厂单位
		 	
		 		var buyAmount = [], useAmount = [] , useDate = [] , buyDate = [];//采购，使用，日期
		 		var j = 0;
		 		var k = 0;
	        	for(var i = 0;i<purchase.length;i++){
	        		var work = purchase[i].sc;
	        		var name = purchase[i].pname;
	        		if(work==compId&&name==eleId){
	        			
        				buyAmount[j] = purchase[i].pnum;
	        			buyDate[j] = purchase[i].pdate;
	        			j++;
	        		}	        			
	        	}
	        	
	        	for(var i = 0;i<purpose.length;i++){
	        		var work = purpose[i].sc;
	        		var name = purpose[i].pname;
	        		if(work==compId&&name==eleId){
	        			useAmount[k] = purpose[i].pnum;
	        			useDate[k] = purpose[i].pdate;
	        			k++;
	        		}
	        	}
	        	dopicture(buyAmount,useAmount,buyDate,useDate);
	        		
	
		    }
            
            function dopicture(buyAmount,useAmount,buyDate,useDate){
            		//指定图表的配置项和数据
                    option0 = {
                        title: {
                            text: '采购量'
                        },
                        tooltip: {},
                        legend: {},
                        xAxis: {
                            data:buyDate,
                        },
                        series: [{
                            type: 'line',
                            itemStyle: {
                                normal: {
                                    color: '#e3b443'
                                }
                            },
                            data: buyAmount
                        }
                        ]
                    };
                    option1 = {
                        title: {
                            text: '使用量'
                        },
                        tooltip: {},
                        legend: {},
                        xAxis: {
                            data:useDate,
                            axisLabel: {
                                interval:0,
                                rotate:-20
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
                            name: '使用量',
                            type: 'line',
                            itemStyle: {
                                normal: {
                                    color: '#e3b443'
                                }
                            },
                            data: useAmount
                        }
                        ]
                    };

                    // 使用刚指定的配置项和数据显示图表。
                    myChart0.setOption(option0);
                    myChart1.setOption(option1);
	
	
	}

</script>

	</body>
</html>
