function showArr(arr) {
	for(let i =0; i < arr.length; i++) {
		document.write("<p>점수: " + arr[i] + "</P>");
	};
};

function array() {
	let arr = new Array(99, 89, 100, 100, 99);
	showArr(arr);
	let total = 0;
	
	for(let i =0; i < arr.length; i++) {
		total = total + arr[i];
	};
	
	document.write("<p>합계: " + total +"</p>");
	document.write("<p>평균: " + total/arr.length +"</p>");
};