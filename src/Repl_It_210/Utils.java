package Repl_It_210;

public class Utils {
    public static String reverseLetters(String word){
        String reversed="";
        String result="";

        for(int i=word.length()-1; i>=0; i--){
            if(Character.isLetter(word.charAt(i))){
                reversed+=word.charAt(i);
            }
        }

        int x=0;
        for (int i = 0; i <word.length() ; i++) {
            if(!Character.isLetterOrDigit(word.charAt(i))){
                result+=word.charAt(i);
            }else if(Character.isLetter(word.charAt(i))){
                result+=reversed.charAt(x);
                x++;
            }
        }
        return result;
    }
}
