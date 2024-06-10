<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>gugudan</title>
	</head>
	<body>
	<h1>forTest</h1>
	<table border="1px solid">
		<% for(int i = 1; i < 10; i++) { %>
			<tr>
				<% for(int j = 1; j < 10; j++) { %>
					<td>
						<% if(i == j) { %>
							<img alt= "test" />
						<% } else { %>
							<%= i + " * " + j + " = " + i * j%>
						<% } %>
					</td>
				<% } %>
			</tr>
		<% } %>
	</table>
	</body>
</html>