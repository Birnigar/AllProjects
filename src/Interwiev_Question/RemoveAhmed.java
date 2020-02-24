package Interwiev_Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAhmed {

    public static void main(String[] args) {
        /*
        Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
        Write a java operation to remove all the names named Ahmed
         */

        //we use the fori loop to check every item in list
        //we use if method to check condition
        //we need to use get method and equals method
        //when I remove the Item size will be changed
        //that's why we put


        List<String> names=new ArrayList<>(Arrays.asList("Ahmed","John","Eric","Ahmed"));


        for (int i = 0; i <names.size() ; i++) {

            if(names.get(i).equals("Ahmed")){

                names.remove(names.get(i));//names.removeAll(Array.asList("Ahmed");

                i--;
            }

        }

        System.out.println("Without Ahmed= "+ names);













        List<Integer> nums=new ArrayList<>(Arrays.asList(2,5,6,7,5));

        for (int i = 0; i <nums.size() ; i++) {
            if(nums.get(i)==5){    //if (nums.get(i).equals(5))
                nums.remove(i);
                i--;
            }
        }
        System.out.println("Without 5= "+nums);







    }




}
