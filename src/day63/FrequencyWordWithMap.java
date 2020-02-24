package day63;

import java.util.HashMap;
import java.util.Map;

public class FrequencyWordWithMap {
    public static void main(String[] args) {


        String str="Finding Words Frequency Sounds Fun Because Fun Comes in When you count Words\" +\n" +
                "                \" But How do I count the Words with what I already know previously \" +\n" +
                "                \"Do it and find out Words Words Words\";\n";

        String[] strArr=str.split(" ");

        Map<String,Integer> wordFrequencyMap=new HashMap<>();
        for (int i = 0; i <strArr.length ; i++) {

            if(!wordFrequencyMap.containsKey(strArr[i])){
                wordFrequencyMap.put(strArr[i],1);
            }else{
               wordFrequencyMap.replace(strArr[i],wordFrequencyMap.get(strArr[i])+1);
            } 
        }


        System.out.println("wordFrequencyMap = " + wordFrequencyMap);


    }
}
