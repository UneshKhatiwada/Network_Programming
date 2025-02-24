import java.net.*;
import java.util.List;

public class RetrieveCookiesExample {
    public static void main(String[] args) throws Exception {
        CookieManager cookieManager = new CookieManager();
        CookieHandler.setDefault(cookieManager);

        URI uri = new URI("http://httpbin.org/cookies/set?user=JohnDoe&seesion=abc123");
        URL url = uri.toURL();
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.getResponseCode();

        CookieStore cookieStore = cookieManager.getCookieStore();
        List<HttpCookie> cookies = cookieStore.getCookies();

        System.out.println("Stored Cookies :");
        if (cookies.isEmpty()) {
            System.out.println(" No cookies Stores");

        } else {
            for (HttpCookie cookie : cookies) {
                System.out.println("Name: " + cookie.getName());
                System.out.println("value" + cookie.getValue());
                System.out.println("Domain" + cookie.getDomain());
                System.out.println("Path" + cookie.getPath());
                System.out.println("Max Age" + cookie.getMaxAge());
                System.out.println("Secure " + cookie.getSecure());

            }
        }

    }
}