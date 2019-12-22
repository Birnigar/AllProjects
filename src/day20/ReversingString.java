package day20;

public class ReversingString {
    public static void main(String[] args) {
        //given a string variable name with value
        //reverse this name and store reversed value into
        String name="Jon Snow";
        String reversedName="";

        for (int i = 7; i >=0 ; i--) {
            System.out.print(i+" index: ");
            char currentChar=name.charAt(i);
            System.out.println(currentChar);
             reversedName=reversedName+currentChar;
        }
        System.out.println("reversedName ="+reversedName);
        //reversedName+=name.charAt(x);  also this one is works
       /* System.out.print(name.charAt(7));
        System.out.print(name.charAt(6));
        System.out.print(name.charAt(5));
        System.out.print(name.charAt(4));
        System.out.print(name.charAt(3));
        System.out.print(name.charAt(2));
        System.out.print(name.charAt(1));
        System.out.print(name.charAt(0));
        System.out.println();
*/

    }
}
