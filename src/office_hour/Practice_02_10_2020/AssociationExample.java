package office_hour.Practice_02_10_2020;

import java.util.ArrayList;
import java.util.List;

public class AssociationExample {
    /*
    create a class called AssociationExample:
			create 5 objects of the students class
			creata a List of students called CybertekStudents and store those 5 objects into the List
			create the object of the School and initialize school name to "Cybertek"
			add two more new students "Denis" and "Irina" to cybertek school' student list
			use for each loop to print out entire cybertek student' names
     */
    public static void main(String[] args) {
        Student s1=new Student("Ayse");
        Student s2=new Student("Seda");
        Student s3=new Student("Faruk");
        Student s4=new Student("Furkan");
        Student s5=new Student("Mujgan");

        List<Student> CybertekStudents=new ArrayList<>();
        School sc1 = new School("Cybertek", CybertekStudents);
        sc1.addNewStudent(new Student("Dennis"));
        sc1.addNewStudent(new Student("Irina"));

        for (Student each:CybertekStudents){
             System.out.println( each.studentName);
        }


    }
}
