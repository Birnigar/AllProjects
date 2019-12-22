package day07;

public class Casting {
    public static void main(String[] args) {

        //int  num=10;

        double bigNum=10; //10 is implicitly converted to double 10.0
        //and stored inside bigNum behind scene
        System.out.println(bigNum);

        //int num=12.99; compiler give ERROR
        // 12.99 is double ,double has much bigger range than int
        //so it just does not fit

        int num= (int) 12.99;
        System.out.println(num);


        long mile=1000000L;
        int km= (int) mile;
        System.out.println(km);

        long earthToMoon=1000;//--->1000L

        int earthToMoonIn_int= (int) earthToMoon;







    }
}
