package day55;

public class Calculator {
   private int result;

    public Calculator addNum(int num){
        this.result+=num;

        return this;
    }
    public  void displayFinalResult(){
        System.out.println("final.result "+result);
    }


    public static void main(String[] args) {

        Calculator c1=new Calculator();
        c1.addNum(100).addNum(200).addNum(100).displayFinalResult();
       // System.out.println(c1.result);


    }




}
