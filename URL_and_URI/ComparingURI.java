import java.net.URI;

public class ComparingURI {
    public static void main(String[] args) {
        try {
            URI uri = new URI("hhtps://example.com:8000/blog/article.html?name=value");
            System.out.println(uri);
           
           
        } catch (Exception e) {
            System.out.println("Invalid URI syntax: " + e.getMessage());
        }
    }
}
