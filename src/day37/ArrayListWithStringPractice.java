package day37;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWithStringPractice {
    public static void main(String[] args) {
        List<String> superHeros=new ArrayList<>();
        superHeros.add("Superman");
        superHeros.add("Batman");
        superHeros.add("Cyborg");
        superHeros.add("Flash");
        superHeros.add("Aquaman");
        superHeros.add("Wonder Woman");

        System.out.println("superHeros.contains(\"Superman\") = " + superHeros.contains("Superman"));

        System.out.println("superHeros.contains(\"man\") = " + superHeros.contains("man"));

        for (int i = 0; i <superHeros.size() ; i++) {
            if(!superHeros.get(i).contains("man")){
                superHeros.remove(superHeros.get(i));
                i--;
            }

        }
        System.out.println("superHeros without man = " + superHeros);
        
        List<String> superHeroCopy=new ArrayList<>(superHeros);
        System.out.println("superHeroCopy = " + superHeroCopy);
        
        List<String> topics= Arrays.asList("Java","Selenium","Database","API");
        System.out.println("topics = " + topics);
        
        List<String> topicsCopy=new ArrayList<>(topics);
        System.out.println("topicsCopy = " + topicsCopy);
        
    }
}
