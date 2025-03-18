import java.net.*;


public class ServerExample{
    public static void main(String[] args){
        InetSocketAddress serverAddress = new InetSocketAddress(8080);
        System.out.println("Server will listen on :" +serverAddress);
    }

}
