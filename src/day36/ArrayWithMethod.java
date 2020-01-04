package day36;

import java.util.Arrays;

public class ArrayWithMethod {
    public static void main(String[] args) {


        System.out.println(checkIfStringHasNumber("25shdghfh"));
        long []arr={129456852126l,5876,1265478,3569874152369l};
        swapArray(arr);
        int[] arr1={9,5,7,3,6,4};
         reverseArray(arr1);
    }
    public static boolean checkIfStringHasNumber(String str){
        int count=0;

        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){
                count++;
            }
        }
        if(count>=1){
            return Boolean.valueOf(true);
        }
        return Boolean.valueOf(false);
    }
    public static void swapArray(long[] arr){
        long temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
    public  static void reverseArray(int[] arr){
        int[]arrayNew = new int[arr.length];
        int i=0;
        for(int a:arr){
            arrayNew[arrayNew.length-1-i] = a;
            i++;
        }
        System.out.println(Arrays.toString(arrayNew));


    }
}
