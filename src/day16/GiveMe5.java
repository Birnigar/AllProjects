package day16;

import java.util.Scanner;

public class GiveMe5 {
    public static void main(String[] args) {
        //I want to ask user to enter a number
        // i will keep asking until user actualy number 5

        Scanner scan=new Scanner(System.in);
        System.out.println("GIVE ME FIVE!!!");
       int number=0;
        while (number!=5){
            System.out.println("hey you did not give me five");
             number=scan.nextInt();
        }
        System.out.println("end of the program");







    }
}
