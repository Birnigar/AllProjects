package day24;

import java.util.Arrays;

public class ArraysEquality {
    public static void main(String[] args) {
        int [] scores1={2,5,6,7,3,34,6};
        int [] scores2={22,45,6,37,3,6,9};
        int [] scores3={2,5,6,7,3,34,6};
        int [] scores4={6,5,6,7,3,2,34};

        boolean isS1S2Equals= Arrays.equals(scores1,scores2);
        System.out.println("Is Score1 same Score2 = " + isS1S2Equals);//false
        boolean isS1S3Equals=Arrays.equals(scores1,scores1);
        System.out.println("Is Score1 same Score3 = "+ isS1S3Equals);//true

        boolean isS1S4Equals=Arrays.equals(scores1,scores4);
        System.out.println("isS1S4Equals = " + isS1S4Equals);//false because order is matter
        Arrays.sort(scores3);
        Arrays.sort(scores4);
        
        boolean isS3S4Equals=Arrays.equals(scores3,scores4);
        System.out.println("isS3S4Equals = " + isS3S4Equals);//give true








    }
}
