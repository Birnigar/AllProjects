package day24;

public class ForEachLoopReadOnly {
    public static void main(String[] args) {


        int yourFavNumber=300;
        int myFavNumber=yourFavNumber;


        myFavNumber=299;
        System.out.println(yourFavNumber);//it doesn't change display is 300'

        long[] nums={10,20,40};
        for (int x = 0; x <3 ; x++) {
           long eachItem=nums[x];
           eachItem=100;
        }
        nums[0]=nums[0]*2;
        System.out.println(nums[0]);// 10 into be 20
        System.out.println("AFTER WE MODIFY THE VALUE");
        for (int x = 0; x <3 ; x++) {
            System.out.println(nums[x]);//display double value
        }




    }
}
