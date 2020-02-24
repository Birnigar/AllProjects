package day42;

public class Computer {

    String brand;
    int ram;//(1-128)
    double price;


    //runProgram -->print brand is running with the ram size
    //calculate--> print brand is calculating
    //and getters and setters to all the fields
    //add toString method

    public String getBrand() {
        return this.brand;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public int getRam() {
        return this.ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if(price>=20 ){
            this.price = price;
        }
    }
    public void runProgram(int ram){
        System.out.println(this.brand+" is running program with the ram size " +ram);
    }
    public  void calculate(String brand){
        System.out.println(brand+" is calculating");
    }

    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }






}
