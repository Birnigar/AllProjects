package day13;

public class StringMethods {
    public static void main(String[] args) {
        //String actions that we  already know so far
        //equals
        String s1="hello";
        System.out.println(s1.equals("abc"));
        //equalsIgnorecase
        System.out.println(s1.equalsIgnoreCase("HELLO"));
        //toUpperCase method of string is used to make String all character uppercase
        System.out.println(s1);
        System.out.println(s1.toUpperCase());
        //toLowerCase method of string is used to make String all character lowercase
        System.out.println(s1.toLowerCase());
        String myName= "nigar";
        System.out.println("MY NAME IS "+ myName.toUpperCase());
        String myName1="NIGAR";
        System.out.println("my name is "+ myName.toLowerCase());
        //in order to get how many character we have inside String
        //We can use length method of string

        String v1="MY NAME IS NIGAR";
        System.out.println(v1.length());
        int lenghtOfMynane=v1.length();
        System.out.println(lenghtOfMynane);
        if(lenghtOfMynane>10){
            System.out.println("More than 10 characters");
        }else {
            System.out.println("Not more than 10");
        }


    }
}
