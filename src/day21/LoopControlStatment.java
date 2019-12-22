package day21;

public class LoopControlStatment {
    public static void main(String[] args) {
        //break
        //if line contains break reaches the loop will stop!!!

        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
            break;

        }

//while iterating over 1 to 10
        //break out of the loop when it's 5

        for (int i = 0; i <=10 ; i++) {
            System.out.println(i);
            if (i==5){
                break;
            }

            //add from 1 to 5
            int sum=0;

            for (int j = 0; j <=10 ; j++) {
                System.out.println("current sum is "+sum);
                System.out.println("if I add "+j+" dollar ,it would be "+sum);
                // here we are checking whether after adding the next number
                // it will go over 40 or not ,
                // that's why we should use sum + x to see whether it will go over before we acrually add them
                if(sum+j>40){
                    break;
                }
                // we need to add the sum after we make sure it did not go over 40
                sum=sum+j;

            }
            System.out.println("sum ="+sum);
        }

        //continue
        //if line contains break reaches the loop, will skip to next iteration

        //we can use break and continue any type of loop









    }
}
