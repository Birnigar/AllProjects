package office_hour;

import java.util.Scanner;

public class Practice_12_04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 1 st word with single character to start with:");
        String firsthLetter=scan.next();
        char firsth=firsthLetter.charAt(0);
       
        System.out.println("Enter 2 nd word with single character to end with:");
        String secondLetter=scan.next();
        char second=secondLetter.charAt(0);
        
        
        for (char iChar='A'; iChar<=second;iChar++){
            System.out.println("iChar = " + iChar);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
}
