package day12;

public class FizzBuzzNumberCheck {
    public static void main(String[] args) {

        int num=15;


        if (num%5==0&&num%3==0){
            System.out.println("IT IS FIZZBUZZ NUMBER");
        }else if(num%3==0){
            System.out.println("IT IS BUZZ NUMBER");
        }else if(num%5==0){
            System.out.println("IT IS FIZZ NUMBER");
        }else{
            System.out.println("NOT MY NUMBER");
        }













    }
}