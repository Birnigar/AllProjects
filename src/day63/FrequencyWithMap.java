package day63;

import java.util.HashMap;
import java.util.Map;

public class FrequencyWithMap {
    public static void main(String[] args) {

        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

        Map<Character,Integer> charFrequencyMap=new HashMap<>();
        for (int i = 0; i <str.length() ; i++) {

            if(!charFrequencyMap.containsKey(str.charAt(i))){
                charFrequencyMap.put(str.charAt(i),1);
            }else{
                charFrequencyMap.replace(str.charAt(i),charFrequencyMap.get(str.charAt(i))+1);
            }


        }

        System.out.println("charFrequencyMap = " + charFrequencyMap);





    }
}
