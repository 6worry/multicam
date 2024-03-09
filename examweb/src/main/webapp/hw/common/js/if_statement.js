function score() {
	let score = prompt("점수는?");
	score.length = 3;
	let negation = (score == null || isNaN(score)|| !/[^\W-.]/.test(score));
	
	
	if(!negation && score >= 90 && score <= 100) {
		document.write("<h1>점수: " + num +" 수</h1>");
	} else if(!negation && score >= 80 && score < 90) {
		document.write("<h1>점수: " + num +" 우</h1>");
	} else if(!negation && score >= 70 && score < 80) {
		document.write("<h1>점수: " + num +" 미</h1>");
	} else if(!negation && score >= 60 && score < 70) {
		document.write("<h1>점수: " + num +" 양</h1>");
	} else if(!negation && score >= 0 && score < 60) {
		document.write("<h1>점수: " + num +" 가</h1>");
	} else {
		document.write("<h1>점수 잘못입력</h1>");
	};
};