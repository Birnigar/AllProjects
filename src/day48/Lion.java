package day48;

public class Lion extends Mammal {


    @Override
    public void drinkMilk() {
        System.out.println("LION DRINKS MILK");
    }

    @Override
    public void makeNoise() {
        System.out.println("LION SAYS ROOOAAARRRRRR!!!!!");
    }


    public static void main(String[] args) {
        Lion l1= new Lion();
        l1.drinkMilk();
        l1.makeNoise();

        Animal a1=new Lion();
        a1.makeNoise();


    }
}
