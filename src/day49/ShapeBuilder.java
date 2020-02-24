package day49;

public class ShapeBuilder {
    public static void main(String[] args) {

        Shape square1=new Square(25);
        square1.calculateArea();
        square1.draw();
        System.out.println("square1 = " + square1);


        Shape circle1=new Circle(14);
        circle1.toString();
        circle1.draw();
        circle1.calculateArea();
        System.out.println("circle1 = " + circle1);

    }
}
