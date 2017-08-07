<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title></title>
<link href="css/sampling car.css" rel="stylesheet" type="text/css">
<link href="css/Bootstrap font.css" rel="stylesheet" type="text/css"> 

<link href="jquery-easyui-1.5.1/themes/cupertino/easyui.css" rel="stylesheet" type="text/css">
<link href="jquery-easyui-1.5.1/themes/icon.css" rel="stylesheet" type="text/css">



<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.5.1/jquery.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.5.1/locale/easyui-lang-zh_CN.js"></script>
</head>
<script>
$(function(){
	$('#isearch').click(function(){
		$('#dg').datagrid('load',{
			searchCp :$("#tt").combotree("getValue"),
		    searchCon :$("#psdate").val(),
		    searchType : $("#pedate").val(),
		});		
	});
});
</script>

<script>
$(function(){
	var  add= '<%= session.getAttribute("role") %>';
	if(add=="jt"||add=="zs"){
		document.getElementById( "progress").style.display= "none"; 
	}else{
		document.getElementById( "progress").style.display=""; 	
	}
})
function excel(){
	var  add= '<%= session.getAttribute("报表统计") %>';
	 
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#excel').attr('href',add); 	
	}
}
function qyqx(){
	var  add= '<%= session.getAttribute("企业信息") %>';
	 
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#qy').attr('href',add); 	
	}
}
function whqx(){
	var  add= '<%= session.getAttribute("危化品MSDS") %>';
	 
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#wh').attr('href',add); 	
	}
}
function cgqx(){
	var  add= '<%= session.getAttribute("采购") %>';
	 
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#cg').attr('href',add); 	
	}
}
function syqx(){
	var  add= '<%= session.getAttribute("使用") %>';
	 
	if(add=="null"){
		alert("没有权限")
	}else{
		$('#sy').attr('href',add); 	
	}
}
function ysqx(){
	var  add= '<%= session.getAttribute("运输") %>';
	 
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#ys').attr('href',add); 	
	}
}
function kcqx(){
	var  add= '<%= session.getAttribute("库存") %>';
	 
	if(add=="null"){
		alert("没有权限")
	}else{
		$('#kc').attr('href',add); 	
	}
}
function fqwczqx(){
	var  add= '<%= session.getAttribute("废弃物处置") %>';
	 
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#fqwcz').attr('href',add); 	
	}
}
function rkqx(){
	var  add= '<%= session.getAttribute("入库查询") %>';
	 
	if(add=="null"){
		alert("没有权限")
	}else{
		$('#rk').attr('href',add); 	
	}
}
function ckqx(){
	var  add= '<%= session.getAttribute("出库查询") %>';
	 
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#ck').attr('href',add); 	
	}
}
function kccxqx(){
	var  add= '<%= session.getAttribute("库存查询") %>';
	 
	if(add=="null"){
		alert("没有权限")
	}else{
		$('#kccx').attr('href',add); 	
	}
}
function yscxqx(){
	var  add= '<%= session.getAttribute("运输信息查询") %>';
	 
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#yscx').attr('href',add); 	
	}
}
function fqwqx(){
	var  add= '<%= session.getAttribute("废弃物处置查询") %>';
	 
	if(add=="null"){
		alert("没有权限")
	}else{
		$('#fqwcx').attr('href',add); 	
	}
}
function yjyaqx(){
	var  add= '<%= session.getAttribute("应急预案") %>';
	 
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#yjya').attr('href',add); 	
	}
}
function qypmtqx(){
	var  add= '<%= session.getAttribute("企业平面图") %>';
	 
	if(add=="null"){
		alert("没有权限")
	}else{
		$('#qypmt').attr('href',add); 	
	}
}
function jssmqx(){
	var  add= '<%= session.getAttribute("技术说明") %>';
	 
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#jssm').attr('href',add); 	
	}
}
function yhglqx(){
	var  add= '<%= session.getAttribute("用户管理") %>';
	 
	if(add=="null"){
		alert("没有权限")
	}else{
		$('#yhsz').attr('href',add); 	
	}
}
function qxfpqx(){
	var  add= '<%= session.getAttribute("权限分配") %>';
	 
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#qxfp').attr('href',add); 	
	}
}
function rzglqx(){
	var  add= '<%= session.getAttribute("日志管理") %>';
	 
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#rzgl').attr('href',add); 	
	}
}


   

