import java.io.*;
import java.net.*;
public class DelayedSocketConnection {
    public static void main(String[] args){
        Socket socket = new Socket();

        SocketAddress address = new InetSocketAddress("time.nist.gov", 13);

        try{
            System.out.println("Connecting to the time sever...");
            socket.connect(address, 5000);
            System.out.println("Connected");


            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             String serverTime;
             while((serverTime = reader.readLine()) != null){
                System.out.println("Server Time :" + serverTime);
             }

             reader.close();
             socket.close();


        }catch(IOException e){
            System.out.println("Connection failed :" + e.getMessage());

        }
    }
}
