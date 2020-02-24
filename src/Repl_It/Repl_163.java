package Repl_It;

import java.util.Scanner;

public class Repl_163 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        String[] arr=new String[size];
        for (int i = 0; i <size ; i++) {
            arr[i]=scan.next();
        }
        String t=scan.next();
count_appearance(arr,t);
    }
    public static int count_appearance(String[] arr, String t){
        int count=0;
       for (String each:arr){
           if(each.equals(t)){
                   count++;
               }

       }
            return count;

    }
}
