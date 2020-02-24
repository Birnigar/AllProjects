package day56;

public class ProductTest {
    public static void main(String[] args) {

        Product p1=new Product("Macbook Pro",2999);
        Product p2=new Product("Sony Tv",499);
        Product p3=new Product("Sony Tv",499);


        System.out.println(p1==p2);
        System.out.println(p2==p3);//this give false ;

        System.out.println("p2.equals(p3) "+ p2.equals(p3));//this also give false after

        System.out.println("p2.equals(p2) "+p2.equals(p2));

        Product p4=p3;

        System.out.println("p4.equals(p3) = " + p4.equals(p3));

    }
}
