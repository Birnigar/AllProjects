package day64;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterFaceDemo {
    public static void main(String[] args) {

        Queue<String> taskQueue= new LinkedList<>();

        taskQueue.add("review the class");
        taskQueue.add("do your homework");
        taskQueue.add("attend the class");
        taskQueue.add("Say bye to Java");


        System.out.println("taskQueue = " + taskQueue);
        
        taskQueue.remove();
        System.out.println("taskQueue = " + taskQueue);
        taskQueue.remove();
        taskQueue.remove();
        taskQueue.remove();
        System.out.println("taskQueue = " + taskQueue);











    }
}
