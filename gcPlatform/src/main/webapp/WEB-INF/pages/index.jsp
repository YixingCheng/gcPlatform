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
</head>
<body>
<script type="text/javascript" src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="webjars/jquery/2.1.1/jquery.min.js"></script>
<%@include file="/WEB-INF/pages/common/head.jsp"%>

<div class="container">
  <div id="left_container" class="col-md-3">
    <div id="zitiao">
		<h2>Card Category</h2>
	</div>
	<table class="table table-striped">
				<tr>
					<td width="199" height="31">
						<h3>Categories</h3>
					</td>
				</tr>
				<tr>
					<td height="5"></td>
				</tr>
				<tr>
					<td valign="top"><s:action name="category_list"
							namespace="/category" executeResult="true"></s:action></td>
				</tr>
	</table>
  </div>
  
  <div id="right_container" class="col-md-9">
			<div id="zitiao">
			    <!-- 
				<img src="${context_path}/css/images/<s:property default='02.gif' value='image.url'/>"
					width="676" height="31" />
				 -->
				 <h1>Buy Gift Cards</h1>
			</div>
            <div>
            	<s:action name="cards_list"
							namespace="/cards" executeResult="true"></s:action>
            </div>
            
  
  <!--  
  <div class="jumbotron">
    <h1>My First Bootstrap Page</h1>
    <p>Resize this responsive page to see the effect!</p> 
  </div>
  <div class="row">
    <div class="col-sm-4">
      <h3>Column 1</h3>
      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
      <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
    </div>
    <div class="col-sm-4">
      <h3>Column 2</h3>
      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
      <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
    </div>
    <div class="col-sm-4">
      <h3>Column 3</h3> 
      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
      <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
    </div>
  </div>
  -->
</div>

</body>
</html>