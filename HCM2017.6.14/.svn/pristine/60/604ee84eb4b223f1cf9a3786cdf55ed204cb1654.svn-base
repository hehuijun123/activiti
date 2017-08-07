<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/sampling car.css" rel="stylesheet" type="text/css">
<link href="css/Bootstrap font.css" rel="stylesheet" type="text/css"> 

<link href="jquery-easyui-1.5.1/themes/cupertino/easyui.css" rel="stylesheet" type="text/css">
<link href="jquery-easyui-1.5.1/themes/icon.css" rel="stylesheet" type="text/css">

<!-- <link href="jquery-easyui-1.5.1/demo/demo.css" rel="stylesheet" type="text/css"> -->


<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.5.1/jquery.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.5.1/locale/easyui-lang-zh_CN.js"></script>
<title>Insert title here</title>
<script type="text/javascript"> 
$(function(){
	  $('#tt').tree({	    
	      url: "Tree_treeRole.action",
	      lines:true,//显示虚线效果 
	     
	      loadFilter: function(data){   
	    	console.log(data);
	          if (data.d){      
	              return data.d;      
	          } else {      
	              return data;      
	          }     
	      }      
	 })
}) 
</script> 
</head> 
<body> 
  <ul id="tt" checkbox="true"></ul> 
</body>