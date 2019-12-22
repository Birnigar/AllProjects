package arrayTask;

import java.util.Arrays;
import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {
      /*
        2. Write a program that will remove all the dupplicates from a string
        Do it withg Arrays only
        */

        Scanner scan=new Scanner(System.in);
        String str= scan.next();

        String[] eachChar=str.split("");
        String result="";
        for (String each:eachChar){
            if(!result.contains(each)){
                result+=each;
            }
        }
        String[] resultArray=result.split("");

        System.out.println(Arrays.toString(resultArray));

    }

        }



