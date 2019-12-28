package task_holiday;

public class Calculater {
    public static void main(String[] args) {

calculater(65,26,'*');
calculater(95,54,'(');



    }
    public static void calculater (int num1,int num2,char operator) {
        if (operator == '-' || operator == '+' || operator == '*' || operator == '/' || operator == '%'){
            int result=num1+operator+num2;
            System.out.println(result);

    }else{
            System.out.println("Invalid Operator");
        }

    }
}
