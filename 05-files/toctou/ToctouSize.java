import java.io.*;
import java.nio.file.*;
import java.util.concurrent.TimeUnit;

public class ToctouSize {
    final static long goodSize = 1024;

    public static void processFile(String filename) {
        long size = new File(filename).length();
        if (size != goodSize) {
            System.out.println("File has wrong size!");
            return;
        }

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            System.err.println(e);
        }

        try (BufferedReader br = new BufferedReader(new
                    InputStreamReader(new FileInputStream(filename)))) {
            System.out.println("line is: " + br.readLine());
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) {
        processFile("test.txt");
    }
}
