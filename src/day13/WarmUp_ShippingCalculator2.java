package day13;

public class WarmUp_ShippingCalculator2 {
    public static void main(String[] args) {
        /*
         *create a boolean store result of doYouWantShop
         * if yes, do you want to go to Store or do you wanna shop online
         * else  stay home keep coding
         */
        boolean youWantToShop = true ;
        String prefence = "Store";
        if (youWantToShop) {
            if (prefence.equals("Store")) {
                System.out.println("GOING TO STORE FOR SHOPPING");
            } else {
                System.out.println("GOING TO ONLINE FOR SHOPPING");
            }
         }else {
                System.out.println("good job stay home and do coding");

        }

    }
}