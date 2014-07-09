package by.bsu.yakovlev.xmlparsing.hyerarchy;

    public class Pants extends Ammunition {
    private boolean haveKevlar;
    private AmmunitionMaterial ammunitionMaterial;

        public Pants(){};
        public Pants(int price, double weight, String companyName, String color,
                 boolean haveKevlar, AmmunitionMaterial ammunitionMaterial, String id){
        super(price,weight,companyName,color, id);
        this.haveKevlar = haveKevlar;
        this.ammunitionMaterial = ammunitionMaterial;
    }
    public boolean getHaveKevlar(){
        return haveKevlar;
    }
    public void setHaveKevlar(boolean haveKevlar){
        this.haveKevlar = haveKevlar;
    }
    public AmmunitionMaterial getAmmunitionMaterial(){
        return ammunitionMaterial;
    }
    public String toString(){
        return "Pants price: " + getPrice()+ ",Pants weight: "+ getWeight() + ",Pants company name: "+ getCompanyName()+
                ",Pants color: " +getColor()+ "Pants kevlar availability: " +getHaveKevlar()+
                ", Pants material" +getAmmunitionMaterial();
    }
}
