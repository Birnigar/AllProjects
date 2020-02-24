package day62;

import java.util.*;
import day61.Job;
public class JobTreeSet {
    public static void main(String[] args) {

     Job j1=new Job("VA",100000,"Asap");
     Job j2=new Job("MO",120000,"Slmn");
     Job j3=new Job("NY",110000,"FLCD");
     Job j4=new Job("NJ",105000,"YHGF");

        SortedSet<Job> sort = new TreeSet<>(Arrays.asList(j1,j2,j3,j4));


        System.out.println("sort = " + sort);

          sort.forEach(each -> System.out.println(each));

for (Job each:sort){
    System.out.println("each = " + each);
}





    }
}
