package day17;

public class FizzBuzzTest {
    public static void main(String[] args) {
        //if a number divided by both 3 and 5 ---->Fizz Buzz number
        //if a number divided by 5-----> Fizz number
        //if a number divided by 3-----> Buzz number

        int num=1;
        while (num<=100) {
            if (num % 5 == 0 && num % 3 == 0) {
                System.out.println(num + " is Fizz Buzz number");
            } else if (num % 5 == 0) {
                System.out.println(num + " is Fizz number");
            } else if (num % 3 == 0) {
                System.out.println(num + " is Buzz number");
            }
            ++num;

        }







    }
}
