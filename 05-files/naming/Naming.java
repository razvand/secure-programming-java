import java.io.*;

public class Naming {
    public static void main(String[] args) {
        String filename = "a\nb\nc";
        try {
            File f = new File(filename);
            PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter(f)));
            fout.println("hello");
            fout.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
