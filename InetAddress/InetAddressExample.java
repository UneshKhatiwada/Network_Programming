
import java.net.*;

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            // InetAddress address=InetAddress.getByName("www.google.com");
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address);
            System.out.println("Host:name" + address.getHostName());
            System.out.println("Ip address:" + address.getHostAddress());
            System.out.println("Hashed address:" + address.hashCode());
            System.out.println("String representation:" + address.toString());
            System.out.println(address);

            InetAddress anotherAddress = InetAddress.getByName("www.facebook.com");
            System.out.println("another address" + anotherAddress);

            InetAddress address3 = Inet4Address.getByName("www.google.com");
            System.out.println("IPV4: " + address3.getHostAddress());
            System.out.println("Is IPV4: " + (address3 instanceof Inet4Address));
            System.out.println("Is IPV6: " + (address3 instanceof Inet6Address));

            InetAddress address4 = Inet4Address.getByName("www.pinterest.com");
            System.out.println("IPV4: " + address4.getHostAddress());
            System.out.println("Is IPV4: " + (address4 instanceof Inet4Address));
            System.out.println("Is IPV6: " + (address4 instanceof Inet6Address));

        } catch (Exception e) {
            
            //TODO:handle exception

            System.out.println("an error occured");
        }
    }
}
