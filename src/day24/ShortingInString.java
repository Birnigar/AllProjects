package day24;

import java.util.Arrays;

public class ShortingInString {
    public static void main(String[] args) {

        String[] superHeros={"Superman", "Batman","Wonder Woman","Aquaman","Cyborg","Flash"};

        System.out.println("Before sorting superheros = " + Arrays.toString(superHeros));
        Arrays.sort(superHeros);
        System.out.println("After sorting superheros = " + Arrays.toString(superHeros));

    }
}
