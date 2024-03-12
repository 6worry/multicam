function printGugu() {
	let dan = prompt("출력할 단");
	document.write("<table border='1'>");
	
	for(i=1;i<=9;i++){
		document.write("<tr>");
		document.write("<td><h3>"+dan+"*"+i+"="+(dan*i)+"</h3></td>");
		document.write("</tr>");
	};
	
	document.write("</table>");
};

function getSum() {
	let num1 = parseInt(prompt("숫자1"));
	let num2 = parseInt(prompt("숫자2"));
	sum = 0;
	
	for(i = num1;i <= num2; i++){
		sum = sum + i
	};
	return sum;
};

function calc() {
	let num1 = parseInt(prompt("숫자1"));
	let num2 = parseInt(prompt("숫자2"));
	let operator = prompt("연산자 ex) +,-,*,/");
	let selectNum = (num1 != null && num2 != null);
	
	if (selectNum && operator === "+"){
		return (num1 + num2);
	} else if(selectNum && operator === "-") {
		return (num1 - num2);
	} else if(selectNum && operator === "*") {
		return (num1 * num2);
	} else if(selectNum && operator === "/") {
		return (num1 / num2);
	} else {
		alert("다시 입력하세요.");
	};
};