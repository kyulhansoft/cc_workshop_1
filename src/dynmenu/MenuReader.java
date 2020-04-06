package dynmenu;

import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class MenuReader {

    private ArrayList<MenuItem> items = new ArrayList<MenuItem>();

    public ArrayList<MenuItem> getItems() {
        try {
            File inputFile = new File("tomcat/webapps/cc_workshop_1/ui-menu.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("item");
            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                //System.out.println("\nCurrent Element :" + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    MenuItem item = new MenuItem();
                    item.setCaption(element.getElementsByTagName("caption").item(0).getTextContent());
                    item.setBeanClass(element.getElementsByTagName("bean-class").item(0).getTextContent());
                    items.add(item);
                    // System.out.println(element.getAttribute("id"));
                    // System.out.println("caption : "
                    //         + element
                    //         .getElementsByTagName("caption")
                    //         .item(0)
                    //         .getTextContent());
                    // System.out.println("bean : "
                    //         + element
                    //         .getElementsByTagName("bean")
                    //         .item(0)
                    //         .getTextContent());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return items;
    }
}
