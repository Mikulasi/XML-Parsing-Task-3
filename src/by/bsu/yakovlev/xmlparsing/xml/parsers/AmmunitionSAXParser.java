package by.bsu.yakovlev.xmlparsing.xml.parsers;

import by.bsu.yakovlev.xmlparsing.hyerarchy.Ammunition;
import org.apache.log4j.Logger;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class AmmunitionSAXParser {
    public static final Logger LOGGER = Logger.getLogger(AmmunitionSAXParser.class);

    public static void parsingSAX(){

            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            AmmunitionHandler handler = new AmmunitionHandler();
            saxParser.parse(new File("src/resources/ammunition.xml"), handler);
            List<Ammunition> list = handler.getList();
            for (Ammunition am : list) {
                LOGGER.info(am);
            }
        }catch (ParserConfigurationException e){
            LOGGER.error("Parser config error: " +e);
        } catch (SAXException e) {
            LOGGER.error("SAX Parser exception: " +e);
        } catch (IOException e){
            LOGGER.error("I/O exception: " +e);
        }
    }
}
