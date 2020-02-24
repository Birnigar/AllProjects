package day63;

import java.util.*;

public class FindingUnique {
    public static void main(String[] args) {

        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

        //How many unique character showed up in above sentence
      // String[] strArr=str.split("");
       Set<String> strSet=new HashSet<>(Arrays.asList(str.split("")));
        for (String each:strSet ) {
            System.out.print( each+" ");
        }
        System.out.println();
       
       int uniqueCharacter=strSet.size();

        System.out.println("uniqueCharacter = " + uniqueCharacter);


            Set<Character> charSet=new LinkedHashSet<>();
        for (int i = 0; i <str.length() ; i++) {
            
            charSet.add(str.charAt(i));
            
        }


        System.out.println("charSet = " + charSet);


        Set<Character> charSetTree=new TreeSet<>();
        for (int i = 0; i <str.length() ; i++) {
            charSetTree.add(str.charAt(i));
        }

        System.out.println("charSetTree = " + charSetTree);
    }
}
