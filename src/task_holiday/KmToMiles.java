package task_holiday;

public class KmToMiles {
    public static void main(String[] args) {

       convertKmToMiles(657.2);

    }

    public static double convertKmToMiles(double x){
        double miles= x*0.612;

        System.out.println(miles+" miles");
        return miles;
    }


}
