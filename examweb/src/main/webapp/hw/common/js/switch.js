function score() {
	let score = prompt("점수는?");
	let negation = (score == null || isNaN(score)|| !/[^\W.]/.test(score));
	
	if(negation) {
		document.write("<h1>점수 잘못입력</h1>");
	} else {
		switch(true) {
			case(score >= 90 && score <= 100):
				document.write("<h1>점수: " + score +" 수</h1>");
				break;
			case(score >= 80 && score < 90):
				document.write("<h1>점수: " + score +" 우</h1>");
				break;
			case(score >= 70 && score < 80):
				document.write("<h1>점수: " + score +" 미</h1>");
				break;
			case(score >= 60 && score < 70):
				document.write("<h1>점수: " + score +" 양</h1>");
				break;
			case(score >= 0 && score < 60):
				document.write("<h1>점수: " + score +" 가</h1>");
		};
	};
};