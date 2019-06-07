import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args)
            throws UnknownHostException, IOException {
            Socket socket = null;
            try {
                socket = new Socket("localhost", 9999);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
                BufferedReader stdIn = new BufferedReader(
                        new InputStreamReader(System.in));
                String userInput;
                while ((userInput = stdIn.readLine()) != null) {
                    out.println(userInput);
                    System.out.println(in.readLine());
                }
            } finally {
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        System.err.println(e);
                    }
                }
            }
    }
}
