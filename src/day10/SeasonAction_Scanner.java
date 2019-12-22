package day10;

import java.util.Scanner;

public class SeasonAction_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*spring---->Hike,Nawruz.Blossom
        Summer---->swim,Vacation,BBQ,Holiday
        Fall---->Black Friday,Hiking,Harvest,Halloween,Shopping
        Winter--->Snowboarding,Ski,Christmas,New year
         */

        System.out.println("Hey What is the season!!!?");
        String season=scan.next();

        switch (season){

            case "Spring":
                System.out.println("Hike,Nawruz.Blossom");
                break;
            case "Summer":
                System.out.println("swim,Vacation,BBQ,Holiday");
                break;
            case "Fall":
                System.out.println("Black Friday,Hiking,Harvest,Halloween,Shopping");
                break;
            case "Winter":
                System.out.println("Snowboarding,Ski,Christmas,New year");
                break;

        }


    }

}
