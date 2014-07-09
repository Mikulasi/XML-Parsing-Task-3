package by.bsu.yakovlev.xmlparsing.hyerarchy;

    public class Jacket extends Ammunition {

        public enum JacketType{
            CLASSIC,RETRO,RACE,RAIN,SPORT,TOURING,TRADITIONAL
        }

    private JacketType jacketType;
    private AmmunitionMaterial ammunitionMaterial;

        public Jacket(){};
        public Jacket(int price, double weight, String companyName,String color,
                  JacketType jacketType, AmmunitionMaterial ammunitionMaterial, String id){
        super(price,weight,companyName,color, id);
        this.jacketType = jacketType;
        this.ammunitionMaterial = ammunitionMaterial;
    }

    public AmmunitionMaterial getAmmunitionMaterial(){
        return ammunitionMaterial;
    }
    public JacketType getJacketType(){return jacketType;}
    public String toString(){
        return "Jacket price: " + getPrice()+ ",Jacket weight: "+ getWeight() + ",Jacket company name: "+ getCompanyName()+
                ",Jacket color: " +getColor()+ "Jacket type: "+ jacketType +", Jacket material: " + getAmmunitionMaterial();
    }
}
