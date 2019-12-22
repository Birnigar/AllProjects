package day17;

public class WakeUp_NameCorrector {
    public static void main(String[] args) {
        String name="kHumAyra";
        //meke first character uppercase
        //get the rest of lowercase

        String name2;


        name2=(name.charAt(0)+"").toUpperCase();
        name2=name2+name.substring(1).toLowerCase();

        System.out.println("name2 = " + name2);






    }
}
