package day49;

public class Square extends Shape {

    int length;

    public Square(int length) {
        super("Square");
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void calculateArea() {
        System.out.println("area  = " + (area=length*length));
    }

    @Override
    public void draw() {
        System.out.println("Draw square");
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
