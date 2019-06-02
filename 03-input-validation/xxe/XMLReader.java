// https://www.mkyong.com/java/how-to-read-xml-file-in-java-dom-parser/

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class XMLReader {
    public static void main(String argv[]) {
        try {
            File fXmlFile = new File("test.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            //dbFactory.setXIncludeAware(false);
            //dbFactory.setExpandEntityReferences(false);
            //dbFactory.setValidating(false);
            //dbFactory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
            //dbFactory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            //optional, but recommended
            //read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            doc.getDocumentElement().normalize();
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("foo");
            System.out.println("----------------------------");
            System.out.println(nList.item(0).getTextContent());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
