package day24;

import java.util.Arrays;

public class ArraysMethodSorting {
    public static void main(String[] args) {
        int[] scores={99,44,66,23,19,55};
        System.out.println("original first Item Value: " +scores[0]);//original first item 99
        System.out.println(Arrays.toString(scores));//[99, 44, 66, 23, 19, 55]
        Arrays.sort(scores);//just action
        System.out.println(Arrays.toString(scores));//[19, 23, 44, 55, 66, 99] low to high
//first Item Value
        System.out.println("new first Item Value: " +scores[0]); //give 19


        char[] nameChar={'n','i','g','a','r'};
        System.out.println("nameChar = " +Arrays.toString( nameChar));
        Arrays.sort(nameChar);
        System.out.println("after sothing nameChar = " + Arrays.toString( nameChar));// [n, i, g, a, r] by ascii table

        char[] nameChars={'N',' ','9','a','R'};
        Arrays.sort(nameChars);
        System.out.println("sort nameChars = " + Arrays.toString(nameChars));//[ , 9, N, R, a]
//  Special character comes first,number.upperCase then lowercase








    }
}
