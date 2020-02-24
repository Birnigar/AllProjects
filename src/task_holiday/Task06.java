package task_holiday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task06 {
    public static void main(String[] args) {
        /**
         * Given List of names with various character count,
         * Remove any name with less than 2 characters
         * and if any name has more than 10 character only keep 10 characters
         * and if it has exactly 5 characters , reverse it
         * Of course , Otionally make a method out of it.
         */
        List<String> names1= new ArrayList<>(); //("HalilIbrahim","A","Faruk");
        names1.add("HalilIbrahim");
        names1.add("A");
        names1.add("Faruk");

        System.out.println(namesEliminate((ArrayList<String>) names1));

    } public static ArrayList<String> namesEliminate(ArrayList<String> names){
        for (int i = 0; i <names.size() ; i++) {
            if(names.get(i).length()<2){
                names.set(i,"");
            } if(names.get(i).length()>10){
               names.set(i,names.get(i).substring(0,10)) ;

            }if(names.get(i).length()==5){
                String reverseName="";
                for (int j = names.get(i).length()-1; j >=0 ; j--) {
                    reverseName+=names.get(i).charAt(j);
                }
                names.set(i,reverseName);
            }
        }
        return names;
    }

}
