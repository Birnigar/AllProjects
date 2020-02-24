package day59;

public class General {
    public static void main(String[] args) {


        // Object o =new String("abc");
        // can I get the first char using o?
        // no because Object type
        System.out.println("The Start");
       // String str = null;
       String str="";


        try{

            System.out.println(str.charAt(0));
            System.out.println("End of Try");

        }catch (NullPointerException e){

            System.out.println("No Object here");

        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("this is rest of exception");
        }

        System.out.println("The End");





    }

}
