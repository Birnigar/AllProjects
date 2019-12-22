package day13;

public class WarmUp_ShippingCalculator {
    public static void main(String[] args) {
        /*
        Amazon has 2 type of user one is Prime member and another is regular user
        prime member getting free shipping
        regular member user get the free shipping only if their purchase is more than 25$
        otherwise they get 5$ shipping fee
         */

        String memberType=" member";
        double amount=45.99d;
        int shippingFee=0;

        // first I wanna check it's prime member or not
        if(memberType.equalsIgnoreCase("PRIME MEMBER")){
            System.out.println("You get 1 day free shipping!!!");
            System.out.println("Your final price is "+amount);
        }else if(!memberType.equalsIgnoreCase("PRIME MEMBER")&& (amount>25)){
            System.out.println("YOU ARE NOT PRIME MEMBER BUT YOU ORDER IS MORE THAN 25");
            System.out.println("YOU GOT FREE SHIPPING "+amount);
        }else {
            System.out.println("DO YOU WANNA SIGN UP FOR PRIME MEMBERSHIP?");
            shippingFee=5;
            amount=amount+shippingFee;
            System.out.println("YOUR FINAL AMOUNT IS "+amount);
        }

                //){





    }

}
