package day27;

import java.util.Arrays;

public class Multi_DimensionalArraysPractise {
    public static void main(String[] args) {


        String[][] names={{"Rukhshona","Ghoya"},{"Hasan","Tetiana"}};

//print hasan
        System.out.println(names[1][0]);

        //print tatiana
        System.out.println(names[1][1]);
names[1][1]="Dilshat";
        System.out.println(names[1][1]);//display dilshat
//if I want second array
        System.out.println(Arrays.toString(names[1]));
        System.out.println("All Arrays = " + Arrays.deepToString(names));









    }
}
