package day62;

import java.util.*;

public class SetOfUniqueState {
    public static void main(String[] args) {

        Set<String> states = new HashSet<>
                (Arrays.asList("GA","NY","FL","CA","NY","WA","VA","VA","FL"));
        System.out.println("states before= " + states);

       // states.removeIf(each ->each.contains("A"));


         Iterator<String> stIter=states.iterator();

       while (stIter.hasNext()){
         //  String each=stIter.next();
          // if(each.contains("A")){
           if(stIter.next().contains("A")){
           stIter.remove();
             }
         }



        System.out.println("states after = " + states);
    }
}
