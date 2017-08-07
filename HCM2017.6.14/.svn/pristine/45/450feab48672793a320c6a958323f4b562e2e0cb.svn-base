<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Hotspotter - Cool Hotspot Maker jQuery Plugin</title>
    <link rel="stylesheet" type="text/css" href="css/demos.min.css" />
    <!--[if lt IE 9]><link rel="stylesheet" type="text/css" href="css/demos-ie7-8.min.css" /><![endif]-->
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="css/jquery-hotspotter-1.7.7.min.css" />
    <!--[if lt IE 9]><link rel="stylesheet" type="text/css" href="css/ie7-8.min.css" /><![endif]-->
    <link rel="stylesheet" type="text/css" href="Editor/css/ui-darkness/jquery-ui-1.9.2.custom.min.css" />
    <style type="text/css">
#try-editor a {
	color: #DD0000;
	font-weight: bold;
}
</style>
    <script src="libs/jquery/1.8.3/jquery.min.js"></script>
    <script src="libs/jqueryui/1.9.2/jquery-ui.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/jquery-hotspotter-1.7.7.min.js"></script>
    <script type="text/javascript">    
        $(document).ready(function () {
        	 
        	var s1 = "125,50,0";//南市水厂
        	var s2 = "75,70,0";//青草沙水厂
        	var s3 = "85,85,0";//白龙港
        	var row = getQueryString("row");
        	row = JSON.parse(row);
        	var url = "image/"+row.simg;
        	var sc = row.sc;
        	 if(sc=="22"){
        		$("#hotpoint").attr("data-dim",s1);
        	}
        	if(sc=="11"){
        		$("#hotpoint").attr("data-dim",s2);
        	}
        	if(sc=="27"){
        		$("#hotpoint").attr("data-dim",s3);
        	} 
        	$("#pic").attr("src",url);
        	$("#hotpoint").attr("data-coord",row.spoint);
        	var spoint = row.spoint;
        	var point = spoint.split(',')
        	if(point[0]*1>400){
        		$(".tip-tooltip").attr("data-dir",'left');
        	}
        	if(point[0]*1<200){
        		$(".tip-tooltip").attr("data-dir",'right');
        	}
        	var sname = row.sname;
        	var sall = row.sall;
        	var sapply = row.sapply;
        	var sbeforeSurplus = row.sbeforeSurplus;
        	var sdate = row.sdate;
        	var smonth = row.smonth;
        	var snum = row.snum;
        	var stotal = row.stotal;
        	var swork = row.swork;
        	var sunit = row.sunit;
        	
        
        	$("#sname").append(sname);
        	$("#sall").append(sall);

        	$("#sapply").append(sunit);
        	$("#sbeforeSurplus").append(sbeforeSurplus);
        	$("#smonth").append(smonth);
        	$("#snum").append(snum);
        	$("#swork").append(swork);
        

        	
        	
              	
            $('.hs-area').hotspotter({ imgTopMargin: 50 });
            $('#resize').resizable({
                aspectRatio: true,
                stop: function () {
                    $(this).hotspotter();
                }
            });

            $('#control-btns').bind('mouseover', function (e) {
                if (e.target.tagName == 'BUTTON') {
                    $('#' + $(e.target).text()).hotspotter('trigger');
                }
            });
            $('#control-btns').bind('mouseout', function (e) {
                if (e.target.tagName == 'BUTTON') {
                    $('#' + $(e.target).text()).hotspotter('untrigger');
                }
            });
            $('#show-btn').bind('click', function () {
                $('#controlled-area').hotspotter("show");
            });
            $('#hide-btn').bind('click', function () {
                $('#controlled-area').hotspotter("hide");
            });
        });
        
        function getQueryString(name){ //获取url 中的参数
        	var reg = new RegExp('(^|&)' + name + '=([^&]*)(&|$)', 'i');
            var r = window.location.search.substr(1).match(reg);
            if(r!=null){
            	return decodeURIComponent(r[2]);//decodeURIComponent  unescape
            }
            return null;	
        }
        
       /*  function getUrlParam(key){
            // 获取参数
            var url = window.location.search;
            // 正则筛选地址栏
            var reg = new RegExp("(^|&)"+ key +"=([^&]*)(&|$)");
            // 匹配目标参数
            var result = url.substr(1).match(reg);
            //返回参数值
            return result ? decodeURIComponent(result[2]) : null;
        }
        
        function getQueryString(name) { 
        	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
        	var r = window.location.search.substr(1).match(reg); 
        	if (r != null) return unescape(r[2]); return null; 
        	}  */

    </script>
    </head>
    
<script>
    $(function(){
    	var  add= '<%= session.getAttribute("role") %>';
    	if(add=="jt"||add=="zs"){
    		document.getElementById( "progress").style.display= "none"; 
    	}else{
    		document.getElementById( "progress").style.display=""; 	
    	}
    })

   

</script>
    <body>

<section id="responsive_fluid">
      <div id="responsive-fluid-container">
    <div class="hs-area" id="resize"> <img id="pic" data-imgdim="640,480" src="" style="width: 100%;">
          <div class="hs-wrap">
        <div id="hotpoint" data-activeon="hover" data-dim="" data-coord="" class="shadow-spot"></div>
        <div class="tt-wrap" style="z-index: 1050;">
              <div data-dir="" data-pos="10" data-anim="goin" class="tip-tooltip">
            <div style="height:205px;width:425px;"> 
                  <p style="margin:0" align="center" id="sname"><strong>${row.sname}</strong><strong style="color: #007e32"></strong></p>
                  <table width="200" border="1" align="center" id="data">
                <tr>
                      <th scope="row">&nbsp;公司</th>
                      <td id="swork">&nbsp;${row.sapply}</td>
                     
                    </tr>
                
                <tr>
                      <th scope="row" >&nbsp;危化物编码</th>
                      <td id="snum">${row.snum}</td>
                      
                    </tr>
                <tr>
                      <th scope="row">&nbsp;总量</th>
                      <td id="sall">&nbsp;${row.sall}</td>
                      
                    </tr>
                    
                <tr>
                      <th scope="row">&nbsp;上月剩余量</th>
                      <td id="sbeforeSurplus">&nbsp;${row.sbeforeSurplus}</td>
                      
                    </tr>
                <tr>
                      <th scope="row">&nbsp;本月采购量</th>
                      <td id="smonth">&nbsp;${row.smonth}</td>
                      
                    </tr>
                    <tr>
                      <th scope="row">&nbsp;单位</th>
                      <td id="sapply">&nbsp;${row.sunit}</td>
                     
                    </tr>
                   <%--  <tr>
                      <th scope="row">&nbsp;总量</th>
                      <td>&nbsp;${row.smonth}</td>
                      <td>&nbsp;</td>
                    </tr>
                    <tr>
                      <th scope="row">&nbsp;总量</th>
                      <td>&nbsp;${row.smonth}</td>
                      <td>&nbsp;</td>
                    </tr>
                    <tr>
                      <th scope="row">&nbsp;总量</th>
                      <td>&nbsp;${row.smonth}</td>
                      <td>&nbsp;</td>
                    </tr> --%>
              </table>
                </div>
          </div>
            </div>
      </div>
        </div>
  </div>
    </section>
</body>
</html>
