package day11;

public class TruthTable {

    public static void main(String[] args) {


        int num=70;

        System.out.println(num>100 && num<10);



        System.out.println(num>100 || num<10);

        System.out.println(num>60 && num<50);

        System.out.println(num>60 || num<50);
    //more than two conditions
        System.out.println(true||false||false);// result true

        System.out.println(true&&true&&false);// result false

        System.out.println(num>50 && num!=52 ||num==57);


    }
}
