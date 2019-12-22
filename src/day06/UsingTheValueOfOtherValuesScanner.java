package day06;
import java.util.Scanner;
public class UsingTheValueOfOtherValuesScanner {
    public static void main(String[] args) {



        Scanner scan=new Scanner(System.in);
        System.out.println("What is your order? I want the same");
        String myOrder=scan.nextLine();

        System.out.println("My order is "+ myOrder+ "\n"+"Your order is "+myOrder);




    }





}
