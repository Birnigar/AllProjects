package Interwiev_Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort_Descending {
    public static void main(String[] args) {

       int[] arr1 = {10,20,7, 8, 90};
        System.out.println(Arrays.toString(sort(arr1)));

      //  List<Integer> lst=new ArrayList<>(Arrays.asList(15,21,5,98,2));
      //  System.out.println(sortLst(lst));
      // int[] a = {10,20,7, 8, 90};
      //  System.out.println(Arrays.toString(Sort(a)));

    }


    public static int[] sort(int[] arr){

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
               if(arr[i]<arr[j]){
                  int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
           }
      }
        return arr;
    }


    public static List<Integer> sortLst(List<Integer> lst){

        for (int i = 0; i <lst.size() ; i++) {
            for (int j = i+1; j <lst.size() ; j++) {
                if(lst.get(i)<lst.get(j)) {
                    int temp = lst.get(i);
                    lst.set(i,lst.get(j));   //lst.get(i)=lst.get(j);
                    lst.set(j,temp);

                }
            }
        }
        return lst;
    }
    public static int[] Sort(int[] a) {

        ArrayList<Integer> list=new ArrayList<Integer>();

        for(int each: a)

            list.add(each);
        for(int i=0; i < a.length; i++) {

            a[i] = findMax(list);

            list.remove(Integer.valueOf(a[i]));
        }

        return a;
    }
    public static int findMax(ArrayList<Integer> a) {
        int max=Integer.MIN_VALUE;
        for(int each: a)
            max = Math.max(max, each);

        return max;

    }
}
