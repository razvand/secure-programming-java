import java.io.*;

public class TempFile {
    public static void main(String[] args) throws IOException {
        File f = new File("tempnam.tmp");
        if (f.exists()) {
            System.out.println("This file already exists");
            return;
        }

        FileOutputStream fop = null;
        try {
            fop = new FileOutputStream(f);
            String str = "Data";
            fop.write(str.getBytes());
        } finally {
            if (fop != null) {
                try {
                    fop.close();
                } catch (IOException e) {
                    System.err.println(e);
                }
            }
        }
    }
}
