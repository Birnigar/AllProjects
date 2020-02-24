package Interwiev_Question;

import java.util.Arrays;
import java.util.Collections;

public class FindTheUnique {
    public static void main(String[] args) {


        System.out.println(unique("AAABCDEC"));
    }


    public static String unique(String str){

        String[] arr=str.split("");

        String unique="";
        for (int i = 0; i <arr.length ; i++) {
            int count=0;
            for (int j = 0; j <arr.length ; j++) {
                if(arr[i].equals(arr[j])){
                    count++;
                }
            }
            if(count==1){
                unique+=arr[i];
            }

        }

        return unique;

    }
    public static String Unique2(String str) {

        String result ="";

        for(String each : str.split(""))

            result +=(  (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";



        return result;

    }

}
