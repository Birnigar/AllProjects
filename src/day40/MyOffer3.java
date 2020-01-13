package day40;

public class MyOffer3 {
    public static void main(String[] args) {

        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = false;
        o1.salary = 140000;

        o1.displayOfferDetails();
        o1.turnFullTime();
        o1.changeLocation("DC");
        o1.displayOfferDetails();

        o1.changeAllInfo("Tesla","New Jersey",150000,true);
        o1.displayOfferDetails();

        boolean result=o1.is100KOffer();
             if(result==true){
              o1.changeLocation("Atlanta");
             }
      o1.displayOfferDetails();

    }
}
