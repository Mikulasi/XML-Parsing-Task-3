package by.bsu.yakovlev.xmlparsing.xml.parsers;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class AmmunitionDOMParser {
    public static final Logger LOGGER = Logger.getLogger(AmmunitionDOMParser.class);
    public static void parse() {
        /*DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(String xmlPath);
        ArrayList<Ammunition> ammunition = new ArrayList<>();
        NodeList nodeList = document.getDocumentElement().getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if(node instanceof Element){
                Helm helm = new Helm() {};
                String getId = helm.getId();
                getId = node.getAttributes().getNamedItem("id").getNodeValue();

                NodeList childNodes = node.getChildNodes();
                for(int j=0;j<childNodes.getLength();j++){
                    Node node1 = childNodes.item(j);

                    if(node1 instanceof Element){
                        String lastChild = node1.getLastChild().getTextContent().trim();
                        switch (node1.getNodeName()){
                            case "helm-name":
                                Helm.HelmType. = lastChild;*/

        try {

            File fXmlFile = new File("src/resources/ammunition.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            LOGGER.info("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList hList = doc.getElementsByTagName("helm-type");


            for (int temp = 0; temp < hList.getLength(); temp++) {

                Node nNode = hList.item(temp);

                LOGGER.info("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    LOGGER.info("Helm id : " + eElement.getAttribute("id"));
                    LOGGER.info("Helm Type : " + eElement.getElementsByTagName("helm-name").item(0).getTextContent());
                    LOGGER.info("Company name : " + eElement.getElementsByTagName("company-name").item(0).getTextContent());
                    LOGGER.info("Price : " + eElement.getElementsByTagName("price").item(0).getTextContent());
                    LOGGER.info("Weight : " + eElement.getElementsByTagName("weight").item(0).getTextContent());
                    LOGGER.info("Color : " + eElement.getElementsByTagName("color").item(0).getTextContent());

                }
            }
            NodeList bList = doc.getElementsByTagName("boots-type");
            for (int temp = 0; temp < bList.getLength(); temp++) {

                Node bNode = bList.item(temp);

                LOGGER.info("\nCurrent Element :" + bNode.getNodeName());

                if (bNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) bNode;

                    LOGGER.info("Boots id : " + eElement.getAttribute("id"));
                    LOGGER.info("Boots Type : " + eElement.getElementsByTagName("boots-name").item(0).getTextContent());
                    LOGGER.info("Company name : " + eElement.getElementsByTagName("company-name").item(0).getTextContent());
                    LOGGER.info("Price : " + eElement.getElementsByTagName("price").item(0).getTextContent());
                    LOGGER.info("Weight : " + eElement.getElementsByTagName("weight").item(0).getTextContent());
                    LOGGER.info("Color : " + eElement.getElementsByTagName("color").item(0).getTextContent());
                }
            }
            NodeList gList = doc.getElementsByTagName("gloves-type");
            for (int temp = 0; temp < gList.getLength(); temp++) {

                Node gNode = gList.item(temp);

                LOGGER.info("\nCurrent Element :" + gNode.getNodeName());

                if (gNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) gNode;

                    LOGGER.info("Gloves id : " + eElement.getAttribute("id"));
                    LOGGER.info("Gloves Material : " + eElement.getElementsByTagName("gloves-material").item(0).getTextContent());
                    LOGGER.info("Company name : " + eElement.getElementsByTagName("company-name").item(0).getTextContent());
                    LOGGER.info("Price : " + eElement.getElementsByTagName("price").item(0).getTextContent());
                    LOGGER.info("Weight : " + eElement.getElementsByTagName("weight").item(0).getTextContent());
                    LOGGER.info("Color : " + eElement.getElementsByTagName("color").item(0).getTextContent());
                    LOGGER.info("Is protected? : " + eElement.getElementsByTagName("is-protected").item(0).getTextContent());
                }
            }
            NodeList jList = doc.getElementsByTagName("jacket-type");
            for (int temp = 0; temp < jList.getLength(); temp++) {

                Node jNode = jList.item(temp);

                LOGGER.info("\nCurrent Element :" + jNode.getNodeName());

                if (jNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) jNode;

                    LOGGER.info("Jacket id : " + eElement.getAttribute("id"));
                    LOGGER.info("Jacket Type : " + eElement.getElementsByTagName("jacket-name").item(0).getTextContent());
                    LOGGER.info("Company name : " + eElement.getElementsByTagName("company-name").item(0).getTextContent());
                    LOGGER.info("Price : " + eElement.getElementsByTagName("price").item(0).getTextContent());
                    LOGGER.info("Weight : " + eElement.getElementsByTagName("weight").item(0).getTextContent());
                    LOGGER.info("Color : " + eElement.getElementsByTagName("color").item(0).getTextContent());
                    LOGGER.info("Material : " + eElement.getElementsByTagName("jacket-material").item(0).getTextContent());
                }
            }
            NodeList pList = doc.getElementsByTagName("pants-type");
            for (int temp = 0; temp < pList.getLength(); temp++) {

                Node pNode = pList.item(temp);

                LOGGER.info("\nCurrent Element :" + pNode.getNodeName());

                if (pNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) pNode;

                    LOGGER.info("Pants id : " + eElement.getAttribute("id"));
                    LOGGER.info("Pants Material : " + eElement.getElementsByTagName("pants-material").item(0).getTextContent());
                    LOGGER.info("Company name : " + eElement.getElementsByTagName("company-name").item(0).getTextContent());
                    LOGGER.info("Price : " + eElement.getElementsByTagName("price").item(0).getTextContent());
                    LOGGER.info("Weight : " + eElement.getElementsByTagName("weight").item(0).getTextContent());
                    LOGGER.info("Color : " + eElement.getElementsByTagName("color").item(0).getTextContent());
                    LOGGER.info("Material : " + eElement.getElementsByTagName("pants-material").item(0).getTextContent());
                    LOGGER.info("Have kevlar? : " + eElement.getElementsByTagName("have-kevlar").item(0).getTextContent());
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}


