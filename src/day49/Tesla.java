package day49;

public class Tesla extends Vehicle implements Autonomous {
    int horsePower;
    int year;

    public Tesla(int horsePower,int year){
        super("Tesla");
        this.horsePower=horsePower;
        this.year=year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
public void isElectric(){
    System.out.println(brand+" " +year+ " is electric car");
}



    @Override
    public void selfDrive() {
        System.out.println(brand+ " has self drive");
    }

    @Override
    public void start() {
        System.out.println(brand+ "is starting");

    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", year=" + year +
                ", brand='" + brand + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Tesla t1=new Tesla(2500,2020);


        t1.selfDrive();
        t1.start();
        t1.goForward();
        t1.isElectric();
        t1.toString();


    }

}
