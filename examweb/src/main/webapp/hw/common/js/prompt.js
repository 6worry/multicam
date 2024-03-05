function button() {
	let num = prompt("숫자를 입력하시오");
	
	if (num % 5 === 0 && num != null && !isNaN(num)) {
		alert("5의 배수!");
		/*document.write("5의 배수" + "<img src='../images/bts.jpg'>");*/
		document.write("5의 배수" + "<img src='./common/images/bts.jpg'>");
	} else if(num === null || isNaN(num)) {
		alert("숫자를 입력해야합나다.");
	} else {
		alert("5의 배수가 아님!");
		/*document.write("5의 배수가 아닙니다." + "<img src='../images/garden01.jpg'>");*/
		document.write("5의 배수가 아닙니다." + "<img src='./common/images/garden01.jpg'>");
	};
};