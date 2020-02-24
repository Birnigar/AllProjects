package Interwiev_Question;

public class PrintConsecutiveNumber {





    public static void ConsecutiveNumber(int N){
        String str="";
        for (int i = 1; i <=N ; i++) {
            if( i%2==0 && i%3==0 && i%5==0 ){
                str+="CodilityTestCoders\n";
            }else if(i%2==0 && i%3==0){
                str+="CodilityTest\n";
            }else if(i%3==0 && i%5==0){

            }
        }


    }
}
