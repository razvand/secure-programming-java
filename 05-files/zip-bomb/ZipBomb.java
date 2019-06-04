import java.io.*;
import java.util.zip.*;

public class ZipBomb {
    static final int BUFFER = 512;

    public static void unzip(String filename) throws java.io.IOException{
        FileInputStream fis = new FileInputStream(filename);
        ZipInputStream zis = new ZipInputStream(new BufferedInputStream(fis));
        ZipEntry entry;
        try {
            while ((entry = zis.getNextEntry()) != null) {
                System.out.println("Extracting: " + entry);
                int count;
                byte data[] = new byte[BUFFER];
                // Write the files to the disk
                FileOutputStream fos = new FileOutputStream(entry.getName());
                BufferedOutputStream dest = new BufferedOutputStream(fos, BUFFER);
                while ((count = zis.read(data, 0, BUFFER)) != -1) {
                    dest.write(data, 0, count);
                }
                dest.flush();
                dest.close();
                zis.closeEntry();
                unzip(entry.getName());
            }
        } finally {
            zis.close();
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Provide one argument.");
            System.exit(-1);
        }
        try {
            unzip(args[0]);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
