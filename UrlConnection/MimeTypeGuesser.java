import java.net.URLConnection;

public class MimeTypeGuesser{

    public static void main(String [] args){
        String filePath = "DV.pdf";

        String mimeTypeByName = URLConnection.guessContentTypeFromName(filePath);

        System.out.println("MIME Type (by file name):" +mimeTypeByName);
    }
}