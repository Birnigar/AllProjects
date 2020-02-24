package day56;

import java.util.Arrays;
import java.util.List;

public class StoreTest2 {
    public static void main(String[] args) {

        List<Product> denisList= Arrays.asList(new Product("coekie",2),
                new Product("Tea",3),
                new Product("coffe",7),
                new Product("Muffins",5));

        Store s2=new Store("Dennis Store",denisList);
        System.out.println("s2 = " + s2);


        s2.addProduct(new Product("Cheesecake",10));
        System.out.println("s2 = " + s2);
        s2.addProduct("Latte",3);
        System.out.println("s2 = " + s2);

        System.out.println("s2.getProductCount() = " + s2.getProductCount());
        s2.displayProducts();

        System.out.println("s2.checkIfProductExists(new Product(\"Cheesecake\",10)) = " + s2.checkIfProductExists(new Product("Cheesecake",10)));
        System.out.println("s2.indexOfProduct(new Product(\"Cheesecake\",10)) = " + s2.indexOfProduct(new Product("Cheesecake",10)));

        s2.removeProduct(new Product("Cheesecake",10));
        s2.displayProducts();
        s2.removeProduct(new Product("Cheesecake",10));
        s2.removeProduct(new Product("Cheesecake",10));

    }
}
