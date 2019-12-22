package day06;
import java.util.Scanner;

public class SaleCalculator {
    public static void main(String[] args) {



    Scanner scan =new Scanner(System.in);

    double regularPrice;
    double salePrice;
    double discount;


    System.out.println("What is the regular price : ");
     regularPrice=scan.nextDouble();

    System.out.println("What is the discount rate : ");
       discount=scan.nextDouble();

       salePrice=regularPrice-regularPrice*discount;

        System.out.println("reguler price is "+ regularPrice +" discount is "+discount+" and your got deal "+salePrice+ "$");












    }






}
