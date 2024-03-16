function array() {
	let myarr = [5, 7, 9, 10, 5];
	let myfunc = (arr => arr * 5);
	let myfunc2 = (arr => arr % 2 === 0);
	let newArr = myarr.map(myfunc);
	let newArr2 = myarr.map(myfunc2);
	
	newArr.forEach((item) => {
		document.write("<p>" + item + "</p>");
	});
	
	newArr2.forEach((item) => {
		document.write("<p>" + item + "</p>");
	});
};