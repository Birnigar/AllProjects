package Repl_It;

public class Repl_217 {
    public static void main(String[] args) {

    } public static boolean badP(int[] products,int limit)
    {    int count=0;
        for (int i = 0; i <products.length ; i++) {
            if(products[i]==0){
                count++;
            }
        }if( limit>count ){
            return true;
    }else{
            return false;
    }

    }
}
