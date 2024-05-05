<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	test
	<h3><a href="/examspring/test">test1</a></h3>
	<h3><a href="/examspring/gugu">test2</a></h3>
	<h3><a href="/examspring/showview">test3</a></h3>
	<h3><a href="/examspring/showpost">test4</a></h3>
	<h3><a href="/examspring/insert">test5</a></h3>
	<h3><a href="/examspring/insert2">test6</a></h3>
	
	<form action="/examspring/test" method="post">
		<input type="submit" value="test">
	</form>
	
	<form action="/examspring/gugu" method="get">
		<input type="submit" value="test2">
	</form>
</body>
</html>