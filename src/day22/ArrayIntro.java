package day22;

public class ArrayIntro {
    public static void main(String[] args) {



        int num1=10;

        int [] score=new int[4];

        score[0]=95;
        score[1]=70;
        score[2]=88;
        score[3]=100;

        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        System.out.println(score[3]);

        score[1]=99;
        System.out.println(score[1]);

        int[] numbers=new int[3];
        System.out.println(numbers[0]); //default 0
        System.out.println(numbers[1]);//default 0
        System.out.println(numbers[2]);//default 0
        //because i didn't assign any value;

        byte[]data=new byte[4];
        data[0]=15;
        data[1]=24;
        data[2]=18;
        data[3]=65;
        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);

        data[3]=3;
        System.out.println(data[3]);
    }
}
