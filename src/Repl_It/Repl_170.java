package Repl_It;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_170 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] inhabitants = new int[8];
            for(int i=0; i<inhabitants.length; i++) {
                inhabitants[i] = input.nextInt();
            }
        zombieAttack(inhabitants);
    }public static void zombieAttack(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i!=0 && i!=arr.length - 1) {
                if (arr[i] == 0) {
                    arr[i - 1] /= 2;
                    arr[i + 1] /= 2;
                }
            } else if (arr[0]==0) {
                    arr[i + 1] /= 2;
            } else if (arr[arr.length-1]==0) {
                    arr[i - 1] /= 2;
            }
            System.out.println("Day "+i+" "+Arrays.toString(arr));
            }

        }
    }

