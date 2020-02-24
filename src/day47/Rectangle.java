package day47;

public class Rectangle extends Shape {

    int width;
    int height;

    public Rectangle(int width, int height) {
        super("Square");
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void calculateArea() {
        area=width*height;

    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}

