package Repl_It;

import java.util.Scanner;

public class Repl_172 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}
        };
        int result = 0;
        int num1=0;
        int num2=0;
        int j=0;
        for (int i = 0; i <3 ; i++) {
            num1+=matrix[i][j];
              j++;
            }

    int y=0;
         for (int x = 2; x >=0 ; x--) {
        num2+=matrix[x][y];
        y++;
    }

        result=num1-num2;



        // FINAL PRINT
        System.out.println(Math.abs(result));







    }
}
