function number() {
	let total = 0;
	let oddTotal = 0;
	let evenTotal = 0;
	let n = 1;
	
	while(n <= 100) {
		total += n;
		n++;
	};
	
	n = 1;
	
	while(n <= 50) {
		oddTotal += (2 * n - 1);
		evenTotal += (2 * n);
		n++;
	};
	
	document.write(total + "<br />");
	document.write(oddTotal + "<br />");
	document.write(evenTotal);
};