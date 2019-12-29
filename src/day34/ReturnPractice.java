package day34;

public class ReturnPractice {
    public static void main(String[] args) {


        printMin4CharacterLengthName("Jon");



    }

    public static void printMin4CharacterLengthName(String name){
        if(name.length()<4){
            System.out.println("INVALID NAME");
            return;//being use get out the method early
        }
        System.out.println(name);
    }

}
