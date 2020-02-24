package day48;

public abstract class Employee {
    String name;
    int ID;


    public Employee(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public abstract void calculateAnnualSalary();

    public abstract String toString();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
