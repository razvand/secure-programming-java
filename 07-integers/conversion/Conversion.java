public class Conversion {
    public static void main(String[] args) {
        byte b1 = (byte) 0x7f;
        byte b2 = (byte) 0x80;

        System.out.format("b1: 0x%02x (%1$d), b2: 0x%02x (%2$d)\n", b1, b2);

        int i1 = b1;
        int i2 = b2;

        System.out.format("i1: 0x%08x (%1$d), i2: 0x%08x (%2$d)\n", i1, i2);

        short s1 = (short) 0xaabb;
        short s2 = (short) 0x0011;

        System.out.format("s1: 0x%04x (%1$d), s2: 0x%04x (%2$d)\n", s1, s2);

        b1 = (byte) s1;
        b2 = (byte) s2;

        System.out.format("b1: 0x%02x (%1$d), b2: 0x%02x (%2$d)\n", b1, b2);
    }
}
