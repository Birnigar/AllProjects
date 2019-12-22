package day17;

import java.util.Scanner;

public class BackCountMyName {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        System.out.println("Enter your name");
        String name=scan.nextLine();
        int myNameLengt=name.length();

        int myNameLastIndex=myNameLengt-1;

        while (myNameLastIndex>=0){
            System.out.println(myNameLastIndex);
            --myNameLastIndex;
        }




    }
}
