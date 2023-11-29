
import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
//import java.io.PrintStream;
import java.io.InputStreamReader;
import java.io.IOException;

class Server{
    public static void main(String args[]) throws IOException{

        ServerSocket ss = new ServerSocket(3000);

        //connect it to client
        Socket s = ss.accept();
        System.out.println("Connection Established...");
        //read from client
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        while(true){
            String str;
            while ((str = br.readLine()) != null){
                System.out.println(str);
            }
        }
        br.close();
        ss.close();
        System.exit(0);
    }
}
