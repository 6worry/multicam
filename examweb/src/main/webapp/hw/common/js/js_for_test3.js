function number() {
	let gugudan = prompt("출력할 단을 입력하세요.");
	let negation = (gugudan == null || isNaN(gugudan) || /\W/.test(gugudan));
	
	if (negation) {
		document.write("다시 입력하세요.");
	} else {
		for(let i = 1; i < 10; i++) {
			document.write("<table border= 1px solid>");
			if (gugudan == 1) {
				document.write(`<tr><td style= border: 1px solid> ${gugudan} * ${i} = ` + (gugudan * i) + "</td></tr>");
			} else if (gugudan == 2) {
				document.write(`<tr><td style= border: 1px solid> ${gugudan} * ${i} = ` + (gugudan * i) + "</td></tr>");
			} else if (gugudan == 3) {
				document.write(`<tr><td style= border: 1px solid> ${gugudan} * ${i} = ` + (gugudan * i) + "</td></tr>");
			} else if (gugudan == 4) {
				document.write(`<tr><td style= border: 1px solid> ${gugudan} * ${i} = ` + (gugudan * i) + "</td></tr>");
			} else if (gugudan == 5) {
				document.write(`<tr><td style= border: 1px solid> ${gugudan} * ${i} = ` + (gugudan * i) + "</td></tr>");
			} else if (gugudan == 6) {
				document.write(`<tr><td style= border: 1px solid> ${gugudan} * ${i} = ` + (gugudan * i) + "</td></tr>");
			} else if (gugudan == 7) {
				document.write(`<tr><td style= border: 1px solid> ${gugudan} * ${i} = ` + (gugudan * i) + "</td></tr>");
			} else if (gugudan == 8) {
				document.write(`<tr><td style= border: 1px solid> ${gugudan} * ${i} = ` + (gugudan * i) + "</td></tr>");
			} else if (gugudan == 9){
				document.write(`<tr><td style= border: 1px solid> ${gugudan} * ${i} = ` + (gugudan * i) + "</td></tr>");
			} else {
				alert("그만");
				return gugudan;
			};
			document.write("</table>");
		};
	};
};