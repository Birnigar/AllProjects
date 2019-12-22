package day11;

public class LogicalOperator_Single {
    public static void main(String[] args) {

        System.out.println(7>5&&1>7);
        System.out.println(5>5&&1>7);
        System.out.println(1>5&&9>7);

        System.out.println(7>5&1>7);
        System.out.println(5>5&1>7);
        System.out.println(1>5&9>7);

        System.out.println(5>10 && 9/0==3);
        System.out.println(5>10 & 9/0==3);//error because can not divide number by 0
        System.out.println(11>10 && 9/0==3);//error because can not divide number by 0






    }





}
