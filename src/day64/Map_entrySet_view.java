package day64;

import java.util.HashMap;
import java.util.*;

public class Map_entrySet_view {
    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);


        Set<Map.Entry<String,Double>> entryView=groceryPriceMap.entrySet();


        for (Map.Entry<String, Double> each : entryView) {
            System.out.println("Key for current entry is = "+ each.getKey());
            System.out.println("Value for current entry is = " +each.getValue());
            if(each.getKey().length()==5){
                each.setValue(15.0);

            }
            
        }
        System.out.println("entryView = " + entryView);





    }
}
