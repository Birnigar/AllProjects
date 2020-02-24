package Repl_It;

import java.util.Arrays;

public class Repl_208 {
    public static int[] populate(int[] r)
    {       int[] populate=new int[r.length];
        for (int i = 0; i <r.length ; i++) {
            populate[i]=i+1;
        }

             return populate;
    }

    public static void main(String[] args)
    {


        int [] i= new int[3];
        i= populate(i) ;
        System.out.println(Arrays.toString(i));

    }
}
