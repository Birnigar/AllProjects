package office_hour;

public class Practice_12_12 {
    public static void main(String[] args) {
     //if arr -> {1,1,2,3,3}

   int[] numbers={1,1,2,2,3,4,4,5,5};

        for (int j = 0; j <numbers.length ; j++) {
            int count=0;
            for (int i = 0; i <numbers.length ; i++) {

            if (numbers[i] == numbers[j]) {
                count++;
            }
        }
            if(count==1){
             System.out.println(j);
         }

        }


        String[] arr= {"a" , "a ", "b", "c", "c"};

        for (int i = 0; i <arr.length ; i++) {
            int count2=0;
            for (int x = 0; x <arr.length; x++) {
                if(arr[x].equals(arr[i])){
                    count2++;
                }
            }
            if (count2==1){
                System.out.println(arr[i]);
            }
        }
     //   Swap two variable' values without using a temporary variable

        int a =10, b= 20;
       // output: print( a ) ==> 20
       // print( b ) ==> 10
          a=a+b;//a=30
          b=a-b;//b=30-20=10
          a=a-b;//a=30-10=20

        System.out.println(a+" "+b);



    }
}
