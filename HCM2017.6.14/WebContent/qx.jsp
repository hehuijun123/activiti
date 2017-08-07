<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title></title>
 <link href="css/sampling car.css" rel="stylesheet" type="text/css">
<link href="css/Bootstrap font.css" rel="stylesheet" type="text/css">
<link href="css/styless.css" rel="stylesheet" type="text/css">

<link href="jquery-easyui-1.5.1/themes/cupertino/easyui.css" rel="stylesheet" type="text/css">
<link href="jquery-easyui-1.5.1/themes/icon.css" rel="stylesheet" type="text/css">

<!-- <link href="jquery-easyui-1.5.1/demo/demo.css" rel="stylesheet" type="text/css"> -->


<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="js/ui.js"></script>

<script type="text/javascript" src="jquery-easyui-1.5.1/jquery.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.5.1/locale/easyui-lang-zh_CN.js"></script>


</head>

<script type="text/javascript">
 $(function(){
	  /* $('#tt').combotree({	    
	      url: "Tree_tree.action",
	      lines:true,//显示虚线效果 
	      
	      loadFilter: function(data){   
	    	console.log(data);
	          if (data.d){      
	              return data.d;      
	          } else {      
	              return data;      
	          }     
	      },
	  onLoadSuccess: function (data) {$('#treeGrid').treegrid('collapseAll')},
	 });  */
	  
	 /*  $('#fm').form({
			url : 'Tree_tree.action',
			onSubmit : function() {
				alert("fgd")
				progressLoad();
				var isValid = $(this).form('validate');
				if (!isValid) {
					progressClose();
				}
				var checknodes = resourceTree.tree('getChecked');
				var ids = [];
				if (checknodes && checknodes.length > 0) {
					for ( var i = 0; i < checknodes.length; i++) {
						ids.push(checknodes[i].id);
					}
				}
				$('#resourceIds').val(ids);
				return isValid;
			},
			success : function(result) {
				progressClose();
				result = $.parseJSON(result);
				if (result.success) {
					parent.$.modalDialog.openner_dataGrid.datagrid('reload');//之所以能在这里调用到parent.$.modalDialog.openner_dataGrid这个对象，是因为user.jsp页面预定义好了
					parent.$.modalDialog.handler.dialog('close');
				} else {
					parent.$.messager.alert('错误', result.msg, 'error');
				}
			}	
		})
	   */
	 
	/*  $("#tt").tree({  
		 url:'Tree_tree.action',  
		 method: 'GET',  
		 animate: true,  
		 checkbox: true,  
		 cascadeCheck:true,//层叠选中  
		 lines:true,//显示虚线效果  
		 onLoadSuccess:function(node,data){ 
			 console.log(data)
		  var nodeDep = $('#tree').tree('find',checkeid);  
		  if (null != nodeDep && undefined != nodeDep)  
		  {  
		      $('#tree').tree('check',nodeDep.target);  
		  }  
		 },  
		 onCheck:function(node, checked)  
		 {  
		  if (checked)  
		  {  
		      //这段逻辑自拟  
		      }   
		      else   
		      {   
		      }  
		      
		}   
		}); */
 })

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

	if(add=="null"||add==""){
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
                            <ul class="treeview-menu"  style="display: block;">
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
      <li><a href="##" id="a_leader_txt">权限设置</a></li>
    </ul>
    
    <section class="list_data"">
			<table id="dg" title="" class="easyui-datagrid" border="0" cellspacing="0" style="width:88%;text-align: center;"
					data-options="toolbar:'#toolbar',pagination:true,singleSelect:true,
                        url:'User_selectUser.action',pageSize:10,pageList:[10,20,30]">
					<thead>
						<tr>
							<th field="cuser"    width="33%">用户</th>
							<th field="cname"    width="33%">姓名</th>
							<th field="#" formatter="qx"  width="33%">权限分配</th>
							
						</tr>
					</thead>
				</table>
				<div id="toolbar">
	<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">权限分配</a>
</div>
    </section>
    

<div id="gdlg" class="easyui-dialog" style="width: 400px; height: 320px; padding: 10px 20px" closed="true" buttons="#dlg-buttons">
				<div data-options=6 "region:'west'" title="权限" style="width: 300px; padding: 1px;">
					<div class="well well-small">
						<form id="fm" method="post" >
							<div class="fitem">
								<input name="id" id="id" class="easyui-validatebox" hidden="true" >
							</div>
							<div class="fitem">
								<label>用户：</label>
								<input name="cuser" id="cuser" class="easyui-validatebox" required="true" style="margin-left:13px;">
							</div><br>
							<div class="fitem">
								<label>权限分配：</label>
								<select multiple  class="easyui-combotree" checkbox="true"  id="tt" name="tt" data-options="url:'Tree_tree.action',cascadeCheck:false,lines:true" style="margin-left:50px;width:200px"></select >
							</div>
							<div class="fitem">
								<input name="cqx" id="cqx" class="easyui-validatebox" required="true" style="margin-left:13px;" hidden="true">
							</div><br>
						</form>
					</div>
				</div>


	

</div>
<div id="dlg-buttons">
	<a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="save()">保存</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#gdlg').dialog('close')">关闭</a>
</div>
    <script src="js/sidebar-menu.js"></script>
    <script>
        $.sidebarMenu($('.sidebar-menu'))
    </script> 
<script>

//新用户
function newUser(){
	
	$('#gdlg').dialog('open').dialog('setTitle','添加新用户');
	$('#fm').form('clear');
}
//更新
function editUser(){
	var row = $('#dg').datagrid('getSelected');
	console.log(row);
	if (row){
		$('#gdlg').dialog('open').dialog('setTitle','权限分配');
		$('#fm').form('load',row);
		var s = $("#cqx").val();
		var str = new Array();
		str = s.split(",");
		$('#tt').combotree({
		onLoadSuccess: function(){
                                for (i=0;i<str.length ;i++ ){
                                        node=$('#tt').combotree('tree').tree('find',str[i]);
                                        $('#tt').combotree('tree').tree('check',node.target);
                                        $('#tt').combotree('tree').tree('expandAll', node.target);
                               }
                       }
		             });
		/* if (ids.length > 0) {
			for ( var i = 0; i < ids.length; i++) {
				if (resourceTree.tree('find', ids[i])) {
					resourceTree.tree('check', resourceTree.tree('find', ids[i]).target);
				}
			}
		} */
		/* var t = $("#tt").combotree('tree');//获取tree  
        for (var i=0;i<str.length ;i++ ){  
           node= t.tree("find",str[i].id);  
           t.tree('expandAll',node.target);//展开所有节点  
              
        }   */
		
	}
	console.log($("#cqx").val());
}
//保存用户

	
function save() {
	$('#fm').form('submit', {
		url : 'Tree_addRight.action',
		onSubmit : function() {
			return $(this).form('validate');
		},
		success : function(result) {
			
				$('#gdlg').dialog('close');
				$('#dg').datagrid('reload');
				
		}
	});
}

	
	
	
	/* $('#fm').form({
		url : 'Tree_tree.action',
		onSubmit : function() {
			alert("fgd")
			progressLoad();
			var isValid = $(this).form('validate');
			if (!isValid) {
				progressClose();
			}
			var checknodes = resourceTree.tree('getChecked');
			var ids = [];
			if (checknodes && checknodes.length > 0) {
				for ( var i = 0; i < checknodes.length; i++) {
					ids.push(checknodes[i].id);
				}
			}
			$('#resourceIds').val(ids);
			return isValid;
		},
		success : function(result) {
			progressClose();
			result = $.parseJSON(result);
			if (result.success) {
				parent.$.modalDialog.openner_dataGrid.datagrid('reload');//之所以能在这里调用到parent.$.modalDialog.openner_dataGrid这个对象，是因为user.jsp页面预定义好了
				parent.$.modalDialog.handler.dialog('close');
			} else {
				parent.$.messager.alert('错误', result.msg, 'error');
			}
		}
			
		
	})
	alert("zcv") */


//删除用户
function destroyUser(){
	var row = $('#dg').datagrid('getSelected');
	
	if (row){
		$.messager.confirm('Confirm','是否删除当前用户？',function(r){
			if (r){
				$.post('User_deleteUser.action',{id:row.id},function(result){
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

function qx(value,row,index){
	row = JSON.stringify(row);
	

	console.log(row.id)

	var lookup = "<a href='#' id='loo' class='easyui-linkbutton' iconCls='icon-edit' plain='true' onclick='editUser()'>权限分配</a>";
	$.parser.parse(".easyui-linkbutton");
	xr()
	//var lookup = window.open ('picture.jsp?row='+row, '_blank', 'height=100, width=400, top=0, left=0, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=n o, status=no') 
	return lookup;
};
function xr(){
	var s = $(".gdlg");
	$.parser.parse(s);
}




</script>

</body>
</html>