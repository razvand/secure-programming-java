public class Print {
    public static void main(String[] args) {
        byte b1 = (byte) 0x7f;
        byte b2 = (byte) 0x8f;
        short s1 = (short) 0x7fff;
        short s2 = (short) 0x8fff;
        int i1 = 0x7fffffff;
        int i2 = 0x8fffffff;
        long l1 = 0x7fffffffffffffffL;
        long l2 = 0x8fffffffffffffffL;
        System.out.format("b1: 0x%02x (%1$d), b2: 0x%02x (%2$d)\n", b1, b2);
        System.out.format("s1: 0x%04x (%1$d), s2: 0x%04x (%2$d)\n", s1, s2);
        System.out.format("i1: 0x%08x (%1$d), i2: 0x%08x (%2$d)\n", i1, i2);
        System.out.format("l1: 0x%016x (%1$d), l2: 0x%016x (%2$d)\n", l1, l2);
    }
}
