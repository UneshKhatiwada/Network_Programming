import java.net.*;

public class ConnectionDetailsExample {
    public static void main(String[] args){
        try{
            Socket socket = new Socket("www.google.com", 80);

            SocketAddress remoteAddress = socket.getRemoteSocketAddress();

            SocketAddress localAddress = socket.getLocalSocketAddress();

            System.out.println("Remote (server) Address:" + remoteAddress);
            System.out.println("Local (server) Address:" + localAddress);

            socket.close();
        }catch(Exception e){
            System.err.println("Error :" + e.getMessage());
        }
    }
}
