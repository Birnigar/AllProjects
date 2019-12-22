package day10;

import java.util.Scanner;

public class ConditionalMultiBranc_Practice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        // At the McDonald Drive menu
        System.out.println("Welcome to McDonald,what can I get for you");
        /*
        11.Burger
        5.French Fry
        8.Nuggets
        35.Ice Cream
        55.coke
         */
        int itemNumber;
        String order="";
      itemNumber=scan.nextInt();
        order=scan.next();
        if(itemNumber==11){
            order="Burger";
            System.out.println("you have selected "+ itemNumber);
        }else if(itemNumber==5){
            order="Frenh Fry";
            System.out.println("you have selected "+ itemNumber);
        }else if(itemNumber==8){
            order="Nugget";
            System.out.println("you have selected "+ itemNumber);
        }else if(itemNumber==8){
            order="Nugget";
            System.out.println("you have selected "+ itemNumber);
        }else if(itemNumber==35){
            order="Ice Cream";
            System.out.println("you have selected "+ itemNumber);
        }else{
            order="UNKNOWM";
            System.out.println("you have selected "+ itemNumber+ "ITEM");
        }



    }




}
