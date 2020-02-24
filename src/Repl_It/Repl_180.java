package Repl_It;

public class Repl_180 {
    public static void main(String[] args) {

        System.out.println(coverString("java methods", "me") );


    }
    public static String coverString(String main, String coverME){
String cover="";
        if (!main.contains(coverME)) {
            return "["+main+"]";

        }

        while(main.contains(coverME)){
            cover+=main.substring(0,main.indexOf(coverME))+"["+coverME+"]";
            main=main.substring(main.indexOf(coverME)+coverME.length());
        }



         return cover+main;

    }
}
