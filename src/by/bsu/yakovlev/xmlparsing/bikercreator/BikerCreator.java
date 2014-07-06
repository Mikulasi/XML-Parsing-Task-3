package by.bsu.yakovlev.xmlparsing.bikercreator;

import by.bsu.yakovlev.xmlparsing.hyerarchy.*;

import java.util.ArrayList;
import java.util.List;

public class BikerCreator {

    public static List<Ammunition> createAllAmmun() {
        List<Ammunition> allAmmun = new ArrayList<>();

        Helm helm = new Helm(800, 1.5, "BMW", "White", Helm.HelmType.FULL_FACE);
        Jacket jacket = new Jacket(1500, 2.3, "Honda", "Black", Jacket.JacketType.RACE, AmmunitionMaterial.LEATHER);
        Pants pants = new Pants(1000, 1.8, "Fox", "White", false, AmmunitionMaterial.TEXTILE);
        Gloves gloves = new Gloves(300, 0.2, "Fox", "White", AmmunitionMaterial.TEXTILE, false);
        Boots boots = new Boots(500, 1, "Fox", "Black", Boots.BootsType.SPORT_BOOTS);

        allAmmun.add(helm);
        allAmmun.add(jacket);
        allAmmun.add(pants);
        allAmmun.add(gloves);
        allAmmun.add(boots);

        return allAmmun;
    }

    //create biker with all ammunition
    public static Biker createBikerAllAmmun(List<Ammunition> list) {
        Biker biker = new Biker();

        for (Ammunition ammun : list) {
            biker.add(ammun);
        }
        return biker;
    }

    //create Biker with some ammunition
    public static Biker createBiker(List<Ammunition> list) {
        Biker biker = new Biker();

        for (Ammunition ammun : list) {
            int rand = (int) (Math.random() * 10);
            if (rand % 2 == 0) {
                biker.add(ammun);

                if (rand % 3 == 0) {
                    biker.add(ammun);
                }
            }
        }
        return biker;
    }
    //include some ammunition to biker
    public static Biker includeSomeAmmun(Biker biker){
        List<Ammunition> list = new ArrayList<>();
        Biker biker1 = new Biker(list);
        List<Ammunition> bikerList = biker.getList();

        for(Ammunition ammun: bikerList){
            int rand = (int) (Math.random() * 10);
            if (rand % 2 == 0){
                list.add(ammun);
            }
        }
        return biker1;
    }
}


