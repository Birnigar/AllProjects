package day20;

import java.util.Scanner;

public class WorkingWithMoreThanOneCharInString {
    public static void main(String[] args) {
        //given string with even number character count
        //print two characters in one line
        //for example:Gokyuzum
/*
Go
ky
uz
um
 */
        Scanner scan=new Scanner(System.in);

            String name=scan.next();
            int length=name.length();

        for (int i = 0; i <length; i+=2) {
            if(length%2==0){
                System.out.println(name.substring(i,i+2));
            }



        }

    }
}
