public class StringAddress {
    public static void main(String[] args) {
        String s = "ana";
        System.out.format("s hashcode: 0x%x\n", s.hashCode());
        System.out.println("s[2]: " + s.charAt(2));
        System.out.format("s hashcode: 0x%x\n", s.hashCode());
        s = s + "are";
        System.out.println("s[4]: " + s.charAt(4));
        System.out.format("s hashcode: 0x%x\n", s.hashCode());
    }
}
