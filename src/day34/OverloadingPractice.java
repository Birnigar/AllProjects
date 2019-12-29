package day34;

public class OverloadingPractice {
    public static void main(String[] args) {

        add(15);
        add(65,27);
        add(65,89,96);
        add(102548l,95632187l);

    }
    public static void add(int num ){
        System.out.println(num+100);
    }
    public static void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    public static void add(int num1,int num2,int num3){
        System.out.println(num1+num2+num2);
    }
    public static void add(long num1,long num2){
        System.out.println(num1+num2);
    }





}
