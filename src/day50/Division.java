package day50;

public class Division extends Question {
    public Division(int num1, int num2) {

        super("Division questions", "/");

        // need to make sure num1 is always more than num2
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        this.num1 = num1;
        this.num2 = num2;
    }


    @Override
    public void calculate() {
        // if num2 is 0 , instead of throwing error , lets just make answer 0
        if (num2 == 0) {
            answer = 0;
        } else {
            answer = num1 / num2;
        }
        calculated = true;
    }

    @Override
    public String toString() {

        // how do I call toString method of super class so i can generate
        // something like this :
        // // The question type is Addition :  10+90 =
        if (calculated == true) {
            return super.toString() + num1 + operator + num2 + " = " + answer;
        } else {
            return super.toString() + num1 + operator + num2 + " = ";
        }

    }


    public static void main(String[] args) {
        Division q4=new Division(24,6);
        q4.calculate();
        System.out.println("q4 = " + q4);

        Division q5 = new Division(10, 5);
        System.out.println("q5 = " + q5);
        q5.calculate();
        System.out.println("q5 = " + q5);

        Division q6 = new Division(10, 50);
        System.out.println("q6 = " + q6);
        q6.calculate();
        System.out.println("q6 = " + q6);

        Division q7 = new Division(10, 0);
        System.out.println("q7 = " + q7);
        q7.calculate();
        System.out.println("q7 = " + q7);
    }
}