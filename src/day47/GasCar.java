package day47;

public class GasCar extends Car {

    int gasLevel;

    @Override
    public void start() {
        System.out.println("This is how gas car start");
    }

    @Override
    public void goForward() {

            System.out.println("Go forward");
    }

    @Override
    public void goBackward() {
        System.out.println("Go backward");
    }
    @Override
    public void turn(String direction) {
        System.out.println("Turn on "+direction);
    }
}
