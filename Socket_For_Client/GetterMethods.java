import java.net.*;

public class GetterMethods{
    public static void main(String[] args){
        try{
            Socket socket = new Socket("www.google.com", 80);
            InetSocketAddress remoteAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
          

            System.out.println("REmote Hostname:" + remoteAddress.getHostName());
            System.out.println("REmote IP Address:" + remoteAddress.getAddress());
            System.out.println("REmote Port:" + remoteAddress.getPort());

            InetSocketAddress localAddress = (InetSocketAddress) socket.getLocalSocketAddress();

           
            System.out.println("Local IP Address:" + localAddress.getAddress());
            System.out.println("Local Port:" + localAddress.getPort());
            socket.close();
        }catch(Exception e){ 
            System.err.println("Error :" + e.getMessage());
        }
    }
}
