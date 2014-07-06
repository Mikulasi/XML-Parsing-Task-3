package by.bsu.yakovlev.xmlparsing.main;

import by.bsu.yakovlev.xmlparsing.xml.parsers.AmmunitionDOMParser;
import by.bsu.yakovlev.xmlparsing.xml.validator.ValidatorXML;
import org.apache.log4j.Logger;

class BikerMain {

    private static final Logger LOGGER = Logger.getLogger(BikerMain.class);

    public static void main(String[] args) {

        /*LOGGER.info(ValidatorXML.validate(ValidatorXML.XML_PATH, ValidatorXML.XSD_PATH));
        AmmunitionSAXParser ammunitionSAXParser = new AmmunitionSAXParser();
        ammunitionSAXParser.parsingSAX();*/
        AmmunitionDOMParser domParser = new AmmunitionDOMParser();
        LOGGER.info(domParser.parseDocument(ValidatorXML.XML_PATH));

    }
    }

