package day21;

import java.util.Scanner;

public class SearchSomethingInString2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String myName=scan.nextLine();
        int length=myName.length();

        for (int i = 0; i <=length-2 ; i++) {
            String currentName=myName.substring(i,i+2);
            if(currentName.equalsIgnoreCase("al")){
                System.out.println("Index Of A: "+i);
            }
        }





    }
}
