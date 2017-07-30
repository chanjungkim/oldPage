
i = 1;
password = prompt("접근 번호를 입력하세요.");
if(password == "305a" || password == "305A"){
	alert("반갑습니다. 즐거운 스터디 되세요!");
	i = 0;
} else {
	warn(i);
}
function warn(i) {
	while( i > 0) {
		password = prompt("Warning: 접근 거부! 다시 입력하세요");
		if(password == "305a" || password == "305A"){
			alert("반갑습니다. 즐거운 스터디 되세요!");
			i = 0;
		} else {
			warn(i);
		}
	}
}
