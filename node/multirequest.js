var proxy = process.argv[3]
var num = parseInt(process.argv[2]) || 100;
var request = require('request').defaults({proxy:proxy})


var then = new Date().getTime();
var successNum = 0;
for(var i = 0; i <num; i++){
	request('http://www.google.com', function (error, response, body) {
		if (!error && response.statusCode == 200) {
			successNum += 1;	
		}
		if(successNum === num){
			var now = new Date().getTime();
			console.log("There were " + successNum + " successful requests!")
			console.log("this took: " + (now - then) + " milleseconds")
		}
	})
}
