package Repl_It;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_162 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
           fib(num);
}

    public static void fib(int num){
        //WRITE YOUR CODE HERE
             int[] nums=new int[num+1];
             nums[0]=0;
             nums[1]=1;
        for (int i = 2; i <nums.length ; i++) {
              nums[i]=nums[i-1]+nums[i-2];
        }
        System.out.println(nums[nums.length-1]);
    }
}
