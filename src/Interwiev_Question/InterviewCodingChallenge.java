package Interwiev_Question;

import java.util.Arrays;

public class InterviewCodingChallenge {
    public static void main(String[] args) {

        System.out.println(fibonacciNumber(6));
        int[] arr = {1, 9, 1, 20, 10};
        int a = 3;

        System.out.println(Arrays.toString(subarray(arr, a)));


    }

    public static int fibonacciNumber(int n) {
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci[fibonacci.length - 1];
    }
    //Write a function that will take int[] arr, int n as parameters and return subarray[n] with the largest sum.
    //Example: input: arr[]{5,5,1,2,10}, 3
    //		 return {1, 2, 10}

    public static int[] subarray(int[] arr, int n) {
        int[] largestSubArray = new int[n];
        int max = 0;
        for (int i = 0; i < arr.length - n + 1; i++) {
            int sum = arr[i] + arr[i + 1] + arr[i + 2];
            if (sum > max) {
                max = sum;
                for (int j = 0; j < n; j++) {
                    largestSubArray[j] = arr[i + j];
                }
            }
        }
        return largestSubArray;
    }
    //Given a string s, find the longest palindromic substring in s. If string has spaces ignore them.
    //Input: "babad"
    //Output: "bab"
    //Note: "aba" is also a valid answer.

    /**
     * Piles game.
     * You need to make it flat with minimum hight. With 1 step you can remove all blocks from 1 pile to make it equal to next smaller pile.
     *  Example: 1st step moving from pile(high=5) 2 blocks. Next smaller pile high = 3.
     *     | |        2 1 5 5 3
     *     | |        2 1 5 3 3
     *     | | |      2 1 3 3 3
     * |   | | |      2 1 3 3 2
     * | | | | |      2 1 3 2 2
     * 2 1 5 5 3      2 1 2 2 2
     *                1 1 2 2 2
     *                1 1 1 2 2
     *                1 1 1 1 2
     *                1 1 1 1 1
     *
     */

    public static int piles(int[] arr){
        int stepCount=0;
        Arrays.sort(arr);


     return stepCount;
    }
}
