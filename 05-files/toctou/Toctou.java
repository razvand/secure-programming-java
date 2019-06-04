import java.io.*;
import java.nio.file.*;
import java.util.concurrent.TimeUnit;

public class Toctou {
    public static void processFile(String filename) {
        // Identify a file by its path
        Path file1 = Paths.get(filename);

        // Open the file for writing
        try (BufferedWriter bw = new BufferedWriter(new
                    OutputStreamWriter(Files.newOutputStream(file1)))) {
            bw.write("behemoth\n");
            bw.close();
        } catch (IOException e) {
            System.err.println(e);
        }

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            System.err.println(e);
        }

        // Reopen the file for reading
        Path file2 = Paths.get(filename);

        try (BufferedReader br = new BufferedReader(new
                    InputStreamReader(Files.newInputStream(file2)))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) {
        processFile("test.txt");
    }
}
