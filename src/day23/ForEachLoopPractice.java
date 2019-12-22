package day23;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        
        long[] salary={100000,200000,150000,115000,60000};

      
        for (long eachSalary:salary){
            System.out.println("eachSalary = " + eachSalary);
        }
        for (long salaries:salary) {
            if (salaries > 100000) {
                System.out.println("salaries = " + salaries);
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
