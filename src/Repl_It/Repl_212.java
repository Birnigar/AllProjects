package Repl_It;

public class Repl_212 {
    public static void main(String[] args) {






    } public static  double convertC(String[][] money,String[][] convertionRate)
    {    double sum=0.0;
        for (int i = 0; i <money.length ; i++) {
            if(money[i][0].equals(convertionRate[i][0])){
                sum+=Double.parseDouble(money[i][1])*Double.parseDouble(convertionRate[i][1]);
            }
        }
        return sum;

    }
}
