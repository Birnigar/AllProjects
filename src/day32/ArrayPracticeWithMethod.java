package day32;

import java.util.Arrays;

public class ArrayPracticeWithMethod {
    public static void main(String[] args) {

        printArrayItems(new int[]{1, 6, 5, 3, 12, 3});
        int[] scores = {2, 5, 8, 23, 4, 5, 6};
        printArrayItems(scores);
        printmaxOfIntArray(new int[]{75, 55, 44, 76, 100});
        printMinOfArray(new int[]{99, 55, 44, 76, 100});
        printSumOfIntArray(new int[]{99, 55, 44, 76, 100});
        checkScoresAllMoreThan60(new int[]{65,66,45,78,35});
    }

    public static void printArrayItems(int[] num) {

        System.out.println("Arrays has item :" + Arrays.toString(num));
    }

    public static void printmaxOfIntArray(int[] arr) {
        int maxNum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum=arr[i];
            }
        }
        System.out.println("maxNum = " + maxNum);
    }

    public static void printMinOfArray(int[] arr) {
        int minNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minNum) {
                minNum = arr[i];
            }

        }
        System.out.println("minNum = " + minNum);
    }

    public static void printSumOfIntArray(int[] arr3) {
        int sum = 0;
        for (int i = 0; i < arr3.length; i++) {
            sum += arr3[i];
        }
        System.out.println("sum = " + sum);
    }

    public static void checkScoresAllMoreThan60(int[] scores) {

        int count = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > 60) {
                count++;
            }
        }
if(scores.length==count){
    System.out.println("Print everyone passed");
}else{
    System.out.println("Somone has failed");
}
    }
}