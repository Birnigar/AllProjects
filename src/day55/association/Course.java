package day55.association;

import java.util.List;

public class Course {
    String subject;
    List<String> studentNames;

    public Course(String subject, List<String> studentNames) {
        this.subject = subject;
        this.studentNames = studentNames;
    }

    public void addStudent(String name){
        studentNames.add(name);
    }

    public void addManyStudents(List<String> many){
        studentNames.addAll(many);
    }



    @Override
    public String toString() {
        return "Course{" +
                "subject='" + subject + '\'' +
                ", studentNames=" + studentNames +
                '}';
    }
}
