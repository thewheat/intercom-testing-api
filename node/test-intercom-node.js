// enter your configuration here
var APP_ID = "";
var API_KEY = "";
var TOKEN = "";
// end of configuration

var Intercom = require('intercom-client');
var client;
if(TOKEN != ""){
	client = new Intercom.Client({ token: TOKEN });
}{
	client = new Intercom.Client(APP_ID, API_KEY);
}

client.users.list(function (err, d) {
  if(err){
  	console.log("There is an error! Abort abort!", err.raw_body);
  	return;
  }
  else{
  	console.log("Output", d.raw_body);
  	var output = JSON.parse(d.raw_body);
	console.log("Total number of users: " + output.total_count + "\n");
	console.log("Page details: \n");
	console.log(output.pages);
	console.log("\nTotal pages: " + output.pages.total_pages);
	console.log("First User (if any): \n", output.users[0] || "");
  }
});

