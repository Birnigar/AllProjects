package day19;

import java.util.Scanner;

public class SuperHero {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String keyword;
        do {
            System.out.println("What is Keyword?");
             keyword=scan.next();
        }while (!keyword.equals("SHAZAM"));

        System.out.println("YOU ARE NOW SUPER HERO!");


    }
}
