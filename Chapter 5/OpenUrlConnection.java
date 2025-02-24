import java.net.*;

public class OpenUrlConnection{
    
    public static void main(String [] args) throws Exception  {

        URI uri= new URI("https://www.example.com");
        URL url = uri.toURL();
        URLConnection connection = url.openConnection();
        System.out.println("Connection open to" + url);
        System.out.println(connection);

    }
}