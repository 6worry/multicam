<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>paramtest</title>
</head>
<body>
	<h3><a href="/examspring/paramtest?data=first&info=1000">parameter</a></h3>
	<form method="post" action="/examspring/paramtest2">
		Data: <input type="text" name="data" />
		ID: <input type="text" name="id" />
		PW: <input type="text" name="pw" />
		<input type="submit" value="parameter" />
	</form>
	
	<form method="get" action="/examspring/paramtest">
		Data: <input type="text" name="data" />
		ID: <input type="text" name="id" />
		PW: <input type="text" name="pw" />
		<input type="submit" value="parameter" />
	</form>
	
	<h2>parameter test- command</h2>
	<form method="post" action="/examspring/cmdtest">
		Data: <input type="text" name="data" />
		ID: <input type="text" name="id" />
		PW: <input type="text" name="pw" />
		<input type="submit" value="parameter" />
	</form>
	
	<% if(request.getAttribute("data") != null) { %>
        <p>Data: <%= request.getAttribute("data") %></p>
        <p>ID: <%= request.getAttribute("id") %></p>
        <p>PW: <%= request.getAttribute("pw") %></p>
    <% } %>
</body>
</html>