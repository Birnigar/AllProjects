package day20;

public class SumOfOdd {
    public static void main(String[] args) {
        System.out.println("Give me the sum of odd numbers from 10-100");
         int sum=0;
        for (int i = 11; i <=100 ; i+=2) {
            sum=sum+i;
        }
        System.out.println("sum ="+sum);

    }
}
