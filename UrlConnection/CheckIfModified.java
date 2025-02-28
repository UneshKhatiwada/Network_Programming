import java.io.IOException;
import java.net.*;


public class CheckIfModified{

        public static void main(String[] args){
            try{
                URI uri = new URI("https://www.example.com");
                URL url = uri.toURL();

                URLConnection connection = url.openConnection();

                long lastChecked = System.currentTimeMillis() - (24 * 60 * 60 * 1000);
                connection.setIfModifiedSince(lastChecked);


                System.out.println("If-MOdified-Since: " + connection.getIfModifiedSince());

                connection.connect();

                long lastModified = connection.getLastModified();
                System.out.println("Last Modified:" + lastModified);

                if(lastModified == 0){
                    System.out.println("The server did not provide a Last-Modified header.");

                }else if(lastModified > lastChecked) {
                    System.out.println("The resource has been updated since the last check.");

                } else{
                    System.out.println("The resource has not been modified since the last check");
                }
            }
            catch (URISyntaxException e){
                    System.err.println("Inalid url : " + e.getMessage());
            }catch (IOexception e){
                e.printStackTrace();
            }
        }

}