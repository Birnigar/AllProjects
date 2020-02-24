package day48;

import java.util.Arrays;
import java.util.List;

public class HR_STUFF {
    public static void main(String[] args) {

        Employee e1=new HourlyEmployee("Subi",101,55,200);
   e1.calculateAnnualSalary();
   e1=new FullTimeEmployee("Ainura",103,10000);
    e1.calculateAnnualSalary();

    Employee e2=new HourlyEmployee("Roksana",102,57,2000);
    Employee e3=new FullTimeEmployee("Dennis",104,13000);


        List<Employee> allEmployee= Arrays.asList(e1,e2,e3);
        
        
        for (Employee each: allEmployee){
            System.out.println("each.name = " + each.name);
            each.calculateAnnualSalary();
        }









    }
}
