package day21;

import java.util.Scanner;

public class PrintTwoCharacter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String mySentence=scan.nextLine();
        int lenght=mySentence.length();
        String myNewSentence="";

        for (int i = 0; i <=lenght-2 ; i++) {

            myNewSentence+=mySentence.substring(i,i+2)+"->";
        }
        System.out.println(myNewSentence);

        System.out.println("--------------");


        for (int i = 0; i <=lenght-3 ; i++) {

            myNewSentence+=mySentence.substring(i,i+3)+"->";
        }
        System.out.println(myNewSentence);
    }
}
