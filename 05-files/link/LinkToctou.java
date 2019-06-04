import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.concurrent.TimeUnit;

public class LinkToctou {
    public static void main(String[] args) {
        String filename = "/tmp/pass";
        Path path = new File(filename).toPath();
        try {
            BasicFileAttributes attr = Files.readAttributes(
                    path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);

            // Check
            if (!attr.isRegularFile()) {
                System.out.println("Not a regular file");
                return;
            }

            TimeUnit.SECONDS.sleep(10);

            // Use
            try (BufferedReader in = new BufferedReader(new InputStreamReader(Files.newInputStream(path)))) {
                System.out.println("Contents: " + in.readLine());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
