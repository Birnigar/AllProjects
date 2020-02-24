package day59;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {


        System.out.println("The start");//only this line is printed
        String name="Furkan";

        Scanner scan=new Scanner(System.in);
        System.out.println("Which index of character  you want to get from Furkan's name");
         int index=scan.nextInt();




         try {
             System.out.println(name.charAt(index));
             // }catch (Exception e){
         }catch (StringIndexOutOfBoundsException e){
             System.out.println("Message from getMassage method "+ e.getMessage());
           System.out.println("Something unusual happen!!!");
         }catch (InputMismatchException bla){
             System.out.println("Input mismatch,enter number");
         }

             System.out.println("The end");





      //  System.out.println("Number 100 char of name is "+name.charAt(100));

      //  StringIndexOutOfBoundsException e1=new StringIndexOutOfBoundsException();
      //  System.out.println(e1.toString());






    }
}
