

import io.intercom.api.Counts;
import io.intercom.api.User;
import io.intercom.api.UserCollection;
import io.intercom.api.Intercom;

public class Main {

    public static void main(String[] args) {
        // enter your configuration here
        String APP_ID = "";
        String API_KEY = "";
        String TOKEN = "";
        // end of configuration

        if(TOKEN != null && TOKEN.trim() != ""){
            Intercom.setToken(TOKEN);
        }else{
            Intercom.setAppID(APP_ID);
            Intercom.setApiKey(API_KEY);
        }

        Counts.Totals totals = Counts.appTotals();

        UserCollection users = User.list();
        System.out.println("Total number of users: " + totals.getUser().getValue());
        System.out.println("First User (if any):");
        if(users.hasNext())
            System.out.println(users.next().toString());

    }
}
