package day56;

import java.util.ArrayList;
import java.util.List;

public class Store {

    String name;

   private List<Product> allProducts;//store has List of products

    public Store(){
        this.name="Cybertek Store";
        this.allProducts=new ArrayList<>();
    }



    public Store(String name, List<Product> otherList) {
        this();
        this.name=name;
        allProducts.addAll(otherList);
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", \nallProducts=" + allProducts +
                '}';
    }

    public void addProduct(Product newProduct){
        System.out.println("calling addProduct");
        allProducts.add(newProduct);

    }

    public void addProduct(String productName,int productPrice){
        Product newProduct=new Product(productName,productPrice);
        allProducts.add(newProduct);

    }

    public int getProductCount(){
        return allProducts.size();
    }

    public void displayProducts(){
        System.out.println(name+" s Store has below product");
       for (Product each:allProducts){
           System.out.println("\t each ="+each);
       }

    }

    public boolean checkIfProductExists(Product newProduct){
        return allProducts.contains(newProduct);
    }

    public int indexOfProduct(Product newProduct){
        return allProducts.indexOf(newProduct);
    }

    public void removeProduct(Product newProduct){
        if (checkIfProductExists(newProduct)==true){
            allProducts.remove(newProduct);
        }else{
            System.out.println("We don't have "+newProduct);
        }
    }

    public int findSumOfProductPrice(){
        int sum=0;
        for (Product each:allProducts){
            sum+=each.getPrice();
        }
        return sum;
    }

    public double getAveragePrice(){
        return findSumOfProductPrice()/getProductCount();
    }

    public Product findingMaxProduct() {
        //  int max=allProducts.get(0).getPrice();
        Product maxProduct=null;
        int max = Integer.MIN_VALUE;
       for (Product each:allProducts){
           if(each.getPrice()>max){
               max=each.getPrice();
               maxProduct=each;
           }
       }
       return maxProduct;
    }

    public List<Product> findProductMoreThanAverage(){
        List<Product> myList=new ArrayList<>();
        for (Product each:allProducts){
            if(each.getPrice()>getAveragePrice()){
                myList.add(each);
            }
        }
        return myList;
    }

}
