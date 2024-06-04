<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<body>
	<h3>AJAX</h3>
	<form name="myform" action="">
		<input type="text" name="id" id="id" />
		<input type="text" name="name" id="name" />
		<input type="button" value="AJAX" id="AJAX" />
		<input type="button" value="No_AJAX" id="No_AJAX" />
	</form>
	<div id="result">${msg}</div>
	<div id="result2"></div>
	<h3>구구단출력하기</h3>
	<form name="myform">
		<input type="text" name="id" id="dan"/>
		<input type="button" id="guguajaxbtn" value="구구단출력">
	</form>
	<div id="guguresult"></div>
</body>
<script type="text/javascript">
	$(document).ready(function() {
		alert("test");
		
		$("#No_AJAX").on("click", function() {
			location.href = "/examspring2/ajax/No_AJAX?id=" + $("#id").val();
		});
		
		$("#AJAX").on("click", function() {
			let querydata = {"id": $("#id").val(), "pass": "1234"};
			
			$.ajax({
				url: "/examspring2/ajax/AJAX",
				type: "get",
				data: querydata,
				success: success_run, 
				error: error_run
			});
			
		});
		
		$("#guguajaxbtn").on("click", function() {
			let querydata = {"dan": $("#dan").val()};
			
			$.ajax({
				url: "/examspring2/ajax/gugu",
				type: "get",
				data: querydata,
				success: success_gugu, 
				error: error_run
			});
			
		});
		
		function success_run(result) {
			alert("good" + result);	
			$("#result2").html("<h2>test: " + result + "</h2>");
		}
		
		function error_run(obj, msg, statusMsg) {
			alert("bad" + obj + ", " + msg + ", " + statusMsg);	
		}
		
		function success_gugu(result) {
			alert("good" + result);	
			$("#guguresult").html("<h2>" + result + "</h2>");
		}
	});
</script>
</html>