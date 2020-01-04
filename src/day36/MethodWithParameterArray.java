package day36;

import java.util.Arrays;

public class MethodWithParameterArray {
    public static void main(String[] args) {
String str1="old";
String str2=str1;
str1="new";
        System.out.println(str1);
        System.out.println(str2);

        int [] nums={1,5,3,4,7,2};
        System.out.println("nums before sort "+Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("nums after sort "+Arrays.toString(nums));
changeArrayFirstItemTo100(nums);
        System.out.println("nums change with method "+Arrays.toString(nums));
        int num=10;
        System.out.println(addOneHundredAndReturn(num));
        num=addOneHundredAndReturn(10);
        System.out.println(num);

    }
    public static void changeArrayFirstItemTo100(int [] nums){
        nums[0]=100;

    }
    public static int addOneHundredAndReturn(int x){
        x=x+100;
        return x;

    }

}
