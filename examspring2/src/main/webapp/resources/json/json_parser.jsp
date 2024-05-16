<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="result1"></div>
	<div id="result2"></div>
	<div id="result3"></div>
	<div id="result4"></div>
	
	<script type="text/javascript">
		let deptlist = '{"dept":' 
			+'[{"code":"001","name":"정보시스템팀","loc":"4층"},'
			+'{"code":"002","name":"시스템지원팀","loc":"7층"},'
			+'{"code":"003","name":"기업영업팀","loc":"6층"},'
			+'{"code":"004","name":"전산실","loc":"5층"}'
			+']'	
			+ '}';
			
		// alert(deptlist);
		
		let jsonObj = JSON.parse(deptlist);
		// alert(jsonObj);
		// alert(jsonObj.dept.length);
		
		for(let i = 1; i <= jsonObj.dept.length; i++) {
			document.getElementById("result" + i).innerHTML = jsonObj.dept[i-1].name;
		}
		
	</script>
</body>
</html>