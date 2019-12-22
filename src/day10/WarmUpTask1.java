package day10;

import java.util.Scanner;

public class WarmUpTask1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String myAnswer="";
        int myNumber;
        myNumber=scan.nextInt();

        if(myNumber%5==0) {
            myAnswer="Fizz Number";

        }else{
           myAnswer="not a Fizz Number";
        }
        System.out.println("My number is "+myNumber+", It is "+myAnswer);





    }
}
