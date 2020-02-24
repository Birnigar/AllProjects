package day55;

public class TaxiAction {
    public static void main(String[] args) {


        Engine en=new Engine("V6",400);
        Taxi t1=new Taxi(101,en);

        System.out.println("t1 = " + t1);


        Driver d1=new Driver("Furkan",123456);
        
        Taxi_2 t2=new Taxi_2(en,d1,"3");

        System.out.println("t2 = " + t2);

        System.out.println("t2.dr.name = " + t2.dr.name);
        System.out.println(d1.name.charAt(0));
        int x=t1.plateNumber;

        Driver y=t2.dr;

        Engine z=t2.en;

        String s=t2.dr.name;

    }

}
