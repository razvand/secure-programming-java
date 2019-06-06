public class MyBigInteger {
    public static void main(String[] args) {
        int i1 = 0x00010000;
        int i2 = 0x00020000;
        int i3 = i1 * i2;
        System.out.format("i3: 0x08x (%1$d)\n", i3, i3);
        /* TODO: Use BigInteger. */
    }
}
