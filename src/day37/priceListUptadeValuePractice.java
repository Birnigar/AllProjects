package day37;

import java.util.ArrayList;
import java.util.List;

public class priceListUptadeValuePractice {
    public static void main(String[] args) {
        ArrayList<Double> priceList = new ArrayList<>();
        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);

        System.out.println("priceList after swapping first and last value : \n\t" + priceList);
int lastIndex=priceList.size()-1;

        //  slightly ore simplified version of above code
        Double firstItem = priceList.get(0);
        Double lastItem = priceList.get(lastIndex);

        Double temp1 = firstItem;
        priceList.set(0, lastItem);
        priceList.set(lastIndex, temp1);

        System.out.println("priceList after swapping back : \n\t" + priceList);
    }
}
