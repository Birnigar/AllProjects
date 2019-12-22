package day24;

import java.util.Arrays;

public class ArraysClassMethod2 {
    public static void main(String[] args) {

          double[] price={13.25,32.1,15.75,};

        String strPrice=Arrays.toString(price);

        for (int i = 0; i <strPrice.length() ; i++) {
            System.out.println("Character at index "+i+ " is "+strPrice.charAt(i)); //we get index of each character
        }


    }
}
