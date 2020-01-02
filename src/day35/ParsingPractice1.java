package day35;

public class ParsingPractice1 {


        public static void main(String[] args) {
            String snt="I bought 3 tomato and price was 3.14 each";
            String[] arr=snt.split(" ");
            System.out.println(Float.valueOf(arr[arr.length-2])*Integer.valueOf(arr[2]));





        }







}
