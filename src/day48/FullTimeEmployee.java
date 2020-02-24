package day48;

public class FullTimeEmployee extends Employee {
    double monthlySalary;
    double annualSalary;

    public FullTimeEmployee(String name, int ID, int monthlySalary) {
        super(name, ID);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void calculateAnnualSalary() {
      annualSalary=monthlySalary*12;

    }

    @Override
    public String toString() {
        return "FullTimeEmployee{ montlySalary " +monthlySalary+
                ", annualSalary=" + annualSalary +
                ", name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }
}
