import java.io.*;

public class Path {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Provide one argument.");
            System.exit(-1);
        }
        try {
            File file = new File("img/" + args[0]);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
            bw.write("data\n");
            bw.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
