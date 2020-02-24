package Repl_It;

import java.util.ArrayList;

public class Repl_215 {
    public static void main(String[] args) {
        /**
         * Create a method that:
         *
         * is called twoTimes
         * returns a new ArrayList of Integers
         * takes in a single parameter - an ArrayList of Integers
         *
         * This method should create a new ArrayList of Integers
         * that contains every value of the ArrayList parameter repeated twice.
         */
    }
    public static ArrayList<Integer> twoTimes(ArrayList<Integer> r){
        ArrayList<Integer> twoTimes=new ArrayList<>();
        for (int i = 0; i <r.size() ; i++) {
            twoTimes.add(r.get(i));
            twoTimes.add(r.get(i));
        }
        return twoTimes;
    }
}
