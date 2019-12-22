package day09;

import java.util.Scanner;

public class dayPrintirVersion2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int day;
        day=scan.nextInt();
        String dayName="";//assign a empty string value

        if(day==1){
            dayName ="Monday";
        } else if(day==2){
            dayName ="Tuesday";
        } else if(day==3){
            dayName =" Wednesday";
        } else if(day==4){
            dayName ="Thursday";
        } else if(day==5){
            dayName ="Friday";
        } else if(day==6){
            dayName ="Saturday";
            System.out.println("YAY@@ SATURDAY");
        } else if(day==7){
            dayName ="Sunday";
            System.out.println("WATCH FOOTBALL");
        }else{
            System.out.println("Day is Unknown");
        }

        System.out.println("Day is "+dayName);

    }
}
