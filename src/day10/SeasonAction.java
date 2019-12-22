package day10;

public class SeasonAction {
    public static void main(String[] args) {
        /*spring---->Hike,Nawruz.Blossom
        Summer---->swim,Vacation,BBQ,Holiday
        Fall---->Black Friday,Hiking,Harvest,Halloween,Shopping
        Winter--->Snowboarding,Ski,Christmas,New year
         */
        String season="Fall";

        switch (season){

            case "Spring":
                System.out.println("Hike,Nawruz.Blossom");
                break;
            case "Summer":
                System.out.println("swim,Vacation,BBQ,Holiday");
                break;
            case "Fall":
                System.out.println("Black Friday,Hiking,Harvest,Halloween,Shopping");
                break;
            case "Winter":
                System.out.println("Snowboarding,Ski,Christmas,New year");
                break;

        }


    }

}
