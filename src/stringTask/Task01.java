package stringTask;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String name=scan.next();
        int length=name.length();

        if(length>2){
            System.out.println(name.substring(0,2));
        }else if(name.isEmpty()){
            System.out.println("empty string");
        }else{
            System.out.println(name.charAt(0)+" "+name.charAt(0));
        }









    }
}
