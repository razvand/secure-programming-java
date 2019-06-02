import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// java XMLInjection 15
// java XMLInjection '1</quantity><price>2</price><quantity>1'
// java XMLInjection peanut

public class XMLInjection {
    private static void createXMLStream(final BufferedOutputStream outStream,
            final String quantity) throws IOException {
        String xmlString = "<item>\n\t<description>Widget</description>\n"
            + "\t<price>500</price>\n" + "\t<quantity>" + quantity
            + "</quantity>\n</item>\n";
        outStream.write(xmlString.getBytes());
        outStream.flush();
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Add quantity as parameter.");
            System.exit(-1);
        }

        try {
            BufferedOutputStream outStream = new BufferedOutputStream(new FileOutputStream("shop.xml"));
            createXMLStream(outStream, args[0]);
        } catch (IOException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(-1);
        }
    }
}
