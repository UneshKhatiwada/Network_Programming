import java.net.URI;


public class CreatingURI {
    public static void main(String[] args) {
        try {
            URI uri = new URI("hhtps://example.com");
            System.out.println( "URI: " + uri );

           
            
        } catch (Exception e) {
            System.out.println("Invalid URI syntax: " + e.getMessage());
        }
    }
}
