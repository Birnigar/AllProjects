package day11;

public class LogicalNotOperator {
    public static void main(String[] args) {


        System.out.println(!true);//output is false
        System.out.println(!false);//output is true


        boolean isRecording=false;
        System.out.println(!isRecording);//output is true

        System.out.println(!(7>5));//output is false

        int x=7;
        System.out.println("result of(x>10) is ");
        System.out.println(x>10);
        System.out.println("result of!(x>10) is ");
        System.out.println(!(x>10));
    }
}
