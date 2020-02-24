package day49;

public abstract class Vehicle {

    String brand;

   public Vehicle(String brand){
       this.brand=brand;
   }


    public abstract void start();

    public void goForward(){
        System.out.println(brand+" is going goForward");

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
