require Intercom.Client

defmodule TestingIntercomElixir do

	# enter your configuration here
	app_id = "";
	api_key = "";
	token = "";
	# end of configuration

	if (token != "") do
		app_id = token;
		api_key = "";
	end

	Intercom.Client.start

	response = Intercom.Client.get!(
	  "/users",
	  [],
	  hackney: Intercom.Client.auth(app_id, api_key)
	)
	output = Poison.Parser.parse!(response.body)

	IO.puts "Total number of users: #{output["total_count"]}";
	IO.puts "Page details: #{inspect output["pages"]}";
	IO.puts "Total pages: #{output["pages"]["total_pages"]}";
	IO.puts "First User (if any): ";
	if length(output["users"]) > 0 do
		IO.inspect List.first(output["users"])
	end 
end