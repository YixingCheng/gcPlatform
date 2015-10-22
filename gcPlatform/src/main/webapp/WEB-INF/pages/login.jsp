<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<STYLE type="text/css">
</STYLE>
<SCRIPT type="text/javascript">
	if (self != top) {
		top.location = self.location;
	}
</SCRIPT>
<link rel='stylesheet' href='webjars/bootstrap/3.2.0/css/bootstrap.min.css'>
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
</head>
<body>
<script type="text/javascript" src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="webjars/jquery/2.1.1/jquery.min.js"></script>
<%@include file="/WEB-INF/pages/common/head.jsp"%>

<div class="container">
    <div class="row">
        <div class="col-md-offset-5 col-md-3">
                <!-- 
				<div class="form-login">
					<h4>Welcome back.</h4>
					<input type="text" id="userName"
						class="form-control input-sm chat-input" placeholder="username" />
					</br> <input type="text" id="userPassword"
						class="form-control input-sm chat-input" placeholder="password" />
					</br>
					<div class="wrapper">
						<span class="group-btn"> <a href="#"
							class="btn btn-primary btn-md">login <i class="fa fa-sign-in"></i></a>
						</span>
					</div>
				</div>
                 -->
                 
                <div >
					<h4>Welcome back.</h4>
					<s:if test="%{#parameters.error != null}">
						<div style="color: red">Invalid User</div>
					</s:if>
					<s:form name="loginForm" class="form-login" action="j_spring_security_check"
						method="post">
						<s:textfield name="username" label="Username" id="userName"
						cssClass="form-control input-sm chat-input" placeholder="username"/>
						<br/>
						<s:password name="password" label="Password" id="userPassword"
						cssClass="form-control input-sm chat-input" placeholder="password"/>
						<br/>
						<!--  
						<div class="wrapper">
							<span class="group-btn"> 
								<a href="#" class="btn btn-primary btn-md">login <i class="fa fa-sign-in"></i></a>
							</span>
						</div>
						-->
						<div class="wrapper">
							<span class="group-btn">
								<s:submit value="Login" cssClass="btn btn-primary btn-md"/> <i class="fa fa-sign-in"></i>
							</span>
						</div>
					</s:form>
				</div>
		</div>
    </div>
</div>

</body>
</html>