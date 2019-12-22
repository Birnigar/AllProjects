package day03;

public class PrimitivesVsPractice_Integer {

    public static void main(String[] args) {



        char  myFirstLetter ='B';
        System.out.println("My Name is start by "+ myFirstLetter);
        boolean loveJava=true;

        byte letterCount=26;
        System.out.println("English Language has "+letterCount);
        short sheepCount=300;
        System.out.println("There are "+ sheepCount +"in my uncle's farmer.");
        int catCount =12000;
        System.out.println("There are "+ catCount+"special cat in The World.");
        long mileToMoon = 120052020202L;
        System.out.println("Moon is far away "+mileToMoon+ "from The World");

        //----------------floating point--------------
        float priceOfBanana = 1.99f;
        System.out.println("Banana price is "+priceOfBanana);
        // you must add f at end of the number to indicate this is float type
        //upper case or lower case does not matter but it's mandatory
        float priceOfPotato = 2.49F;
        System.out.println("Potato's price is "+priceOfPotato);
        //-----------------larger floating point numbers---------

        double priceOfIpad1 = 355.99d;
        System.out.println("The price of Ipad is "+priceOfIpad1);
        double priceOfIpadPro =1024.99D;
        System.out.println("The price of Ipad Pro is "+priceOfIpadPro);
        //compiler automatically assume  it's a double so it's not required to have d
        //However for good programming habit , add them always
        double priceOfMac = 2299.99;
        System.out.println("The price of Mac is "+priceOfMac+ " It's more expensive.");

        //If you have whole number by itself,compiler automatically assume it's an int
        //If you have fractional number by itself,compiler automatically assume it's an double












    }
}
