package office_hour.Practice_02_19_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {
    public static void main(String[] args) {

        List<Integer> lst=new ArrayList<>(Arrays.asList(20,10,44,3,11));

        Iterator<Integer> numIter=lst.iterator();

        System.out.println("numIter.hasNext() = " + numIter.hasNext());

     //   System.out.println( numIter.next());//remove to next item
        
        while ( numIter.hasNext()){
            int x=numIter.next();
            if(x>10) {
                System.out.println("current item = " + x);

            }
        }
        
        
        
        
        
        
        
        
        
        
        
    }
}
