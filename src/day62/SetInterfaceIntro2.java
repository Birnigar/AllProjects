package day62;

import java.util.HashSet;
import java.util.List;
import java.util.*;

public class SetInterfaceIntro2 {
    public static void main(String[] args) {


    //creating a HashSet with Items already have;
        List<Integer> numsList=Arrays.asList(10,10,20,20,20,30,30,30,30);
        System.out.println("numsList = " + numsList);

        Set<Integer> myNums= new HashSet<>(numsList);
        System.out.println("myNums = " + myNums);

//create a Set of String called States

        Set<String> states=new HashSet<>(Arrays.asList("Florida", "Florida", "New York", "New York", "New Jersey", "New Jersey", "California", "New Jersey","California", "New York"));


        Iterator<String> statesItr=states.iterator();

       while (statesItr.hasNext()){
           System.out.println("statesItr.next() = " + statesItr.next());
           
       }
        System.out.println();
        states.forEach(each -> System.out.print(each+" "));
        System.out.println();

        System.out.println("state.size= " + states.size());
        
states.forEach(each -> System.out.println("each state = " + each));






















    }
}
