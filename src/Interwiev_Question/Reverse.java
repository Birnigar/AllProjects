package Interwiev_Question;

public class Reverse {
    public static void main(String[] args) {


        System.out.println(StrReverse("NIGAR Fatma343"));
    }

    public static String StrReverse(String str){
         String reverse="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=""+str.charAt(i);

        }

        return reverse;

    }

    public  static String  Reverse(String str) {

        return new StringBuffer(str).reverse().toString();

    }
}
