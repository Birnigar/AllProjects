package arrayTask;

import java.util.Arrays;
import java.util.Scanner;

public class CopyNewArray {
    public static void main(String[] args) {

        int[] num={1,3,5,7};

        int[] numCopy=new int[num.length+1];


        for (int i = 0; i <num.length ; i++) {

            numCopy[i]=num[i];
        }
numCopy[numCopy.length-1]=9;
        System.out.println(Arrays.toString(numCopy));

        String[] name={"Omer","Nigar","Fatma","Mujgan","Faruk","Furkan"};
        String[] myFamily=new String[name.length-1];
         int x=0;
        for (int i = 0; i <name.length ; i++) {
            if(!name[i].contains("Fatma")){
              myFamily[x]=name[i];
                x++;
            }

        }
        System.out.println(Arrays.toString(myFamily));






    }
}
