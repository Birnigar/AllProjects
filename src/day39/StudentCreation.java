package day39;

public class StudentCreation {
    public static void main(String[] args) {
       //how do we create an object of template

       Student s1= new Student();
       s1.name="Karima";
       s1.age=18;
       s1.gender='F';

        System.out.println("s1 name = " + s1.name);
        System.out.println("s1 age = " + s1.age);
        System.out.println("s1 gender= " + s1.gender);



       Student s2= new Student();
       s2.name="Nigar";
       s2.age=31;
       s2.gender='F';

        System.out.println("s2 name = " + s2.name);
        System.out.println("s2 age = " + s2.age);
        System.out.println("s2 gender= " + s2.gender);


    }
}
