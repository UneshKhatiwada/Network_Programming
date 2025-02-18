
import java.net.*;
import java.nio.charset.*;
public class url_encoder{
    public static void main(String[] args){
        try{
            String filename = "Report #1.pdf";
            String encodedFilename = URLEncoder.encode(filename, StandardCharsets.UTF_8);
            System.out.println("Original Filename :" +filename);
            System.out.println("Encoded Filename :" +encodedFilename);

        }
        catch(Exception e){
            System.out.println("An error occured : " +e.getMessage())
        }
    }
    
}