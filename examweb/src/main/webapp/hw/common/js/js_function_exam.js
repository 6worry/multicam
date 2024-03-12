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

function getSum(Num1, Num2) {
	sum = 0;
	
	for(i = Num1; i <= Num2; i++){
		sum = sum + i
	};
	return sum;
};

function calc(num1, num2, operator) {
	// 값 직접 입력시 selectNum으로 에외처리
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