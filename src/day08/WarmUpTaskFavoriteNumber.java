package day08;

import java.util.Scanner;

public class WarmUpTaskFavoriteNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int myFavouriteNumber;
        System.out.println("Please enter a number to guess my favourite number: ");
        myFavouriteNumber = scanner.nextInt();
        if(myFavouriteNumber == 35){
            System.out.println("Well done!!");
        } else{
            System.out.println("Try again!");
        }








    }

}
