function picture() {
	let n =1;
	
	do {
		let i = 1;
		
		do {
			document.write("<img src='./common/images/bts.jpg' width='70px;'>");
			i++;
		} while(i <=5 );
		
		document.write("<br />");
		n++;
	} while (n<=5);
};