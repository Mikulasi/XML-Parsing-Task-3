package by.bsu.yakovlev.xmlparsing.xml.parsers;

import by.bsu.yakovlev.xmlparsing.hyerarchy.Ammunition;
import by.bsu.yakovlev.xmlparsing.hyerarchy.Helm;
import org.apache.log4j.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class AmmunitionHandler extends DefaultHandler {
    public static final Logger LOGGER = Logger.getLogger(AmmunitionHandler.class);

    private List<Ammunition> list;
    private Ammunition ammunition;

    public List<Ammunition> getList(){
        return list;
    }
    boolean name = false;
    boolean company=false;
    boolean color=false;
    boolean price=false;
    boolean weight=false;
    boolean isProtected=false;
    boolean haveKevlar = false;
    boolean material = false;

    @Override
        public void startDocument() {
            LOGGER.info("Parsing started");
        }
        @Override
        public void startElement(String uri, String localName, String qName, Attributes attrs) {
            if (qName.equalsIgnoreCase("helm-type")){
                String id = attrs.getValue("id");
                ammunition = new Helm();
                ammunition.setId(id);
                if(list==null){
                    list = new ArrayList<>();
                }else if (qName.equalsIgnoreCase("helm-name")){
                    name = true;
                } else if (qName.equalsIgnoreCase("company-name")){
                    company = true;
                }else if (qName.equalsIgnoreCase("price")){
                    price=true;
                }else if (qName.equalsIgnoreCase("weight")){
                    weight=true;
                }else if (qName.equalsIgnoreCase("color")){
                    color=true;
                }
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) {
            if (qName.equalsIgnoreCase("helm-type")){
                list.add(ammunition);
            }
        }

        @Override
        public void characters(char[ ] ch, int start, int length) {
          if (name){
              ammunition.setCompanyName(new String(ch,start,length));
              company = false;
          }else if (price){
              ammunition.setPrice(Integer.parseInt(new String(ch, start, length)));
              price=false;
          }else if (weight){
              ammunition.setWeight(Double.parseDouble(new String(ch,start,length)));
              weight=false;
          }else if (color){
              ammunition.setColor(new String(ch,start,length));
          }
        }

        @Override
        public void endDocument() {
            LOGGER.info("\nParsing ended");
        }
    }

