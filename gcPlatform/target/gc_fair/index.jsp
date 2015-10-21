<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
		<h2>Struts 2 Global results</h2>
		<s:a action="Link_home">Home</s:a>
		<s:a action="Link_logout">Home</s:a>
		
		<h2>Struts 2 results</h2>
		<s:a action="Link_add">Add</s:a>
		<s:a action="Link_delete">Delete</s:a>
		
	</body>
</html>
