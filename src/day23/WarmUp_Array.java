package day23;

import java.util.Scanner;

public class WarmUp_Array {
    public static void main(String[] args) {
        int[] num={12,34,45,77,85,52,63};

        int numIndex=num.length;
        String result="";
//print out in reverse order
        for (int i = numIndex-1; i >=0; i--) {

             result=result+" "+num[i];
        }
        System.out.println(result);
        //store last item in a variable lastItem
        int lastItem=num[numIndex-1];
        System.out.println("lastItem = " + lastItem);
        // print item right in the middle
        int middle=num[numIndex/2];
        System.out.println("middle = " + middle);
        //find sum
        int sum=0;
        for (int j = 0; j <numIndex ; j++) {
            sum+=num[j];
        }
        System.out.println("sum = " + sum);
        //find average
        double average=0;
        for (int x = 0; x <numIndex ; x++) {
            sum+=num[x];
            average=sum/numIndex-1;
        }
        System.out.println("average = " + average);
        //find max
        int max=num[0];

        for (int y = 1; y <numIndex ; y++) {
            if(num[y]>max){
                max=num[y];
            }
        }
        System.out.println("max = " + max);

        int min=num[0];
        for (int a = 1; a <numIndex ; a++) {
            if(num[a]<min){
                min=num[a];
            }
        }
        System.out.println("min = " + min);


















    }

}
