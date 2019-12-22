package day27;

import java.util.Arrays;

public class Multi_D_ArraysTask {
    public static void main(String[] args) {
        
        int[][] numbers={{12,11,10,19},{19,20,15}};
        
        int max=numbers[0][0];

        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                
                if(max<numbers[i][j]){
                    max=numbers[i][j];
                }
                
            }
            
        }
        System.out.println("max = " + max);
        
        
        int max2=numbers[0][0];

        for (int[] each1DArray:numbers) {
            for (int eachElement:each1DArray) {
                if(max2<eachElement){
                    max2=eachElement;
                }

            }
        }
        System.out.println("max2 = " + max2);

        //finding the minimum number

        int min=numbers[0][0];

        for (int[] eachArray1:numbers) {

            for (int eachVariable:eachArray1) {
                if(eachVariable<min){
                    min=eachVariable;
                }

            }

        }

        System.out.println("min = " + min);
        
        
        
        
        
        
        
        
    }
}
