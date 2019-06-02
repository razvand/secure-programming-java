import java.util.Calendar;
import java.util.GregorianCalendar;

public class Format {
    static Calendar c = new GregorianCalendar(1995, GregorianCalendar.MAY, 23);
    public static void main(String[] args) {
        // args[0] should contain the credit card expiration date
        System.out.format(args[0] + " did not match! HINT: It was issued on %1$terd of some month\n", c);
    }
}
