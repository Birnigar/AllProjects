package day29;

import java.util.Arrays;

public class FillingUpArrayValue {
    public static void main(String[] args) {

        int[] num=new int[100];

        num[0]=1;
        num[1]=2;

        for (int i = 0; i <num.length ; i++) {
            System.out.println(num[i]=i+1);

        }

        System.out.println("After filling up \n"+Arrays.toString(num));

    }
}
