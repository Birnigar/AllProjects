package day55;

public class Taxi_2 {
    Engine en;
    Driver dr;
    String passengers;


    public Taxi_2(Engine en, Driver dr, String passengers) {
        this.en = en;
        this.dr = dr;
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Taxi_2{" +
                "en=" + en +
                ", dr=" + dr +
                ", passengers='" + passengers + '\'' +
                '}';
    }
}
