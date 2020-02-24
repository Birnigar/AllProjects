package day55;

public class Driver {

    String name;
    int driverId;

    public Driver(String name, int driverId) {
        this.name = name;
        this.driverId = driverId;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverId=" + driverId +
                '}';
    }
}
