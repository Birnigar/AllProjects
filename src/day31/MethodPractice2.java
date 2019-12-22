package day31;

public class MethodPractice2 {


    public static void count1to10(){

        for (int i = 0; i <=10 ; i++) {
            System.out.print(i+" ");

        }

    }

    public static void main(String[] args) {


        count1to10();
        System.out.println();
        count1to10();
        System.out.println();
        MethodPractice2.count1to10();

        printOddNumbers1to100();
    }


public static void printOddNumbers1to100(){

    for (int i = 0; i <=100 ; i++) {
        if(i%2!=0){
            System.out.println(i+" ");
        }

    }


}





}
