import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class DictClient {
    public static void main(String[] args){
        String server ="dict.org";

        int port = 2628;

        try(Socket socket = new Socket(server, port)){
            socket.setSoTimeout(30000);

            Writer writer = new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8); 
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8)
            );
        String serverResponse = reader.readLine();
        if(!serverResponse.startsWith("220")){
            System.err.println("Error :  Unexpected response from server : " + serverResponse);
            return;
        }
        writer.write("SHOW DB\r\n");
        writer.flush();


        System.out.println("Available databases :");
        String line;

        while((line = reader.readLine())!= null){
            if(line.equals("."))
            break;
            System.out.println(line);
        }

        String word = "gold";

        writer.write("DEFINE fd-eng-lat "  + word + "\r\n" );
        writer.flush();

        boolean definationFound = false;
        while ((line = reader.readLine())!= null){
            if(line.startsWith("532")){
                System.out.println("No definition found for:" + word);
                break;
            }
            if(line.equals(".")){
                break;
            }
            if(!line.matches("^\\d{3}.*")){
                definationFound = true;
                System.out.println(line);

            }
        }
        if(!definationFound){
            System.out.println("No valid definitions returned.");
        }

        writer.write("quit\r\n");
        writer.flush();
            
        }catch (SocketTimeoutException e){
            System.out.println("Error: Server took too long to respond, Try again later.1");    
    }catch(IOException e){
        e.printStackTrace();
    }
    }
}
