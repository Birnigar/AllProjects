package Repl_It;

import java.util.Arrays;

public class Repl_190 {
    public static void main(String[] args) {
        int [] a={1,2,3};
        int [] b={4,5};
        System.out.println(Arrays.toString( mergR(a,b) ));



    }


    public static int[] mergR(int[] a, int[] b) {
        int[] merger = new int[(a.length + b.length)];

        for (int i = 0; i <a.length ; i++) {
            merger[i]=a[i];
        }
        int z=0;
        for (int i = a.length; i <merger.length ; i++) {
            merger[i]=b[z];
            z++;
        }

return merger;
    }
}