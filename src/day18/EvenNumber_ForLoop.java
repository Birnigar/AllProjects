package day18;

public class EvenNumber_ForLoop {
    public static void main(String[] args) {


        for (int i = 0; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int n = 0; n <= 100; n += 3) {
            System.out.print(n + " ");
        }
        System.out.println("---even number");
//even number
        for (int x = 0; x <= 100; x += 2) {
            System.out.print(x+" ");
        }
        //odd number
        for (int y = 1; y < 100; y+=2) {
            System.out.print(y);
        }
        for (int m = 0; m <100 ; m++) {
            if (m%5==0 && m%3==0){
                System.out.println(m+" is BUZZ  NUMBER");
            }
        }



    }
}