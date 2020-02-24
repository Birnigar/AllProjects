package day56;

import java.util.Arrays;
import java.util.List;

public class StoreTest3 {
    public static void main(String[] args) {

        List<Product> denisList= Arrays.asList(new Product("coekie",2),
                new Product("Tea",3),
                new Product("coffe",7),
                new Product("Muffins",5),
                new Product("Nutt",7),
                new Product("Frappecino",8),
                new Product("Double Shot",15));
        

        Store s2=new Store("Dennis Store",denisList);
        System.out.println("s2 = " + s2);

        System.out.println("s2.findSumOfProductPrice() = " + s2.findSumOfProductPrice());
        System.out.println("s2.getAveragePrice() = " + s2.getAveragePrice());

        System.out.println("s2.findingMaxProduct() = " + s2.findingMaxProduct());

        System.out.println("s2.findProductMoreThanAverage() = " + s2.findProductMoreThanAverage());
        
    }
}
