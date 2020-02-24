package day59;

public class FinallyBlock {
    public static void main(String[] args) {

        int [] nums={1,4,6};


        try {
            System.out.println("nums[5] = "+nums[100]);


        } catch (Exception e) {
            System.out.println("Exception caught \n "+e.getMessage());
        } finally {
            System.out.println("This code run no matter we have exception or not");
        }

        System.out.println("The end");


    }
}
