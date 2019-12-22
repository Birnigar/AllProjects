package day26;

public class Task1 {
    public static void main(String[] args) {
        
        int[] num={21,34,75};
        
        
        int sum=num[0]+num[1];
        System.out.println("sum = " + sum);
        
        
        int temp=num[0];
        num[0]=num[2];
        num[2]=temp;
        System.out.println(num[0]+","+num[2]);
        
        int[] myNumbers=new int[]{10,40,30,7};
        //swap first item and last item

        int tempConatiner=myNumbers[0];
        myNumbers[0]=myNumbers[myNumbers.length-1];
        myNumbers[myNumbers.length-1]=tempConatiner;

        System.out.println("first myNumbers = " + myNumbers[0]);
        System.out.println("last myNumbers = " + myNumbers[myNumbers.length-1]);


    }
}
