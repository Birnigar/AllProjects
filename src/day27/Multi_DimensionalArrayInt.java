package day27;

import java.util.Arrays;

public class Multi_DimensionalArrayInt {
    public static void main(String[] args) {

        int[][] numbers={{1,2,3},{4,5,6},{7,8,9}};


        for (int i = 0; i <numbers.length ; i++) {

           // System.out.println(" array = "+i+" " + Arrays.toString(numbers[i]));
            for (int j = 0; j <numbers[i].length ; j++) {
                System.out.println(numbers[i][j]+" ");

            }
        }








    }
}
