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
  

ul{
   display: block;
}

ul li{
  display: inline;
}

</STYLE>
<SCRIPT type="text/javascript">
	if (self != top) {
		top.location = self.location;
	}
</SCRIPT>
<link rel='stylesheet' href='../webjars/bootstrap/3.2.0/css/bootstrap.min.css'>
</head>
<body>
<script type="text/javascript" src="../webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../webjars/jquery/2.1.1/jquery.min.js"></script>

<s:set var="context_path"
	value="#request.get('javax.servlet.forward.context_path')"></s:set>


<%@include file="/WEB-INF/pages/common/head.jsp"%>


<div class="container">
  <div id="left_container" class="col-md-4">
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
  
  <div id="right_container" class="col-md-8">
			<div id="zitiao">
			    <!-- 
				<img src="${context_path}/css/images/<s:property default='02.gif' value='image.url'/>"
					width="676" height="31" />
				 -->
				 <h1>Buy Gift Cards</h1>
			</div>
	        <div>
	           
				<s:if test="cards != null && cards.getCard().size() > 0">
					<ul class="product-source">
						<s:iterator value="cards.getCard()">

							<li class="product-source">
								<div class="col-md-3">
									<tr>
										<td><s:a action="cards_select" namespace="/cards">
												<s:param name="id" value="id"></s:param>

												<img width="150" height="150"
													src="<s:property value="#request.get('javax.servlet.forward.context_path')"/>/images/<s:property value="path"/>">

											</s:a></td>
									</tr>
									<tr bgcolor="#f2eec9">
										<td>Name：</td>
										<td><s:a action="cards_select" namespace="/cards">
												<s:param name="id" value="id"></s:param>
												<s:property value="name" />
											</s:a></td>
									</tr>
									<tr>
										<td>Description：</td>
										<td><s:property value="description" /></td>
									</tr>

								</div>
							</li>

						</s:iterator>
					</ul>
					<s:url var="first">
						<s:param name="pageNo" value="1"></s:param>
						<s:param name="category.id" value="category.id"></s:param>
						<s:param name="product.name" value="product.name"></s:param>
					</s:url>
					<s:url var="previous">
						<s:param name="pageNo" value="pageModel.pageNo-1"></s:param>
						<s:param name="category.id" value="category.id"></s:param>
						<s:param name="product.name" value="product.name"></s:param>
					</s:url>
					<s:url var="last">
						<s:param name="pageNo" value="pageModel.bottomPageNo"></s:param>
						<s:param name="category.id" value="category.id"></s:param>
						<s:param name="product.name" value="product.name"></s:param>
					</s:url>
					<s:url var="next">
						<s:param name="pageNo" value="pageModel.pageNo+1"></s:param>
						<s:param name="category.id" value="category.id"></s:param>
						<s:param name="product.name" value="product.name"></s:param>
					</s:url>
					<s:include value="/WEB-INF/pages/common/page.jsp"></s:include>
				</s:if>
				<s:else>
					<p>对不起，还没有添加商品信息。</p>
					<s:a action="index">返回主页</s:a>
				</s:else>

			</div>
  </div>

</div>
<%@include file="/WEB-INF/pages/common/footer.jsp"%>

</body>
</html>