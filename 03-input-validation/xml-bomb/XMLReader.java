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

            NodeList nList = doc.getElementsByTagName("item");
            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element: " + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("description: " + eElement.getElementsByTagName("description").item(0).getTextContent());
                    int num = eElement.getElementsByTagName("price").getLength();
                    System.out.println("price: " + eElement.getElementsByTagName("price").item(num-1).getTextContent());
                    String qText = eElement.getElementsByTagName("quantity").item(0).getTextContent();
                    System.out.println("quantity: " + qText);
                    int q = Integer.parseInt(qText);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
