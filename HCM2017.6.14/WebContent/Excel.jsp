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

<script type="text/javascript">  
$(function(){
	var  add= '<%= session.getAttribute("role") %>';
	if(add=="jt"||add=="zs"){
		document.getElementById( "progress").style.display= "none"; 
	}else{
		document.getElementById( "progress").style.display=""; 	
	}
})
$(function() {      
      $('#spdate').datebox({    
            onShowPanel : function() {// 显示日趋选择对象后再触发弹出月份层的事件，初始化时没有生成月份层    
                span.trigger('click'); // 触发click事件弹出月份层    
                if (!tds)    
                    setTimeout(function() {// 延时触发获取月份对象，因为上面的事件触发和对象生成有时间间隔    
                        tds = p.find('div.calendar-menu-month-inner td');    
                        tds.click(function(e) {    
                            e.stopPropagation(); // 禁止冒泡执行easyui给月份绑定的事件    
                            var year = /\d{4}/.exec(span.html())[0]// 得到年份    
                            , month = parseInt($(this).attr('abbr'), 10) + 1; // 月份    
                            $('#spdate').datebox('hidePanel')// 隐藏日期对象    
                            .datebox('setValue', year + '-' + month); // 设置日期的值    
                        });    
                    }, 0);    
            },    
            parser : function(s) {// 配置parser，返回选择的日期    
                if (!s)    
                    return new Date();    
                var arr = s.split('-');    
                return new Date(parseInt(arr[0], 10), parseInt(arr[1], 10) - 1, 1);    
            },    
            formatter : function(d) {    
                var month = d.getMonth();  
                if(month<=10){  
                    month = "0"+month;  
                }  
                if (d.getMonth() == 0) {    
                    return d.getFullYear()-1 + '-' + 12;    
                } else {    
                    return d.getFullYear() + '-' + month;    
                }    
            }// 配置formatter，只返回年月    
        });    
        var p = $('#spdate').datebox('panel'), // 日期选择对象    
        tds = false, // 日期选择对象中月份    
        span = p.find('span.calendar-text'); // 显示月份层的触发控件    
        
    });   
$(function() {      
    $('#edate').datebox({    
          onShowPanel : function() {// 显示日趋选择对象后再触发弹出月份层的事件，初始化时没有生成月份层    
              span.trigger('click'); // 触发click事件弹出月份层    
              if (!tds)    
                  setTimeout(function() {// 延时触发获取月份对象，因为上面的事件触发和对象生成有时间间隔    
                      tds = p.find('div.calendar-menu-month-inner td');    
                      tds.click(function(e) {    
                          e.stopPropagation(); // 禁止冒泡执行easyui给月份绑定的事件    
                          var year = /\d{4}/.exec(span.html())[0]// 得到年份    
                          , month = parseInt($(this).attr('abbr'), 10) + 1; // 月份    
                          $('#edate').datebox('hidePanel')// 隐藏日期对象    
                          .datebox('setValue', year + '-' + month); // 设置日期的值    
                      });    
                  }, 0);    
          },    
          parser : function(s) {// 配置parser，返回选择的日期    
              if (!s)    
                  return new Date();    
              var arr = s.split('-');    
              return new Date(parseInt(arr[0], 10), parseInt(arr[1], 10) - 1, 1);    
          },    
          formatter : function(d) {    
              var month = d.getMonth();  
              if(month<=10){  
                  month = "0"+month;  
              }  
              if (d.getMonth() == 0) {    
                  return d.getFullYear()-1 + '-' + 12;    
              } else {    
                  return d.getFullYear() + '-' + month;    
              }    
          }// 配置formatter，只返回年月    
      });    
      var p = $('#edate').datebox('panel'), // 日期选择对象    
      tds = false, // 日期选择对象中月份    
      span = p.find('span.calendar-text'); // 显示月份层的触发控件    
      
  }); 


  
</script> 

<script type="text/javascript">


$(function(){
	$('#isearch').click(function(){
		$('#dg').datagrid('load',{			
		    searchDate :$("#spdate").val(),
		});		
	});
});

</script>

<script>
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
      <li><a href="##" id="a_leader_txt">报表统计</a></li>
    </ul>
    
   <section class="list_data" >
			<table id="dg" title="" class="easyui-datagrid" border="0" cellspacing="0" style="width:88%;text-align: center;"
					data-options="toolbar:'#toolbar',pagination:true,singleSelect:true,
                        url:'Excel_searchExcel.action',pageSize:10,pageList:[10,20,30]">
					<thead>
						<tr>
							<th field="ename" align="center"    width="10%">文件名</th>
							<th field="edate" align="center"    width="10%">日期</th>
							<th field="ework" align="center"    width="10%">水厂</th>
 						
						</tr>
					</thead>
				</table>
				
				<div id="toolbar">
				    <div class="content">
				   <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">报表</a>
				    	<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true"  onclick="downUser()">下载</a>
				    
				    企业:	<input name="scompany" id="scompany" class="easyui-combobox"  data-options="  
    valueField:'cname' , textField:'cname', loader : select, mode : 'remote'    
