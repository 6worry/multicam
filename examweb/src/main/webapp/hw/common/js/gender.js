function number() {
	let gender = prompt("성별 평가 숫자를 입력하시오");
	
	if(gender == 1 || gender == 2 || gender == 3 || gender == 4) {
		let age = prompt("나이를 입력하시오");
		let man = (gender == 1 || gender == 3);
		let woman = (gender == 2 || gender == 4);
		let adult = (age >= 20);
		let kid = (age > 0 && age < 20);
		
		if(man) {
			if(adult) {
				document.write("<p>성인남자</p>");
			} else if(kid) {
				document.write("<p>청소년남자</p>");
			} else {
				alert("나이 기입 잘못 입력!");
			};
		} else if (woman){
			if(adult) {
				document.write("<p>성인여자</p>");
			} else if(kid){
				document.write("<p>청소년여자</p>");
			} else {
				alert("나이 기입 잘못 입력!");
			};
		};
	} else {
		alert("잘못 입력!");
	};
};