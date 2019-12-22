package day06;
import java.util.Scanner;

public class ScannerCapturingMultipleWord {
    public static void main(String[] args) {

        Scanner blabla= new Scanner(System.in);

        System.out.println("What is your name ? ");

        String name=blabla.nextLine();
        System.out.println("You have entered "+ name);

        System.out.println("Which city you live (including State");
        String city=blabla.nextLine();
        System.out.println("You have entered "+ city);

        System.out.println("What is your Street? ");
        String street=blabla.nextLine();
        System.out.println("You have entered "+street);

    }
}
