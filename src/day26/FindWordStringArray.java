package day26;

import java.util.Arrays;

public class FindWordStringArray {
    public static void main(String[] args) {



String[] marvelHeros={"Iron Man","Captain America","Spiderman","Black Panther","Hulk","Black Widow","Wanda","Captain Marvel"
        ,"Captain America","Spiderman","Spider Man","Black Panther","Hulk","Black Widow"};
        System.out.println("marvelHeros = " + Arrays.toString(marvelHeros));

     String searchBlack="black";
     
     int countBlack=0;

        for (String eachWord:marvelHeros) {
            
            if(eachWord.toLowerCase().contains("black")){
                countBlack++;
            }
            
            
        }
        System.out.println("countBlack = " + countBlack);


    }
}
