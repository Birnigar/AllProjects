package day05;

import java.util.Scanner;

public class TheScannerWay {
    public static void main(String[] args) {
        //ask user for name
        //and capture the result
        //print your name is this
        //ask user for birth year
        //and capture the result
        //print the age
        //ask user for height
        //and capture the result
        //print the height

        //create scanner object
        Scanner scan =new Scanner(System.in);
        System.out.println("What is your name : ");
        String name=scan.next();
        System.out.println("My name is "+ name);

        System.out.println("What is your birth year :");
         int birthYear=scan.nextInt();
         int currentYear=2019;
         int age=currentYear-birthYear;
        System.out.println("Your age is "+ age);

        System.out.println("What is your height : ");
        double height=scan.nextDouble();
        System.out.println("Your height is: "+ height);







    }

}
