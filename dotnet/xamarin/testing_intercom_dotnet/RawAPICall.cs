using System;
using RestSharp;

namespace testing_intercom_dotnet
{
	class RawAPICall
	{
		public static void run()
		{
			// enter your configuration here
			var TOKEN = "";
			// end of configuration

			var client = new RestClient("https://api.intercom.io");
			client.AddDefaultHeader("Accept", "application/json");
			client.AddDefaultHeader("Content-Type", "application/json");
			client.AddDefaultHeader("Authorization", "Bearer " + TOKEN);

			// GET reqeust
			var response = client.Execute(new RestRequest("users", Method.GET));
			Console.WriteLine(response.Content);

			// POST request
			var data = new { user_id = "1", name = "User 1 dotnet", custom_attributes = new { test_string = "test string dotnet" } };
			response = client.Execute(new RestRequest("users", Method.POST).AddJsonBody(data));
			Console.WriteLine(response.Content);
		}
	}
}
