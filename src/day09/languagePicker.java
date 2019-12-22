package day09;

import java.util.Scanner;

public class languagePicker {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int languageOption;
        String greeting="";

        System.out.println("Welcome to Cybertek call Center");
        System.out.println("please select your language option from 1-7");
        languageOption=scan.nextInt();
        if (languageOption==1){
            greeting="Hello";
        }else if(languageOption==2){
            greeting="Salam";
        }else if(languageOption==3) {
            greeting = "Hola";
        }else if(languageOption==4) {
            greeting = "Privet";
        }else if(languageOption==5) {
            greeting = "Merhaba";
        }else if(languageOption==6) {
            greeting = "Szia";
        }else if(languageOption==7) {
            greeting = "Bonjour";
        }else{
            System.out.println("UNKOWN LANGUAGE");
        }
    }
}
