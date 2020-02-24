package Repl_It;

import java.util.Arrays;

public class Repl_204 {
    public static void main(String[] args) {





    }
    public static boolean isAnagram(String word1, String word2) {
        char[] chars1 = word1.replace(" ", "").toLowerCase().toCharArray();
        char[] chars2 = word2.replace(" ", "").toLowerCase().toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);

    }
}
