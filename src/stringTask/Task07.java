package stringTask;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String name=scan.nextLine();
        String mailTitle="@gmail.com";
        int space=name.indexOf(" ");
        char firstLetter=name.charAt(0);
        String lastName=name.substring(space+1);

        String mail=firstLetter+""+lastName+mailTitle;
        System.out.println(mail);



    }
}
