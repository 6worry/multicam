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
<jsp:include page="../../view/top.jsp"></jsp:include>
<div class="container-fluid">
		<div class="row">
			<div class="col-lg-2 sidenav">
				<jsp:include page="../../layout/emp_menu.jsp"></jsp:include>
			</div>
			
			<div class="col-lg-10">
				<% int result = (int) request.getAttribute("insert"); %>
				<% if(result >0) { %>
						<h1><%= result %>개 성공</h1>
				<% } else { %>
					<h2>실패</h2>
				<% } %>
			</div>
		</div>
	</div>
</body>
</html>