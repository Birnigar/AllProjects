package day06;

public class UsingTheValueOfOtherVariables {
    public static void main(String[] args) {

        int myFavoriteNumber=300;
        int yourFavoriteNumber=myFavoriteNumber;

       System.out.println("My favorite number "+ myFavoriteNumber);
        System.out.println("Your favorite number "+yourFavoriteNumber);

        yourFavoriteNumber=100;

        System.out.println("My favorite number "+ myFavoriteNumber);
        System.out.println("Your favorite number "+yourFavoriteNumber);

       String myOrder="Pizza";
       String yourOrder=myOrder;

        System.out.println("My order is "+ myOrder);
        System.out.println("Your order is "+yourOrder);




    }
}
