package day27;

import java.util.Arrays;

public class Multi_Dimensional_3DArraysPrintEachItem {
    public static void main(String[] args) {

        int [][][] arr3D={{{1,2,3},{4,5,6}}  , {{7,8,9},{10,11,12}} };

        for (int[][] arr2D:arr3D){
            for (int[] arr:arr2D){
                for (int eachItem:arr){
                    System.out.println("eachItem = " + eachItem);
                }
            }
        }

    }
}
