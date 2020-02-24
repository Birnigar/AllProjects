package Repl_It;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl_193 {
    public static void main(String[] args) {
String[] r1={"f","o","o"};
String[] r2={" b","a","r"};
        System.out.println(  combineRs(r1,r2));
    }

    public static String combineRs(String[] r1, String[] r2) {
        ArrayList<String> str = new ArrayList<>(Arrays.asList(r1));
        str.addAll(Arrays.asList(r2));
String str1="";
        for (int i = 0; i <str.size() ; i++) {
            str1+=str.get(i);
        }
        return str1;
    }
}