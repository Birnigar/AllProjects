package task_holiday;

import java.util.ArrayList;

public class Task05 {
    public static void main(String[] args) {
        /**
         * Given a ArrayList of 6 Integer 1,3,7,2,12,7
         * insert 100 in between each numbers
         * For example :
         * 1,100,3 ,100, 7, 100, 2, 100, 12, 100, 7
         *
         * Optionally make it a method
         * write a static void method that accept a ArrayList of integer object and insert 100 in between items.
         */
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(7);
        nums.add(2);
        nums.add(12);
        nums.add(7);

        System.out.println( insert100(nums) );


    }public static ArrayList<Integer> insert100(ArrayList<Integer> nums){
        for (int i = 0; i <6 ; i+=2) {
            nums.add(i+1,100);
        }
        return nums;
    }
}
