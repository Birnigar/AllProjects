package Repl_It;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repl_187 {
    public static void main(String[] args) {
        System.out.print(
                lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","edit","1","bbb")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","delete","3","")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","none","1","")+"\n"
        );




    }public static String lameDb(String db, String op,String id,String data){
        List<String> lst=new ArrayList<>(Arrays.asList(db.split("#")));
        String result="";
        if(op.equals("add")){
            lst.add(id+data);
        }else if(op.equals("edit")){
            lst.set(Integer.parseInt(id)-1,id+data);
        }else if(op.equals("delete")){
            lst.remove(Integer.parseInt(id)-1);
        }
        for(int i=0; i< lst.size();i++){
            if(lst.get(i).charAt(0)!='1'){
                result+="#";
            }
            result+=lst.get(i);
        }
        return result;
           }
}