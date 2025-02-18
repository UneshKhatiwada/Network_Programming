import java.io.*;
import java.io.InputStreamReader;
import java.net.*;

public class HttpGetExample{

    public static void main(String[] args) throws Exception{

        URI uri = new URI("https://jsonplaceholder.typicode.com/posts/1");
        URL url = uri.toURL();

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        int responseCode = conn.getResponseCode();
        System.out.println("Response Code: "+ responseCode);

        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line= reader.readLine())!= null) {
            System.out.println(line);
            
        }
        reader.close();
        
    }
}
