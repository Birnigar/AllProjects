package day30;

import java.util.Arrays;

public class SplitAndDefineTheSize {
    public static void main(String[] args) {
        String sentence="I love Java Java Java";
        String[] wordsArray=sentence.split(" ");
        System.out.println("wordsArray = " + Arrays.toString(wordsArray));
        

        String[] wordArrays2=sentence.split(" ",2);
        String[] wordArrays3=sentence.split(" ",3);
        String[] wordArrays4=sentence.split(" ",5);
        String[] wordArrays5=sentence.split(" ",6);
        String[] wordArrays6=sentence.split(" ",1);

        System.out.println(Arrays.toString(wordArrays2));
        System.out.println(Arrays.toString(wordArrays3));
        System.out.println(Arrays.toString(wordArrays4));
        System.out.println(Arrays.toString(wordArrays5));
        System.out.println(Arrays.toString(wordArrays6));
    }
}
