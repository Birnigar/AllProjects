package day46;

public class Dog extends Animal {

    @Override
    public void speak() {
        super.speak();
        System.out.println("BARK!!!");
        super.speak();
        super.speak();
    }

    public static void main(String[] args) {
        Dog twix = new Dog();
        twix.speak();


    }
}