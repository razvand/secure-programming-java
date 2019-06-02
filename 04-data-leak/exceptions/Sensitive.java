import java.io.FileNotFoundException;
import java.io.FileInputStream;

public class Sensitive {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.err.println("Provide one argument (filename).");
            System.exit(-1);
        }
        FileInputStream fis = new FileInputStream(System.getenv("HOME") + "/" + args[0]);
    }
}
