package day34;

public class PracticeMethodWithNumbers {
    public static void main(String[] args) {

        System.out.println("number  = " +build3DigitNumber(3,5,0));
        System.out.println("number  = " +build3DigitNumber(11,5,4));



    }

    public static int build3DigitNumber(int digit1,int digit2,int digit3){
        int number=0;

        if(digit1<0 || digit1>9){
            digit1=0;
        }
        if(digit2<0 || digit2>9){
            digit2=0;
        }
        if(digit3<0 || digit3>9){
            digit3=0;
        }

        number = (digit1 * 100) + (digit2 * 10) + (digit3);

        return number;

    }












}
