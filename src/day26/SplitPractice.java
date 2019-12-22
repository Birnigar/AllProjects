package day26;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {
        
        String survey="Complete B15 Online 1 Month Survey";
        
        char[] surveyChars=survey.toCharArray();

        //for each loop
        for (char each :surveyChars) {
            System.out.println("each = " + each);
        }


       //while loop
        int x=0;
        while ( x<surveyChars.length){
            System.out.println("each char is = " + surveyChars[x]);
            x++;
        }


        //do while loop
        int y=0;
        do{
            System.out.println(surveyChars[y]);
            y++;
        }while (y<surveyChars.length);


        System.out.println("Before surveyChar sort : " +Arrays.toString(surveyChars));
        
        Arrays.sort(surveyChars);

        System.out.println("After surveyChar sort : " +Arrays.toString(surveyChars));
        
    }
}
