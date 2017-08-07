<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>

</head>
<link href="jquery-easyui-1.5.1/themes/cupertino/easyui.css" rel="stylesheet" type="text/css">
<link href="jquery-easyui-1.5.1/themes/icon.css" rel="stylesheet" type="text/css">
<link href="css/sampling car.css" rel="stylesheet" type="text/css">
<link href="css/Bootstrap font.css" rel="stylesheet" type="text/css"> 



<!-- <link href="jquery-easyui-1.5.1/demo/demo.css" rel="stylesheet" type="text/css"> -->


<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.5.1/jquery.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.5.1/locale/easyui-lang-zh_CN.js"></script>


<script>
$(function(){
	var  add= '<%= session.getAttribute("role") %>';
	if(add=="jt"||add=="zs"){
		document.getElementById( "progress").style.display= "none"; 
	}else{
		document.getElementById( "progress").style.display=""; 	
	}
})
<%-- $(function(){
	var  add= '<%= session.getAttribute("role") %>';
	if(add=="jt"||add=="zs"){
		document.getElementById( "progress").style.display= "none";	
	}
	$('#dg').datagrid({
		url:'company_selectCompany.action',
		pagination:true,
		singleSelect:true,
		pageSize:10,
		pageList:[10,20,30],
		columns:[[
			{title:'公司',field:"pid",width:'15%',align:'center'},
			{title:'水厂',field:"cname",width:'17%',align:'center'},
			{title:'地址',field:"caddress",width:'17%',align:'center'},
			{title:'电话',field:"ctel",width:'17%',align:'center'},
			{title:'紧急联系人',field:"emergencyPerson",width:'17%',align:'center'},
			{title:'紧急联系人电话',field:"emergencyCalls",width:'17%',align:'center'},
			 /* {title:'水厂列表',field:"#",width:'15%',align:'center', formatter:function(value,row,index){
				var lookup = "" ;					
				lookup = '<button onclick="showDivFuns(\''+row.cid+'\')">&nbsp;&nbsp;&nbsp;&nbsp;水厂&nbsp;&nbsp;&nbsp;</button>';	
				return lookup;									
			} },  */
		]],onLoadSuccess:function(data){
			var indexs;//第几行开始合并
			let htypep = [];	
			let htype = [];//类型集合 
			for(var i = 0;i<data.rows.length;i++){
				var HazardousChemicals = data.rows[i];
				htype[i] = HazardousChemicals.pid;
			}
			for(var i = 0;i<data.rows.length;i++){
				var HazardousChemicals = data.rows[i];
				htypep[i] = HazardousChemicals.pid;
			}
			$.unique(htype);//去重复
			 for(var i = 0;i<htype.length;i++){
				 var num = 0;//合并几行
				for(var j = 0;j<data.rows.length;j++){
					var HazardousChemicals = data.rows[j];
					htypes = HazardousChemicals.pid;
					if(htype[i]==htypes){		
						num +=1;
					}
					indexs =j; 
				}		
				var a = htypep.indexOf(htype[i]);//获取元素在数组中第一次出现的位置
				rows(htypep.indexOf(htype[i]),num)
			} 
		} 
	});
})
function rows(index,rowspan){	
	$('#dg').datagrid('mergeCells',{
		index:index,
		field:'pid',
		rowspan:rowspan
	}); 
}

//弹出调用的方法,集团
function showDivFuns(value){
	$("#popDiv").dialog('open')
	$('#dc').datagrid({
		url:'company_selectId.action?Cid='+value,			
		pagination:true,
		singleSelect:true,
		pageSize:10,
		pageList:[10,20,30],
		columns:[[
			{title:'企业名称',field:"cname",width:'20%',align:'center'},
			{title:'地址',field:"caddress",width:'20%',align:'center'},
			{title:'电话',field:"ctel",width:'20%',align:'center'},
			{title:'紧急联系人',field:"emergencyPerson",width:'20%',align:'center'},
			{title:'紧急联系人电话',field:"emergencyCalls",width:'20%',align:'center'},
		]]
	});
	
	var div = document.getElementById('popDiv');
	div.style.display='block';

}
//关闭事件
function closeDivFun(){
    document.getElementById('popDiv').style.display='none';
} --%>

