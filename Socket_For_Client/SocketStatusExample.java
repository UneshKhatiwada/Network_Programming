import java.io.IOException;
import java.net.Socket;
import java.net.InetSocketAddress;

public class SocketStatusExample {

    public static void main(String[] args) {
        Socket socket = new Socket();
        System.out.println("BEfore connecting, isClosed");
        printSocketStatus(socket);

        try {
            InetSocketAddress address = new InetSocketAddress("www.google.com", 80);
            socket.connect(address);
            socket.bind(new InetSocketAddress(0));
            System.out.println("\nAfter connecting");
            printSocketStatus(socket);

            socket.connect(address);
            System.out.println("\nAfter connecting");
            printSocketStatus(socket);

            socket.close();
            System.out.println("\nAfter closing");
            printSocketStatus(socket);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        }
    }

    private static void printSocketStatus(Socket socket) {
        System.out.println("Is Bound?" + socket.isBound());
        System.out.println("Is Connected?" + socket.isConnected());
        System.out.println("Is Closed?" + socket.isClosed());
    }
}
