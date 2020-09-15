/*-----------------------------------------------------------------
 * create by chengqi on 2016-05-31 version V2016_1.0 for 登录界面js
 * ----------------------------------------------------------------*/
//界面加载事件
$(document).ready(function(){
	$("#usename").val('');
	$('#userpwd').val('');
	console.info(shrgStatus);
	if(shrgStatus=="E")
	{
		document.getElementById("userpwd").focus();
		$(".error_box").html("<img src='//img/del.png'>"+"用户名或者密码错误！");
	}
   $("#userpwd").focus(function(){
	   $("#icon_passwd").attr('src',getBasePath()+'/img/icon_passwd.png');
   });
   $("#userpwd").blur(function(){
	   $("#icon_passwd").attr('src',getBasePath()+'/img/icon_passwds.png');
   });
   $("#usename").focus(function(){
	   $("#icon_name").attr('src',getBasePath()+'/img/icon_name.png');
   });
   $("#usename").blur(function(){
	   $("#icon_name").attr('src',getBasePath()+'/img/icon_names.png');
   });
});

//重置
function loginreset(){
	$("#loginroles").val("");//角色
	$("#usename").val("");//用户名
	$("#userpwd").val("");//登录密码
}
//登录
/*function login(){
	var uname=$("#usename").val();
	var pwd=$("#userpwd").val();
	var type=$('input:radio:checked').val();
	 "/BBS/user/login?loginName="+ uname + "&password=" + userpwd;  
	 window.location.href="/BBS/user/login?loginName="+ uname + "&password=" + pwd +"&userType="+type; 
	
}*/

function doForLogin(){
	$(".error_box").html("");
    document.onkeydown=function(event)  
    {  
    	//兼容火狐keydown事件
        e = event ? event :(window.event ? window.event : null);  
        var currKey=0;  
        currKey=e.keyCode||e.which||e.charCode;  
        if(currKey==13){  
            //执行的方法  
        	//login(); 
        }  
    };  
	/*if (event.keyCode=='13'){
		login(); 
	}else{
	}*/
}

function hideLogin() {
    $(".switchWx").css("display","none");
    $(".blockLogin").css("display","block");
}

function blockLogin() {
    $(".switchWx").css("display","block");
    $(".blockLogin").css("display","none");
}