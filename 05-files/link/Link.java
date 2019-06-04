import java.io.*;

public class Link {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("/tmp/pass"));
            System.out.println("Password is: " + in.readLine());
        } catch (IOException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(-1);
        }
    }
}
