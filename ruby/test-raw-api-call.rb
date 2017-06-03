# gem install httparty
require 'httparty'

# enter your configuration here
TOKEN = "";
# end of configuration

headers = { 'Accept' => 'application/json', 'Content-Type' => 'application/json', 'Authorization' => "Bearer #{TOKEN}" }
base_uri = "https://api.intercom.io"

# GET reqeust
response = HTTParty.get("#{base_uri}/users", :headers => headers)
puts response.parsed_response

# POST request
body = { "user_id" => "1", "name" => "User 1 Ruby", "custom_attributes" => { "test_string" => "test string ruby"}}
response = HTTParty.post("#{base_uri}/users", :headers => headers, :body => body.to_json )
puts response.parsed_response
