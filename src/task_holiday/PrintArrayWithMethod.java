package task_holiday;

import java.util.Arrays;

public class PrintArrayWithMethod {
    public static void main(String[] args) {

        int[] arr2={3,75,95,81,4,67};
        printDescending(arr2);



    }
    public static int[] printDescending(int[] arr){

        Arrays.sort(arr);
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+",");
        }
       return arr;
    }
}
