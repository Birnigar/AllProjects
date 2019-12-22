package day21;

public class LoopControlStatment2 {
    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {

            if(i%2==1){//it means number is odd skip ,
                continue;// means skip
            }
            System.out.println(i);
        }

    }
}
