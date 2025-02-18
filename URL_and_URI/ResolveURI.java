import java.net.*;

public class ResolveURI {
    public static void Main(String[]args) throws Exception{
        URI baseUri = new URI("https://example.com/");
        URI relativeUri = new URI("blog/article.html");

        URI resolveUri = baseUri.resolve(relativeUri);
            
        System.out.println("Resolve URi :"  + resolveUri);
        
            }
          
}
