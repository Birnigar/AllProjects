package day23;

public class TaskArrPart3 {
    public static void main(String[] args) {

        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        double[] storePrices = {1.99, 0.99, 4.65, 3.89, 3.88, 2.88};
        int indexOfPrice = storePrices.length;
        int indexOfItem=groceryItems.length;
        String grocerList;
       double priceList;
        for (int i = 0; i <indexOfItem ; i++) {

            grocerList = groceryItems[i];

            for (int j = 0; j < i; j++) {

                priceList = storePrices[j];
            }
            System.out.println(groceryItems[i]+" price is "+storePrices[i]);
        }

        System.out.println("Last Item is: "+groceryItems[indexOfItem-1]+" price is: "+storePrices[indexOfPrice-1]);
        System.out.println("-------------@@@@@@--------------");
        for (int i = 0; i <indexOfItem ; i++) {

            grocerList = groceryItems[i];

            for (int j = 0; j < i; j++) {
                if (storePrices[j] > 3.11) {
                    priceList = storePrices[j];
                    System.out.println(groceryItems[i] + " price is " + storePrices[j]);
                }

            }
        }
















































        }
}
