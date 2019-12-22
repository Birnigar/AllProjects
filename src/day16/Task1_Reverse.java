package day16;

import java.util.Scanner;

public class Task1_Reverse {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Please Enter Word1 which has 4 characters");
        String word1=scan.next();
         String word2="";

       // String word2=word1.charAt(3)+" "+word1.charAt(2)+" "+word1.charAt(1)+" "+word1.charAt(0);
 word2 += word1.charAt(3)+" "+word1.charAt(2)+" "+word1.charAt(1)+" "+word1.charAt(0);
        System.out.println(word2);




    }
}
