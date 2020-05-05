package MapPractice;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class EmployeeMap {
    public static void main(String[] args) throws IOException {

        Map<Map,String> employeeData=new HashMap<>();
        HashMap<String ,String> employee=new HashMap<>();


        List<String> fileEmployee = Files.readAllLines(Paths.get("C:\\Users\\Admin\\IdeaProjects\\JavaProgrammingB15Online\\src\\MapPractice\\EmploymentData.txt"));
        for (String eachLine : fileEmployee) {

            String name=eachLine.split(",")[0];
            String email=eachLine.split(",")[1];
            String gender=eachLine.split(",")[2];
            employee.put(name,email);
            employeeData.put(employee,gender);



        }


    }

}
