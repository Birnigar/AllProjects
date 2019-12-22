package day25;

import java.util.Arrays;

public class CheckArraySortedOrNot2 {
    public static void main(String[] args) {


        //int[] nums={13,31,8,5,21,2};
        int[] nums={1,2,3,4,5,6};
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        int numsSItemCount=nums.length;
       boolean isShortedAlready=true;
        for (int i = 0; i <numsSItemCount-1 ; i++) {
            System.out.println("is "+nums[i]+" less than "+nums[i+1]+" ? "+(nums[i]<nums[i+1]));

            if((!(nums[i] <nums[i+1]))){
                System.out.println("array is not sorted , no point checking the rest");
               isShortedAlready=false;
               break;
            }
           System.out.println("Array is sorted "+isShortedAlready);



            }
        }




    }
