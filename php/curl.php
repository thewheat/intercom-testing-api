<?php
$url = 'https://api.intercom.io/users';

$curl = curl_init($url);

curl_setopt($curl, CURLOPT_HTTPHEADER, array(
    'Content-Type: application/json', 
    'Accept: application/json', 
    'Authorization: Bearer YOUR_ACCESS_TOKEN'
));
curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);                                                                      

# For POST requests - 1
#$data = array("user_id" => "13"); 
#$data_string = json_encode($data);                                                                                   
#curl_setopt($curl, CURLOPT_CUSTOMREQUEST, "POST");                                                                     
# curl_setopt($curl, CURLOPT_POSTFIELDS, $data_string);                                                                  
# For POST requests - 0

$result = curl_exec($curl);
curl_close($curl);

# echo $result;
print_r(json_decode($result, true)["users"][0]);

?>