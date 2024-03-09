function number() {
	let total = 0;
	let oddTotal = 0;
	let evenTotal = 0;
	
	for(let i = 0; i < 100; i++) {
		total += (i + 1);
	};
	
	for(let j = 1; j <= 50; j++) {
		oddTotal += (2 * j - 1);
		evenTotal += (2 * j);
	};
	
	document.write(total + "<br />");
	document.write(oddTotal + "<br />");
	document.write(evenTotal);
};