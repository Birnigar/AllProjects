package stringTask;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name (at least 3 character)");
        String name=scan.next();
        int length=name.length();

        System.out.println(name.charAt(0)+""+name.charAt(length-1)+""+name.charAt(length-1/2));







    }
}
