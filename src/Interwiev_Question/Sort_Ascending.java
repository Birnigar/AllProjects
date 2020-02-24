package Interwiev_Question;

import java.util.Arrays;

public class Sort_Ascending {
    public static void main(String[] args) {

        int[] arr1 = {10,20,7, 8, 90};
        System.out.println(Arrays.toString(sort(arr1)));




    }
    public static int[] sort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        return arr;
    }
}
