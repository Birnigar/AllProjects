package day21;

public class Count1To100SkipAll5 {
    public static void main(String[] args) {


    //    for (int i = 1; i <=100 ; i++) {


         //   if (i % 5 == 0) {
         //       System.out.println("skipping "+i);
         //       continue;
         //  }
          //  System.out.println(i);
      //  }

        for (int i = 1; i <=100 ; i++) {


            if(i%5!=0){
                System.out.println(i);
            }else{
                System.out.println("skipping "+i);
            }

        }










    }
}
