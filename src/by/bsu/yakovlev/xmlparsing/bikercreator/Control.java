package by.bsu.yakovlev.xmlparsing.bikercreator;

import org.apache.log4j.Logger;

public class Control {
    public static final Logger LOGGER = Logger.getLogger(Control.class);

    public static int TestControl(int numberOfBikers) {

        for (int i = 1; i <= numberOfBikers; i++) {

            LOGGER.info("Biker #" + i);
            //create biker
            Biker biker = BikerCreator.createBiker(BikerCreator.createAllAmmun());
            LOGGER.info("Total ammunition on biker is(are):" + biker.getList());
            LOGGER.info("Total cost is " + Service.calculateTotalCost(biker));
            //include some ammunition
            Biker biker1 = BikerCreator.includeSomeAmmun(biker);
            LOGGER.info("Current ammunition on biker is(are):" + biker1.getList());
            LOGGER.info("Current cost is " + Service.calculateTotalCost(biker1));
            //sorting by cost
            Service.sortAmmunByWeight(biker);
            LOGGER.info("Ammunition sorted by weight: " + biker.getList());
            //finding suitable ammunition
            LOGGER.info("Suitable ammunition for this biker is(are): " + Service.findMatchByCost(biker));

        }
        return numberOfBikers;
    }
}




