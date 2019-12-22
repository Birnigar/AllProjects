package day04;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

             //I want to save users input after asking some question
             //and I want to save this input so I can do something with it

              //Step 1: Use scanner class to create scanner object
                //that have this functionality
        Scanner scan = new Scanner(System.in);
              // ask user to enter name

        System.out.println("Enter your first name please :");
               // capture what user typed on keyboard in console
              //ask question from user before entering
        String firstName = scan.next();
        //scan.next() is capturing single word that user input

                //print the result of what is saved from user input
        System.out.println("You have entered :"+firstName);


        System.out.println("How old are you?");
        int age=scan.nextInt();
        //scan.nextInt() is capturing single number that user entered
        System.out.println("Your age is: "+ age);


    }
}
