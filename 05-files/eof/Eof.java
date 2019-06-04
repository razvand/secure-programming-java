import java.io.*;

public class Eof {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("data");
            byte data;

            while (true) {
                data = (byte) in.read();
                if (data == -1) /* EOF reached */
                    break;
                System.out.format("read 0%02x (%1$c)\n", data);
            }
            in.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
