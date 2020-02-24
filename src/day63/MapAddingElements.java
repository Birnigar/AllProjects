package day63;

import java.util.HashMap;
import java.util.Map;

public class MapAddingElements {
    public static void main(String[] args) {


        Map<String,Integer> nameAge=new HashMap<>();

        nameAge.put("Zehra",6);
        nameAge.put("Muhammed",21);
        nameAge.put("Maiia",27);
        nameAge.put("Aidar",20);

        System.out.println("nameAge = " + nameAge);

        System.out.println("nameAge.size() = " + nameAge.size());

        System.out.println("nameAge.get(\"Zehra\") = " + nameAge.get("Zehra"));

        System.out.println("nameAge.containsKey(\"Aidar\") = " + nameAge.containsKey("Aidar"));

        System.out.println("nameAge.putIfAbsent(\"Fatih\",27) = " + nameAge.putIfAbsent("Fatih",27));

        System.out.println("nameAge = " + nameAge);


        System.out.println("nameAge.replace(\"Maiia\",17) = " + nameAge.replace("Maiia",17));
        
        nameAge.replace("Fatih",27,15);

        System.out.println("nameAge = " + nameAge);




    }
}
