import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.io.IOException;



public class Client1{
    public static void main(String args[]){
        Socket s = new Socket("localhost", 3000);

        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        

        String str, str1;

    }
}