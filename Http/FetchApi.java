import java.net.http.*;
import java.net.URI;
import java.nio.charset.StandardCharsets;
public class FetchApi{
    public static void main(String[] args){
        
        HttpClient client = HttpClient.newHttpClient();
        String json = "{\"title\":\"foo\", \"body\":\"bar\", \"userId\":1}";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json, StandardCharsets.UTF_8))
                .build();

        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
    }
}
