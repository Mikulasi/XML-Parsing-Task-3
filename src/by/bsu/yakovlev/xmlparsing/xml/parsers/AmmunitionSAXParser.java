package by.bsu.yakovlev.xmlparsing.xml.parsers;

import org.apache.log4j.Logger;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;

public class AmmunitionSAXParser {
    public static final Logger LOGGER = Logger.getLogger(AmmunitionSAXParser.class);
    public void parsingSAX(){
        try {
            XMLReader xmlReader = XMLReaderFactory.createXMLReader();
            AmmunitionHandler handler = new AmmunitionHandler();
            xmlReader.setContentHandler(handler);
            xmlReader.parse(".\\src\\resources\\ammunition.xml");
        } catch (SAXException e) {
            LOGGER.error("SAX Parser exception: " +e);
        } catch (IOException e){
            LOGGER.error("I/O exception: " +e);
        }
    }
}
