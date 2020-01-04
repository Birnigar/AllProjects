package day36;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {
    public static void main(String[] args) {

        List<Long> lst=new ArrayList<>();
        lst.add(12L);
        lst.add(100L);
        lst.add(200L);

        System.out.println("lst = " + lst);

        System.out.println("counting items = " + lst.size());

        System.out.println("first Item = " + lst.get(0));

        System.out.println("Sum of ArrayList = " + (lst.get(0)+lst.get(1)+lst.get(2)));
        Long sum=0L;
        for (int i = 0; i <lst.size() ; i++) {
            sum+=lst.get(i);
        }
        System.out.println("sum = " + sum);
    }
}
