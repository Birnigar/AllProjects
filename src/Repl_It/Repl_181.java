package Repl_It;

public class Repl_181 {
    public static void main(String[] args) {


        System.out.println(wordCount("one two three"));

    }
    public static int wordCount(String words){

        String[] arrStr=words.split(" ");

       return  arrStr.length;



    }
}
