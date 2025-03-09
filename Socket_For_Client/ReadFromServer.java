import java.io.*;
import java.net.*;

public class ReadFromServer {
    public static void main(String [] args){
        String somehost = "eample.com";
        int someport = 80;

        try{

            Socket socket = new Socket(somehost, someport);

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            PrintStream pStream = new PrintStream(socket.getOutputStream());

            pStream.println("GET / Http/1.1");
            pStream.println("Host : " + somehost);
            pStream.println("Connection : close");


            pStream.println();

            String line ;
            while((line = reader.readLine()) != null){
                System.out.println(line);
    
            }
            socket.close();
        } 
        catch(Exception e) {
                e.printStackTrace();
        }
    }
}

//Explain this if i was ten years old