package day31;

public class IcanDoIt300Times {
    public static void main(String[] args) {

        IcanDoIt();

    }

    public static void IcanDoIt(){
        String sentence="I can't do it";
        sentence=sentence.replace("can't","CAN");
        for (int i = 0; i <=300 ; i++) {
            System.out.println(i+"-"+sentence);
        }

    }




}
