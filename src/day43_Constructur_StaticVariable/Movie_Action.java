package day43_Constructur_StaticVariable;

import day42.Movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Movie_Action {
    public static void main(String[] args) {
        Movie m1 = new Movie("Inception", 2.28,"Action");
        Movie m2 = new Movie("Joker", 2.2, "Drama");
        Movie m3 = new Movie("Frozen2", 1.5, "Family");
        Movie m4 = new Movie("Pursuit of Happiness", 2.0, "Drama");
        Movie m5 = new Movie("Free Willy", 1.51,"Children&Family");
        Movie m6 = new Movie("G.O.R.A", 2.3, "Action");
        Movie m7 = new Movie("Turbo", 1.36, "Family");
        Movie m8 = new Movie("Bee Movie", 1.31, "Family");
        Movie m9 = new Movie("Dancing With The Birds", 0.51, "Documentary");
        Movie m10 = new Movie("My Travel Buddy", 1.51, "Comedy");

        List<Movie> top10Movies = new ArrayList<>(Arrays.asList(m1,m2,m3,m4,m5,m6,m7,m8,m9,m10));

        System.out.println("\n----- Name movies less than 2 hours -----");
        for(Movie eachMov : top10Movies){
            if(eachMov.getLength()<2){
                System.out.println(eachMov.getName());
            }
        }

        System.out.println("\n----- Action Movies -----");
        for( Movie eachMov : top10Movies){
            if(eachMov.getType().equalsIgnoreCase("Action")){
                System.out.println(eachMov.getName());
            }
        }

        System.out.println("\n----- If any Movie is longer than 2 hours Update the movie type to  Long -----");
        for( Movie eachMov : top10Movies){
            if(eachMov.getLength()>2){
            //    eachMov.setType("Long"+eachMov.getType());
                System.out.println(eachMov);
            }
        }

        System.out.println("\n----- Longest Movie Name -----");
        Movie longest = top10Movies.get(0);
        for (int i = 0; i <top10Movies.size() ; i++) {
            if((top10Movies.get(i).getLength())> longest.getLength()){
                longest = top10Movies.get(i);
            }
        }
        System.out.println("Longest movie = " + longest.getName());
    }
}
