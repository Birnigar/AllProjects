package arrayTask;

import java.util.Arrays;

public class MallShopping {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};
//Task 1
int itemsLength=items.length;
int pricesLength=prices.length;
int itemIDsLength=itemIDs.length;

if(itemIDsLength==pricesLength&&pricesLength==itemIDsLength){
    System.out.println("All arrays are equal length");
}else{
    System.out.println();
}

//TASK 2

        System.out.println("Items count: " + itemsLength);

//TASK 3
        double totalPrice = 0.0;
      //  12345 - Shoes - $99.99
        // 458.8 * 0.06 + 458.8

        for (int i = 0; i <itemIDs.length ; i++) {

            System.out.println(itemIDs[i]+" - "+items[i]+" - "+prices[i]);
            totalPrice+=prices[i];

        }

        System.out.println(totalPrice*0.06);

  //TASK 4. Find/Look for "Airpods" in items and print along with price and itemID

        for (int i = 0; i <items.length ; i++) {
            if(items[i].equalsIgnoreCase("Airpods"))
                System.out.println(items[i] +"-"+ prices[i]);
        }

   ///TASK 5. Find the most expensive item and print all details
        double maxPrice = prices[0];
        int maxPriceIndex = 0;

        for (int i = 1; i <prices.length ; i++) {
            if(prices[i]>maxPrice) {
                maxPrice = prices[i];
                maxPriceIndex = i;
            }

        }
        System.out.println("Most expensive item: "+maxPrice);
        System.out.println(itemIDs[maxPriceIndex] + " - " + items[maxPriceIndex] + " - "+prices[maxPriceIndex]);









    }
}
