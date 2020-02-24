package day64;

import java.util.HashMap;
import java.util.*;

public class LinkedHashMapSet {
    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap = " + groceryPriceMap);
        Map<String, Double> groceryPriceMap2 = new LinkedHashMap<>();
        groceryPriceMap2.put("Tomato", 1.99);
        groceryPriceMap2.put("Patato", 1.99);
        groceryPriceMap2.put("Grape", 3.99);
        groceryPriceMap2.put("Banana", 1.99);
        groceryPriceMap2.put("Apple", 1.89);
        System.out.println("groceryPriceMap2 = " + groceryPriceMap2);
        
        
        
        
        
        
        
        
        
        
    }
}
