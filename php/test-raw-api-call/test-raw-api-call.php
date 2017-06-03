<?php
require "vendor/autoload.php";

// enter your configuration here
$TOKEN = "";
// end of configuration

use GuzzleHttp\Client;

$headers = ['Accept' => 'application/json', 'Content-Type' => 'application/json', 'Authorization' => 'Bearer ' . $TOKEN];
$client = new GuzzleHttp\Client(['base_uri' => 'https://api.intercom.io/', 'headers' => $headers]);

function printOutput($response){
	print_r(getJson($response));
}
function getJson($response){
	return json_decode($response->getBody()->getContents());
}

# GET reqeust
$response = $client->request('GET', 'users');
printOutput($response);

# POST request
$data = ['user_id' => '1', 'name' => 'User 1 PHP', 'custom_attributes' => ['test_string' => 'test string from php']];
$response = $client->request('POST', 'users', ['json' => $data]);
printOutput($response);