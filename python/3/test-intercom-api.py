import requests;

# enter your configuration here
APP_ID = None;
API_KEY = None;
TOKEN = None; # if specified, till take precedence over APP_ID/API_KEY
# end of configuration

if TOKEN is not None and TOKEN != "" :
	APP_ID = TOKEN;
	API_KEY = None;

response = requests.get("https://api.intercom.io/users", auth=(APP_ID, API_KEY), headers={"Accept": "application/json"})
output = response.json()
print("Total number of users: %d" %(output["total_count"]));
print("Page details:");
print(output["pages"]);
print("Total pages: %d" %(output["pages"]["total_pages"]));
print("First User (if any):");
if len(output["users"]) > 0 :
	print(output["users"][0]);