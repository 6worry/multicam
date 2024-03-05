/*function test1() {
	alert("test1");
};

function test2() {
	confirm("test2");
};

function test3() {
	prompt("test3");
};*/

function printType() {
	const krLang = 98;
	const eng = 100;
	const math = 97;
	
	const total = krLang + eng + math;
	const avg = Math.floor(total / 3);
	/*const avg = total / 3;*/

	document.write("[출력형식]" + "<br />");
	document.write("국어: " + krLang + "<br />");
	document.write("수학: " + math + "<br />");
	document.write("영어: " + eng + "<br />");
	document.write("총점: " + total + "<br />");
	document.write("평균: " + avg);
};