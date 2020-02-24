package Repl_It;

import java.util.Scanner;

public class Repl_161 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num) {
        //WRITE YOUR CODE HERE
        int reversed = 0;
        int numNew = num;
        while (numNew > 0) {
            reversed = reversed * 10 + numNew % 10;
            numNew /= 10;
        }
        System.out.println(reversed == num);

    }
}