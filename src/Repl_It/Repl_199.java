package Repl_It;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Repl_199 {
    public static void main(String[] args) {
        /**
         * Create a static method that:
         * is called removeAll
         * returns nothing
         * takes two parameters: an ArrayList of Strings called wordList, and a String called targetWord
         *
         * This method should go through every element of wordList and remove every instance of targetWord from the ArrayList.
         */
    }public static void removeAll(ArrayList<String> wordList,String targetWord){
        wordList.removeAll(Collections.singleton(targetWord));
        System.out.println(wordList);
    }
}
