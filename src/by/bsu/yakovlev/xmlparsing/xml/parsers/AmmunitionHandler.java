package by.bsu.yakovlev.xmlparsing.xml.parsers;

import org.apache.log4j.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class AmmunitionHandler extends DefaultHandler {
    public static final Logger LOGGER = Logger.getLogger(AmmunitionHandler.class);
        @Override
        public void startDocument() {
            LOGGER.info("Parsing started");
        }
        @Override
        public void startElement(String uri, String localName, String qName, Attributes attrs) {
            String s = localName;
            for (int i = 0; i < attrs.getLength(); i++) {
                s += " " + attrs.getLocalName(i) + "=" + attrs.getValue(i);
            }
            LOGGER.info(s.trim());
        }
        @Override
        public void characters(char[ ] ch, int start, int length) {
            LOGGER.info(new String(ch, start, length));
        }
        @Override
        public void endElement(String uri, String localName, String qName) {
            LOGGER.info(localName);
        }
        @Override
        public void endDocument() {
            LOGGER.info("\nParsing ended");
        }
    }

