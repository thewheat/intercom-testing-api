using System;
using Intercom.Clients;
using Intercom.Core;
using Intercom.Data;
using Newtonsoft.Json;

namespace testing_intercom_dotnet
{
	class MainClass
	{
		public static void Main(string[] args)
		{
			// enter your configuration here
			string APP_ID = null;
			string API_KEY = null;
			string TOKEN = null; // if specified, till take precedence over APP_ID/API_KEY
			// end of configuration

			UsersClient usersClient;
			if (!String.IsNullOrWhiteSpace(TOKEN))
			{
				usersClient = new UsersClient(new Authentication(TOKEN));
			}
			else {
				usersClient = new UsersClient(new Authentication(APP_ID, API_KEY));
			}


			Users users = usersClient.List();

			Console.WriteLine("Total number of users: " + users.total_count + "\n");
			Console.WriteLine("Page details: \n");
			Console.WriteLine(JsonConvert.SerializeObject(users.pages));
			Console.WriteLine("\nTotal pages: " + users.pages.total_pages);
			Console.WriteLine("First User (if any): \n");
			foreach (User user in users.users)
			{
				Console.WriteLine(JsonConvert.SerializeObject(user));
				break;
			}
		}
	}
}
