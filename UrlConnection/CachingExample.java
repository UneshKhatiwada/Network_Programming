import java.net.*;
import java.util.*;

public class CachingExample {

    public static void main(String[] args) {
        try {

            // define the urls to connect to
            URI uri = new URI("https://www.example.com");
            URL url = uri.toURL();
            URLConnection connection = url.openConnection();

            connection.setUseCaches(true);

            connection.connect();

            System.out.println("caching headers");
            printHeaderField(connection, "Cache-Control");
            printHeaderField(connection, "Expires");
            printHeaderField(connection, "Etag");
            printHeaderField(connection, "Last-Modified");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printHeaderField(URLConnection connection, String field) {
        Map<String, List<String>> headers = connection.getHeaderFields();
        List<String> values = headers.get(field);

        if (values != null) {
            System.out.println(field + ":" + String.join(",", values));
        } else {
            System.out.println(field + ": Not Present");
        }
    }
}