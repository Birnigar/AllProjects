package day17;

import java.util.Scanner;

public class NamePrinter {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=scan.nextLine();
       // String name="Alexander";



               int x=0;
           while (x<name.length()){
               System.out.print(name.charAt(x));
               ++x;
           }

    }

    }

