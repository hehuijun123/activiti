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

<!-- <link href="jquery-easyui-1.5.1/demo/demo.css" rel="stylesheet" type="text/css"> -->


<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>

<script type="text/javascript" src="jquery-easyui-1.5.1/jquery.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="js/ajaxfileupload.js"></script>

<script type="text/javascript" src="jquery-easyui-1.5.1/locale/easyui-lang-zh_CN.js"></script>

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


$(function(){
	var  add= '<%= session.getAttribute("role") %>';
	if(add=="jt"||add=="zs"){
		document.getElementById( "progress").style.display= "none";	
	}
	
	var mycars=new Array("1","2","3","4","5","6","7")
	if(add=="jt"){
		$('#dg').datagrid({
			url:'Emergency_jt.action',
			pagination:true,
			singleSelect:true,
			pageSize:10,
			pageList:[10,20,30],
			columns:[[			
				{title:'应急预案',field:"escheme",width:'15%',align:'center'},
				{title:'上传日期',field:"edate",width:'17%',align:'center'},
				{title:'上传人',field:"eperson",width:'17%',align:'center'},
				{title:'紧急联系人电话',field:"emergencyCalls",width:'17%',align:'center'},
			]]
		});
		$('#db').datagrid({
			url:'Emergency_zs.action',
			pagination:true,
			singleSelect:true,
			pageSize:10,
			pageList:[10,20,30],
			columns:[[			
				{title:'公司',field:"name",width:'15%',align:'center'},
				{title:'查看',field:"id",width:'15%',align:'center', formatter:function(value,row,index){				
					var lookup = "" ;			
					
						lookup = '<button onclick="showDivFuns(\''+row.id+'\')">&nbsp;&nbsp;&nbsp;&nbsp;下属单位&nbsp;&nbsp;&nbsp;</button>';
					
					/* if($.inArray(row.ework, mycars)>=0){
					} */
						
					return lookup;									
				} },  
			]]
		});
	}else{
		$('#dg').datagrid({
			url:'Emergency_selectEmergency.action',
			pagination:true,
			singleSelect:true,
			pageSize:10,
			pageList:[10,20,30],
			columns:[[			
				{title:'应急预案',field:"escheme",width:'15%',align:'center'},
				{title:'上传日期',field:"edate",width:'17%',align:'center'},
				{title:'上传人',field:"eperson",width:'17%',align:'center'},
				{title:'紧急联系人电话',field:"emergencyCalls",width:'17%',align:'center'},
			]]
		});
	}
	
})


