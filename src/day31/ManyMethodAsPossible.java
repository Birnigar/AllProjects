package day31;

public class ManyMethodAsPossible {
    public static void main(String[] args) {
       countDownFrom20till0();
      spellYourName();
    }



    public static void countDownFrom20till0(){

        for (int i = 20; i >=0; i--) {
            System.out.print(i+" ");
        }
    }
    public static void spellYourName(){
        String name="Nigar";
        for (int i = 0; i <name.length() ; i++) {
            char nameChar=name.charAt(i);
            System.out.println(nameChar);
        }

    }
    public static void printOddNumbers1to100() {

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " ");
            }

        }

    }
}
