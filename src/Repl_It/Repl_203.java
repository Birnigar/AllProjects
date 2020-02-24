package Repl_It;

public class Repl_203 {
    public static void main(String[] args) {









    }
    public static boolean isPalindrome(String check) {
          String word=check.replace(" ","");
             String word2="";
        for (int i = word.length()-1; i >=0; i--) {
                word2+=word.charAt(i);
        }
          return word.equalsIgnoreCase(word2);

    }
}