$(function(){
	var  add= '<%= session.getAttribute("role") %>';
	if(add=="jt"){
		
		$('#dg').datagrid({
			url:'company_selectCompany.action',
			pagination:true,
			singleSelect:true,
			pageSize:10,
			pageList:[10,20,30],
			columns:[[
				{title:'公司',field:"cname",width:'17%',align:'center'},
				{title:'地址',field:"caddress",width:'17%',align:'center'},
				{title:'电话',field:"ctel",width:'17%',align:'center'},
				{title:'紧急联系人',field:"emergencyPerson",width:'17%',align:'center'},
				{title:'紧急联系人电话',field:"emergencyCalls",width:'17%',align:'center'},
				{title:'下属单位',field:"#",width:'17%',align:'center', formatter:function(value,row,index){			
					row = JSON.stringify(row);
					rows = JSON.parse(row);
					console.log(rows);
					var lookup = "" ;
					lookup = '<a class="easyui-linkbutton l-btn"  onclick="showDivFuns(\''+rows.cid+'\')">下属单位</a>';
					return lookup;							
				}},
			]]
		});
	}if(add=="zs"){
		$('#dg').datagrid({
			url:'company_selectCompany.action',
			pagination:true,
			singleSelect:true,
			pageSize:10,
			pageList:[10,20,30],
			columns:[[
				
				{title:'单位',field:"cname",width:'17%',align:'center'},
				{title:'地址',field:"caddress",width:'17%',align:'center'},
				{title:'电话',field:"ctel",width:'17%',align:'center'},
				{title:'紧急联系人',field:"emergencyPerson",width:'17%',align:'center'},
				{title:'紧急联系人电话',field:"emergencyCalls",width:'17%',align:'center'},
			]]
		});
	}if(add=="sc"){
		$('#dg').datagrid({
			url:'company_selectCompany.action',
			pagination:true,
			singleSelect:true,
			pageSize:10,
			pageList:[10,20,30],
			columns:[[
				{title:'单位',field:"cname",width:'17%',align:'center'},
				{title:'地址',field:"caddress",width:'17%',align:'center'},
				{title:'电话',field:"ctel",width:'17%',align:'center'},
				{title:'紧急联系人',field:"emergencyPerson",width:'17%',align:'center'},
				{title:'紧急联系人电话',field:"emergencyCalls",width:'17%',align:'center'},
			]]
		});
	}
})



//弹出调用的方法,集团
function showDivFuns(value){
	$("#popDiv").dialog('open')
	
	$('#dc').datagrid({
		url:'company_selectScCompany.action?cid='+value,			
		pagination:true,
		singleSelect:true,
		pageSize:10,
		pageList:[10,20,30],
		columns:[[
			{title:'单位',field:"cname",width:'17%',align:'center'},
			{title:'地址',field:"caddress",width:'17%',align:'center'},
			{title:'电话',field:"ctel",width:'17%',align:'center'},
			{title:'紧急联系人',field:"emergencyPerson",width:'17%',align:'center'},
			{title:'紧急联系人电话',field:"emergencyCalls",width:'17%',align:'center'},
		]]
	});
	
	console.log("picture------------"+$('#dc'))
	var div = document.getElementById('popDiv');
	div.style.display='block';

}
//弹出调用的方法
function showDivFun(value){
	$("#popDiv").dialog('open')
	var str = value.split(',');
	var sname = str[0];
	var sdate = str[1];
	var swork = str[2]
	var flax = str[3];
	$('#dc').datagrid({
		url:'Storage_selectdetail.action?sname='+encodeURI(encodeURI(sname))+'&sdate='+encodeURI(encodeURI(sdate))+'&swork='+swork+'&flax='+flax,			
		pagination:true,
		singleSelect:true,
		pageSize:10,
		pageList:[10,20,30],
		columns:[[
			{title:'公司',field:"swork",width:'15%',align:'center'},
			{title:'总量',field:"sall",width:'10%',align:'center'},
			{title:'当月购入量',field:"smonth",width:'10%',align:'center'},
			{title:'上月剩余量',field:"sbeforeSurplus",width:'10%',align:'center'},
			{title:'单位',field:"sunit",width:'10%',align:'center'},
			{title:'使用量',field:"sapply",width:'10%',align:'center'},
			{title:'月份',field:"sdate",width:'13%',align:'center'},
			{title:'使用场合',field:"sother",width:'10%',align:'center'},
			{title:'库位',field:"sposition",width:'10%',align:'center', formatter:function(value,row,index){
				row = JSON.stringify(row);
				console.log(row);
				var lookup = "<a href='#'  data-param ='"+row+"' onclick='show(this)'>查看</a>";
				//var lookup = window.open ('picture.jsp?row='+row, '_blank', 'height=100, width=400, top=0, left=0, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=n o, status=no') 			
				return lookup;
			}},
		]]
	});
	
	console.log("picture------------"+$('#dc'))
	var div = document.getElementById('popDiv');
	div.style.display='block';

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
function excel(){
	var  add= '<%= session.getAttribute("报表统计") %>';
	 
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#excel').attr('href',add); 	
	}
}


   

</script>


