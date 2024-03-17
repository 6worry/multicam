function test2() {
	let day = new Date();
	let month = day.getMonth();
	let year = day.getFullYear();
	let lastDate = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
	let firstDay = new Date(year, month, 1).getDay();
	let lastDay = 6 - (new Date(year, month, lastDate[month]).getDay());
	
	// 윤년 적용
	if(year % 4 == 0) {
		lastDate[1] = 29;
	};
	
	document.write("<h1>" + `${year}년 ${month + 1}월` + "</h1>");
	document.write("<table><tr>");
	document.write("<th>일</th>");
	document.write("<th>월</th>");
	document.write("<th>화</th>");
	document.write("<th>수</th>");
	document.write("<th>목</th>");
	document.write("<th>금</th>");
	document.write("<th>토</th>");
	document.write("</tr>");
	
	document.write("<tbody><tr>");
	
	// 1일 이전 공백처리
	for(let i = 0; i < firstDay; i++) {
        document.write("<td></td>");
    }
	
	for(let i = 1; i <= lastDate[month]; i++) {
		if ((i + firstDay - 1) % 7 === 0) {
            document.write("</tr><tr>");
        };
		
		if(i == day.getDate()) {
			document.write(`<td style="background-color: orange;">${i}</td>`);
		} else {			
        	document.write(`<td>${i}</td>`);
		};
	}
	
	// 말일 이후 공백처리
	for(let i = 0; i < lastDay; i++) {
        document.write("<td></td>");
    }
	
	document.write("</tr></tbody></table>");
}