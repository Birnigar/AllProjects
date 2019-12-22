package day31;

public class Calculator_V2 {
    public static void main(String[] args) {


        calculate('-',10,20);
        calculate('+',20,10);
        calculate('*',10,20);
        calculate('/',40,4);
        calculate('A',10,20);
    }
    public static void calculate(char operator,int num1,int num2) {

        switch (operator){
            case '+':
                System.out.println("Additional result is "+(num1+num2));
             break;
            case '-':
                System.out.println("Substraction result is "+(num1-num2));
             break;
            case'*':
                System.out.println("Multipication result is "+(num1*num2));
             break;
            case '/':
                System.out.println("Divisional result is "+(num1/num2));
                break;
            default:
                System.out.println("INVALID OPERATOR");


        }


    }


}

