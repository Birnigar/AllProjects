package office_hour.Practice_02_13_2020;

public class ExceptionPractice {
    public static void main(String[] args) {

        String str="Batch15";
        try{
            char ch1=str.charAt(10);
            System.out.println(ch1);
        }catch (RuntimeException e){
            System.out.println("String index out of bound exception");
        }
        System.out.println("Test Completed");




    }


}
