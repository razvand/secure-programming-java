import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.logging.Logger;

public class Logging {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Logging.class.getName());
        if (args.length != 1) {
            System.err.println("Provide one argument (filename).");
            System.exit(-1);
        }
        try {
            FileInputStream fis = new FileInputStream(System.getenv("HOME") + "/" + args[0]);
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }
    }
}
