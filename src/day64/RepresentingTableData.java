package day64;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class RepresentingTableData {
    public static void main(String[] args) throws IOException {

        Map<String,String> row1=new HashMap<>();
        row1.put("first name","Regan");
        row1.put("email","rboichat0@1688.com");
        row1.put("gender","Female");

        Map<String,String> row2 = new HashMap<>();
        row2.put("first_name", "Carleen" );
        row2.put("email", "cmorillas1@blog.com" );
        row2.put("gender", "Male" );

        List<String> readingEmployeeData = Files.readAllLines(Paths.get("src/day64/Employee.txt"));

        // for one row I used one map
        // but I have many rows !
        // may of Some type -->> List<SomeType>

        System.out.println("row1 = " + row1);
        System.out.println("row2 = " + row2);

        List<Map<String,String>> rowMapsList=new ArrayList<>();
        
        rowMapsList.add(row1);
        rowMapsList.add(row2);


        System.out.println("rowMapsList = " + rowMapsList);


       // System.out.println("rowMapsList.get(1).get(\"email\") = " + rowMapsList.get(1).get("email"));



                rowMapsList.get(0).replace("first name","Hulk");

        System.out.println("rowMapsList = " + rowMapsList);
    }
}
