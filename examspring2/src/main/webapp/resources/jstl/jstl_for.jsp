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
	<c:forEach var="i" begin="1" end="10" step="3" varStatus="j">
		<h3>${i}, index = ${j.index}, first = ${j.first}, last = ${j.last}, 
			begin = ${j.begin}, end = ${j.end}, step = ${j.step}
		</h3>
	</c:forEach>
	
	<c:forEach var="i" begin="1" end="9">
		<h3>7 * ${i} = ${7 * i}</h3>
	</c:forEach>
</body>
</html>