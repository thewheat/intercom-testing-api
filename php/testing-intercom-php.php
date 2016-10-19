<?php
require "vendor/autoload.php";


// enter your configuration here
$APP_ID = null;
$API_KEY = null;
$TOKEN = null; // if specified, till take precedence over APP_ID/API_KEY
// end of configuration


use Intercom\IntercomClient;

if($TOKEN != null && trim($TOKEN) != ""){
	$APP_ID = $TOKEN;
	$API_KEY = null;
}
$client = new IntercomClient($APP_ID, $API_KEY);

$users = $client->users->getUsers([]);

echo("Total number of users: " . $users->total_count . "\n");
echo("Page details: \n");
print_r($users->pages);
echo("\nTotal pages: " . $users->pages->total_pages);
echo("First User (if any): \n");
print_r(@$users->users[0]);