package day40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyOffer {
    public static void main(String[] args) {

        Offer s1 = new Offer();
        s1.location = "New York";
        s1.company = "Healty Insurance";
        s1.salary = 100000L;
        s1.isFullTime = true;
        s1.displayOfferDetails();

        Offer s2 = new Offer();
        s2.location = "Menlo Park";
        s2.company = "Facebook";
        s2.salary = 150000L;
        s2.isFullTime = true;
        s2.displayOfferDetails();

        Offer s3 = new Offer();
        s3.location = "Mountain View";
        s3.company = "Google";
        s3.salary = 140000L;
        s3.isFullTime = true;
        s3.displayOfferDetails();

        Offer s4 = new Offer();
        s4.location = "Vancouver";
        s4.company = "Amazon";
        s4.salary = 120000L;
        s4.isFullTime = true;
        s4.displayOfferDetails();


        List<Offer> offerList = new ArrayList<>(Arrays.asList(s1, s2, s3, s4));

        for (Offer eachOffer : offerList) {
            eachOffer.displayOfferDetails();
        }
    }


}
