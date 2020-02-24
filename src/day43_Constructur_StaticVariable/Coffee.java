package day43_Constructur_StaticVariable;

public class Coffee {
    private String type;
    private int coffeeLevel;
    private double price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCoffeeLevel() {
        return coffeeLevel;
    }

    public void setCoffeeLevel(int coffeeLevel) {
        this.coffeeLevel = coffeeLevel;
    }

    public double getPrice() {

            return price;

    }

    public void setPrice(double price) {
        if(price>0){
            this.price=price;
        }else{
            this.price=1;
        }
    }

    public Coffee(){
        System.out.println("No Argument constructor");
    }
    public Coffee(String type,int coffeeLevel,double price){
        this.type=type;
        this.coffeeLevel=coffeeLevel;
        setPrice(price);

    }


    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", coffeeLevel=" + coffeeLevel +
                ", price=" + price +
                '}';
    }

    public int getCaffeineLevel() {
        return coffeeLevel;
    }
}
