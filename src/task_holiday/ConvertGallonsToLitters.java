package task_holiday;

public class ConvertGallonsToLitters {
    public static void main(String[] args) {

        convertGallonsToLitters(65.2);



    }


    public static double convertGallonsToLitters(double galoons){

        double litters=galoons*3.75;
        System.out.println(litters+" l");
        return litters;
    }
}
