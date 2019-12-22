package day15;

public class ReversingAString {
    public static void main(String[] args) {
        String name="Nigar";

        System.out.println(name.charAt(0)+" "+name.charAt(1)+" "+name.charAt(2)+" "+name.charAt(3)+" "+name.charAt(4));

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));

        System.out.println(name.charAt(4)+" "+name.charAt(3)+" "+name.charAt(2)+" "+name.charAt(1)+" "+name.charAt(0));
//how do you find last character of any string
        //counting character start with one
        //counting index location star with 0

        int nameLength=name.length();
        System.out.println(nameLength);
        char lastChar=name.charAt(nameLength-1);
        System.out.println(lastChar);


    }
}
