package day41;

//make this product a well encapsulated
//make all instance fields private so it can only be accessible in same class
// provide public getters and setters method
public class Product {

   private String name;
   private double price;



   public String getName(){
       //return name;
       return this.name;
   }

   public void setName(String name){
      // name=newName;
       this.name=name;
   }

   public double getPrice(){
      // return price;
       return this.price;
   }
   public void setPrice(double price){
      // if(newPrice>0){
        //   price=newPrice;
       //}
       if(price>0){
           this.price=price;
       }

   }


    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
