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
<form>
		글번호:<input type="text" name="boardno" id="boardno"/>
		<input type="button" value="ajax테스트" id="testbtn"/>
		<input type="button" value="ajaxjson테스트" id="testjsonbtn"/>
	</form>
	<div id="result">
		<h4>글번호:<span id="no"></span></h4>
		<h4>제목:<span id="title"></span></h4>
		<h4>작성자:<span id="writer"></span></h4>
		<h4>내용:<span id="content"></span></h4>
	</div>
	<div id="printarr">
	
	</div>
</body>
<script type="text/javascript">
	$(document).ready(function() {
		$("#testbtn").on("click", function() {
			let querydata = {"boardno": $("#boardno").val()}
			
			$.ajax({
				url: "/examspring2/ajax/exam01",
				type: "get",
				data: querydata,
				dataType: "json",
				success: success_run, 
				error: error_run
			});
		});
		
		$("#testjsonbtn").on("click", function() {
			let querydata = {"boardno": $("#boardno").val()}
			
			$.ajax({
				url: "/examspring2/ajax/exam02",
				type: "get",
				data: querydata,
				dataType: "json",
				success: success_run2, 
				error: error_run
			});
		});
	});
	
	function success_run(result) {
		console.log("good" + result);	
		$("#no").html(" " + result.board_no);
		$("#title").html(" " + result.title);
		$("#writer").html(" " + result.id);
		$("#content").html(" " + result.content);
	}
	
	function success_run2(result) {
		console.log("good" + result);	
		let printarr = "";
		
		/* result.forEach(function(boardDTO) {
			printarr += "<h4>글번호: " + boardDTO.board_no + "</h4>";
			printarr += "<h4>제목: " + boardDTO.title + "</h4>";
			printarr += "<h4>작성자: " + boardDTO.id + "</h4>";
			printarr += "<h4>내용: " + boardDTO.content + "</h4><hr>";
		});
		
		$("#printarr").html(printarr); */
		
		/* for(const value of result) {
			printarr += "<h3>글번호: " + value.board_no + "</h3>";
			printarr += "<h3>제목: " + value.title + "</h3>";
			printarr += "<h3>작성자: " + value.id + "</h3>";
			printarr += "<h3>내용: " + value.content + "</h3>";
		}
		
		$("#printarr").html(printarr); */
		
		 result.filter(value => value.board_no <50)
		 		.forEach(value => {
			printarr += "<h4>글번호: " + value.board_no + "</h4>";
			printarr += "<h4>제목: " + value.title + "</h4>";
			printarr += "<h4>작성자: " + value.id + "</h4>";
			printarr += "<h4>내용: " + value.content + "</h4><hr>";
		});
		
		$("#printarr").html(printarr); 
		
	}
	
	function error_run(obj, msg, statusMsg) {
		console.log("bad" + obj + ", " + msg + ", " + statusMsg);	
	}
	
</script>
</html>