//弹出调用的方法,集团
function showDivFuns(value){
	$("#popDiv").dialog('open')
	
	$('#dc').datagrid({
		url:'Emergency_sc.action?id='+value,			
		pagination:true,
		singleSelect:true,
		pageSize:10,
		pageList:[10,20,30],
		columns:[[
			{title:'单位',field:"name",width:'15%',align:'center'},
			{title:'查看',field:"id",width:'15%',align:'center', formatter:function(value,row,index){				
				var lookup = "" ;			
				
					lookup = '<button onclick="showDivFun(\''+row.id+'\')">&nbsp;&nbsp;&nbsp;&nbsp;应急预案&nbsp;&nbsp;&nbsp;</button>';
				
				/* if($.inArray(row.ework, mycars)>=0){
				} */
					
				return lookup;									
			} },  
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
		url:'Emergency_groupCompany.action?id='+value,	
		pagination:true,
		singleSelect:true,
		pageSize:10,
		pageList:[10,20,30],
		columns:[[			
					{title:'应急预案',field:"escheme",width:'15%',align:'center'},
					{title:'上传日期',field:"edate",width:'17%',align:'center'},
					{title:'上传人',field:"eperson",width:'17%',align:'center'},
					{title:'紧急联系人电话',field:"emergencyCalls",width:'17%',align:'center'},
				]]
	});
	
	console.log("picture------------"+$('#dc'))
	var div = document.getElementById('popDiv');
	div.style.display='block';

}
//关闭事件
function closeDivFun(){
    document.getElementById('popDiv').style.display='none';
}


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
                            <ul class="treeview-menu"  style="display: block;">
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
      <li><a href="##" id="a_leader_txt">应急预案</a></li>
    </ul>
    
    <section class="list_data">
			<!-- <table id="dg" title="" class="easyui-datagrid" border="0" cellspacing="0" style="width:88%;text-align: center;"
					data-options="toolbar:'#toolbar',pagination:true,singleSelect:true,
                        url:'Emergency_selectEmergency.action?flax=Escheme',pageSize:10,pageList:[10,20,30]">
					<thead>
						<tr>
							<th field="escheme" align="center"    width="30%">应急方案</th>
							<th field="edate"  align="center"    width="30%">上传日期</th>
							<th field="eperson" align="center"     width="30%">上传人</th>
							
							
							
						</tr>
					</thead>
				</table> -->
				<div id="toolbar">
	<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">添加</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true"  onclick="downUser()">下载</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">删除</a>
	
		<table id="dg" title="" class="easyui-datagrid" border="0" cellspacing="1" style="width:88%;text-align: center;"></table>
			<br><br>
			<table id="db" title="" class="easyui-datagrid" border="0" cellspacing="1" style="width:88%;text-align: center;"></table>
	
</div>
    </section>
   <div style="display: none;">  
    <div id="dlg" class="easyui-dialog" style="width:400px;height:380px;padding:10px 20px" align="center"
		closed="true" buttons="#dlg-buttons">
	<div class="ftitle" style="text-align: center;font-size: 14px;margin-bottom: 10px;">应急预案</div>
	<form id="fm" method="" enctype="multipart/form-data">
		<div class="fitem">
			<input name="id" class="easyui-validatebox" hidden="true" >
		</div>
		<div class="fitem">
			<label>文件</label>
			<input  type="file" name="file"  data-options="prompt:'选择文件'" id="escheme" style="margin-left:100px;"/>  
		</div><br>
	</form>
</div>
<div id="dlg-buttons">
	<a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveCompany()">保存</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">关闭</a>
</div>
</div>

    <div id="popDiv" class="easyui-window" center closed="true" title="水厂" fit="false" shadow="false" style="width:80%;;padding:5px;display:none;">
    <table id="dc"  title="" class="easyui-datagrid" border="0" align="center"  cellspacing="0" style="width:100%;text-align: center;align:center;"></table>
</div>
    <script src="js/sidebar-menu.js"></script>
    <script>
        $.sidebarMenu($('.sidebar-menu'))
    </script> 
<script>

//新用户
function newUser(){
	var  add= '<%= session.getAttribute("添加应急预案") %>';
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#dlg').dialog('open').dialog('setTitle','添加应急预案');
		$('#fm').form('clear');	}
}
//更新
function editUser(){
var  add= '<%= session.getAttribute("编辑应急预案") %>';
	
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		var row = $('#dg').datagrid('getSelected');
		if (row){
			$('#dlg').dialog('open').dialog('setTitle','编辑应急预案');
			$('#fm').form('load',row);
		}	
		}
}

//下载文件
function downUser(){
	var row = $('#dg').datagrid('getSelected');
	var flax = "1";
	window.location.href='Emergency_downloadFile.action?id='+row.id+'&flax='+flax;
	//'work_downloadFile.action?downloadFilePath="+filePaths[i]+"'
	/* if (row){
		$.messager.confirm('Confirm','是否下载当前文件？',function(r){
			if (r){
				$.post('Emergency_downloadFile.action',{id:row.id,flax:"1"},function(result){
					 if (result.success){
						$('#dg').datagrid('reload');	// reload the user data
					} else {
						$.messager.show({	// show error message
							title: 'Error',
							msg: result.errorMsg
						});
					} 
					 $('#dg').datagrid('reload')
				},'Text');
			}
		});
	} */
}
//保存用户
function saveCompany(){
	
	/* var edate = document.getElementsByName("edate");
	alert(edate)
	$('#fm').form('submit',{
		url: "Emergency_addFile.action",
		onSubmit: function(){
			return $(this).form('validate');
		},
		success: function(result){
//			var result = eval('('+result+')');
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
	}); */
	
	
	
	//文件上传
	 var files = ['escheme'];  //将上传三个文件 ID 分别为file2,file2,file3  
	var edate = document.getElementsByName("edate");
	 var flax = "1";
	$.ajaxFileUpload( {  
        url : 'Emergency_addFile.action',     //用于文件上传的服务器端请求地址    
        secureuri : false,            //一般设置为false    
        fileElementId : files,        //文件上传的id属性  <input type="file" id="file" name="file" />    
        dataType : 'Text',  
        data:{
        	"edate":edate,
        	"flax":flax
        	
        },//返回值类型 一般设置为json    
        success : function(data, status) { 
        	 var fileNames = data.fileFileName; //返回的文件名   
             var filePaths = data.filePath;     //返回的文件地址   
             //alert(data)
        	$('#dlg').dialog('close');
			$('#dg').datagrid('reload');
        }  
    }) 
}
//删除用户
function destroyUser(){
	
var  add= '<%= session.getAttribute("删除应急预案") %>';
	
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		var row = $('#dg').datagrid('getSelected');
		
		if (row){
			$.messager.confirm('Confirm','是否删除当前用户？',function(r){
				if (r){
					$.post('Emergency_deleteEmergency.action',{id:row.id},function(result){
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