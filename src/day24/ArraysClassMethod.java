package day24;

import java.util.Arrays;

public class ArraysClassMethod {
    public static void main(String[] args) {


        String[] superHeros={"Superman", "Batman","Wonder Woman","Aquaman","Cyborg","Flash"};
       // System.out.println(superHeros); it doesn't work never
        System.out.println( Arrays.toString(superHeros));

        String savingSuperHerosAsString=Arrays.toString(superHeros);

        System.out.println(savingSuperHerosAsString.charAt(0));// give me '[' it is first character in my new string

        int[] numbers={10,44,55,3,78};
        System.out.println(Arrays.toString(numbers));//display is[10,44,55,3,78]








    }
}
