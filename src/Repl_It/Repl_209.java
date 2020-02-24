package Repl_It;

public class Repl_209 {
    public static void main(String[] args) {


    }

    public static String extractNum(String s) {
        String extractNum = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                extractNum += s.charAt(i);
            }

        }
        return extractNum;
    }
}