package day64;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_For_LIFO {
    public static void main(String[] args) {

        Deque<String> lifeQue=new LinkedList<>();

        lifeQue.add("review the class");
        lifeQue.add("do your homework");
        lifeQue.add("attend the class");
        lifeQue.add("Say bye to Java");

        System.out.println("lifeQue = " + lifeQue);
        
        lifeQue.remove();
        System.out.println("lifeQue = " + lifeQue);
     //   System.out.println("lifeQue.removeLast() = " + lifeQue.removeLast());
      //  System.out.println("lifeQue.removeLast() = " + lifeQue.removeLast());
       // System.out.println("lifeQue.removeLast() = " + lifeQue.removeLast());


        System.out.println("lifeQue.getFirst() = " + lifeQue.getFirst());


    }
}
