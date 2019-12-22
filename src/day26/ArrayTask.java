package day26;

import java.util.Arrays;

public class ArrayTask {
    public static void main(String[] args) {

        // 3 , given a String with multiple word. get an array of words then reverse the array
// 4 , OPTIONAL : reverse each word in a sentence after getting an array of words

         String mySentence="I will be good tester";
         String[] allWords=mySentence.split(" ");

        System.out.println("allWords = " + Arrays.toString(allWords));

        for (int i = 0; i <allWords.length ; i++) {

            System.out.println("index of  = "+i +" "+allWords[i]);
        }

        for (int j = 0; j <allWords.length/2 ; j++) {

            String temp=allWords[j];
            allWords[j]=allWords[(allWords.length-1)-j];
            allWords[(allWords.length-1)-j]=temp;

        }


        System.out.println("After the reverse my sentence = " + Arrays.toString(allWords));







    }
}
