package task_holiday;

import java.util.ArrayList;
import java.util.List;

public class Task08 {
    public static void main(String[] args) {
        /**
         * Create a method that accept String object and return List<Character> that contains each character.
         */

        System.out.println(character("Birnigar"));


    }public static List<String> character(String str){
        List<String> character=new ArrayList<>();
        for (int i = 0; i <str.length() ; i++) {
            character.add(str.substring(i,i+1));
        }
        return character;
    }
}
