function number() {
	let num = prompt("숫자를 입력하시오");
	let negation = (num != null && !isNaN(num))
	
	if(num > 0 && num % 2 != 0 && negation && /\W/.test(num)) {
		document.write("<h1>양수이면서 홀수</h1>");
	} else if(num > 0 && num % 2 === 0 && negation && /\W/.test(num)) {
		document.write("<h1>양수이면서 짝수</h1>");
	} else if(num < 0 && negation && /[^\W-]/.test(num)) {
		document.write("<h1>음수</h1>");
	} else {
		console.log(num);
		alert("숫자를 입력해야합나다.");
	};
};