package day49;

public class IceCream extends Object implements Edible{



    @Override
    public void eat() {
        System.out.println("Eat with spoon");
    }

    @Override
    public void drink() {
        System.out.println("Drink with milkshake");
    }

    @Override
    public void digest(){
        System.out.println("Drink soda");
    }





    public static void main(String[] args) {
        IceCream i1=new IceCream();
        i1.eat();
        i1.drink();
        System.out.println(i1.toString());
        i1.digest();




    }
}
