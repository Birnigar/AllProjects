package stringTask;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your name:");
        String name=scan.nextLine();

        int space=name.indexOf(" ");

        System.out.println("Inital is: "+name.charAt(0)+""+name.charAt(space+1));


    }
}
