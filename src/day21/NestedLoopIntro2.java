package day21;

public class NestedLoopIntro2 {
    public static void main(String[] args) {

        //count from 1 to 10
        //print only odd numbers
        //repeat this 3 times

        for (int x = 1; x <=4 ; x++) {

            System.out.println("iteration: "+x);
        for (int i = 1; i <=10 ; i++) {

            if(i%2==0){
                continue;
            }
            System.out.print(i+" ");

        }
            System.out.println();
        }









    }
}
