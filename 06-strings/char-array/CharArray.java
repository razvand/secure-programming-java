public class CharArray {
    public static void main(String[] args) {
        String s = "ana€aređmere";
        char[] c = s.toCharArray();
        int i;

        System.out.println("s.length: " + s.length());
        for (i = 0; i < s.length(); i++)
            System.out.format("s[%d]: %c, 0x%04x\n", i, s.charAt(i), (int) s.charAt(i));
        System.out.println("c.length: " + c.length);
        for (i = 0; i < c.length; i++)
            System.out.format("c[%d]: %c\n", i, c[i]);

        char[] c2 = {'a', 'n', 'a', '€', 'a', 'r', 'e'};
        System.out.println("c2.length: " + c2.length);
        for (i = 0; i < c2.length; i++)
            System.out.format("c[%d]: %c\n", i, c2[i]);
    }
}
