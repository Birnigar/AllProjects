package day40;

public class MyOffer2 {
    public static void main(String[] args) {

        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = true;
        o1.salary = 140000;
        o1.displayOfferDetails();

        Offer o2 = new Offer();
        o2.location = "Boston";
        o2.company = "Google";
        o2.salary = 100000;
        o2.isFullTime = false;
        o2.displayOfferDetails();

        Offer o3 = new Offer();
        o3.company = "Amazon";
        o3.location = "Vancouver";
        o3.isFullTime = true;
        o3.salary = 96000;
        o3.turnFullTime();
        o3.displayOfferDetails();


        Offer o4 = new Offer();
        // if we don't assign values for instance filed|variable
        // we get default value
        // for primitive numbers : 0 or 0.0
        // boolean : false
        // char    : ''
        // for any reference types :
        // null
        o4.displayOfferDetails();


        o3.salary=o3.salary+2000;
        o3.salary+=2000;
        System.out.println("New Amazon salary= " + o3.salary);

//set the salary value of o4 offer object to sum of all offers

        o4.salary=o1.salary+o2.salary+o3.salary;
        System.out.println("o4  salary = " + o4.salary);

        o4.turnFullTime();
        o4.displayOfferDetails();
        o4.changeLocation("DC");
        o4.displayOfferDetails();




    }
}