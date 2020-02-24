package day47;

public class Triangle extends Shape {


    int height;
    int base;

    public Triangle( int height, int base) {
        super("my triangle");
        this.height = height;
        this.base = base;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public void calculateArea() {

        area=(height*base)/2;


    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}

