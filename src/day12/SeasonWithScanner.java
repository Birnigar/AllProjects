package day12;

import java.util.Scanner;

public class SeasonWithScanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter your season");

        //if spring -->Hiking,Navruz,Alergy,Cool weather,Vacation
        //if Summer--->Pool,Swimming,Beach
        // If Fall--->barbecue,riding bike,JUST CODE,Halloween
        // If Winter ----> CODE,Ski,Sledding,Snowman
        String season=scan.next();

        if(season.equalsIgnoreCase("spring")){
            System.out.println("Hiking,Navruz,Alergy,Cool weather,Vacation");
        }else if(season.equalsIgnoreCase("summer")){
            System.out.println("Pool,Swimming,Beach");
        }else if(season.equalsIgnoreCase("fall")){
            System.out.println("barbecue,riding bike,JUST CODE,Halloween");
        }else if(season.equalsIgnoreCase("winter")){
            System.out.println("CODE,Ski,Sledding,Snowman");
        }else{
            System.out.println("NOT VALID");
        }



    }
}