</script>
<body>
<div class="bg">
 <div class="toparticle">
    	    <div class=" middle">危化品管理系统</div>
            <div class="use">
            	<a href="###"><img src="image/click_1.png"><span class="icon-user">&nbsp;${loginName}</span></a>
            	<a href="main.jsp"><img src="image/click_2.png"></a>
            	<a href="Login.jsp"><img src="image/click_3.png"></a>
            </div>
    </div>
   <aside class="main-sidebar">
                <section  class="sidebar">
                    <ul class="sidebar-menu">
                        <li class="header">系统列表</li>
                        <li class="treeview" >
                            <a href="#">
                                <i class="icon-home"></i> 
                                <span>基础信息</span></i>
                            </a>
                            <ul class="treeview-menu" style="display: none;">
                                <li><a id="qy" href="" onclick="qyqx()">企业信息</a></li>
                                <li><a id="wh" href="" onclick="whqx()">危化品MSDS</a></li><!-- dangerproduct.jsp -->
                            </ul>
                        </li>
                        <li class="treeview"  id="progress">
                            <a href="#">
                                <i class="icon-exchange"></i>
                                <span>流程管理</span>
                            </a>
                            <ul class="treeview-menu" style="display: none;">
                                <li><a id="cg" href="" onclick="cgqx()" >采购</a></li>
                                <li><a id="sy" href="" onclick="syqx()">使用</a></li>
                                <li><a id="ys" href="" onclick="ysqx()">运输</a></li>
                                <li><a id="kc" href="" onclick="kcqx()">库存</a></li>
                                <li><a id="fqwcz" href="" onclick="fqwczqx()">废弃物处置</a></li>
                            </ul>
                        </li>
                        <li>
                           <a id="excel" href="" onclick="excel()">
                                <i class="icon-signal"></i> <span>报表统计</span>
                            </a>
                        </li>
                        <li class="treeview">
                            <a href="#">
                                <i class="icon-folder"></i>
                                <span>信息汇总</span>
                            </a>
                            <ul class="treeview-menu"  style="display: block;">
                                <li><a id="rk" href="" onclick="rkqx()">入库查询</a></li>
                                <li><a id="ck" href="" onclick="ckqx()">出库查询</a></li>
                                <li><a id="kccx" href="" onclick="kccxqx()">库存查询</a></li>
                                <li><a id="yscx" href="" onclick="yscxqx()">运输查询</a></li>
                                <li><a id="fqwcx" href="" onclick="fqwqx()">废弃物处置查询</a></li>
                            </ul>
                        </li>
                        <li class="treeview">
                            <a href="#">
                                <i class="icon-medkit"></i>
                                <span>应急处理</span>
                            </a>
                            <ul class="treeview-menu"  style="display: none;">
                                <li><a id="yjya" href="" onclick="yjyaqx()">应急预案</a></li>
                           
                                 <li><a id="flfg" href="rule.jsp" onclick="">法律法规</a></li>
                            </ul>
                        </li>
                        <li class="treeview">
                            <a href="#">
                                <i class="icon-cogs"></i>
                                <span>系统管理</span>
                            </a>
                            <ul class="treeview-menu"  style="display: none;">
                                <li><a id="yhsz" href="" onclick="yhglqx()">用户设置</a></li>
                                <li><a id="klgg" href="password.jsp" >口令更改</a></li>
                                 <li><a id="qxfp" href="" onclick="qxfpqx()">权限分配</a></li>
                                <li><a id="rzgl" href="" onclick="rzglqx()">日志管理</a></li>
                            </ul>
                        </li>
                        
                    </ul>
                </section>
    </aside>
    <ul class="bread">
      <li><a href="{:U('Index/info')}"  class="icon-home"> 首页</a></li>
      <li><a href="##" id="a_leader_txt">出库查询</a></li>
    </ul>
    
    <section class="list_data"">
			<table id="dg" title="" class="easyui-datagrid" border="0" cellspacing="0" style="width:88%;text-align: center;"
					data-options="toolbar:'#toolbar',pagination:true,singleSelect:true,
                        url:'Purpose_searchPurchase.action',pageSize:10,pageList:[10,20,30]">
					<thead>
						<tr>
							<th field="pname" align="center"    width="20%">危化物</th>
							<th field="pcompany" align="center"  width="20%">公司</th>				
							<th field="pdate"  align="center" width="20%">出库日期</th>
							<th field="pnum"  align="center" width="20%">领用量</th>
							<th field="punit"  align="center" width="20%">单位</th>
							<th field="pperson"  align="center" width="20%">领用人</th>
														<th field="pr" align="center"  width="11%">记录人</th>
							
							
						</tr>
					</thead>
				</table>
				<div id="toolbar">
				    <div class="content">
				  企业:	<!-- <input name="pcompany" id="pcompany" class="easyui-combobox"  data-options="  
    valueField:'cname' , textField:'cname', loader : select, mode : 'remote'    
"  style="margin-left:10px;"> -->
				   			<select multiple  class="easyui-combotree" checkbox="true"  id="tt" name="tt" data-options="url:'Tree_treeRole.action',cascadeCheck:false,lines:true" style="margin-left:25px;width:180px"></select >

							   	起始时间:
							   				<input name="psdate" id="psdate" class="easyui-datebox" validType="true" style="margin-left:10px;">
							   	结束时间:
							   				<input name="pedate" id="pedate" class="easyui-datebox" validType="true" style="margin-left:10px;">
							   	 <a class="easyui-linkbutton"  id="isearch" >查询</a>
				    </div>		    
				</div>
    </section>
</div>

    <script src="js/sidebar-menu.js"></script>
    <script>
        $.sidebarMenu($('.sidebar-menu'))
    </script>
     <script>
    //自动提示
var select = function (param, success, error) {  
    var q = param.q || "";  
    if (q.length <= 0) {  
        console.log("q.length <= 0--------------"+q);  
        return false;  
    }  
    $.ajax({  
        url: "company_selectCp.action",  
        type: "post",  
        data: {"param": q},//后台使用param这个变量接收传值的，后台用了struts、spring后面就不拓展说明了  
        dataType: "json",  
        success: function (data) {  
            //console.log("i am in success-->" + data);返回的是数组对象data  
            var items = $.each(data, function(value){ 
            	console.log(value)
                return value; //遍历数组中的值  
            });
            success(items);//调用loader的success方法，将items添加到下拉框中,这里是难点啊，之前后台已经返回数据了，但就是不添加到下拉框  
        }  
    });  
}  
</script>
    
<script>


 


</script>

</body>
</html>