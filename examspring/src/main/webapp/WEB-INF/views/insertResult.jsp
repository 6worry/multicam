<%@page import="exam.mvc.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>postResult</title>
</head>
<body>
	<% MemberDTO dto = (MemberDTO) request.getAttribute("dto"); %>
	<h2>DTO2</h2>
	<hr />
	<h3><%= dto.getId() %></h3>
	<h3><%= dto.getPass() %></h3>
	<h3><%= dto.getName() %></h3>
	<h3><%= dto.getAddr() %></h3>
	<h3><%= dto.getInfo() %></h3>
</body>
</html>