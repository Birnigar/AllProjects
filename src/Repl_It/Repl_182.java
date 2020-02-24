package Repl_It;

public class Repl_182 {
    public static void main(String[] args) {




    }
    public static String clean (String text ,String badWord){

        while (text.contains(badWord)){
            text=text.replace(badWord,"");

        }
        return text;
    }
}
