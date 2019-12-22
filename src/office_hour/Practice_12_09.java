package office_hour;

public class Practice_12_09 {
    public static void main(String[] args) {
      /*  create an int array of 6 elements and find out
        average of the array
        sum of all elements
        sum of even numbers in the array
        sum of odd numbers in the array
        max number in the array
        min number in the array*/
int sum=0;
int sumOfEven=0;
int sumOfOdd=0;

        int[] nums={25,16,45,95,78,93};
        int bigger=nums[0];
        int min=nums[0];
        for (int i = 0; i <nums.length ; i++) {
           sum+=nums[i];
        }
        System.out.println("Sum is: "+sum);
        for (int j = 0; j <nums.length ; j++) {

            if(nums[j]%2==0){
                sumOfEven+=nums[j];
            }
        }
        System.out.println("Sum Of even: "+sumOfEven);

        for (int x = 0; x <nums.length ; x++) {
            if(nums[x]%2!=0){
                sumOfOdd+=nums[x];
            }
        }
        System.out.println("Sum of odd: "+sumOfOdd);

        for (int y = 1; y <nums.length ; y++) {
            if(nums[y]>bigger){
                bigger=nums[y];
            }
        }
        System.out.println("Bigger Number is: "+bigger);
        for (int z = 1; z <nums.length; z++) {
            if(min<nums[z]){
                min=nums[z];
            }
            
        }
        System.out.println("min = " + min);
    }
}
