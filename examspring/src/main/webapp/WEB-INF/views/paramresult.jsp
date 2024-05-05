<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>paramresult</title>
</head>
<body>
	<h2>response view</h2>
	<hr />
	<h3><%= request.getAttribute("msg") %></h3>
	<h3>${msg}</h3>
	<h3>${data}</h3>
</body>
</html>