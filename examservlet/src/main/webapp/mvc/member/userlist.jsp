<%@page import="member.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<% MemberDTO data = (MemberDTO) request.getAttribute("data"); %>
		<% if(data != null) { %>
			<h1><%= data.getId() %>의 정보</h1>
		    <hr />
		    <h2>ID: <%= data.getId() %></h2>
		    <h2>Pass: <%= data.getPass() %></h2>
		    <h2>Name: <%= data.getName() %></h2>
		    <h2>Addr: <%= data.getAddr() %></h2>
		    <h2>RegDate: <%= data.getRegDate() %></h2>
		    <h2>Point: <%= data.getPoint() %></h2>
		    <h2>Info: <%= data.getInfo() %></h2>
	    <% } %>
	</body>
</html>