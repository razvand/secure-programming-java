import java.io.*;

public class DirList {
  public static void main(String[] args) throws Exception {
    String dir = System.getProperty("dir");
    if (dir == null) {
        System.err.println("No dir property set. Use -Ddir=... in java command line.");
        System.exit(-1);
    }
    Runtime rt = Runtime.getRuntime();
    Process proc = rt.exec(new String[] {"sh", "-c", "ls " + dir});
    int result = proc.waitFor();
    if (result != 0) {
      System.out.println("process error: " + result);
    }
    InputStream in = (result == 0) ? proc.getInputStream() :
                                     proc.getErrorStream();
    int c;
    while ((c = in.read()) != -1) {
      System.out.print((char) c);
    }
  }
}
