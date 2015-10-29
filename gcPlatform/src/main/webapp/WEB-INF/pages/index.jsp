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

            <div id="xshangpin">
				<s:if test="pageModel != null && pageModel.list.size() > 0">
					<s:iterator value="pageModel.list">
						<ul>
							<li>
								<table border="0" width="100%" cellpadding="0" cellspacing="0">
									<tr>
										<td rowspan="5" width="160"><s:a action="product_select"
												namespace="/product">
												<s:param name="id" value="id"></s:param>
												<img width="150" height="150"
													src="<s:property value="#request.get('javax.servlet.forward.context_path')"/>/upload/<s:property value="uploadFile.path"/>">
											</s:a></td>
									</tr>
									<tr bgcolor="#f2eec9">
										<td align="right" width="90">商品名称：</td>
										<td><s:a action="product_select" namespace="/product">
												<s:param name="id" value="id"></s:param>
												<s:property value="name" />
											</s:a></td>
									</tr>
									<tr>
										<td align="right" width="90">市场价格：</td>
										<td><font style="text-decoration: line-through;">
												<s:property value="marketprice" />
										</font></td>
									</tr>
									<tr bgcolor="#f2eec9">
										<td align="right" width="90">天下淘价格：</td>
										<td><s:property value="sellprice" /> <s:if
												test="sellprice <= marketprice">
												<font color="red">节省<s:property
														value="marketprice-sellprice" /></font>
											</s:if></td>
									</tr>
									<tr>
										<td colspan="2" align="right"><s:a
												action="product_select" namespace="/product">
												<s:param name="id" value="id"></s:param>
												<img src="${context_path}/css/images/gm_06.gif" width="136"
													height="32" />
											</s:a></td>
									</tr>
								</table>
							</li>
						</ul>
					</s:iterator>
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