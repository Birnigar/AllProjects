package day56;

import java.util.Arrays;
import java.util.List;

public class StoreTest {
    public static void main(String[] args) {


        Store s1=new Store();
        System.out.println(s1.name);
    //    System.out.println(s1.allProducts);
        
        
    //    s1.allProducts.add(new Product("imac",399));
   //    System.out.println("s1.allProducts = " + s1.allProducts);

        List<Product> denisList= Arrays.asList(new Product("coekie",2),
                new Product("Tea",3),
                new Product("coffe",7),
                new Product("Muffins",5));
        
        Store s2=new Store("Dennis Store",denisList);
        System.out.println("s2 = " + s2);
    }
}
