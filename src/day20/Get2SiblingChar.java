package day20;

import java.util.Scanner;

public class Get2SiblingChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String name=scan.next();
        int length=name.length();

        for (int i = 0; i <length-1 ; i++) {
            System.out.println(name.substring(i,i+2));

        }





    }
}
