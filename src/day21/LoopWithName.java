package day21;

import java.util.Scanner;

public class LoopWithName {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        int length=name.length();


        for (int i = 0; i <length-1; i++) {


            if(name.substring(i,i+1).equalsIgnoreCase("l")) {

                break;
            }
            System.out.print(name.substring(i,i+1));
             }







    }
}
