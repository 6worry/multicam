<%@page import="member.MemberDTO"%>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<jsp:include page="../../view/top.jsp"></jsp:include>
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-2 sidenav">
				<jsp:include page="../../layout/emp_menu.jsp"></jsp:include>
			</div>
			
			<div class="col-lg-10">
				<jsp:include page="/mvc/member/search.jsp"></jsp:include>
				<table border='1' style='border-color: red'>
			        <tr>
			        <th>ID</th>
			        <th>Password</th>
			        <th>Name</th>
			        <th>Address</th>
			        <th>RegDate</th>
			        <th>Point</th>
			        <th>Info</th>
			        <th>삭제</th>
			        </tr>
					<% ArrayList<MemberDTO> dataList = (ArrayList<MemberDTO>) request.getAttribute("list"); %>
					<% for(MemberDTO data: dataList) {%>
			            <tr>
			            <td><a href ="/examservlet/mvc/read?id=<%= data.getId() %>"><%= data.getId() %></a></td>
			            <td><%= data.getPass() %></td>
			            <td><%= data.getName() %></td>
			            <td><%= data.getAddr() %></td>
			            <td><%= data.getRegDate() %></td>
			            <td><%= data.getPoint() %></td>
			            <td><%= data.getInfo() %></td>
			            <td><a href="/examservlet/mvc/delete?id=<%= data.getId() %>">삭제</a></td>
			            </tr>
		       		<% } %>
				</table>
			</div>
		</div>
	</div>
	</body>
</html>