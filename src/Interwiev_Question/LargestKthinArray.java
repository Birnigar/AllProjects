package Interwiev_Question;

public class LargestKthinArray {
    public static void main(String[] args) {

        int[] nums={3,2,1,5,6,4};
        int k=3;

        System.out.println(kthLargestinArray(nums,k));

    }

    /**
     * input =[3,2,1,5,6,4]  k=2
     * output =5
     */


    public static void sort(int[] nums) {
     int temp;
     boolean check=true;

     while (check){
         check=false;
         for (int i = 0; i <nums.length-1 ; i++) {
             if(nums[i]<nums[i+1]){
                 temp=nums[i];
                 nums[i]=nums[i+1];
                 nums[i+1]=temp;
                 check=true;
             }
         }
     }
    }
    public static int kthLargestinArray(int [] nums,int k){
        sort(nums);
        return nums[k-1];
    }

}
