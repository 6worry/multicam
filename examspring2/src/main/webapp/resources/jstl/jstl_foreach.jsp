<%@page import="test.TestDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% String[] arr = {"java", "servlet", "jsp", "spring"};%>
	
	<c:forEach var="data" items="<%= arr%>">
		<h3>${data}</h3>
	</c:forEach>
	
	<% 
		ArrayList<String> list = new ArrayList<String>(); 
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		request.setAttribute("list", list);
	%>
	
	<c:forEach var="data" items="${list}" varStatus="i">
		<h3>${data}, current = ${i.current}, index = ${i.index}</h3>
	</c:forEach>
	
	<% 
		ArrayList<TestDTO> list2 = new ArrayList<TestDTO>(); 
		list2.add(new TestDTO("1", "2", "3", "4", "5"));
		list2.add(new TestDTO("2", "3", "4", "5", "6"));
		list2.add(new TestDTO("3", "4", "5", "6", "7"));
		list2.add(new TestDTO("4", "5", "6", "7", "8"));
		list2.add(new TestDTO("5", "6", "7", "8", "9"));
		request.setAttribute("userlist", list2);
	%>
	
	<% 
		ArrayList<TestDTO> list3 = (ArrayList<TestDTO>)request.getAttribute("userlist"); 
	%>
	
	<% for(TestDTO dto: list3) {%>
		<h3><%= dto.getId() %>: <%= dto.getPass() %></h3>
	<% } %>
	
	<c:forEach var="user" items="${list3}">
		<h3>${user.id}: ${user.pass}</h3>
	</c:forEach>
	
</body>
</html>