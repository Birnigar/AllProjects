package Repl_It;

import java.util.Scanner;

public class Repl_153 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {

            arr[i] = inp.nextInt();
        }

        plus_minus(arr);
    }//end main

    public static void plus_minus(int[] arr) {
        int positives = 0;
        int negatives = 0;
        int zeros = 0;

        for (int eachArr : arr) {
            if (eachArr > 0) {
                positives++;
            }
            else if (eachArr < 0) {
                negatives++;
            }
             else {
                zeros++;
            }

        }
          System.out.println("positives:" + positives + ", negatives:" + negatives + ", zeros:" + zeros);

    }
}