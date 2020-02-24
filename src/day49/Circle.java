package day49;

public class Circle extends Shape {

      int radius;

    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("area " +( area=3.14*radius*radius));
    }

    @Override
    public void draw() {
        System.out.println("Draw circle");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
