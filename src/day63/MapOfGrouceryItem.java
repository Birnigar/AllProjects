package day63;

import java.util.*;

class MapOfGroceryItem {
    public static void main(String[] args) {

        Map<String,Double> groceryItemPrice=new HashMap<>();

        groceryItemPrice.put("tomato",1.95);
        groceryItemPrice.put("banana",3.85);
        groceryItemPrice.put("cheese",4.95);
        groceryItemPrice.put("tomato",2.00);


        System.out.println("groceryItemPrice = " + groceryItemPrice);

        groceryItemPrice.replace("tomato",2.00*2);

        groceryItemPrice.remove("tomato");

        groceryItemPrice.replace("banana",groceryItemPrice.get("banana")-1);

        System.out.println("groceryItemPrice = " + groceryItemPrice);

        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";
       
        String s="";
        for (int i = 0; i < str.length(); i++) {
            if (!s.contains("" + str.charAt(i))) {
                s += str.charAt(i);
            }
        }
        Map<Character,Integer> charFrequencyMap=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (s.charAt(i) == str.charAt(j)) {
                    count++;
                }
              
            }
            charFrequencyMap.put(s.charAt(i),count);
        }


        System.out.println("charFrequencyMap = " + charFrequencyMap);



    }

}
