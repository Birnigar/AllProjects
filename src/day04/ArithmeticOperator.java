package day04;

public class ArithmeticOperator {
    public static void main(String[] args) {

        //arithmetic operator between two int -->another int


        System.out.println(5+3);//8
        System.out.println(5-3);//2
        System.out.println(5*3);//15
        System.out.println(5/3);//1 compiler see just whole number ,not fraction part


        //arithmetic operator between two numerical data type
        //the final result will be larger data type

        System.out.println(5+3.00d);//8
        System.out.println(5-3.00d);//2
        System.out.println(5*3.00d);//15
        System.out.println(5/3.00d);//1
        System.out.println(5/3.00f);//1

        //store above number in variables
        //and replace above statements with variables instead
        //dataType ressult1 = the calculation here
        //System.out.println(result1);
        int number1=5;
        int number2=3;
        double number3=3.00d;
        float number4=3.0f;

        double result1=number1+number2;
        double result2=number1-number2;
        double result3=number1*number2;
        double result4=number1/number2;
        float  result5=number1/number4;


        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);


    }
}
