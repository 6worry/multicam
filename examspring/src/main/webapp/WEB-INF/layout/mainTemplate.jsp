<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mainTemplate</title>
 <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<!-- top영역 -->
	<tiles:insertAttribute name="top" />
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-2 sidenav">
				<tiles:insertAttribute name="menu" />
			</div>
				
			<div class="col-lg-10">
				<tiles:insertAttribute name="content" />
			</div>
		</div>
	</div>
</body>
</html>