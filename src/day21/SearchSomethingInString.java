package day21;

import java.util.Scanner;

public class SearchSomethingInString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String myName=scan.nextLine();
        int length=myName.length();

        for (int i = 0; i <length ; i++) {
            String currentName=myName.substring(i,i+1);
            if(currentName.equalsIgnoreCase("a")){
                System.out.println("Index Of A: "+i);
            }
        }





    }
}
