package day22;

public class BreakContinuePractice {
    public static void main(String[] args) {

        String msg = "I struggle with Java I like Java I love Java Everything is Awesome!!";
        int indexOfA=0;
        for (int i = 0; i < msg.length(); i++) {
            if (msg.charAt(i) =='a' || msg.charAt(i)=='A') {
                ++indexOfA;
            }
            if (i % 2 ==0) {
                System.out.print(msg.charAt(i));
            } else {
                continue;
            }
            if (indexOfA ==3) {
                System.out.println();
                System.out.println("Third a reached!!");
                break;
            }
        }






    }
}
