<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
<html>
<head>
<title></title>

<link rel="stylesheet" type="text/css" href="css/styles.css" />
<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>

<!-- <script type="text/javascript" src="js/Login_javascript.js"></script> -->
</head>
<script type="text/javascript">
function login(){
	var uname = $("#uname").val();
	var userpwd = $("#password").val();
	$("#rem_sub_l").html("");
	$.ajax({
		   url:'User_login.action',
		   type:'POST',
		   dataType : "text",
		   data:{
			 "uname":uname,
			 "userpwd":userpwd,
		   },
		   beforeSend: function(){
		   		
		   },
		   error: function(XMLHttpRequest, textStatus, errorThrown){
/* 			   alert ("XMLHttpRequest.status="+XMLHttpRequest.status+"\ntextStatus="+textStatus+"\nerrorThrown=" + errorThrown);
 */		   },
		   success:function(data){
			   var datas = eval("("+data+")");	
			   console.log(datas)
			   console.log(data.info)
			   localStorage.setItem("loginName",uname ); 
			   if(datas=='"a"'){
				   window.open("main.jsp","_self");	   
			   }else{
				   var string ="您输入的密码或账号有误！"
				   $("#rem_sub_l").append(string);
			   }
			},	   
	   });	   
}
	

</script>
<body>

<div class="main">
  <div class="denglu">
  <div class="dl_logo"><img src="image/dl_03.png"></div>
  	<div class="title-name">危化品管理系统</div>
    <div class="dlk">
      <table width="292" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td height="76" colspan="3"></td>
        </tr>
        <tr>
          <td width="65" style="font-size:14px;">登录账号</td>
          <td colspan="2"><input name="uname" id="uname" type="text" class="dlinput" /></td>
        </tr>
        <tr>
          <td height="16" colspan="3"></td>
        </tr>
        <tr>
          <td>登录密码</td>
          <td colspan="2"><input name="password" id="password" type="password" class="dlinput" /></td>
        </tr>
        <tr>
          <td height="16" colspan="3"></td>
        </tr>
        
        <tr>
          <td height="16" colspan="3"></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td colspan="2"><input type="submit" value="登 录" class="loginbtn" onclick="login()" /></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td colspan="2"><table width="224" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td align="right"><a class="zc" id="rem_sub_l" style="font-size:13px;"></a></td>
            </tr>
          </table></td>
        </tr>
      </table>
    </div>
  </div>
</div>
</body>
</html>
