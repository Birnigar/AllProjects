package day18;

import java.util.Scanner;

public class SmartLackOpener {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("knock knock!!");
        System.out.println("what is the password");
        String password=scan.next();
        while (!password.equals("B15")){
            System.out.println("Wrong Password!! Try Again");
            password=scan.next();
        }

        System.out.println("OPEN SESEAME!!!");






    }
}
