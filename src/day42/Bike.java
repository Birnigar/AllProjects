package day42;

public class Bike {

    int speed;
    int gear;

    public Bike(){
        System.out.println("message from constructor");
        gear=1;
    }
    public Bike(int newGear){
        gear=newGear;
        //this.gear=newGear;
    }
    public Bike(int newGear,int speed){
          gear=newGear;
          this.speed=speed;
    }


}

