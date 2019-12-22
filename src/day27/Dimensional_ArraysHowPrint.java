package day27;

public class Dimensional_ArraysHowPrint {
    public static void main(String[] args) {

        int[] arr1D={1,2,3};


        for (int each:arr1D) {
            System.out.print(each+" ");
        }

      int [][] arr2D={{10,20,30},{40,50,60,70,80,90,100}};

        for (int[] each1DArray:arr2D){

            for (int eachElement:each1DArray){
                System.out.print( eachElement+" ");

            }

        }





    }
}
