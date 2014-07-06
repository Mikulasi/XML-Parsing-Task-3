package by.bsu.yakovlev.xmlparsing.bikercreator;

import by.bsu.yakovlev.xmlparsing.hyerarchy.Ammunition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Service {
        public static int calculateTotalCost(Biker biker){
            // List<Ammunition> listOfAmmunition = ;
            int totalCost = 0;
            for(Ammunition ammun: biker.getList()){
                totalCost += ammun.getPrice();
            }
            return totalCost;
        }

        public static Biker sortAmmunByWeight(Biker biker){
            List<Ammunition> listOfAmm = biker.getList();
            Collections.sort(listOfAmm);
            Biker biker1 = new Biker(listOfAmm);
            return biker1;
        }

        public static String findMatchByCost(Biker biker){
            List<Ammunition> listOfAmm = biker.getList();
            List<Ammunition> listOfMatchAmm = new ArrayList<>();
            for(Ammunition ammun: listOfAmm){
                if(ammun.getPrice() < 700){
                    listOfMatchAmm.add(ammun);
                }
            }
            return listOfMatchAmm.toString();
        }
    }

