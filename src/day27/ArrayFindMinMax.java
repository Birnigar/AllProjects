package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFindMinMax {
    public static void main(String[] args) {
        
        int[] num=new int[6];
        Scanner scan=new Scanner(System.in);

        for (int x = 0; x <6 ; x++) {
            System.out.println("Enter your number!");
            num[x]=scan.nextInt();
        }

        System.out.println(Arrays.toString(num));

          int minNumber=num[0];
        for (int i = 1; i <num.length ; i++) {
            
            if(num[i]<minNumber){
                minNumber=num[i];
            }
            
        }
        System.out.println("minNumber = " + minNumber);
int maxNum=num[0];

        for (int j = 1; j <num.length ; j++) {

            if(num[j]>maxNum){
                maxNum=num[j];

            }

        }
        System.out.println("maxNum = " + maxNum);
        
        
        
        
        
        
        
        
    }
}
