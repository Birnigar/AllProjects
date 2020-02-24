package day51.polymorphim;

public class AnimalShow {
    public static void main(String[] args) {

        Animal a1=new Dog();
        a1.makeNoise();
        //here we are just reassigning a1 different object
        a1=new Horse();
        a1.makeNoise();


        Animal a2=new Horse();
        a2.makeNoise();

        Dog d1=new Dog();

        Animal a3=d1;
        a3.makeNoise();





    }
}
