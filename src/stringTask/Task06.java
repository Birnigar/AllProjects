package stringTask;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        //given a prefix name like Dr. Mr. Mrs.
        //if name Started with Dr.-->print Doctor
        //if name Started with Mr.-->print Male
        //if name Started with Miss-->print Single Female
        //if name Started with Mrs.-->print Married Female

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name=scan.nextLine();
        name=name.toUpperCase();

        if(name.startsWith("DR")){
            System.out.println("Doctor");
        }else if(name.startsWith("MISS")){
            System.out.println("Single Female");
        }






    }
}
