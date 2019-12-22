package day23;

public class ForEachLoopPracticeFindMax {
    public static void main(String[] args) {
        
        long[] salary={100000,200000,150000,115000,60000};

      
        long maxSalary=salary[0];

        for (int i = 1; i <salary.length ; i++) {
            if (salary[i]>maxSalary) {
                maxSalary=salary[i]; 
            }
        }

        System.out.println("maxSalary = " + maxSalary);
        
        long minSalary=salary[0];
        for (int j = 1; j <salary.length; j++) {
            if (salary[j]<minSalary){
                minSalary=salary[j];
            }
        }
        System.out.println("minSalary = " + minSalary);
        
        
        
        
        
        
        
        
        
        
        
    }
}
