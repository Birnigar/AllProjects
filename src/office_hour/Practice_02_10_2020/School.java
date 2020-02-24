package office_hour.Practice_02_10_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class School {
    /*
    create a class called School:
			instance variables: String schoolName
								List<Student> AllStudentsList;
			initialize instance variables within a constrcutor
			create a method called addNewStudent() that can add students to the AllStudentsList
     */
    String schoolName;
    List<Student> AllStudentsList;

    public School(String schoolName, List<Student> allStudentsList) {
        this.schoolName = schoolName;
        AllStudentsList = allStudentsList;
    }

    public void addNewStudent(Student name){

        AllStudentsList.add(name);

    }

    public void addNewStudent(Student[] students){

        this.AllStudentsList.addAll(Arrays.asList(students));

    }
    public void addNewStudent(List<Student> students){

        this.AllStudentsList.addAll(students);

    }
}
