import java.lang.Integer;

// Use 1073741825 as argument. Why does it work?

public class Number {
    public static final int[] arr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200};
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Provide one numeric argument.");
            System.exit(-1);
        }
        try {
            int v = Integer.parseInt(args[0]);
            if (v < 10) {
                System.err.println("No negative arguments allowed.");
                System.exit(-1);
            }
            if (arr[v*4] == 500)
                System.out.println("Congratulations! You've got it!");
            else
                System.out.println("Try again!");
        } catch (NumberFormatException e) {
            System.err.println("Provide one _numeric_ argument.");
        }
    }
}
