import java.net.*;
import java.util.*;

public class RetrieveAllHeader {
    public static void main(String[] args) {

        try {
            URI uri = new URI("https://www.example.com");
            URL url = uri.toURL();
            URLConnection connection = url.openConnection();

            Map<String, List<String>> headers = connection.getHeaderFields();

            for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
                String headerName = entry.getKey();
                List<String> headervalues = entry.getValue();

                if (headerName != null) {
                    System.out.println(headerName + ":" + String.join(",", headervalues));
                } else {
                    System.out.println("Status: " + String.join(",", headervalues));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
