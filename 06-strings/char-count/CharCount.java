public class CharCount {
    public static String trim(String string) {
        char ch;
        int i;
        for (i = 0; i < string.length(); i += 1) {
            ch = string.charAt(i);
            if (!Character.isLetter(ch)) {
                break;
            }
        }
        return string.substring(i);
    }

    public static int countChars(String string) {
        char ch;
        int i;
        int cnt = 0;
        for (i = 0; i < string.length(); i += 1) {
            ch = string.charAt(i);
            if (!Character.isLetter(ch)) {
                break;
            }
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        String s = "ana€aređmere";
        System.out.println(trim(s));
        System.out.println("string length: " + s.length());
        System.out.println("count chars: " + countChars(s));
    }
}
