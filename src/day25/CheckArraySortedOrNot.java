package day25;

import java.util.Arrays;

public class CheckArraySortedOrNot {
    public static void main(String[] args) {


        int[] nums={13,31,8,5,21,2};

        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        int numsSItemCount=nums.length;





        int[] numsCopy=new int[numsSItemCount];
      //  numsCopy[0]=nums[0];//13;
        //numsCopy[1]=nums[1];
       // numsCopy[2]=nums[2];
       // numsCopy[3]=nums[3];
       // numsCopy[4]=nums[4];
       // numsCopy[5]=nums[5];

        for (int x = 0; x <numsSItemCount ; x++) {

            numsCopy[0]=nums[0];//13;
            numsCopy[1]=nums[1];
            numsCopy[2]=nums[2];
            numsCopy[3]=nums[3];
            numsCopy[4]=nums[4];
            numsCopy[5]=nums[5];

        }
        System.out.println("numsCopy = " + Arrays.toString(numsCopy));
        System.out.println("Before sotr numsCopy = " + Arrays.toString(numsCopy));
Arrays.sort(numsCopy);

        System.out.println("After sort numsCopy = " + Arrays.toString(numsCopy));

if(Arrays.equals(nums,numsCopy)){
    System.out.println("this array is  already sorted");
}else{
    System.out.println("this array is not  already sorted");
}

    }
}
