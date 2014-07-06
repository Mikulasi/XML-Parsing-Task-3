package by.bsu.yakovlev.xmlparsing.hyerarchy;

    public class Helm extends Ammunition {

        public enum HelmType{
            FULL_FACE, FLIP_UP, OPEN_FACE, HALF_HELMET, OFF_ROAD, ENDURO
        }
    private HelmType type;

        public Helm(){};
        public Helm(int price, double weight, String companyName, String color,HelmType type){
        super(price,weight,companyName,color);
        this.type = type;

    }
    public HelmType getType(){
        return type;
    }

    public String toString(){
        return "Helm price: " + getPrice()+ ",Helm weight: "+ getWeight() + ",Helm company name: "+ getCompanyName()+
                ",Helm color: " +getColor()+ ", Helm type: " + getType();
    }
}
