<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
let person = 
	{
			"name": "진영록",
			"history": [
				{
					"subject": "java",
					"month": "3"
				},
				{
					"subject": "servlet",
					"month": "3"
				}
			],
			"addr": {
				"zip": "111-222",
				"addr1": "인천시"
			},
			"score": {
				"mnet": "1",
				"mbc": "1"
			},
			"age": "25",
			"id": "test1",
			"subject": [
				"java",
				"hadoop",
				"secure-coding"
			]
		};
	
	alert(person);
	
	document.write(person.name);
	document.write(person.id);
	document.write(person.age);
	document.write(person.score.mnet);
	document.write(person.score.mbc);
	document.write(person.subject[0]);
	document.write(person.subject[1]);
	document.write(person.subject[2]);
</script>
</body>
</html>