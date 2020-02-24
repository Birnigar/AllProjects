package day43_Constructur_StaticVariable;

import java.util.*;

public class PetStore {
    public static void main(String[] args) {


        Pet p1 = new Pet("cat", "Boncuk");
        Pet p2 = new Pet("goat", "Inatci");
        Pet p3 = new Pet("dog", "Bule");
        Pet p4 = new Pet("cat", "Minnos");
        Pet p5 = new Pet("bird", "Mavis");
        Pet p6 = new Pet("turtle", "Ninja");
        Pet p7 = new Pet("snake", "Fear");
        Pet p8 = new Pet("cow", "Milk");


        List<Pet> petList=new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8));

        System.out.println("petList = " + petList);

        for (Pet each:petList){
            System.out.println("each.getName() = " + each.getName());
        }

        for (Pet aech:petList){
            if(aech.getBreed().equalsIgnoreCase("cat")){
                System.out.println(aech.getName());
            }
        }
        for (Pet each:petList){
                each.speak();
        }

    }
}