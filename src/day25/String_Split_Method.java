package day25;

import java.util.Arrays;

public class String_Split_Method {
    public static void main(String[] args) {

        String sentence="I love Java";

       String[] allWords=sentence.split(" ");

        System.out.println("allWords = " + Arrays.toString(allWords));
        System.out.println("How many word do I have in this sentence :"+allWords.length);



        System.out.println("Last word in this sentence = " +allWords[allWords.length-1]);

        String sentence2="Everything is Awesome!!!";

        String[] allwords2=sentence2.split("e");
        System.out.println("allwords2 = " + Arrays.toString(allwords2));

        System.out.println("we have = " + allwords2.length+" element");

        for (String eachPieces:allwords2){
            System.out.println("eachPieces =<"+eachPieces+">");

        }











    }
}
