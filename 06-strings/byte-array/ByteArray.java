public class ByteArray {
    public static void main(String[] args) {
        String s = "ana€aređmere";
        byte[] b = s.getBytes();
        int i;

        System.out.println("s.length: " + s.length());
        for (i = 0; i < s.length(); i++)
            System.out.format("s[%d]: %c, 0x%04x\n", i, s.charAt(i), (int) s.charAt(i));
        System.out.println("b.length: " + b.length);
        for (i = 0; i < b.length; i++)
            System.out.format("b[%d]: 0x%02x\n", i, b[i]);
    }
}
