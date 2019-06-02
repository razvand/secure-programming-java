import java.util.logging.Logger;

// run using
// java Logging "$(python -c 'print("a\nb")')"
public class Logging {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Pass username as argument.");
            System.exit(-1);
        }
        Logger logger = Logger.getLogger(Logging.class.getName());
        logger.severe("User login failed for: " + args[0]);
    }
}
