import java.net.URI;

public class ReterivingURI {
    public static void main(String[] args) {
        try {
            URI uri = new URI("hhtps://example.com:8000/Report #1.pdf");

           
            System.out.println("Created URI: " + uri);
            System.out.println("Scheme: " + uri.getScheme());
            System.out.println("Authority: " + uri.getAuthority());
            System.out.println("Host: " + uri.getHost());
            System.out.println("Query: " + uri.getQuery());
            System.out.println("Port : " + uri.getPort());
            System.out.println("Fragment " + uri.getFragment());
        } catch (Exception e) {
            System.out.println("Invalid URI syntax: " + e.getMessage());
        }
    }
    
}
