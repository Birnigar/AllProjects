package day21;

import java.util.Scanner;

public class WakeUpTask1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String myName=scan.nextLine();
        int length=myName.length();
          String newName="";
        for (int i = 0; i < length; i++) {

            newName+=myName.substring(i,i+1)+"->";

        }

        System.out.println(newName);

    }
}
