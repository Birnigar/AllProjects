package day21;

import java.util.Scanner;
import java.util.SortedMap;

public class FindUniqueCharacter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        String currentCharacter="abcd";
        int length=str.length();

        for (int i = 0; i <=length-4 ; i+=4) {

            if(str.contains(currentCharacter)){
                System.out.println(currentCharacter);
                break;

            }

        }
    }
}
