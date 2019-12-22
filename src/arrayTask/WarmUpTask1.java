package arrayTask;

import java.util.Arrays;
import java.util.Scanner;

public class WarmUpTask1 {
    public static void main(String[] args) {
      /*  1. write a program that can check if a string is build out of the same letters as another string
        Ex: input:
        str1 = "abc";
        str2 = "cba";
        output:
        true
       */

        Scanner scan=new Scanner(System.in);
        String str1=scan.next();
        String str2=scan.next();
        char[] str1Char=str1.toCharArray();
        char[] str2Char=str2.toCharArray();

        Arrays.sort(str1Char);
       Arrays.sort(str2Char);
       if(Arrays.equals(str1Char,str2Char)){
           System.out.println("true");
       }else{
           System.out.println("false");
       }





















    }
}
