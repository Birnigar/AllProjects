package day23;

public class TaskArrPart2 {
    public static void main(String[] args) {

        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        double[] storePrices = {1.99, 0.99, 4.65, 3.89, 3.88, 2.88};
        int indexOfPrice = storePrices.length;
        for (double storePrice : storePrices) {
            System.out.println("storePrice = " + storePrice);
        }
        System.out.println("-------------&&&------------");
        for (int i = 0; i < indexOfPrice; i++) {
            if (i % 2 == 0) {
                System.out.println("index " + i + " : " + storePrices[i]);
            }
        }
        System.out.println("-------------&&&------------");
        for (int i = 0; i < indexOfPrice; i++) {
            if (storePrices[i] < 3.00) {
                System.out.println("storePrices = " + i + " " + storePrices[i]);
            }
        }
        System.out.println("-------------&&&------------");
        double sum = 0;
        double average = 0;
        for (double storePrice : storePrices) {
            sum += storePrice;
        }
        System.out.println("Sum: "+sum);
        average = (sum / indexOfPrice);
        System.out.println("Average: "+average);

        System.out.println("-------------&&&------------");

        for (int i = 0; i <indexOfPrice ; i++) {
            if(storePrices[i]>average){
                System.out.println(storePrices[i]);
            }
        }
        System.out.println("-------------&&&------------");


        double maxPrice=storePrices[0];
        int indexMaxPrice=0;
        for (int i = 0; i <indexOfPrice ; i++) {
            if(storePrices[i]>maxPrice){
                maxPrice=storePrices[i];
                indexMaxPrice=i;
            }
        }
        System.out.println("maxPrice = " + maxPrice+ " index of maxPrice: "+indexMaxPrice);
        double secondMax=storePrices[0];
        for (int i = 0; i <indexOfPrice ; i++) {
            if(storePrices[i]>secondMax && storePrices[i]<4.65){
                secondMax=storePrices[i];

            }
        }
        System.out.println("secondMax = " + secondMax);

        System.out.println("-------------&&&------------");
        double minPrice=storePrices[0];
        int indexMinPrice=0;

        for (int i = 0; i <indexOfPrice ; i++) {
            if(storePrices[i]<minPrice){
                minPrice=storePrices[i];
                indexMinPrice=i;
            }
        }
        System.out.println("MinPrice = " + minPrice+ " index of minPrice :"+indexMinPrice);
        System.out.println("-------------&&&------------");

        
        
        


















    }
}
