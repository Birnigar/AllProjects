package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskArrayList {
    public static void main(String[] args) {

                /**
                 * Create an ArrayList of String to store 12 elements.
                 * Each element should contains product information separated by comma  : at index 0 -->> iPhone 6s, 499 , 18.71 and so on
                 */


                ArrayList<String> productLst
                        = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                        "iPhone 6s Plus,549,22.88",
                        "iPhone X,1149,56.16",
                        "MacbookPro,1499.99,79.49",
                        "ThumbDrive,39.99,2.68",
                        "Beats HeadPhones,349.99,15.12",
                        "Mouse,79.99,8.98",
                        "Charger,39.99,4.56",
                        "iPad,429,18.31",
                        "Dyson Vacuum,399,16.25",
                        "TV,2199,89.49",
                        "Apple Watch,559,21.18"));

                System.out.println("productLst = " + productLst);


//  * Task 1 : print only items name
                for (int i = 0; i <productLst.size() ; i++) {
                    String namePart=productLst.get(i).split(",")[0];
                    System.out.println("namePart = " + namePart);
                }
//  * Task 2 : print all the prices more than 500

                for (int i = 0; i <productLst.size() ; i++) {
                    Double priceItem=Double.parseDouble(productLst.get(i).split(",")[1]);
                    if(priceItem>500){
                        System.out.println("priceItem = " + priceItem);
                    }
                }
// * Task 3 : print average price
                double sum=0.0;
                for (int i = 0; i <productLst.size() ; i++) {
                    sum+=Double.parseDouble(productLst.get(i).split(",")[1]);
                }
                System.out.println("sum = " + sum);
                Double everagePrice=sum/12;
                System.out.println("Average = " + everagePrice);

                //* Task 4 : print all the items name that has less than 20$ monthly payment.

                for (int i = 0; i <productLst.size() ; i++) {
                    Double montlyPayment=Double.parseDouble(productLst.get(i).split(",")[2]);
                    System.out.println("montlyPayment = " + montlyPayment);

                }
// * Task 5 : Print the monthly payments of all the iPhone no matter what model.
                for (int i = 0; i <productLst.size() ; i++) {
                    Double montlyPayment=Double.parseDouble(productLst.get(i).split(",")[2]);
                    if(montlyPayment<20){
                        System.out.println("montlyPayment is less than 20$ = " + productLst.get(i).split(",")[0]);
                    }
                }
//* Task 6 : Print all information about most expensive items.
                Double mostExpensive=Double.parseDouble(productLst.get(0).split(",")[1]);
                String mostExpensiveItem=productLst.get(0).split(",")[0];
                for (int i = 0; i <productLst.size() ; i++) {
                    if(Double.parseDouble(productLst.get(i).split(",")[1])>mostExpensive){
                        mostExpensiveItem=productLst.get(i).split(",")[0];

                    }
                }
                System.out.println("mostExpensiveItem = " + mostExpensiveItem);

                // * Task 7 : Update Dyson price to 80% off (Monthly payment should also be calculated accordingly)

                for (String eachItem: productLst ) {
                    if(eachItem.contains("Dyson")){
                        Double uptadePrice=Double.parseDouble(eachItem.split(",")[1])*0.80;
                        System.out.println("uptadePrice = " + uptadePrice);
                        Double updateMontly=uptadePrice/24;
                        System.out.println("updateMontly = " + updateMontly);
                    }
                }
//* Task 8 : Count the items prices more than average price.
                int count=0;
                for (int i = 0; i <productLst.size() ; i++) {
                    if(Double.parseDouble(productLst.get(i).split(",")[1])>everagePrice){
                        count++;
                    }
                }
                System.out.println("count = " + count);
//* Task 9 : Remove all the items has more than average price.

        for (int i = 0; i < productLst.size(); i++) {

            double price = Double.parseDouble(productLst.get(i).split(",")[1]);
            if (price >everagePrice) {

                productLst.remove(i);
                --i;
            }

        }
        System.out.println("productLst count  after removing = " + productLst.size());
        // You may also store all the items with more than average into another list
        // then use remove all method :  productLst.removeAll( newListHere)

        System.out.println("\n-----------Task 3 ArrayList Objects ----------");
        System.out.println("\n-----------Task Three ArrayList Objects ----------");
//         * ------------------------
//         * Create 3 more ArrayList objects to separately store
//         *  itemNames(String), prices(Double) , monthlyPayments(Double)  :
        ArrayList<String> itemNames = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Double> monthlyPayments = new ArrayList<>();

        for (String eachProduct : productLst) {
            // store the name part into ItemName list
            String name = eachProduct.split(",")[0];
            itemNames.add(name);
            // store the name price into prices list
            double pricePart = Double.parseDouble(eachProduct.split(",")[1]);
            prices.add(pricePart);
            // store the name monthlyPart into monthlyParts list
            double monthlyPart = Double.parseDouble(eachProduct.split(",")[2]);
            monthlyPayments.add(monthlyPart);

        }

        System.out.println("itemNames = " + itemNames);
        System.out.println("prices = " + prices);
        System.out.println("monthlyPayments = " + monthlyPayments);



            }
        }

