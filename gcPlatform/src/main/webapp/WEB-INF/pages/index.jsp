<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<STYLE type="text/css">
  
<!--
td {
	font-size: 12px;
}
-->
ul{
   display: block;
}

ul li{
  display: inline;
}

.carousel-content {
    color:black;
    display:flex;
    align-items:center;
}

</STYLE>

<SCRIPT type="text/javascript">
	if (self != top) {
		top.location = self.location;
	}
	
	setCarouselHeight('#carousel-example');

    function setCarouselHeight(id)
    {
        var slideHeight = [];
        $(id+' .item').each(function()
        {
            // add all slide heights to an array
            slideHeight.push($(this).height());
        });

        // find the tallest item
        max = Math.max.apply(null, slideHeight);

        // set the slide's height
        $(id+' .carousel-content').each(function()
        {
            $(this).css('height',max+'px');
        });
    }
</SCRIPT>

<link rel='stylesheet' href='webjars/bootstrap/3.2.0/css/bootstrap.min.css'>

</head>
<body>

<script type="text/javascript" src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="webjars/jquery/2.1.1/jquery.min.js"></script>

<s:set var="context_path"
	value="#request.get('javax.servlet.forward.context_path')"></s:set>
<%@include file="/WEB-INF/pages/common/head.jsp"%>

<div id="carousel-example" class="carousel slide" data-ride="carousel">
    <!-- Wrapper for slides -->
    <div class="row">
        <div class="col-xs-offset-3 col-xs-6">
            <div class="carousel-inner">
                <div class="item active">
                    <div class="carousel-content">
                        <div>
                            <h3>#1</h3>
                            <p>This is a twitter bootstrap carousel that only uses text. There are no images in the carousel slides.</p>
                        </div>
                    </div>
                </div>
                <div class="item">
                    <div class="carousel-content">
                        <div>
                            <h3>#2</h3>
                            <p>This is another much longer item. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Animi, sint fuga temporibus nam saepe delectus expedita vitae magnam necessitatibus dolores tempore consequatur dicta cumque repellendus eligendi ducimus placeat! Sapiente, ducimus, voluptas, mollitia voluptatibus nemo explicabo sit blanditiis laborum dolore illum fuga veniam quae expedita libero accusamus quas harum ex numquam necessitatibus provident deleniti tenetur iusto officiis recusandae corporis culpa quaerat?</p>
                        </div>
                    </div>
                </div>
                <div class="item">
                    <div class="carousel-content">
                        <div>
                            <h3>#3</h3>                            
                            <p>This is the third item.</p>
                        </div>
                    </div>
                </div>
                
            </div>
        </div>
    </div>
    <!-- Controls --> <a class="left carousel-control" href="#carousel-example" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
  </a>
 <a class="right carousel-control" href="#carousel-example" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
  </a>

</div>

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
</div>
<%@include file="/WEB-INF/pages/common/footer.jsp"%>

</body>
</html>