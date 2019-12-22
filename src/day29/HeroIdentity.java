package day29;

import java.util.Arrays;

public class HeroIdentity {
    public static void main(String[] args) {

        String hero1="Superman-Clark J Kent";
        //hide this hero identity
        //String heroX="Superman-************";

        String[] heroSplited=hero1.split("-");
        System.out.println("heroSplited :"+ Arrays.toString(heroSplited));

int lengthLastname=heroSplited[heroSplited.length-1].length();
String star="";
        for (int i = 0; i <lengthLastname ; i++) {
           star=star+"*";

        }
        System.out.println(heroSplited[0]+"-"+star);




















    }
}
