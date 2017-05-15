var balance = 5000;
prompt(balance);
if ( balance>=0 ){
	alert("The balance is positive");
	if ( balance > 10000 ){
		alert("The balance is large!");
	}
} else {
	alert("The balance is negative");
}