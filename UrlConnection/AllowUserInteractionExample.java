import java.io.IOException;
import java.net.*;


public class AllowUserInteractionExample{
    public static void main(String [] args){
        try {
            URI uri = new URI("https://www.example.com");
            URL url = uri.toUrl();

            URLConnection = connection = url.openConnection();

            connection.setAllowUserInteraction(true);
            System.out.println("Is user interaction allowed? " + connection.getAllowUserInteraction());


        }catch (URLSyntaxException e){
            System.err.println("Invalid URL : " + e.getMessage());

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}