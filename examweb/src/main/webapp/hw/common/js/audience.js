function member() {
	let audience = prompt("입장객 명수를 입력하시오. \n(단, 한 줄당 좌석은 5석이며 숫자만 입력하시오.)");
	let seat = 5;
	
	if(audience && !isNaN(audience) && !/\W/.test(audience)) {
		console.log(audience);
		document.write("<h1 style='text-align= center'>자리배치도</h1>");
		document.write(
			`<p style='text-align= center'; font-size='30px'>
				모두 ${Math.ceil(audience / seat)}개의 줄이 필요합니다.
			</p>`
		);
	} else {
		console.log(audience);
		alert("숫자만 입력하시오.");
	};
};