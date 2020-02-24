package day55.association;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseRunner {
    public static void main(String[] args) {

        List<String> studentName=
                new ArrayList<>(Arrays.asList("Ayse","Muge","Astrit","Zehra","Israfil"));

        Course java=new Course("java",studentName);

        System.out.println("java = " + java);
         /* java.studentNames.add("Aysen");
          java.studentNames.add("Mohammed");
          java.studentNames.add("Gail");*/
         java.addStudent("Aysen");
         java.addStudent("Mohammed");
         java.addStudent("Gail");
        System.out.println("java.studentNames = " + java.studentNames);

    }
}
