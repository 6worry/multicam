function number() {
	let gugudan = prompt("몇까지 3의 배수를 찾을까요?");
	let negation = (gugudan == null || isNaN(gugudan) || /\W/.test(gugudan));
	
	if (negation) {
		alert("다시 입력하세요.");
	} else {
		document.write("<h1 style='text-align: center;'>3의 배수 찾기</h1>");
		document.write("<div style='text-align: center;'>");
		
		for(let i = 1; (3 * i) <= gugudan; i++) {
			document.write(`<span style="text-align: center;">${3 * i}</span>` + ", ");
		};
		
		document.write("</div>");
		document.write(`<p style= "color: red; text-align: center;">${gugudan}까지의 3의 배수의 개수: ${Math.floor(gugudan / 3)}</p>`);
	};
};