import java.net.*;

public class OpenUrlConnection{
    
    public static void main(String [] args) throws Exception  {

        URI uri= new URI("https://www.example.com");
        URL url = uri.toURL();
        URLConnection connection = url.openConnection();
        System.out.println("Connection opened to" + url);
        connection.setRequestProperty("Accept", "text/html");
        connection.setRequestProperty("Accept", "json/xml");
        System.out.println("Content-type:" + connection.getHeaderField("Content-Type"));
        System.out.println("Content-length:" + connection.getHeaderField("Content-Length"));
    }
}