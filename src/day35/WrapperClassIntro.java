package day35;

public class WrapperClassIntro {
    public static void main(String[] args) {

        int x=10;
        //this is old not recommended way of create integer object
        int xObj1=new Integer(12);

        Integer xObj2=Integer.valueOf(10);
        Integer xObj3=Integer.valueOf("10");
        
        byte bValue=xObj2.byteValue();
        System.out.println("bValue = " + bValue);


    }
}
