package Repl_It;

import java.util.Scanner;

public class Repl_164 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int max=scan.nextInt();

        max(x,max);


    }
    public static int max(int x,int max){

        {
            return x>max?max:x;

        }

    }
}
