package day53;

public class FruitShop {
    public static void main(String[] args) {
        
        Apple a1=new Apple("sweet","red","Fuji");
        

        
        Fruit f2=new Apple("crispy but testless","hot red","Gala");
        
        Fruit f3=new Orange("sour","orange",12);
        Fruit f4=new Orange("very sweet","Blood red",10);

        a1.getDigested();
        Fruit f1=a1;
        System.out.println("f1.color = " + f1.color);
        System.out.println("f1.taste = " + f1.taste);
        System.out.println(f2.toString());

        f1.getDigested();

        


    }
}
