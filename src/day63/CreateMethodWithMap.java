package day63;

import java.util.HashMap;
import java.util.Map;

public class CreateMethodWithMap {
    public static void main(String[] args) {



    String str="Fun Fun Fun Java Java is Ending Tomorrow Tomorrow No It is Never Ending";

        System.out.println(wordFrequency(str));


    }
    public static Map<String,Integer> wordFrequency(String str){
 Map<String,Integer> wordCount=new HashMap<>();
        for (String word:str.split(" ")){
            if(!wordCount.containsKey(word)){
                wordCount.put(word,1);
            }else{
                wordCount.replace(word,wordCount.get(word)+1);
            }

        }



          return wordCount;


    }









}
