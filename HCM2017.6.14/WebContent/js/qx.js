function qyqx(){
	var  add= '<%= session.getAttribute("企业信息") %>';
	alert(add)
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#qy').attr('href',add); 	
	}
}
function whqx(){
	var  add= '<%= session.getAttribute("危化品MSDS") %>';
	alert(add)
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#wh').attr('href',add); 	
	}
}
function cgqx(){
	var  add= '<%= session.getAttribute("采购") %>';
	alert(add)
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#cg').attr('href',add); 	
	}
}
function syqx(){
	var  add= '<%= session.getAttribute("使用") %>';
	alert(add)
	if(add=="null"){
		alert("没有权限")
	}else{
		$('#sy').attr('href',add); 	
	}
}
function ysqx(){
	var  add= '<%= session.getAttribute("运输") %>';
	alert(add)
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#ys').attr('href',add); 	
	}
}
function kcqx(){
	var  add= '<%= session.getAttribute("库存") %>';
	alert(add)
	if(add=="null"){
		alert("没有权限")
	}else{
		$('#kc').attr('href',add); 	
	}
}
function fqwczqx(){
	var  add= '<%= session.getAttribute("废弃物处置") %>';
	alert(add)
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#fqwcz').attr('href',add); 	
	}
}
function rkqx(){
	var  add= '<%= session.getAttribute("入库查询") %>';
	alert(add)
	if(add=="null"){
		alert("没有权限")
	}else{
		$('#rk').attr('href',add); 	
	}
}
function ckqx(){
	var  add= '<%= session.getAttribute("出库查询") %>';
	alert(add)
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#ck').attr('href',add); 	
	}
}
function kccxqx(){
	var  add= '<%= session.getAttribute("库存查询") %>';
	alert(add)
	if(add=="null"){
		alert("没有权限")
	}else{
		$('#kccx').attr('href',add); 	
	}
}
function yscxqx(){
	var  add= '<%= session.getAttribute("运输信息查询") %>';
	alert(add)
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#yscx').attr('href',add); 	
	}
}
function fqwqx(){
	var  add= '<%= session.getAttribute("废弃物处置查询") %>';
	alert(add)
	if(add=="null"){
		alert("没有权限")
	}else{
		$('#fqwcx').attr('href',add); 	
	}
}
function yjyaqx(){
	var  add= '<%= session.getAttribute("应急预案") %>';
	alert(add)
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#yjya').attr('href',add); 	
	}
}
function qypmtqx(){
	var  add= '<%= session.getAttribute("企业平面图") %>';
	alert(add)
	if(add=="null"){
		alert("没有权限")
	}else{
		$('#qypmt').attr('href',add); 	
	}
}
function jssmqx(){
	var  add= '<%= session.getAttribute("技术说明") %>';
	alert(add)
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#jssm').attr('href',add); 	
	}
}
function yhglqx(){
	var  add= '<%= session.getAttribute("用户管理") %>';
	alert(add)
	if(add=="null"){
		alert("没有权限")
	}else{
		$('yhsz').attr('href',add); 	
	}
}
function qxfpqx(){
	var  add= '<%= session.getAttribute("权限分配") %>';
	alert(add)
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#qxfp').attr('href',add); 	
	}
}
function rzglqx(){
	var  add= '<%= session.getAttribute("日志管理") %>';
	alert(add)
	if(add=="null"||add==""){
		alert("没有权限")
	}else{
		$('#rzgl').attr('href',add); 	
	}
}
