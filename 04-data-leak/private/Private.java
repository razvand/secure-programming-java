import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;

class Sensitive {
    private Date d;

    public Sensitive() {
        d = new Date();
    }

    public Date getDate() {
        return d;
    }

    public void changePassword(String password) {
    }

    public static FileInputStream openPasswordFile()
            throws FileNotFoundException {
            final String password_file = "password";
            // do permission checks
            FileInputStream fin = new FileInputStream(password_file);
            return fin;
    }
}

public class Private {
    public static void main(String[] args) {
        Sensitive s = new Sensitive();
    }
}
