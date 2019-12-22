package day22;

public class ArrayPractice1 {
    public static void main(String[] args) {

        double[] prices=new double[5];

        prices[0]=2.46;
        prices[1]=12.96;
        prices[2]=992.1;
        prices[3]=500;
        prices[4]=65.123;

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);

        char[]name=new char[8];
        name[0]='b';
        name[1]='i';
        name[2]='r';
        name[3]='n';
        name[4]='i';
        name[5]='g';
        name[6]='a';
        name[7]='r';


        System.out.println(""+name[0]+name[1]+name[2]+name[3]+name[4]+name[5]+name[6]+name[7]);
        System.out.println(name);


        boolean[]yesNO=new boolean[3];
        System.out.println(yesNO[0]);
        System.out.println(yesNO[1]);
        System.out.println(yesNO[2]);

        yesNO[0]=true;
        yesNO[1]=false;
        yesNO[3]=true;
        System.out.println(yesNO[0]);
        System.out.println(yesNO[1]);
        System.out.println(yesNO[2]);





    }
}
