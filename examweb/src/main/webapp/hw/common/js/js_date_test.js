function date() {
	let day = new Date();
	let today = day.getDay();
	
	if(today == 0) {
		document.write("<img src='./common/images/m_garden01.jpg' />" 
		+ "<br / >" + "현재 요일: 일요일" + "<br />");
	} else if (today == 1) {
		document.write("<img src='./common/images/m_garden02.jpg' />" 
		+ "<br / >" + "현재 요일: 월요일" + "<br />");
	} else if (today == 2) {
		document.write("<img src='./common/images/m_garden03.jpg' />" 
		+ "<br / >" + "현재 요일: 화요일" + "<br />");
	} else if (today == 3) {
		document.write("<img src='./common/images/m_garden04.jpg' />" 
		+ "<br / >" + "현재 요일: 수요일" + "<br />");
	} else if (today == 4) {
		document.write("<img src='./common/images/m_garden05.jpg' />" 
		+ "<br / >" + "현재 요일: 목요일" + "<br />");
	} else if (today == 5) {
		document.write("<img src='./common/images/m_garden06.jpg' />" 
		+ "<br / >" + "현재 요일: 금요일" + "<br />");
	} else {
		document.write("<img src='./common/images/m_garden07.jpg' />" 
		+ "<br / >" + "현재 요일: 토요일" + "<br />");	
	};
};

function hour() {
	let day = new Date();
	let hour = day.getHours();
	
	if(hour < 12) {
		document.bgColor = "lime";
	} else {
		document.bgColor = "red";
	};
	
	document.write("현재 " + hour + "시" + "<br />");
};