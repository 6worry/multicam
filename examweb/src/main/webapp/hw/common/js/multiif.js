function number() {
	let ssn = prompt("주민번호의 7번째 값을 입력하세요.");
	let test = (ssn.length == 1 && /^[0-9]{1}$/.test(ssn));
	if (test && ssn === 1 || ssn === 3 ) {
		document.write("남자");
	} else if (test && ssn === 2 || ssn === 4) {
		document.write("여자");
	} else {
		document.write("기타");	
	};
};