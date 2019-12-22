package stringTask;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your email address");
        String email=scan.next();
        //separate mail to 3 part 1.name 2.mail 3..com

        int firstPart=email.indexOf("@");
        int secondPart=email.indexOf(".");

        String part1=email.substring(0,firstPart);
        String part2=email.substring(firstPart+1,secondPart);
        String part3=email.substring(secondPart);

        System.out.println(part1);
        System.out.println(part2);
        System.out.println(part3);






    }
}
