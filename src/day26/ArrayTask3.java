package day26;

import java.util.Arrays;

public class ArrayTask3 {
    public static void main(String[] args) {


// 2, write a program to print count of certain item in an array.
       // if item does not exists it should print 0 , if not print the count of the item

        int[] scores={156,101,76,187,87,110};


        System.out.println("My Item count = " + scores.length);

String[] marvelHeros={"Iron Man","Captain America","Spiderman","Black Panther","Hulk","Black Widow","Wanda","Captain Marvel"
        ,"Captain America","Spiderman","Spider Man","Black Panther","Hulk","Black Widow"};
        System.out.println("marvelHeros = " + Arrays.toString(marvelHeros));

        String itemToSearch;
        int countOfItem;
         int count=0;
        for (int i = 0; i <marvelHeros.length ; i++) {
            for (int j = 0; j <i ; j++) {
                if(marvelHeros[i].equals(marvelHeros[j])){
                    count++;
                   System.out.println(marvelHeros[j]);
                }

            }

        }
        System.out.println("count = " + count);





    }
}
