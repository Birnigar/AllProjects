package Repl_It;

public class Repl_188 {
    public static void main(String[] args) {






    }
    public static int findMax(int [] arr){
        int max=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }public static double findMax(double [] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

}
