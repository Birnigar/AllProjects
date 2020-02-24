package office_hour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice_01_09 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.remove(2);
        System.out.println(list);
        list.remove(Integer.valueOf(10));
        System.out.println(list);

        Integer[] nums={1,2,3,4,5,6};
        List<Integer> numsArr= Arrays.asList(1,2,3,4,5,6);

        String[] students={"Nursultan","Irina","Dilshat","Roksana"};
        List<String> name=new ArrayList<>(Arrays.asList(students));//easiest way
       // name.addAll(Arrays.asList(students));// it returned collection ype
        name.addAll(Arrays.asList("Ahmet","Mehmet"));
        System.out.println(name);

        List<String> classes=new ArrayList<>();

        classes.addAll(Arrays.asList("A","B","A","C","D","E","F"));

        classes.removeAll(Arrays.asList("A","C"));

        System.out.println(classes);//B,D,E,F

        List<String> cars =new ArrayList<>();
        cars.addAll(Arrays.asList("BMW","Corolla","Tesla","Jaguar","Honda"));
        //remove all cheap car

        cars.retainAll(Arrays.asList("BMW","Jaguar","Tesla"));//this objects will be stay
        System.out.println(cars);

        List<String> employees=new ArrayList<>();
        employees.addAll(Arrays.asList("Ahmet","Eric","Ahmet","Jonn","Ali","Ahmet"));

      //  employees.removeAll(Arrays.asList("Ahmet"));
        System.out.println(employees );
        //if we want to keep Ahmet and removes all other

        employees.retainAll(Arrays.asList("Ahmet"));
        System.out.println(employees);






    }
}
