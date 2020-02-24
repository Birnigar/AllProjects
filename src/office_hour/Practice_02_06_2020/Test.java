package office_hour.Practice_02_06_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Kentucky obj1 = new Kentucky();
        obj1.KFC();
        obj1.tax();

        States obj2 = new Kentucky();
        obj2.tax();
        //  obj2.KFC(); reference type can decide what can be called
        obj2.method1();

        States obj3=new California();
        obj3.tax();
        obj3.method1();


        List<States> list=new ArrayList<>();
        list.addAll(Arrays.asList(obj1,obj2,obj3));

        System.out.println(list.get(0).stateName);//it gives null because we didn't initialized


        States[] arr={new Kentucky(),new California()};

        //Kentucky obj4=new States(); it is not happen.sub class not be reference type of super class object

    }




}
