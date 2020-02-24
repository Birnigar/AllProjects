package day48;

public class HR_Action {
    public static void main(String[] args) {
        
        HourlyEmployee e1=new HourlyEmployee("Subi",101,5.5,200);
        e1.calculateAnnualSalary();
        System.out.println("e1 = " + e1);
        
        FullTimeEmployee e2=new FullTimeEmployee("Ainura",103,10000);
        e2.calculateAnnualSalary();
        System.out.println("e2 = " + e2);
    }
}
