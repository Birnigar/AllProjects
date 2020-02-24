package Interwiev_Question;

import java.util.Arrays;

public class FindMaximum {
    public static void main(String[] args) {
int[] n={1,2,3,4};
        System.out.println(maxValue(n));

    }


    public static int maxValue( int[]  n ){

        int max=n[0];

        for (int each:n) {
            if(each>max){
                each=max;
            }

        }
        return max;
    }

    public static int maxValue2( int[]  n ){

        Arrays.sort(n);
        return n[n.length-1];
    }


}
