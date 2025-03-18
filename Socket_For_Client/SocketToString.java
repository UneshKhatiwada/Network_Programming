import java.io.IOException;
import java.net.Socket;

public class SocketToString {
    public static void main(String [] args){
        try{
            Socket socket = new Socket("www.google.com", 80);
            System.out.println(socket.toString());

            socket.close();
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
