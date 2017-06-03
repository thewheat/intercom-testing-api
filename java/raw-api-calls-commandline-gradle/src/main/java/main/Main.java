package main;

import java.util.List;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.entity.StringEntity;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.json.JSONObject;

public class Main {

    public static void main(String[] args) {
        // enter your configuration here
        String TOKEN = "";
        // end of configuration

        CloseableHttpResponse response;
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("https://api.intercom.io/users");
        httpGet.setHeader("Accept", "application/json");
        httpGet.setHeader("Content-type", "application/json");
        httpGet.setHeader("Authorization", "Bearer " + TOKEN);

        try{
            response = client.execute(httpGet);
            System.out.println(getOutput(response));
        }catch(Exception e){
            System.out.println("EXCEPTION: " + e.getMessage());
            System.out.println("EXCEPTION: " + e.getStackTrace());
        }


        HttpPost httpPost = new HttpPost("https://api.intercom.io/users");
        httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-type", "application/json");
        httpPost.setHeader("Authorization", "Bearer " + TOKEN);
        JSONObject json = new JSONObject()
             .put("user_id", "1")
             .put("name", "User 1 Java")
             .put("custom_attributes", new JSONObject()
                 .put("test_string", "test_string Java")
                 );
        try{
            StringEntity entity = new StringEntity(json.toString());
            httpPost.setEntity(entity);
            response = client.execute(httpPost);
            System.out.println(getOutput(response));
        }catch(Exception e){
            System.out.println("EXCEPTION: " + e.getMessage());
            System.out.println("EXCEPTION: " + e.getStackTrace());
        }

        try{
            client.close();
        }catch(Exception e){

        }
    }

    private static String getOutput(CloseableHttpResponse response){
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader =
                   new BufferedReader(new InputStreamReader(response.getEntity().getContent()), 65728);
            String line = null;

            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        }
        catch (Exception e) { e.printStackTrace(); }
        return sb.toString();
    }

}

