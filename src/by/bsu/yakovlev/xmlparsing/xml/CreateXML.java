package by.bsu.yakovlev.xmlparsing.xml;

import by.bsu.yakovlev.xmlparsing.hyerarchy.Helm;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class CreateXML {
    public static void main(String[] args) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = null;
        try{
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e){
            e.printStackTrace();
        }
        Document document = documentBuilder.newDocument();
        String root = "ammunition";
        Element rootElement = document.createElement(root);
        document.appendChild(rootElement);
        for (int i = 0;i < 1; i++){
            Document documentHelm = documentBuilder.newDocument();
            String element = "helm";
            Element helmElement = documentHelm.createElement(element);
            documentHelm.appendChild(helmElement);
            rootElement.appendChild(helmElement);
            for (int j = 0;j<1;j++){
                String elementPrice = "price";
                Element price = documentHelm.createElement(elementPrice);
                String value = "800";
                price.appendChild(documentHelm.createTextNode(value));

                String elementWeight = "weight";
                Element weight = documentHelm.createElement(elementWeight);
                String weightValue = "1.5";
                weight.appendChild(documentHelm.createTextNode(weightValue));

                String elementCompany = "companyName";
                Element company = documentHelm.createElement(elementCompany);
                String companyName = "BMW";
                company.appendChild(documentHelm.createTextNode(companyName));

                String elementColor = "color";
                Element color = documentHelm.createElement(elementColor);
                String colorName = "White";
                color.appendChild(documentHelm.createTextNode(colorName));

                String elementHelmType = "helmType";
                Element helmType = documentHelm.createElement(elementHelmType);
                String helmTypeName = (Helm.HelmType.FULL_FACE).toString();
                helmType.appendChild(documentHelm.createTextNode(helmTypeName));

                helmElement.appendChild(price);
                helmElement.appendChild(weight);
                helmElement.appendChild(company);
                helmElement.appendChild(color);
                helmElement.appendChild(helmType);

            }

        }

        }
    }

