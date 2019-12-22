package day10;

public class MultiBranc_WithSwitch {
    public static void main(String[] args) {
        // At the McDonald Drive menu
        System.out.println("Welcome to McDonald,what can I get for you");
        /*
        11.Burger
        5.French Fry
        8.Nuggets
        35.Ice Cream
        55.coke
         */
        int itemNumber=8;
        String order="";
     switch (itemNumber) {
         case 11:
             System.out.println("you have selected 11 ");
             order = "Burger";
             break;
         case 5:
             System.out.println("you have selected 5 ");
             order = "French Fry";
             break;
         case 8:
             System.out.println("you have selected 8 ");
             order = "French Fry";
             break;
         case 35:
             System.out.println("you have selected 35 ");
             order = "Ice Cream";
             break;

         default:
             System.out.println("Your order is not valid");

             System.out.println("Your order is "+order);
     }

    }




}
