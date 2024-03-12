function number() {
    document.write("<h1>구구단</h1>");

    for (let i = 1; i < 10; i++) {
        document.write("<table style='display: inline-block; margin: 15px; border-collapse: collapse;' border='1px solid gray'>");
        document.write(`<tr><th style="text-align: center; background-color: gray;" >${i}단</th></tr>`);

        for (let j = 1; j < 10; j++) {
			if(j < 9) {
            	document.write(`<tr><td style="border-bottom: 1px dotted;"> ${i} * ${j} = ${i * j}</td></tr>`);
			} else {
				document.write(`<tr><td> ${i} * ${j} = ${i * j}</td></tr>`);	
			};
        };

        document.write("</table>");
    };
};
