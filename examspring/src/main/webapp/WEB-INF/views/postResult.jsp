<%@page import="exam.mvc.PostDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>postResult</title>
</head>
<body>
	<% PostDTO dto = (PostDTO) request.getAttribute("dto"); %>
	<h2>DTO</h2>
	<hr />
	<h3><%= dto.getUserId() %></h3>
	<h3><%= dto.getuserName() %></h3>
	<h3><%= dto.getPasswd() %></h3>
	<h3><%= dto.getNickname() %></h3>
	<h3><%= dto.getGender() %></h3>
	<h3><%= dto.getJob() %></h3>
</body>
</html>