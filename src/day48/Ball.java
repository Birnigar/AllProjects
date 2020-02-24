package day48;

public class Ball implements Bouncible {
    String shape;
    String color;

    public Ball(String shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    @Override
    public void bounce() {
        System.out.println("Ball is bouncible");
    }

    @Override
    public String toString() {
        return "Ball{" +
                "shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
