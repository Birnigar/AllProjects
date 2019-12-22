package day07;

import java.util.Scanner;

public class EmailBuilderWithScanner {
    public static void main(String[] args) {
        System.out.println("Enter your first name,last name,company seperated by space:");
        Scanner scan=new Scanner(System.in);
            String firstName,lastName,company,email;
            firstName=scan.next();
            lastName= scan.next();
            company=scan.next();
            char emailSing='@';
            email=firstName+"_"+lastName+emailSing+company+"."+"com";
        System.out.println("My name is "+firstName+" "+lastName+" and I work for "+company+" and my email is:"+email);

        }
}
