package day40;

import java.util.Arrays;

public class Offer {

    /**
     * Create Offer class with
     * instance fields :
     * location, company, salary , isFullTime
     * instance methods :
     * displayOfferDetails -- print all info about offers
     * Create 5 offer objects with your ideal offers with all details , call displayOfferDetails method on each of them
     */

    String location;
    String company;
    long salary;
    boolean isFullTime;


    public void displayOfferDetails() {

        System.out.println(company + "/" + location + "/" + salary + "/" + isFullTime);


    }

    public void turnFullTime() {
        if (isFullTime == false) {
            isFullTime = true;
        } else {
            System.out.println("ALREADY FULL TIME");
        }
    }
    //change the location of the Offer
    //to the location user passed

    public void changeLocation(String newLocation){
        location=newLocation;
    }
    public void changeAllInfo(String newCompany,String newLocation,long newSalary,boolean newIsFullTime){
        company=newCompany;
        location=newLocation;
        salary=newSalary;
        isFullTime=newIsFullTime;


    }
    //write a method to check the offer belong to 100K club
public boolean is100KOffer(){
        return salary>=100000;

}
//create an instance method called toString
    //has no parameter
    //return String representation of Offer Object
    //in below format
    //[Location=Virginia,Company==Amazon | Salary=150000$| isFullTime=true]

     public String toString(){
        String result = "[ Location: " + location + " | Company: " +
               location + " | Salary: " + salary +
                " | isFullTime: " + isFullTime+ "]";
       return result;
   }





}