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
		<%-- <jsp:include page="./top.jsp"></jsp:include>
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-2 sidenav">
					<jsp:include page="./layout/emp_menu.jsp"></jsp:include>
				</div>
				
				<div class="col-lg-10">
					<% MemberDTO data = (MemberDTO) request.getAttribute("data"); %>
					<% if(data != null) { %>
						<h2><%= data.getId() %>님 로그인 성공</h2>
					<% } %>
				</div>
			</div>
		</div> --%>
		
		<% MemberDTO data = (MemberDTO) request.getAttribute("data"); %>
		<% if(data != null) { %>
			<h2><%= data.getId() %>님 로그인 성공</h2>
		<% } %>
	</body>
</html>