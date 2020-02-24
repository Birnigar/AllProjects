package day47;

public class ShapeCreater {


    public static void main(String[] args) {

        Triangle t1=new Triangle(10,20);
        System.out.println(" before t1 = " + t1);
          t1.calculateArea();
        System.out.println("After t1 = " + t1);

        Rectangle r1=new Rectangle(4,4);
        System.out.println(" before r1 = " + r1);
        r1.calculateArea();
        System.out.println("After r1 = " + r1);

    }
}
