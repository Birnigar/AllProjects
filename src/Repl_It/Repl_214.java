package Repl_It;

import java.util.ArrayList;

public class Repl_214 {
    public static void main(String[] args) {
        /**
         * search method accepts ArrayList of Strings and String find.
         * and returns a String.
         * It will look for an element within ArrayList that contains value of find
         * if it finds it, methods needs to return whole Element value.
         * if  an instance of find doesn't exist return:"search failed"
         */



    }public static String search(ArrayList<String> r,String find){

        for (int i = 0; i <r.size() ; i++) {
            if(r.get(i).contains(find))
            return r.get(i);

        }
        return "search failed";
    }
}
