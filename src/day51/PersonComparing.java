package day51;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonComparing {
    public static void main(String[] args) {

Person p1=new Person("Arafat",32);


Person p2=new Person("Zibek",18);

Person p3=new Person("Asena",18);
        System.out.println(p1);
        System.out.println(p2);


  //      System.out.println(p1.compareTo(p2));
        //     System.out.println(p2.compareTo(p3));

        List<Person> lst=new ArrayList<>();
        lst.add(p1);
        lst.add(p2);
        lst.add(p3);
        lst.add(new Person("Jon Snow",27));
        System.out.println("lst = " + lst);

        Collections.sort(lst);
        System.out.println("After sort lst = " + lst);
        
        Collections.sort(lst);
        System.out.println("After name sort");
        System.out.println("lst = " + lst);


        //print out name of younger person between p1 and p3
        if(p1.compareTo(p3)==1){
            System.out.println(p3.name);
        }else{
            System.out.println(p1.name);
        }






        //compare p1 and p2
        //if p1 is older print 1
        //if they are same age print 0
        //if p2 is older print -1

      /**  if(p1.age>p2.age){
            System.out.println(1);
        }else if(p1.age==p2.age){
            System.out.println(0);
        }else{
            System.out.println(-1);
        }

//System.out.println(p1.age==p2.age ? 0 : p1.age>p2.age ? 1 : -1 );

**/



    }
}
