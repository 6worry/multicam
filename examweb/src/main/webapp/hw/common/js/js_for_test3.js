function number() {
	let gugudan = prompt("출력할 단을 입력하세요.");
	let negation = (gugudan == null || isNaN(gugudan) || /\W/.test(gugudan));
	
	if (negation) {
		alert("다시 입력하세요.");
	} else if (gugudan >= 1 && gugudan <= 9) {
        document.write("<table border= 1px solid>");

        for (let i = 1; i < 10; i++) {
            document.write(`<tr><td> ${gugudan} * ${i} = ` + (gugudan * i) + "</td></tr>");
        };

        document.write("</table>");
    } else {
        alert("그만");
    };
};