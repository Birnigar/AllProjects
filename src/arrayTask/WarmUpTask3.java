package arrayTask;

import java.util.Arrays;
import java.util.Scanner;

public class WarmUpTask3 {
    public static void main(String[] args) {
      /*
       given the array of names:
            String[] names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};

       write a program that can remove all the names named Ahmed from the array

       Ex:

               names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};
               System.out.println( Arrays.toString(names) );

               output:
                   [John, Eric, Hassan]
      */
        String[] names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};

String nameNoAhmet="";

        for (int i = 0; i <names.length ; i++) {
            if (names[i].equalsIgnoreCase("Ahmed")) {
                continue;
            } else {
                nameNoAhmet += names[i] + " ";
            }
        }
String[] nameWithoutAhmet= nameNoAhmet.split(" ");

        System.out.println(Arrays.toString(nameWithoutAhmet));

















    }
}
