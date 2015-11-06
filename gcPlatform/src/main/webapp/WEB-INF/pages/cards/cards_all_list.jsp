<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:set var="context_path"
	value="#request.get('javax.servlet.forward.context_path')"></s:set>
	
  <s:if test="pageModel != null && pageModel.list.size() > 0">
  <ul class="product-source">
	<s:iterator value="pageModel.list">
	
	    <li class="product-source">
			<div class="col-md-3">
				<tr>
					<td >
					<s:a action="cards_select" namespace="/cards" >
						<s:param name="id" value="id"></s:param>
						 
						<img width="150" height="150" src="<s:property value="#request.get('javax.servlet.forward.context_path')"/>/images/<s:property value="path"/>">
					  
					</s:a>
					</td>
				</tr>
				<tr bgcolor="#f2eec9">
					<td >Name：</td>
					<td>
					<s:a action="cards_select" namespace="/cards" >
						<s:param name="id" value="id"></s:param>
						<s:property value="name" />
					</s:a>
					</td>
				</tr>
				<tr>
					<td >Description：</td>
					<td>
						<s:property value="description"/>
					</td>
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
	
	
	
