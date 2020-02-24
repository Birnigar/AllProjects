package Repl_It;

import java.util.ArrayList;

public class Repl_202 {
    public static void main(String[] args) {




    }	public static void timesTwo(ArrayList<Integer> nums){
        for(int i=0;i<nums.size();i++){
            nums.set(i,Integer.parseInt(String.valueOf(nums.get(i)*2)));
        }
        System.out.println(nums);
    }
}
