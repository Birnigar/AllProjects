package day42;

public class ComputerShop {
    public static void main(String[] args) {

        Computer c1=new Computer();

        c1.brand="Apple";
        c1.ram=32;
        c1.price=2000;

        c1.runProgram(32);
        c1.calculate("Apple");


        c1.setPrice(1000);
        c1.setRam(12);
        System.out.println("c1 = " + c1.toString());

        int myRam = c1.getRam();
        System.out.println("myRam is  " + myRam);

        Computer c2 = new Computer();
        c2.setBrand("HP");
        // set HP Price to half of apple price
        c2.setPrice(c1.getPrice() / 2);
        // set HP ram to quarter of apple ram
        c2.setRam(myRam / 4);
        System.out.println("c2 = " + c2);





    }
}
