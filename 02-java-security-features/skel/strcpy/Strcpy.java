public class Strcpy {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Provide string as argument.");
            System.exit(-1);
        }
        String s1 = new String();
        String s2 = new String(args[0]);
        String s3 = args[0];

        s1 = args[0];
        //char c = s2[5];
        char c = s2.charAt(5);
        //s2[5] = 'b';

        System.out.println("s1 is: " + s1);
        System.out.println("s2 is: " + s2);
        System.out.println("s3 is: " + s3);
        System.out.println("c is: " + c);
    }
}
