package day21;

public class DecidingWhenToStop {
    public static void main(String[] args) {
        String msg="Hello World";
        int length=msg.length();

        int countOfCharToIterate=1;
        /*
        if I want get 2 character at the same time
        length-2
        if I want to get 4 character at the same time
        length-4
         */
        for (int i = 0; i <=length-1 ; i++) {

            System.out.println(msg.substring(i,i+1));

        }



    }
}
