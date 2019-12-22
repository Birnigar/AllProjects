package day04;

public class StringPractice {
    public static void main(String[] args) {

        String firstName = "Hasan";
        String lastName = "Sultan";

        String myFullName= firstName+"\t"+lastName;
        System.out.println("My First name is "+firstName);
        System.out.println("My last name is "+ lastName);
        System.out.println("My full name is "+firstName+" "+lastName);
        System.out.println("My full name is "+myFullName);
        // I saw Amazon Fire HD8 hands-free with Alexa for $79.99

        String productName="Amazon Fire";
        String model= "HD";
        byte version=8;
        float price =79.99f;
        char dolar='$';

        System.out.println("I saw "+productName+" "  +version+ " hands-free with Alexa for "+price+dolar);



}
}
