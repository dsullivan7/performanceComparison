function fib(n){
	if(n === 1 || n === 0){
		return 1;
	}else{
		return fib(n - 2) + fib(n - 1); 
	}	

}

var num = process.argv[2];
var start = new Date().getTime();
console.log(fib(num));
var end = new Date().getTime();

console.log("This took: " + (end - start) + " milliseconds");


