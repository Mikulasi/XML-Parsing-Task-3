package by.bsu.yakovlev.xmlparsing.bikercreator;

import by.bsu.yakovlev.xmlparsing.hyerarchy.Ammunition;

import java.util.ArrayList;
import java.util.List;

public class Biker {
    private List<Ammunition> list;

    public Biker(){
        list = new ArrayList<>();
    }

    public Biker(List<Ammunition> list){
        this.list = list;
    }

    public void add(Ammunition amm) {
        list.add(amm);
    }

    public List<Ammunition> getList(){
        return list;
    }
}
