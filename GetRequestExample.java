import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URI;
import java.net.URLEncoder;


public class GetRequestExample{
    public static void main(String[]args){
        try{
            String baseUrl = "https://jsonplaceholder.typicode.com/users";

            String param1 = URLEncoder.encode("value1", "UTF-8");
            String param2  =  URLEncoder.encode("value2" , "UTF-8");



            String fulURL = baseUrl + "?param1=" + param1 + "&param2=" + param2;

            URI uri = new URI(fulURL);
            URL url = uri.toURL();

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            connection.setRequestProperty("User-Agent", "Mozilla/5.0");

            int responseCode = connection.getResponseCode();

            System.out.println("Response Code :" + responseCode);

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String inputLine;

            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null){
                response.append(inputLine);

            }

            in.close();

            System.out.println("Response from server : " + response.toString());


        } catch(Exception e){
            e.printStackTrace();
        }
    }
}