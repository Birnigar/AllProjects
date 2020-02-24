package day55.association;

import java.util.ArrayList;
import java.util.List;

public class CourseXRunner {
    public static void main(String[] args) {

        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student("Muge",101));
       studentList.add(new Student("Hasan",102));
        studentList.add(new Student("Vlad",103));
        studentList.add(new Student("Zehra",104));

        CourseX java=new CourseX("Has-A",studentList);

        java.addStudent("Goksel", 110);
        

        System.out.println("java = " + java);




    }
}
