package day39;

public class carCreation2 {
    public static void main(String[] args) {

        Car c1=new Car();

        c1.year=2020;
        c1.model="X";
        c1.make="Tesla";
        c1.color="Black";
        c1.goForward();
          c1.ageOfCar();

        Car c2=new Car();
        c2.year=2010;
        c2.make="Toyota";
        c2.model="Corolla";
        c2.color="Red";
        c2.goForward();

    }
}
