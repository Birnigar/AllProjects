package day18;

import java.util.Scanner;

public class SmartLock_DoWhileLoopVersion {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("KNOCK KNOCK!!");

        String password;
        do {
            System.out.println("WHAT IS THE PASSWORD?");
            password=scan.next();
        }while (! password.equals("B15"));

        System.out.println("door is open" );



    }
}
