package day48;

public class HourlyEmployee extends Employee{
    double hourlyWage;
    int numOfHours;
    double annualSalary;

    public HourlyEmployee(String name, int ID,double hourlyWage,int numOfHours) {
        super(name, ID);
         this.hourlyWage=hourlyWage;
         this.numOfHours=numOfHours;
    }


    @Override
    public void calculateAnnualSalary() {
         annualSalary=(hourlyWage*numOfHours)*30*12;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "annualSalary=" + annualSalary +
                ", name= " + name + '\'' +
                ", ID=" + ID +
                '}';
    }
}
