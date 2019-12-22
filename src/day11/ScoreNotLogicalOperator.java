package day11;

import java.util.Scanner;

public class ScoreNotLogicalOperator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int score=scan.nextInt();
        String scoreChecker="";

        if(score<0 || score>100){
            scoreChecker="INVALID SCORE";
            System.out.println(scoreChecker);
        }else if(score==10){
            scoreChecker="PERFECT SCORE";
            System.out.println(scoreChecker);
        }else if(score>70 && score<100){
            scoreChecker="YOU HAVE PASSED";
            System.out.println(scoreChecker);
        }


    }
}
