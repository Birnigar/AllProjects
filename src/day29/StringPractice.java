package day29;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {

        String hero1="Superman-Clark Kent";

        String[] heroArr=hero1.split("-");
        System.out.println("heroSplitted ="+Arrays.toString(heroArr));
        System.out.println(heroArr.length);

        System.out.println("Hero code  is "+heroArr[0]+" and Idenditity is "+heroArr[1]);


String[] ckArray=heroArr[1].split(" ");
        System.out.println(Arrays.toString(ckArray));

        System.out.println("The initial of the Hero is "+ckArray[0].charAt(0)+ckArray[ckArray.length-1].charAt(0));
        String fullname="Clark Kent";







    }
}
