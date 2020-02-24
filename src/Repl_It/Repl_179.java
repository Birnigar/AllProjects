package Repl_It;

public class Repl_179 {
    public static void main(String[] args) {

        System.out.println( uniqueChars("wooden-spoon") ) ;


    }  public static String uniqueChars(String str){
        String unique="";
        int count=0;
        for (int i = 0; i <str.length()-1; i++) {
            if(!unique.contains(str.substring(i,i+1))){
                unique+=str.substring(i,i+1);

             }
        }
        return unique;



    }
}
