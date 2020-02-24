package Repl_It;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

        public String blogDb(ArrayList<String[]> r,String id)  {
            String result="";
           for (String[] strArr:r){
               for (int i = 0; i <strArr.length ; i++) {
                   if(strArr[0].equals(id)){
                      result=strArr[1]+"\n"+strArr[2];

                   }
               }
           }
           return result;
        }

        public static void main(String[] args) {
            Main m = new Main();
            ArrayList<String[]>  arr = new ArrayList<String[]>();
            arr.add(new String[]{"1","title 1","content"});
            arr.add(new String[]{"2","title 2","content"});
            arr.add(new String[]{"3","title 3","content3"});

            String post = m.blogDb(arr,"3");
            System.out.print(post);
            //should output:
            //title 3
            //content3


        }//end main


    }

