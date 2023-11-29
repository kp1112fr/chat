import java.net.Socket;

public class check {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 3000;

        try (Socket socket = new Socket(host, port)) {
            System.out.println("Server is running on port " + port);
        } catch (Exception e) {
            System.out.println("Server is not running on port " + port);
        }
    }
}
