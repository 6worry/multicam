<%@page import="exam.mvc.dept.DeptDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>postResult</title>
</head>
<body>
	<% DeptDTO dto = (DeptDTO) request.getAttribute("dto"); %>
	<h2>DTO3</h2>
	<hr />
	<h3><%= dto.getDeptCode() %></h3>
	<h3><%= dto.getDeptName() %></h3>
	<h3><%= dto.getTel() %></h3>
	<h3><%= dto.getAddr() %></h3>
</body>
</html>