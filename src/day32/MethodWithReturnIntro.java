package day32;

public class MethodWithReturnIntro {
    public static void main(String[] args) {

String name=giveMeMyName();
        System.out.println("name = " + name);
int result=doubleTheNumber(25);
        System.out.println("result = " + result);

        System.out.println("result of doubling 100 is "+doubleTheNumber(100));
        System.out.println(doubleTheNumber(5));
        System.out.println(doubleTheNumber(15));
        int add14to16result=add2Numbers(14,16);
        System.out.println("add14to16result = " + add14to16result);
        System.out.println(add2Numbers(15,16)+5);
        
    }
    
    public static int add2Numbers(int num1,int num2){
        
        return num1+num2;
        
    }
    
    
    
    public static String giveMeMyName(){
        return "Akbar";


    }
    public static int doubleTheNumber(int num){
      //  System.out.println("I am going to double the value of "+num);
       int result=num*2;
       return result;
    }








}
