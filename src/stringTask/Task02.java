package stringTask;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The search keyword");
        String searchKeyword=scan.nextLine();
        String tabTitle=searchKeyword+"-Google Search";
        System.out.println("tabTitle: "+tabTitle);
        if(tabTitle.startsWith(searchKeyword) && tabTitle.endsWith("Google Search")){
            System.out.println("Test passed");
        }else{
            System.out.println("Test Failed");
        }





    }
}
