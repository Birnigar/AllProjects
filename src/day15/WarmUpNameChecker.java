package day15;

public class WarmUpNameChecker {
    public static void main(String[] args) {

        String name="Furkan";
        int nameLength=name.length();

        if (nameLength>=11){
            System.out.println("longer name");
        }else if(nameLength>=5 && nameLength<=10){
            System.out.println("medium name");
        }else if (nameLength<=4){
            System.out.println("short name");
        }

       boolean nameContains=name.contains("a");
        System.out.println("My name Contains a : " + nameContains);
        boolean nameContains2=name.contains("e");
        System.out.println("My name Contains e = " + nameContains2);
//name.contains("a") || name.contains("e") we can do this way


    }
}
