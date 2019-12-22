package day17;

public class WakeUp_FullNameCorrector {
    public static void main(String[] args) {
        
        String fullName="arYa sTarK";
        
        int firstSpace=fullName.indexOf(" ");
        System.out.println("firstSpace = " + firstSpace);
        
        String fullNameCorrector=fullName.substring(0,1).toUpperCase()+fullName.substring(1,4).toLowerCase()+" "+
                fullName.substring(5,6).toUpperCase()+fullName.substring(6).toLowerCase();
        System.out.println("fullNameCorrector = " + fullNameCorrector);
        
        
        
        
        
        
        
    }
}
