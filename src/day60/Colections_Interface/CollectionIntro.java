package day60.Colections_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionIntro {
    public static void main(String[] args) {


    Collection<String> names=new ArrayList<>();

    names.add("Hasan");
    names.add("Sevim");
    names.add("Abdullo");
    names.add("Tuana");
    names.add("Daria");
    names.add("Lorin");

    names.addAll(names);
        System.out.println(names);

   // names.remove("Hasan");

    names.removeAll(Arrays.asList("Hasan"));

    Collection<String> toRemove=Arrays.asList("Abdullo");

    names.removeAll(toRemove);
        System.out.println(names);







    }
}

