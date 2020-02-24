package Repl_It;

public class Repl_166 {
    public static void main(String[] args) {




    }public static String c_profits (int buyPrice,int sellPrice)
    {    String result="";
        if(sellPrice>buyPrice){
            result= "profit";
        }else if(sellPrice<buyPrice){
            result= "loss";
        }else if(sellPrice==buyPrice){
            result= "no loss";
        }
return result;
    }
}
