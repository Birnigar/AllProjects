package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWIthScanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int[] num=new int[5];



        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter an Int Number?");
              int input= scan.nextInt();//returns int date typ
              num[i]=input;//num[i]=scan.nextInt();
        }
        System.out.println("num = "+ Arrays.toString(num));



          Arrays.sort(num);

        System.out.println("After sort num= " + Arrays.toString(num));

        System.out.println("Biggest number is+ =" +num[4]);











    }
}
