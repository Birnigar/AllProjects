package day51.polymorphim;

public abstract class Animal {

    public abstract void  makeNoise();
//    {
//        System.out.println("general animal noise");
//    }



}
class Dog extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Wooof!!!!");
    }




}

class Horse extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Neinei!!!!!");
    }





}