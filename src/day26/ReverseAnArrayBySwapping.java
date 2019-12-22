package day26;

import java.util.Arrays;

public class ReverseAnArrayBySwapping {
    public static void main(String[] args) {
        int[] num=new  int[]{5,1,21,2,3,13,80};

        System.out.println(Arrays.toString(num));

        for (int i = 0; i <num.length/2; i++) {
            int temp=num[i];
            num[i]=num[(num.length-1)-i];
            num[(num.length-1)-i]=temp;
        }
        System.out.println("reverse num is : "+Arrays.toString(num));

        int[] myNumbers=new int[]{10,40,30,7,25,92};
        for (int i = 0; i <myNumbers.length/2; i++) {

            int temp=myNumbers[i];
            myNumbers[i]=myNumbers[(myNumbers.length-1)-i];
            myNumbers[(myNumbers.length-1)-i]=temp;
        }

        System.out.println("reverse myNumbers = " + Arrays.toString(myNumbers));





    }
}
