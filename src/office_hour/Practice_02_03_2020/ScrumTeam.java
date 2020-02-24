package office_hour.Practice_02_03_2020;

public abstract class ScrumTeam {
    String employeeName;
    String jobTitle;
    double salary;

    public ScrumTeam(String employeeName, String jobTitle, double salary) {
        this.employeeName = employeeName;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }




    public abstract void Demo();


    public abstract void DailyStandUp();


    public void employeeInfo(){
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Job Title: "+jobTitle);
        System.out.println("Salary: "+salary);
    }


}
