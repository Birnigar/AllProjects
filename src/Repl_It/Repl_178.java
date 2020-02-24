package Repl_It;

public class Repl_178 {
    public static void main(String[] args) {

        System.out.println(mergeStrings("adcb","564789"));

    }
    public static String mergeStrings(String one, String two){
       int shortIndex=(one.length()<two.length() ? one.length():two.length());
       String merge="";
        for (int i = 0; i <shortIndex ; i++) {
            merge+=""+one.charAt(i)+two.charAt(i);
        }
       merge+=(one.length()>two.length() ? one.substring(shortIndex):two.substring(shortIndex));
        return merge;
    }
}
