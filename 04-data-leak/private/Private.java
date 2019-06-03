import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Date;

class Sensitive {
    private Date d;

    public Sensitive() {
        d = new Date(1559591551L*1000);
    }

    public Date getDate() {
        return d;
    }

}

class Password {
    public static boolean checkPassword(String password) {
        try {
            FileReader fin = openPasswordFile();
            BufferedReader inStream = new BufferedReader(fin);
            String p = inStream.readLine();
            return p.equals(password);
        } catch (Exception e) {
        }
        return false;
    }

    public static FileReader openPasswordFile()
            throws FileNotFoundException {
            final String password_file = "password.txt";

            // do permission checks

            FileReader fin = new FileReader(password_file);
            return fin;
    }
}

public class Private {
    public static void main(String[] args) {
        Sensitive s = new Sensitive();
        Date d = s.getDate();
        System.out.println("date is " + d);
        System.out.println("password is alphaomega: " + Password.checkPassword("alphaomega"));
    }
}
