package day23;

public class TaskArray {
    public static void main(String[] args) {

        String[] groceryItems={"apple","banana","grape","strawberry","blueberry","kiwi"};
        double[]  storePrices={1.99,0.99,4.65,3.89,3.88,2.88};

        for (String groceryItem : groceryItems) {
            System.out.print("groceryItem = " + groceryItem+" ");
        }
        System.out.println("---------------------");

        int itemIndex=groceryItems.length;
               String oddIndex="";
            for (int i = 0; i <groceryItems.length ; i++) {
                if(i%2!=0){
                  oddIndex+=" "+groceryItems[i];
                }
            }
            System.out.println("oddIndex = " + oddIndex);

        System.out.println("---------------------");

        for (int j = itemIndex-1; j >=0; j--) {
            System.out.println(j +" groceryItems = " + groceryItems[j]);
        }

        for (int x = 0; x <itemIndex ; x++) {
            if(groceryItems[x].equalsIgnoreCase("strawberry"))
                System.out.println("Strawberry's index is "+x);
        }

        System.out.println("---------------------");

            int berryCount=0;
        for (int y = 0; y <itemIndex ; y++) {
            if(groceryItems[y].contains("berry")){
                berryCount++;
            }
        }
        System.out.println("berryCount = " + berryCount);

        System.out.println("---------------------");

        for (int i = 0; i <itemIndex ; i++) {
           int itemCharacter=groceryItems[i].length();
            System.out.println(groceryItems[i] + " has "+itemCharacter+" character");
        }

        System.out.println("---------------------");
        for (int i = 0; i <itemIndex ; i++) {
            if (i%2==0){
                System.out.println(groceryItems[i]);
            }
        }
        System.out.println("---------------------");

        for (int i = 0; i <itemIndex ; i++) {
            if(groceryItems[i].endsWith("e")){
                System.out.println(groceryItems[i]);
            }
        }

        System.out.println("---------------------");
          String last3character="";
        for (int i = 0; i <itemIndex ; i++) {
            last3character=groceryItems[i].substring(groceryItems[i].length()-3);
            System.out.println(i+" "+last3character);
        }
        System.out.println("---------------------");

        String allItems="";
        for (int i = 0; i <itemIndex ; i++) {
           allItems+= groceryItems[i]+",";

        }
        for (int i = 0; i <storePrices.length ; i++) {
            allItems+=storePrices[i]+",";
        }
        System.out.println("All Items : "+allItems);



    }
}