"  style="margin-left:10px;">
				   
				选择月份:	
						<label>日期</label>
						<input name="spdate" id="spdate" validType="true" style="margin-left:5px;width:175px;">
		
			&nbsp;<a class="easyui-linkbutton"  id="isearch" >查询</a>
				    </div>		    
				</div>								
    </section>
    
    <div style="display: none;">   
    <div id="dlg" class="easyui-dialog" style="width:400px;height:420px;padding:10px 20px" align="center"
		closed="true" buttons="#dlg-buttons">
	<div class="ftitle" style="text-align: center;font-size: 14px;margin-bottom: 10px;">报表信息</div>
	<form id="fm" method="post">
		<div class="fitem">
			<label>工厂</label>
			<input name="ework" id="ework" class="easyui-validatebox" validType="true" style="margin-left:25px;">
		</div><br>
		<div class="fitem">
			<label>日期</label>
 			<input name="edate" id="edate" validType="true" style="margin-left:5px;width:175px;">
 		 </div><br>	
	</form>
</div>
<div id="dlg-buttons">
	<a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveUser()">生成报表</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">关闭</a>
</div>
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
        url: "HC_selectHC.action",  
        type: "post",  
        data: {"param": q},//后台使用param这个变量接收传值的，后台用了struts、spring后面就不拓展说明了  
        dataType: "json",  
        success: function (data) {  
            //console.log("i am in success-->" + data);返回的是数组对象data  
            var items = $.each(data, function(value){  
                return value; //遍历数组中的值  
            });  

            success(items);//调用loader的success方法，将items添加到下拉框中,这里是难点啊，之前后台已经返回数据了，但就是不添加到下拉框  
        }  
    });  
}  
//完成
function choose(){
	//var possion = $("#ppoison").val();
	
	var possion = $('input:radio:checked').val();
	var ss = $("#ss");
	var string = "<label>申报日期&nbsp;&nbsp;&nbsp;</label>"
	if(possion==1){	
		var input = document.createElement('input');  //创建input节点
		ss.html("");  
		input.setAttribute('name', 'papplydate');
		input.setAttribute('id', 'papplydate');
		input.setAttribute('class', 'easyui-datebox');
		input.setAttribute('validType', 'true');
		input.setAttribute('required','true');//定义类型是文本输入
/* 		input.setAttribute('style','margin-left:10px;');//定义类型是文本输入
 	$("#pdate").css("margin-left","20px");*/	
		ss.append(string);
		document.getElementById('ss').appendChild(input); //添加到form中显示
		$.parser.parse($('#papplydate').parent());
	}else{
		ss.html("");  
	}
}
//新用户
function newUser(){
	var  add= '<%= session.getAttribute("报表") %>';
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#dlg').dialog('open').dialog('setTitle','添加采购信息');
		$('#fm').form('clear');	
		 $(function(){
				$.ajax({
						url:'User_selectRole.action',
						type:'post',
						dataType:'Text',
						error:function(){
						},
						success:function(data){
							//var result = eval('('+data+')');
							
							console.log(data)
							$("#ework").val(data);
						}
			})
		}); 
	}
}
//更新
function editUser(){
var  add= '<%= session.getAttribute("编辑采购信息") %>';
	
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		var row = $('#dg').datagrid('getSelected');
		if (row){
			$('#dlg').dialog('open').dialog('setTitle','更新采购信息');
			$('#fm').form('load',row);
		}	
		}
}
//保存用户
function saveUser(){
	var edate = document.getElementsByName("pdate");
	
	console.log($("#pname"))
	$('#fm').form('submit',{
		url: "Excel_creatExcel.action",
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
	});
}
//删除用户
function destroyUser(){
var  add= '<%= session.getAttribute("删除采购信息") %>';
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		var row = $('#dg').datagrid('getSelected');
		if (row){
			$.messager.confirm('Confirm','是否删除采购信息？',function(r){
				if (r){
					$.post('Purchase_deletePurchase.action',{id:row.id},function(result){
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


//下载文件
function downUser(){
	var row = $('#dg').datagrid('getSelected');
	var flax = "1";
	console.log(row.eurl);
	window.location.href='Excel_downloadFile.action?id='+encodeURI(row.eurl);
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
</script>

</body>
</html>