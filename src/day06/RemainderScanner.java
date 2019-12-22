package day06;
import java.util.Scanner;
public class RemainderScanner {
    public static void main(String[] args) {

        Scanner blabla=new Scanner(System.in);

        System.out.println("Enter the minute you want to convert");
        int minutes=blabla.nextInt();

        int hourPart=minutes/60;
        int minutesPart=minutes%60;

        System.out.println(hourPart+" hours "+minutesPart+" minutes");

    }
}
