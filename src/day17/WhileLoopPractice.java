package day17;

public class WhileLoopPractice {
    public static void main(String[] args) {
        //Count 1 to 5 and then count 5 to 1
        int count=1 ;

        while (count<=5){
            System.out.print(count+" ");
            ++count;
        }
        System.out.println();
        System.out.println("count = " + count);

         //now I want to count  from 5 to 1,using same counter

        while (count>1){
            --count;
            System.out.print(count+" ");
           ;
        }
        System.out.println("count = " + count);












    }
}
