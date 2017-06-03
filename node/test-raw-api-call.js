var request = require('request');

// enter your configuration here
var TOKEN = "";
// end of configuration

var headers = {
	'Accept': 'application/json',
	'Content-Type': 'application/json',
	'Authorization': 'Bearer ' + TOKEN
}
function printOutput(error, response, body){
  console.log('error:', error); // Print the error if one occurred
  console.log('statusCode:', response && response.statusCode); // Print the response status code if a response was received
  console.log('body:', body); // Print the HTML for the Google homepage.
}

// GET reqeust
request.get({url:"https://api.intercom.io/users", headers:headers}, printOutput);

//# POST request
var data = {'user_id' : '1', 'name' : 'User 1 Node', 'custom_attributes' : {'test_string' : 'test string node'}};
request.post({url:"https://api.intercom.io/users", headers:headers, body: JSON.stringify(data)}, printOutput);