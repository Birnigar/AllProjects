package task_holiday;

import java.util.ArrayList;
import java.util.List;

public class Task07 {
    public static void main(String[] args) {
        /**
         * Given a ArrayList of 10 String(yes String) as scores "79" , "54" , "100", "65", "44"....
         * * print pass if its more than 60 fail if not 
         * * count how many score are more than 90
         * * get the average score
         * * update the values with score-grade pair
         *   for example 
         * 79C , 54F, 100A, 65D, 44F , 89B , 95A
         * Optionally create 4 methods according to above criteria
         */
        List<String> scores = new ArrayList<>();
        scores.add("45");
        scores.add("66");
        scores.add("78");
        scores.add("93");
        scores.add("62");
        scores.add("91");
        scores.add("82");
        scores.add("55");
        scores.add("68");
        scores.add("30");
        System.out.println("averageScore= " + averageScore((ArrayList<String>) scores));

    }

    public static void resultExam(ArrayList<String> scores) {
        for (int i = 0; i < scores.size(); i++) {
            if (Integer.valueOf(scores.get(i)) > 60) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }


        }
    }

    public static int resultMore90(ArrayList<String> scores) {
        int count = 0;
        for (int i = 0; i < scores.size(); i++) {
            if (Integer.valueOf(scores.get(i)) > 90) {
                count++;
            }

        }
        return count;
    }public static double averageScore(ArrayList<String> scores){
       double average=0.0;
    int sum=0;
        for (int i = 0; i < scores.size(); i++) {
           sum+=Integer.valueOf(scores.get(i));
            }
        return average=sum/scores.size();
    }











}