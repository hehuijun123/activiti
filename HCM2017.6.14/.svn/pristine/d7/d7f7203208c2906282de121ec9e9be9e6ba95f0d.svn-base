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
<link rel="stylesheet" type="text/css" href="css/default.css" />
		<link rel="stylesheet" type="text/css" href="css/component.css" />
		<script src="js/modernizr.custom.js"></script>

<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>

<script type="text/javascript" src="jquery-easyui-1.5.1/jquery.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="js/ajaxfileupload.js"></script>

<script type="text/javascript" src="jquery-easyui-1.5.1/locale/easyui-lang-zh_CN.js"></script>
</head>
<script>

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
                                <li><a id="qypmt" href="" onclick="qypmtqx()">企业平面图</a></li>
                                <li><a id="jssm" href="" onclick="jssmqx()">技术说明</a></li>
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
      <li><a href="##" id="a_leader_txt">技术说明</a></li>
    </ul>
    
   
<div class="md-modal md-effect-13" id="modal-13">
			<div class="md-content">
				<h3>库存详情</h3>
				<div>
					<table width="400" border="1" align="center">
                        <tr>
                            <td>公司名称</td>
                            <td>总量</td>
                            <td>单位</td>
                        </tr>
                        <tr>
                            <td>白龙港</td>
                            <td>100</td>
                            <td>g</td>
                        </tr>
                        <tr>
                            <td>青草沙</td>
                            <td>1000</td>
                            <td>g</td>
                        </tr>
                    </table>

					<button class="md-close">Close me!</button>
				</div>
			</div>
		</div>
		
		<button class="md-trigger" data-modal="modal-13">3D Slit</button>
		
		<div class="md-overlay"></div><!-- the overlay element -->

		<!-- classie.js by @desandro: https://github.com/desandro/classie -->
		<script src="js/classie.js"></script>
		<script src="js/modalEffects.js"></script>

		<!-- for the blur effect -->
		<!-- by @derSchepp https://github.com/Schepp/CSS-Filters-Polyfill -->
		<script>
			// this is important for IEs
			var polyfilter_scriptpath = '/js/';
		</script>
		<script src="js/cssParser.js"></script>
		<script src="js/css-filters-polyfill.js"></script>
		
		
  <div style="display: none;">   
    <div id="dlg" class="easyui-dialog" style="width:400px;height:380px;padding:10px 20px" align="center"
		closed="true" buttons="#dlg-buttons">
	<div class="ftitle" style="text-align: center;font-size: 14px;margin-bottom: 10px;">技术说明</div>
	<form id="fm" method="" enctype="multipart/form-data">
		<div class="fitem">
			<input name="id" class="easyui-validatebox" hidden="true" >
		</div>
		<div class="fitem">
			<label>文件</label>
			<input  type="file" name="file" data-options="prompt:'选择文件'" id="einstructions" style="margin-left:100px;"/>  
		</div><br>
	</form>
</div>
<div id="dlg-buttons">
	<a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveCompany()">保存</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">关闭</a>
</div>
</div>
    <script src="js/sidebar-menu.js"></script>
    <script>
        $.sidebarMenu($('.sidebar-menu'))
    </script> 
<script>

//新用户
function newUser(){
	var  add= '<%= session.getAttribute("添加技术说明") %>';
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#dlg').dialog('open').dialog('setTitle','添加技术说明');
		$('#fm').form('clear');	}
}
//更新
function editUser(){
var  add= '<%= session.getAttribute("编辑技术说明") %>';
	
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		var row = $('#dg').datagrid('getSelected');
		if (row){
			$('#dlg').dialog('open').dialog('setTitle','编辑技术说明');
			$('#fm').form('load',row);
		}	
		}
}

//下载文件
function downUser(){
	var row = $('#dg').datagrid('getSelected');
	var flax = "3";
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
	 var files = ['einstructions'];  //将上传三个文件 ID 分别为file2,file2,file3  
	var edate = document.getElementsByName("edate");
	 var flax = "3";
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
        	$('#dlg').dialog('close');
			$('#dg').datagrid('reload');
        }  
    }) 
}
//删除用户
function destroyUser(){
	
var  add= '<%= session.getAttribute("删除记说说明") %>';
	
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		var row = $('#dg').datagrid('getSelected');
		
		if (row){
			$.messager.confirm('Confirm','是否删除技术说明？',function(r){
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