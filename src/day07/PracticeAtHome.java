package day07;

import java.util.Scanner;

public class PracticeAtHome {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter your grade");
       int grade=scan.nextInt();


       if (grade>85){
           System.out.println("You will pass exam");
       }
        else{
            System.out.println("You wiil take the class again");
        }

        System.out.println("THE END");

    }
}
