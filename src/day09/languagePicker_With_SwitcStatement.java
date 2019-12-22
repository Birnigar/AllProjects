package day09;



public class languagePicker_With_SwitcStatement {
    public static void main(String[] args) {
        System.out.println("Welcome to Cybertek call Center");
        System.out.println("please select your language option from 1-7");
        String greeting="" ;
        int num=3;
        switch (num) {

            case 1:
                greeting = "Hello";
                break;
            case 2:
                greeting = "Salam";
                break;
            case 3:
                greeting = "Hola";
                break;
            case 4:
                greeting = "Privet";
                break;
            case 5:
                greeting = "Merhaba";
                break;
            case 6:
                greeting = "Szia";
                break;
            case 7:
                greeting = "Bonjour";
            default:
                System.out.println("UNKOWN LANGUAGE");

        }
    }
}