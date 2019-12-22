package day26;

public class ArrayTask2 {
    public static void main(String[] args) {

        int[] scores={156,101,76,187,87,110};


        String finalResult="";   //if all numbers more than 100 make it yes ,if less no
        int count=0;
        for (int i = 0; i <scores.length ; i++) {

            if (scores[i] >= 100) {
                count++;
            }
        }
            if (count == scores.length - 1) {
                finalResult = "yes";
            } else {
                finalResult = "no";
            }

        System.out.println("finalResult = " + finalResult);










    }
}
