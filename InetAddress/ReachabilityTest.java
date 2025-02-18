
import java.net.*;
public class ReachabilityTest {
	public static void main(String[] args) {
		try {
			InetAddress address=InetAddress.getByName("www.github.com");
			if(address.isReachable(5000)){
				System.out.println("address is reached");
			}
			else{
				System.out.println("Cannot be reached");
			}
			
		} catch (Exception e) {
			// TODO: hadnle exception
		}
	}
}
