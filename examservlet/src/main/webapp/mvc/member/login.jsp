<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form method="post" action="/examservlet/mvc/login">
			id: <input type="text" name="id"/><br />
			pw: <input type="text" name="pass"/><br />
			<input type="submit" value="login" />
		</form>
	</body>
</html>