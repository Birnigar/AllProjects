package day43_Constructur_StaticVariable;

public class PetStaticPractice {
    public static void main(String[] args) {


        //String str = String.valueOf(10);


        // DOES NOT WORK
        //Pet.getName();

        Pet p1 = new Pet("cat", "yumyum");
        System.out.println("p1 name = " + p1.getName());
        p1.speak();



    }
}
