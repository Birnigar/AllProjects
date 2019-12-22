package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {
    public static void main(String[] args) {

        String name="Alesya";

        char[] nameChar=new char[name.length()];

        for (int i = 0; i <name.length() ; i++) {
            nameChar[i]=name.charAt(i);

        }
        System.out.println("nameChar = "+ Arrays.toString(nameChar));


        char[] nameChars2=name.toCharArray();

        System.out.println("nameChars2 "+Arrays.toString(nameChars2));














    }
}
