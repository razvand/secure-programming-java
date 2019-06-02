public class Memory {
    public static void main(String[] args) {
        int[] buf = new int[32];
            if (args.length != 1) {
            System.err.println("Provide one numeric argument.");
            System.exit(-1);
        }
        try {
            int index = Integer.parseInt(args[0]);
            System.out.println("buf[" + index + "] is " + buf[index]);
            buf[index] = 1000;
            //System.out.println("buf[40] is " + buf[40]);
            //buf[40] = 1000;
        } catch (NumberFormatException e) {
            System.err.println("Provide one _numeric_ argument.");
        }
    }
}
