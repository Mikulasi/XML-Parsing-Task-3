package by.bsu.yakovlev.xmlparsing.xml.parsers;

import by.bsu.yakovlev.xmlparsing.hyerarchy.Ammunition;

import java.util.ArrayList;

public abstract class AbstractAmmunParser {

    protected ArrayList<Ammunition> ammunition = new ArrayList<>();
    public abstract ArrayList<Ammunition> parseDocument(String xmlPath);

}
