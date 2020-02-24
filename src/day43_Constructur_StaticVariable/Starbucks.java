package day43_Constructur_StaticVariable;

public class Starbucks {
    public static void main(String[] args) {
        
        Coffee c1=new Coffee();
        c1.setType("Turkish");
        c1.setPrice(-4.99);
        c1.setCoffeeLevel(8);
        System.out.println("c1 = " + c1);

        Coffee c2=new Coffee("Intensito",9,2.0);
        System.out.println("c2 = " + c2);
        
        Coffee c3=new Coffee("blonde",5,1.6);
        System.out.println("c3 = " + c3);
        
        Coffee c4=new Coffee("Latte",3,2.0);
        System.out.println("c4 = " + c4);
    }
}
