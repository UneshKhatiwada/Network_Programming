
import java.net.Inet6Address;
import java.net.InetAddress;

public class Inet6AddressExample {
	public static void main(String[] args) {
		try {
			InetAddress address=Inet6Address.getByName("iPV6.www.google.com");
			System.out.println("Ipv6: "+ address.getHostAddress());

			System.out.println("Is ipv6?: "+ (address instanceof Inet6Address));
		} catch (Exception e) {
			// handle exception
			System.out.println("error occured");
		}

	}
}
