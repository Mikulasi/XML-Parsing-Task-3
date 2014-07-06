package by.bsu.yakovlev.xmlparsing.xml.parsers;

import by.bsu.yakovlev.xmlparsing.hyerarchy.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;

public class AmmunitionDOMParser extends AbstractAmmunParser {

    public ArrayList<Ammunition> parseDocument(String xmlPath) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlPath);
            Element root = document.getDocumentElement();
            NodeList nodeList = root.getChildNodes();
            parseAmmunitionList(nodeList);
            return ammunition;
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void parseAmmunitionList(NodeList ammunNodeList) {
        for (int index = 0; index < ammunNodeList.getLength(); index++) {
            Node ammunNode = ammunNodeList.item(index);
            if (ammunNode.getNodeType() == Node.ELEMENT_NODE) {
                Element ammunElement = (Element) ammunNode;
                Helm helm = new Helm();

                Element priceElement = (Element) ammunElement.getElementsByTagName("price").item(0);
                Element weightElement = (Element) ammunElement.getElementsByTagName("weight").item(0);
                Element companyElement = (Element) ammunElement.getElementsByTagName("companyName").item(0);
                Element colorElement = (Element) ammunElement.getElementsByTagName("color").item(0);
                Element helmTypeElement = (Element) ammunElement.getElementsByTagName("helmType").item(0);

                helm.setPrice(Integer.parseInt(priceElement.getFirstChild().getNodeValue()));
                helm.setWeight(Double.parseDouble(weightElement.getFirstChild().getNodeValue()));
                helm.setCompanyName(companyElement.getFirstChild().getNodeValue());
                helm.setColor(colorElement.getFirstChild().getNodeValue());

                Boots boots = new Boots();

                NodeList bootsNodeList = ammunElement.getElementsByTagName("boots");
                for (int i = 0; i < bootsNodeList.getLength(); i++) {
                    Node bootsNode = bootsNodeList.item(i);
                    if (bootsNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element bootsElement = (Element) bootsNode;

                        Element priceBootsElement = (Element) bootsElement.getElementsByTagName("price").item(0);
                        Element weightBootsElement = (Element) bootsElement.getElementsByTagName("weight").item(0);
                        Element companyBootsElement = (Element) bootsElement.getElementsByTagName("companyName").item(0);
                        Element colorBootsElement = (Element) bootsElement.getElementsByTagName("color").item(0);
                        Element bootsBootsTypeElement = (Element) bootsElement.getElementsByTagName("bootsType").item(0);

                        boots.setPrice(Integer.parseInt(priceBootsElement.getFirstChild().getNodeValue()));
                        boots.setWeight(Double.parseDouble(weightBootsElement.getFirstChild().getNodeValue()));
                        boots.setCompanyName(companyBootsElement.getFirstChild().getNodeValue());
                        boots.setColor(colorBootsElement.getFirstChild().getNodeValue());
                    }
                }

                Gloves gloves = new Gloves();

                NodeList glovesNodeList = ammunElement.getElementsByTagName("gloves");
                for (int i = 0; i < glovesNodeList.getLength(); i++) {
                    Node glovesNode = glovesNodeList.item(i);
                    if (glovesNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element glovesElement = (Element) glovesNode;

                        Element priceGlovesElement = (Element) glovesElement.getElementsByTagName("price").item(0);
                        Element weightGlovesElement = (Element) glovesElement.getElementsByTagName("weight").item(0);
                        Element companyGlovesElement = (Element) glovesElement.getElementsByTagName("companyName").item(0);
                        Element colorGlovesElement = (Element) glovesElement.getElementsByTagName("color").item(0);
                        Element protectedGlovesElement = (Element) glovesElement.getElementsByTagName("isProtected").item(0);

                        gloves.setPrice(Integer.parseInt(priceGlovesElement.getFirstChild().getNodeValue()));
                        gloves.setWeight(Double.parseDouble(weightGlovesElement.getFirstChild().getNodeValue()));
                        gloves.setCompanyName(companyGlovesElement.getFirstChild().getNodeValue());
                        gloves.setColor(colorGlovesElement.getFirstChild().getNodeValue());
                        gloves.setIsProtected(Boolean.parseBoolean(protectedGlovesElement.getFirstChild().getNodeValue()));

                    }
                }

                Jacket jacket = new Jacket();

                NodeList jacketNodeList = ammunElement.getElementsByTagName("jacket");
                for (int i = 0; i < jacketNodeList.getLength(); i++) {
                    Node jacketNode = jacketNodeList.item(i);
                    if (jacketNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element jacketElement = (Element) jacketNode;

                        Element priceJacketElement = (Element) jacketElement.getElementsByTagName("price").item(0);
                        Element weightJacketElement = (Element) jacketElement.getElementsByTagName("weight").item(0);
                        Element companyJacketElement = (Element) jacketElement.getElementsByTagName("companyName").item(0);
                        Element colorJacketElement = (Element) jacketElement.getElementsByTagName("color").item(0);
                        Element jacketTypeElement = (Element) jacketElement.getElementsByTagName("jacketType").item(0);
                        Element jacketMaterialElement = (Element) jacketElement.getElementsByTagName("jacketMaterial").item(0);

                        jacket.setPrice(Integer.parseInt(priceJacketElement.getFirstChild().getNodeValue()));
                        jacket.setWeight(Double.parseDouble(weightJacketElement.getFirstChild().getNodeValue()));
                        jacket.setCompanyName(companyJacketElement.getFirstChild().getNodeValue());
                        jacket.setColor(colorJacketElement.getFirstChild().getNodeValue());
                    }
                }

                Pants pants = new Pants();

                NodeList pantsNodeList = ammunElement.getElementsByTagName("pants");
                for (int i = 0; i < pantsNodeList.getLength(); i++) {
                    Node pantsNode = pantsNodeList.item(i);
                    if (pantsNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element pantsElement = (Element) pantsNode;

                        Element pricePantsElement = (Element) pantsElement.getElementsByTagName("price").item(0);
                        Element weightPantsElement = (Element) pantsElement.getElementsByTagName("weight").item(0);
                        Element companyPantsElement = (Element) pantsElement.getElementsByTagName("companyName").item(0);
                        Element colorPantsElement = (Element) pantsElement.getElementsByTagName("color").item(0);
                        Element pantsHaveKevlar = (Element) pantsElement.getElementsByTagName("haveKevlar").item(0);
                        Element pantsMaterialElement = (Element) pantsElement.getElementsByTagName("pantsMaterial").item(0);

                        pants.setPrice(Integer.parseInt(pricePantsElement.getFirstChild().getNodeValue()));
                        pants.setWeight(Double.parseDouble(weightPantsElement.getFirstChild().getNodeValue()));
                        pants.setCompanyName(companyPantsElement.getFirstChild().getNodeValue());
                        pants.setColor(colorPantsElement.getFirstChild().getNodeValue());
                        pants.setHaveKevlar(Boolean.parseBoolean(pantsHaveKevlar.getFirstChild().getNodeValue()));
                    }
                }

                ammunition.add(boots);
                ammunition.add(gloves);
                ammunition.add(pants);
                ammunition.add(helm);
                ammunition.add(jacket);
            }
        }
    }
}

