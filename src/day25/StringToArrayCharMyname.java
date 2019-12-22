package day25;

import java.util.Arrays;

public class StringToArrayCharMyname {
    public static void main(String[] args) {

        String myName="NigarA";



        char[] charMyname=new char[myName.length()];

        for (int i = 0; i <myName.length() ; i++) {
            charMyname[i]=myName.charAt(i);

        }
        System.out.println("charMyname = " + Arrays.toString(charMyname));

////second way
        char[] allCharsInName=myName.toCharArray();

       // for (char eachChar :allCharsInName) {
        //    System.out.println("eachChar = " + eachChar);

            //now count how many have

            int count=0;
            for (char eachChar:allCharsInName){
                if(eachChar=='a'||eachChar=='A'){
                    count++;
                }
        }

        System.out.println("count = " + count);

    Arrays.sort(allCharsInName);
        System.out.println("After sort allCharsInName = " + Arrays.toString(allCharsInName));



    }



}
