package Repl_It;

public class Repl_191 {
    public static void main(String[] args) {



    }public static String reverse(String input){
        String rvrs="";
        for (int i = input.length()-1; i >=0 ; i--) {
            rvrs+=input.charAt(i);
        }

      return rvrs;
    }
}
