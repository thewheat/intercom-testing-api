package main

import "fmt";
import intercom "gopkg.in/intercom/intercom-go.v2";

func main() {
	// enter your configuration here
	APP_ID := "";
	API_KEY := "";
	// end of configuration

	ic := intercom.NewClient(APP_ID, API_KEY)

	userList, err := ic.Users.List(intercom.PageParams{Page: 1})

	if(err != nil){
		fmt.Printf("Error. Abort Abort! %+v\n", err);
		return;
	}

	//fmt.Printf("Total number of users: " + userList.TotalCount + "\n");
	fmt.Printf("Page details: %+v\n", userList.Pages);
	fmt.Printf("Total pages: %d\n",  userList.Pages.TotalPages);
	fmt.Printf("First User (if any): \n");
	if len(userList.Users) > 0 {
		fmt.Printf("%+v\n", userList.Users[0]);
	}
}