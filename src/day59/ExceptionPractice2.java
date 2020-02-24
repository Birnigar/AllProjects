package day59;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice2 {
    public static void main(String[] args) {



            System.out.println("The start");//only this line is printed
            String name="Furkan";

            Scanner scan=new Scanner(System.in);
            System.out.println("Which index of character  you want to get from Furkan's name");





            try {
                int index=scan.nextInt();
                System.out.println(name.charAt(index));
                System.out.println("end of try");
            }catch (StringIndexOutOfBoundsException e){
                System.out.println("You are out of the bond ");
                System.out.println("Enter between 0 and "+name.length());
            }catch (Exception e){

                System.out.println("If I don't catch above 2 types I will come here");
            }

            System.out.println("The end");





            //  System.out.println("Number 100 char of name is "+name.charAt(100));

            //  StringIndexOutOfBoundsException e1=new StringIndexOutOfBoundsException();
            //  System.out.println(e1.toString());






        }
    }


