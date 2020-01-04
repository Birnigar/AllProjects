package day36;

public class MethodWithWrapperTypes {
    public static void main(String[] args) {
        sumAndPrint(19,25);


Integer i1=15;
printTheDoubledValue(i1);


    }
    public static  void sumAndPrint(Integer num1,Integer num2){

        System.out.println(num1+num2);
    }
    public static void printTheDoubledValue(int x){
        System.out.println("after doubling x= "+(x*2));
    }
}
