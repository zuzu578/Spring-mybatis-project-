<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<script src="https://use.fontawesome.com/1dec14be15.js"></script>
<style>
.stylish-form 
    {
      background-image:url('https://lut.im/cOs9CbKe42/DT8DT06CeJkRsyWC.jpg'); 
      padding:10px;
    }
    .stylish-form h2 {
      color:#f96332;
      margin-top:50px;
      
    }
    .font_white {
      color:#fff !important;
    }
    .mar20 
    {
      margin:20px;
    }
    .inner-section {
      background-color:#f96332;
      width:350px;
      display:block;
      margin:0 auto;
    }
    .inside-form{
      border-radius:8px;
      padding-top:30px;
      padding-bottom:30px;
    }
    .inside-form h2 {
      font-weight:700;
    }
    .inside-form ul {
      list-style-type:none;
      text-align:center;
      margin-top:30px;
    }
    .inside-form ul >li {
      display:inline-block;
    }
    .inside-form ul >li > i {
      margin-top:18px;
    }
    .icon-holder {
      background: #fff;
      border-radius: 50%;
      vertical-align: middle;
      height: 50px;
      width: 50px;
      text-align: center;
      margin-right: 20px;
    }

    .dsp-flex {
      display: -webkit-box; /* OLD - iOS 6-, Safari 3.1-6 */
      display: -moz-box; /* OLD - Firefox 19- (buggy but mostly works) */
      display: -ms-flexbox; /* TWEENER - IE 10 */
      display: -webkit-flex; /* NEW - Chrome */
      display: flex; /* NEW, Spec - Opera 12.1, Firefox 20+ */
      align-items: center;
      -webkit-align-items: center;
      justify-content: center
    }
    .input-group, .form-group {
      margin-bottom: 10px;
    }
    .input-group-addon {
      background-color: rgba(255, 255, 255, 0.1);
      border: none;
      color: #FFFFFF;
      border-radius:25px;
    }
    .form-control,.form-control:focus,.form-control:hover
    {
      background-color: rgba(255, 255, 255, 0.1);
      color: #FFFFFF;
      border-radius:25px;
      border:none;
      font-size:14px;
    }
    ::-webkit-input-placeholder { /* Chrome/Opera/Safari */
      color: #fff !important;
    }
    ::-moz-placeholder { /* Firefox 19+ */
      color: #fff !important;
    }
    :-ms-input-placeholder { /* IE 10+ */
      color: #fff !important;
    }
    :-moz-placeholder { /* Firefox 18- */
      color: #fff !important;
    }
    .footer {
      margin-top:40px;
      margin-bottom:40px;
    }
    input::placeholder {
      color: #fff !important;
    }
    .btn-lg {
      font-size: 1em;
      border-radius: 0.25rem;
      padding: 15px 48px;
    }
    .btn-round {
      border-width: 1px;
      border-radius: 30px !important;
      padding: 11px 23px;
    }
    .btn-neutral,.btn-neutral:focus,.btn-neutral:hover {
      background-color: #FFFFFF;
      color: #f96332;
    }

</style>
<title>Insert title here</title>
</head>
<body>
 <div class="container-fluid stylish-form">
      <h2 class="text-center">Stylish Signup Page Using Bootstrap</h2>
      <div class="row mar20" >
        <div class="col-md-12 col-sm-12 col-xs-12">
          <div class="inner-section">
            
              <div class="mar20 inside-form">
                <h2 class="font_white text-center">SIGN UP</h2>
                <ul>
                  <li class="icon-holder dsp-flex">
                    <i class="fa fa-facebook "></i>
                  </li>
                  <li class="icon-holder dsp-flex">
                    <i class="fa fa-twitter "></i>
                  </li>
                  <li class="icon-holder dsp-flex">
                    <i class="fa fa-instagram "></i>
                  </li>
                </ul>
                <div class="input-group">
                  <span class="input-group-addon"><i class="fa fa-pencil "></i></span>
                  <input type="text" class="form-control" id="userid"  name="userid" placeholder="ID">
                </div>
                <div class="input-group">
                  <span class="input-group-addon"><i class="fa fa-envelope "></i></span>
                  <input type="email" class="form-control" id="useremail" name="useremail" placeholder="Email...">
                </div>
                <div class="input-group">
                  <span class="input-group-addon"><i class="fa fa-lock "></i></span>
                  <input type="password" class="form-control" id="userpassword" name="userpassword" placeholder="Password...">
                </div>
                <div class="footer text-center" >
                  <button class ="btn btn-neutral btn-round btn-lg" id="button">Get Started</button>
                </div>
              </div>
            
          </div>
        </div>
      </div>
      
    </div>
</body>
</html>
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script language="javascript">
$(document)
.on("click","#button",function(){
	$.ajax({
		  url:'TrySignup',//호출될 서블릿의 경로(이름)
		  method:'post',//데이터 전송방식 get/post
		  //전송할 데이터(쿼리스트링)//
		  data:'userid='+$('input[name=userid]').val()+'&useremail='+$('input[name=useremail]').val()+'&userpassword='+$('input[name=userpassword]').val(),
		  dataType:'text',//반환받을 데이터 타입 
		  beforeSend:function(){},
		  success:function(txt){//호출 성공해서 완료하면 
			
		},
		complete:function(){
			
		} 
		
	    })
		 alert("회원가입 되었습니다.")
		 window.location.href='/practice/DoLoginPage';
	   

})


</script>