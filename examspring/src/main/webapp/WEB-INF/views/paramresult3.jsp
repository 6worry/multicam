<%@page import="exam.mvc.ParamDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>paramresult</title>
</head>
<body>
	<% ParamDTO dto = (ParamDTO) request.getAttribute("dto"); %>
	<h2>DTO</h2>
	<hr />
	<h3><%= dto.getId() %></h3>
	<h3>${dto.data}</h3>
	<h3>${dto.pw}</h3>
</body>
</html>