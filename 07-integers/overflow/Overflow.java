public class Overflow {
    public static void main(String[] args) {
        byte b1 = 127;
        byte b2 = b1 + 1;
        short s1 = 0x7fff;
        short s2 = s1 + 1;
        int i1 = 0x7fffffff;
        int i2 = i1 + 1;
        long l1 = 0x7fffffffffffffffL;
        long l2 = l1 + 1;
        System.out.println("b1: " + b1 + ", b2: " + b2);
        System.out.println("s1: " + s1 + ", s2: " + s2);
        System.out.println("i1: " + i1 + ", i2: " + i2);
        System.out.println("l1: " + l1 + ", l2: " + l2);

        int s3 = 0x40000000;
        int s4 = s3 * 2;
        int s5 = s3 * 4;
        int s6 = s3 * 8;
        System.out.println("s3: " + s3 + ", s4: " + s4 + ", s5: " + s5 + ", s6: " + s6);

        if (args.length != 1)
            System.exit(-1);
        try {
            int i3 = Integer.parseInt(args[0]);
            int i4 = i3 + 1;
            System.out.println("i3: " + i3 + ", i4: " + i4);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
