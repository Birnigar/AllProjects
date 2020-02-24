package day55;

public class Casting {
    public static void main(String[] args) {

        int x=10;
        long y=x; //it will implicitly--- up casting

       // byte b=x; this will not working

        byte b=(byte) x;//it will be casted explicitly---down casting

        Object o=new Dog("Kangal");
        //o.bark(); we can not do that
        Dog d= (Dog) o;//we casted// this is down casting
        d.bark(); // we can call bark method



    }
}
