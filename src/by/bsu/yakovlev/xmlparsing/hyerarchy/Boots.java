package by.bsu.yakovlev.xmlparsing.hyerarchy;

    public class Boots extends Ammunition {

        public enum BootsType {
            SPORT_BOOTS, ENDURO_BOOTS, TOURIST_BOOTS, STREET_BOOTS, CHOPPER_BOOTS
        }

        private BootsType bootsType;

        public Boots(){};

       public Boots(int price, double weight, String companyName, String color, BootsType bootsType, String id) {
            super(price, weight, companyName, color, id);
            this.bootsType = bootsType;
        }

        public BootsType getBootsType() {
            return bootsType;
        }

        public String toString() {
            return "Boots price: " + getPrice() + ",Boots weight: " + getWeight() + ",Boots company name: " + getCompanyName() +
                    ",Boots color: " + getColor() + ", Boots type: " + getBootsType();
        }
    }
