package task_holiday;

public class MethodPrintProductInfo {
    public static void main(String[] args) {

        System.out.println(printProductInfo("Fire", "HD",8,79.99f));



    }
    public static String printProductInfo(String productName,String model,int version,float price){



//System.out.println("I saw " + productName + " " +
// model + version + " hands-free with Alexa for " + price);

        return "Model "+ productName+model+version+" it's price= "+price;






    }
}
