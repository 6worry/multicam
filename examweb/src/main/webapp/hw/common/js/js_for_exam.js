function number() {
	document.write("<h1>구구단</h1>");
	
	for(let i = 1; i < 10; i++) {
		document.write(`<h3>${i}단</h3>`);
		
		for(let j = 1; j < 10; j++) {
			document.write(`<div> ${i} * ${j} = ` + (j * i) + "</div>");
		};
	};
};