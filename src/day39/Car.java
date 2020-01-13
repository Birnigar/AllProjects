package day39;

public class Car {
    int year;
    String model;
    String make;
    String color;

    public void goForward(){
        System.out.println("Going forward");
    }

    
    public void ageOfCar(){
        
        int currentYear=2020;
        int ageOfCar=currentYear-year;
        System.out.println("ageOfCar = " + ageOfCar);
    }





}
