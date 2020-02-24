package day49;

public interface Autonomous {




    public  abstract void selfDrive();
    public abstract String toString();

    public default void isElectric(){
        System.out.println("My car is electric car");
    }

}
