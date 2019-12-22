package day11;

public class StringEqualityPractice {
    public static void main(String[] args) {
      // this is something that you will rarely

        System.out.println("Java".equals("java"));


        String myString="Java";
        System.out.println(myString.equals("Java"));

        String yourString=new String("Java");
        System.out.println("is my string same as your string ?");
        System.out.println(myString.equals(yourString));

        String myStr="Java";
        String yourStr="java";

        if (myStr.equals(yourStr)){
            System.out.println("CORRECT WORD!!!!!!");
        }else {
            System.out.println("SAY JAVA!!!!!!");
        }










    }
}