<body >
<div class="bg" >
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
                            <ul class="treeview-menu" style="display: block;">
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
                            <ul class="treeview-menu"  style="display: none;">
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
      <li><a href="main.jsp"  class="icon-home"> 首页</a></li>
      <li><a href="##" id="a_leader_txt">企业信息</a></li>
    </ul>
    
    <section class="list_data">
			<!-- <table id="dg" title="" class="easyui-datagrid" border="0" cellspacing="0" rownumbers="true" style="width:88%;text-align: center;"
					data-options="toolbar:'#toolbar',pagination:true,singleSelect:true,
                        url:'company_selectCompany.action',pageSize:10,pageList:[10,20,30]">
					<thead>
						<tr>
							<th field="id" align="center"     width="10%">序号</th>
							<th field="cname" align="center"    width="15%">企业名称</th>
							<th field="caddress" align="center"  width="15%">地址</th>
							<th field="ctel" align="center"  width="15%">电话</th>
							<th field="emergencyPerson" align="center"  width="15%">紧急联系人</th>
							<th field="emergencyCalls" align="center"    width="15%">紧急联系人电话</th>
							
						</tr>
					</thead>
				</table> -->
				
				<div id="toolbar">
	<!-- <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">添加</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">修改</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">删除</a> -->
	<table id="dg" title="" class="easyui-datagrid" border="0" cellspacing="1" style="width:88%;text-align: center;"></table>
</div>
    </section>
   <div style="display: none;">
    <div id="dlg" class="easyui-dialog" style="width:400px;height:380px;padding:10px 20px" align="center"
		closed="true" buttons="#dlg-buttons">
	<div class="ftitle" style="text-align: center;font-size: 14px;margin-bottom: 10px;">企业信息</div>
	<form id="fm" method="post">
		<div class="fitem">
			<input name="id" class="easyui-validatebox" hidden="true" >
		</div>
		<div class="fitem">
			<label>企业名称</label>
			<input name="cname" class="easyui-validatebox" required="true" style="margin-left:5px;">
		</div><br>
		<div class="fitem">
			<label>地址</label>
			<input name="caddress" class="easyui-validatebox" required="true" style="margin-left:25px;">
		</div><br>
		<div class="fitem">
			<label>电话</label>
			<input name="ctel" class="easyui-validatebox" required="true" style="margin-left:25px;">
		</div><br>
		<div class="fitem">
			<label>紧急联系人</label>
			<input name="emergencyPerson" class="easyui-validatebox" required="true" style="margin-left:0px;">
		</div><br>
		<div class="fitem">
			<label>紧急电话</label>
			<input name="emergencyCalls" class="easyui-validatebox" validType="true" style="margin-left:5px;">
		</div><br>
	</form>
</div>

<div id="dlg-buttons">
	<a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveCompany()">保存</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">关闭</a>
</div>




    <script src="js/sidebar-menu.js"></script>
    <script>
        $.sidebarMenu($('.sidebar-menu'))
    </script> 
    <div id="popDiv" class="easyui-window" center closed="true" title="下属单位" fit="false" shadow="false" style="width:80%;;padding:5px;display:none;">
    <table id="dc"  title="" class="easyui-datagrid" border="0" align="center"  cellspacing="0" style="width:88%;text-align: center;align:center;"></table>
</div>
<script>

//新用户
function newUser(){
	var  add= '<%= session.getAttribute("添加企业信息") %>';
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#dlg').dialog('open').dialog('setTitle','添加企业信息');
		$('#fm').form('clear');	}
	
}
//更新
function editUser(){
	var  add= '<%= session.getAttribute("编辑企业信息") %>';
	
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		var row = $('#dg').datagrid('getSelected');
		if (row){
			$('#dlg').dialog('open').dialog('setTitle','更新企业信息');
			$('#fm').form('load',row);
		}	
		}
	
}
//保存用户
function saveCompany(){
	$('#fm').form('submit',{
		url: "company_saveCompany.action",
		onSubmit: function(){
			return $(this).form('validate');
		},
		success: function(result){
		//	var result = eval('('+result+')');
		//	if (result.success){
		//		$('#dlg').dialog('close');		
	//			$('#dg').datagrid('reload');
		//	} else {
			//	$.messager.show({
			//		title: '<p style="color:red">错误</p>',
			//		msg: result.msg
			//	});
			//}
			$('#dlg').dialog('close');
			$('#dg').datagrid('reload');
		}
	});
}
//删除用户
function destroyUser(){
	
	var  add= '<%= session.getAttribute("删除企业信息") %>';
	
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		var row = $('#dg').datagrid('getSelected');
		
		if (row){
			$.messager.confirm('Confirm','是否删除企业？',function(r){
				if (r){
					$.post(add,{id:row.id},function(result){
						/* if (result.success){
							$('#dg').datagrid('reload');	// reload the user data
						} else {
							$.messager.show({	// show error message
								title: 'Error',
								msg: result.errorMsg
							});
						} */
						$('#dg').datagrid('reload');
					},'json');
				}
			});
		}
	}
}

</script>

</body>
</html>