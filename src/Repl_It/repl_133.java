package Repl_It;

import java.util.Arrays;
import java.util.Scanner;

public class repl_133 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];

        //TODO: Write your code below.
        for(int i=7;i>=0;i--){
            if(decimal>1){
                binary[i]=decimal%2;
                decimal/=2;
            }else if(decimal==1){
                binary[i]=1;
                decimal-=1;
            }else{
                binary[i]=0;
            }
        }
        System.out.println(Arrays.toString(binary));

    }
}
