// https://www.geeksforgeeks.org/string-vs-stringbuilder-vs-stringbuffer-in-java/

public class MyStringBuffer {
    // Concatenates to String
    public static void concat1(String s1) {
        s1 = s1 + "forgeeks";
    }

    // Concatenates to StringBuilder
    public static void concat2(StringBuilder s2) {
        s2.append("forgeeks");
    }

    // Concatenates to StringBuffer
    public static void concat3(StringBuffer s3) {
        s3.append("forgeeks");
    }

    public static void main(String[] args) 
    {
        String s1 = "Geeks"; 
        System.out.format("s1.hashcode: 0x%x\n", s1.hashCode());
        concat1(s1);  // s1 is not changed
        System.out.println("String: " + s1);
        s1 = s1 + "forgeeks";
        System.out.format("s1.hashcode: 0x%x\n", s1.hashCode());

        StringBuilder s2 = new StringBuilder("Geeks");
        System.out.format("s2.hashcode: 0x%x\n", s2.hashCode());
        concat2(s2); // s2 is changed
        System.out.println("StringBuilder: " + s2);
        System.out.format("s2.hashcode: 0x%x\n", s2.hashCode());

        StringBuffer s3 = new StringBuffer("Geeks");
        System.out.format("s3.hashcode: 0x%x\n", s3.hashCode());
        concat3(s3); // s3 is changed
        System.out.println("StringBuffer: " + s3);
        System.out.format("s3.hashcode: 0x%x\n", s3.hashCode());
    }
}
