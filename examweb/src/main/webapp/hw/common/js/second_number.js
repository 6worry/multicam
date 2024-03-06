function number() {
	let first_num = prompt("숫자를 입력하시오");
	let first_nagation = (first_num == null || isNaN(first_num)|| !/[^\W-.]/.test(first_num));
	
	if(first_nagation) {
		console.log(first_num);
		alert("알맞은 숫자를 입력해주세요.");
		return;
	};

	let second_num = prompt("숫자를 하나 더 입력하시오");
	let second_nagation = (second_num == null || isNaN(second_num)|| !/[^\W-.]/.test(second_num));
	let compare = (first_num < 10 || second_num < 10);
	
	if(compare && !second_nagation) {
		document.write("둘 중 최소 하나는 10 미만입니다.");
	} else if(!compare && !second_nagation) {
		document.write("둘다 10 미만이 아닙니다.");
	} else if(second_nagation) {
		console.log(first_num);
		console.log(second_num);
		alert("알맞은 숫자를 입력해주세요.");
		return;
	};
};